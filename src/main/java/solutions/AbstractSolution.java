package solutions;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public abstract class AbstractSolution {

    Logger LOGGER  = LoggerFactory.getLogger(AbstractSolution.class);

    private final String questionName;
    private final String url;

    AbstractSolution(String questionName, String url){
        printQuestionInfo();
        this.questionName = questionName;

        this.url = url;
    }

    private void printQuestionInfo(){
        LOGGER.debug("Running solution for question {[]}",getQuestionName() );
        LOGGER.debug("Click to see the question in leetCode {[]}",getUrl());
    }

    private String getQuestionName() {
        return questionName;
    }

    private String getUrl() {
        return url;
    }

}
