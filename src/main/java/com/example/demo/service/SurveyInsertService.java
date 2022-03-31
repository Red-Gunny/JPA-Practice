package com.example.demo.service;

import com.example.demo.entity.Cafe;
import com.example.demo.entity.Survey;
import com.example.demo.entity.User;
import com.example.demo.repository.CafeRepository;
import com.example.demo.repository.SurveyRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SurveyInsertService {

    private final SurveyRepository surveyRepository;
    private final CafeRepository cafeRepository;
    private final UserRepository userRepository;

    public Boolean insertRecord() {
        List<User> users = userRepository.findByUserId(1L);
        List<Cafe> cafes = cafeRepository.findByCafeId(2L);


        Survey survey = Survey.builder()
                        .cafe(cafes.get(0))
                        .user(users.get(0))
                        .build();

        surveyRepository.save(survey);
        return Boolean.TRUE;
    }
}

