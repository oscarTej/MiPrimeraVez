package com.iesam.firstTime.features.appConfig.domain;

import com.iesam.firstTime.features.appConfig.data.AppConfigDataRepository;

public class IncrementAppOpenedUseCase {
    private AppConfigRepository appConfigRepository;



    public IncrementAppOpenedUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }

    public void execute() {
        AppConfig appConfig = appConfigRepository.getAppConfig();
        if (appConfig== null) {
            appConfig = new AppConfig(1);
        } else {
            appConfig = new AppConfig(appConfig.countTimeOpened + 1);
        }
        appConfigRepository.saveAppConfig(appConfig);
    }
}
