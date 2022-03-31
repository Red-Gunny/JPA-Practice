package com.example.demo.service;

import com.example.demo.entity.Cafe;
import com.example.demo.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CafeInsertService {

    private final CafeRepository cafeRepository;

    public void insertData(String nickName) {
        Cafe cafe = new Cafe(nickName);
        cafeRepository.save(cafe);
    }

    public void findData(Long id) {

    }
}
