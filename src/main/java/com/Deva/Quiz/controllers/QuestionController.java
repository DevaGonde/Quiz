package com.Deva.Quiz.controllers;

import com.Deva.Quiz.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Deva.Quiz.Dao.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
public class QuestionController {

    @Autowired
    QuestionService service;
    @RequestMapping("/test")
    public String testing(){
        return "test successful";
    }

    @RequestMapping("/AllQuestion")
    public List<Questions> getAllQuestion(){

        return service.allQuestion();
    }
    @RequestMapping("/category/{category}")
    public List<Questions> getQuestionByCategory(@PathVariable String category){

        return service.questionByCategory(category);
    }

}
