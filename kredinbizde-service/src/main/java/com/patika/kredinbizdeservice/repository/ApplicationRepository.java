package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRepository {

    private List<Application> applicationList = new ArrayList<>();

    public Application save(Application application) {
        applicationList.add(application);
        return application;
    }
    public List<Application> getApplications(String email) {
    	return applicationList.stream().filter(a -> a.getUser().getEmail().equals(email)).toList();
    }
}
