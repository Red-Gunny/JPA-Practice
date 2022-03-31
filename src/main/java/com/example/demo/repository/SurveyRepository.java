package com.example.demo.repository;

import com.example.demo.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
