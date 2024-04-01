package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.client.AkbankServiceClient;
import com.patika.kredinbizdeservice.client.GarantiServiceClient;
import com.patika.kredinbizdeservice.client.dto.request.AkbankApplicationRequest;
import com.patika.kredinbizdeservice.client.dto.request.GarantiApplicationRequest;
import com.patika.kredinbizdeservice.client.dto.response.ApplicationResponse;
import com.patika.kredinbizdeservice.converter.ApplicationConverter;
import com.patika.kredinbizdeservice.dto.request.ApplicationRequest;
import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicationService {

    private final ApplicationRepository applicationRepository = new ApplicationRepository();
    private final ApplicationConverter applicationConverter;
    private final UserService userService;
    private final AkbankServiceClient akbankServiceClient; 
    private final GarantiServiceClient garantiServiceClient;

    public Application createApplication(ApplicationRequest request) {

    	String bank = request.getBank();
    	
        User user = userService.getByEmail(request.getEmail());
        log.info("user bulundu");

        Application application = applicationConverter.toApplication(request, user);

        Application savedApplication = applicationRepository.save(application);

        ApplicationResponse applicationResponse = null;
        //bu kısımlar banka sayısı artarsa daha farklı halledilebilir
        if (bank.toLowerCase().equals("garanti")) {
        	applicationResponse = garantiServiceClient.createApplication(prepareGarantiApplication(user));
        }
        else if (bank.toLowerCase().equals("akbank")) {
        	applicationResponse = akbankServiceClient.createApplication(prepareAkbankApplicationRequest(user));
        }

        return savedApplication;
    }

    public List<Application> getApplications(String email) {
    	return applicationRepository.getApplications(email);
    }
    
    private AkbankApplicationRequest prepareAkbankApplicationRequest(User user) {
        AkbankApplicationRequest applicationRequest = new AkbankApplicationRequest();

        applicationRequest.setUserId(1L);

        return applicationRequest;
    }
    
    private GarantiApplicationRequest prepareGarantiApplication(User user) {
    	GarantiApplicationRequest applicationRequest = new GarantiApplicationRequest();
    	applicationRequest.setUserId(1L);

        return applicationRequest;
    }
}
