package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;

import java.util.ArrayList;

public class ValideAnagram extends AbstractSolution {
    public ValideAnagram(String questionName, String url) {
        super(questionName, url);
    }

    /** time:O(n)
     * space: O(n)*/
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        ArrayList<Character> list = new ArrayList();
        for (char c: s.toCharArray()){
            list.add(c);
        }
        for (char c:t.toCharArray()){
            list.remove(new Character(c));
        }

        return list.isEmpty();

    }
}
