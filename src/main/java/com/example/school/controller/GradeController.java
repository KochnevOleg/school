package com.example.school.controller;

import com.example.school.entity.Grade;
import com.example.school.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("/grade")
    public List<Grade> getAllGrades() {
        return gradeService.getListOfGrades();
    }

    @PostMapping("/grade")
    public HttpStatus addNewGradeOrUpdateExisting(@RequestBody Grade grade) {
        gradeService.saveOrUpdateGrade(grade);
        return HttpStatus.OK;
    }

    @GetMapping("/grade/{id}")
    public Grade getGradeById(@PathVariable long id) {
        return gradeService.getGradeById(id);
    }

    @DeleteMapping("/grade/{id}")
    public HttpStatus deleteGrade(@PathVariable long id) {
        gradeService.deleteGrade(id);
        return HttpStatus.OK;
    }
}
