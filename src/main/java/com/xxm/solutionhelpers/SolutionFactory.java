package com.xxm.solutionhelpers;

import org.apache.commons.lang3.StringUtils;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class SolutionFactory {

    private String url;

    public SolutionFactory (String url){ this.url = url; }

    public AbstractSolution findSolution() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        String className = StringUtils.substringBetween(getUrl(),"problems/","/");
        String[] names = className.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<names.length;i++){
            sb.append(names[i].substring(0, 1).toUpperCase()).append(names[i].substring(1));
        }
        className = sb.toString();
        AbstractSolution solution = null;
        Reflections reflections = new Reflections("com.xxm.solutions");
        Set<Class<? extends AbstractSolution>> subClasses = reflections.getSubTypesOf(AbstractSolution.class);
        for(Class<? extends AbstractSolution> aClass :subClasses){
            if(aClass.getName().equals("com.xxm.solutions."+className)){
                solution = aClass.getConstructor(String.class,String.class).newInstance(className,url);
            }
        }
        return solution;
    }

    public final String getUrl() {
        return url;
    }

}
