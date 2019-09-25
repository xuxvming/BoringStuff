package com.xxm.solutionhelpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractSolution {

    final static Logger LOGGER = LoggerFactory.getLogger(AbstractSolution.class);

    private final String questionName;
    private final String url;

    public AbstractSolution(String questionName, String url){
        this.questionName = questionName;
        this.url = url;
        printQuestionInfo();
    }

    private void printQuestionInfo(){
        LOGGER.info("Running solution for question [{}], [{}]",getQuestionName(),getUrl());
    }

    private String getQuestionName() {
        return questionName;
    }

    private String getUrl() {
        return url;
    }




}
