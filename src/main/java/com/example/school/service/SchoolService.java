package com.example.school.service;

import com.example.school.entity.Grade;
import com.example.school.entity.School;

import java.util.List;

public interface SchoolService {

    List<School> getListOfSchools();

    void saveOrUpdateSchool(School school);

    School getSchoolById(long id);

    void deleteSchool(long id);
}
