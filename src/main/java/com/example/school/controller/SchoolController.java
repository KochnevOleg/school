package com.example.school.controller;

import com.example.school.entity.School;
import com.example.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/school")
    public List<School> getAllSchools() {
        return schoolService.getListOfSchools();
    }

    @PostMapping("/school")
    public HttpStatus addNewSchoolOrUpdateExisting(@RequestBody School school) {
        schoolService.saveOrUpdateSchool(school);
        return HttpStatus.OK;
    }

    @GetMapping("/school/{id}")
    public School getSchoolById(@PathVariable long id) {
        return schoolService.getSchoolById(id);
    }

    @DeleteMapping("/school/{id}")
    public HttpStatus deleteSchoolById(@PathVariable long id) {
        schoolService.deleteSchool(id);
        return HttpStatus.OK;
    }
}
