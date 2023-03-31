package com.example.school.service.impls;

import com.example.school.entity.Grade;
import com.example.school.repos.GradeRepository;
import com.example.school.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public List<Grade> getListOfGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public void saveOrUpdateGrade(Grade grade) {
        gradeRepository.save(grade);
    }

    @Override
    public Grade getGradeById(long id) {
        Grade grade = null;
        Optional<Grade> optional = gradeRepository.findById(id);
        if (optional.isPresent()) {
            grade = optional.get();
        }
        return grade;
    }

    @Override
    public void deleteGrade(long id) {
        gradeRepository.deleteById(id);
    }
}
