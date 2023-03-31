package com.example.school.service.impls;

import com.example.school.entity.Child;
import com.example.school.repos.ChildRepository;
import com.example.school.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildRepository childRepository;

    @Override
    public List<Child> getListOfChildren() {
        return childRepository.findAll();
    }

    @Override
    public void saveOrUpdateChild(Child child) {
        childRepository.save(child);
    }

    @Override
    public Child getChildById(long id) {
        Child child = null;
        Optional<Child> optional = childRepository.findById(id);
        if (optional.isPresent()) {
            child = optional.get();
        }
        return child;
    }

    @Override
    public void deleteChild(long id) {
        childRepository.deleteById(id);
    }
}
