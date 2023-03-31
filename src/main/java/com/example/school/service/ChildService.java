package com.example.school.service;

import com.example.school.entity.Child;

import java.util.List;

public interface ChildService {

    List<Child> getListOfChildren();

    void saveOrUpdateChild(Child child);

    Child getChildById(long id);

    void deleteChild(long id);
}
