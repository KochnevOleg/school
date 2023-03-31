package com.example.school.service;

import com.example.school.entity.Grade;

import java.util.List;

public interface GradeService {

    List<Grade> getListOfGrades();

    void saveOrUpdateGrade(Grade grade);

    Grade getGradeById(long id);

    void deleteGrade(long id);
}
