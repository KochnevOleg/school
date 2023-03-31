package com.example.school.service.impls;

import com.example.school.entity.Grade;
import com.example.school.entity.School;
import com.example.school.repos.GradeRepository;
import com.example.school.repos.SchoolRepository;
import com.example.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public List<School> getListOfSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public void saveOrUpdateSchool(School school) {
        schoolRepository.save(school);
    }

    @Override
    public School getSchoolById(long id) {
        School school = null;
        Optional<School> optional = schoolRepository.findById(id);
        if (optional.isPresent()) {
            school = optional.get();
        }
        return school;
    }

    @Override
    public void deleteSchool(long id) {
        schoolRepository.deleteById(id);
    }
}
