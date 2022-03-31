package com.example.demo.repository;

import com.example.demo.entity.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CafeRepository extends JpaRepository<Cafe, Long> {
    List<Cafe> findByCafeId(Long cafeId);
}
