package com.example.demo.controller;

import com.example.demo.dto.CafeRequest;
import com.example.demo.dto.CafeResponse;
import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.service.CafeInsertService;
import com.example.demo.service.SurveyInsertService;
import com.example.demo.service.UserInsertService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final CafeInsertService cafeInsertService;
    private final UserInsertService userInsertService;
    private final SurveyInsertService surveyInsertService;

    @GetMapping("/test")
    public ResponseEntity<CafeResponse> getTest(@ModelAttribute CafeRequest request) {
        cafeInsertService.insertData(request.getNickname());
        return new ResponseEntity<>(new CafeResponse(Boolean.TRUE), HttpStatus.OK);
    }


    @GetMapping("/test2")
    public ResponseEntity<UserResponse> setUser(@ModelAttribute UserRequest request) {
        String nickName = request.getNickname();
        userInsertService.setData(nickName);
        return new ResponseEntity<>(new UserResponse(Boolean.TRUE), HttpStatus.OK);
    }

    @GetMapping("/test3")
    public ResponseEntity<UserResponse> setSurvey(@ModelAttribute UserRequest request) {
        String nickName = request.getNickname();
        surveyInsertService.insertRecord();
        return new ResponseEntity<>(new UserResponse(Boolean.TRUE), HttpStatus.OK);
    }

}
