package com.example.school.controller;

import com.example.school.entity.Child;
import com.example.school.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChildController {

    @Autowired
    private ChildService childService;

    @GetMapping("/child")
    public List<Child> getAllChildren() {
        return childService.getListOfChildren();
    }

    @PostMapping("/child")
    public HttpStatus addNewChildOrUpdateExisting(@RequestBody Child child) {
        childService.saveOrUpdateChild(child);
        return HttpStatus.OK;
    }

    @GetMapping("/child/{id}")
    public Child getChildById(@PathVariable long id) {
        return childService.getChildById(id);
    }

    @DeleteMapping("/child/{id}")
    public HttpStatus deleteChild(@PathVariable long id) {
        childService.deleteChild(id);
        return HttpStatus.OK;
    }
}
