package com.iesam.firstTime.features.welcome.domain;

import com.iesam.firstTime.features.appConfig.domain.AppConfig;
import com.iesam.firstTime.features.appConfig.domain.AppConfigRepository;

public class ShowWelcomeMessageUseCase {


    private AppConfigRepository appConfigRepository;

    public ShowWelcomeMessageUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }
    public boolean execute (){
        AppConfig appConfig = appConfigRepository.getAppConfig();

        return appConfig != null && appConfig.countTimeOpened == 1;
    }
}
