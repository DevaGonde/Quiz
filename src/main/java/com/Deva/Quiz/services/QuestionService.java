package com.Deva.Quiz.services;

import com.Deva.Quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Deva.Quiz.Dao.Questions;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository repository;
    public List<Questions> allQuestion(){
        return repository.findAll();
    }

    public List<Questions> questionByCategory(String catagory) {
        return repository.findByCategory(catagory);
    }
}
