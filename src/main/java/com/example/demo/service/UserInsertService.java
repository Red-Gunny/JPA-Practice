package com.example.demo.service;

import com.example.demo.entity.Cafe;
import com.example.demo.entity.User;
import com.example.demo.repository.CafeRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInsertService {

    private final UserRepository userRepository;

    public void setData(String nickName) {
        User user = new User(nickName);
       userRepository.save(user);
    }
}
