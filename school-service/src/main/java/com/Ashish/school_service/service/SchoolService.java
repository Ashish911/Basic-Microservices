package com.Ashish.school_service.service;

import com.Ashish.school_service.entity.School;
import com.Ashish.school_service.respository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public School addSchool(School school) {
        return schoolRepository.save(school);
    }

    public List<School> fetchSchools() {
        return schoolRepository.findAll();
    }

    public School fetchSchoolById(int id) {
        return schoolRepository.findById(id).orElse(null);
    }

}
