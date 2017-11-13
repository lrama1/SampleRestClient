package com.olengski;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(
        		  new BasicAuthorizationInterceptor("sam", "testing"));
        Result result = restTemplate.getForObject("http://localhost:8100/CalcComment/calccomments/888888?page=1&per_page=4", Result.class); 
        for(Comment comment : result.getRows()) {
          log.info(comment.getCalcCommentTextHeader());
        }
    }

}