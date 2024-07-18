package com.Ashish.school_service.controller;

import com.Ashish.school_service.entity.School;
import com.Ashish.school_service.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/school")
@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping
    public School addSchool(@RequestBody School school) {
        return schoolService.addSchool(school);
    }

    @GetMapping
    public List<School> fetchSchools() {
        return schoolService.fetchSchools();
    }

    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id) {
        return schoolService.fetchSchoolById(id);
    }

}
