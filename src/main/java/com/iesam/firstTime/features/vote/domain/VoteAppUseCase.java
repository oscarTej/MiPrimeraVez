package com.iesam.firstTime.features.vote.domain;

import com.iesam.firstTime.features.appConfig.domain.AppConfig;
import com.iesam.firstTime.features.appConfig.domain.AppConfigRepository;

public class VoteAppUseCase {

    private AppConfigRepository appConfigRepository;

    private int totalOpened = 5;

    public VoteAppUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }

    public boolean execute (){
        AppConfig appConfig = appConfigRepository.getAppConfig();
        return appConfig != null && appConfig.countTimeOpened >= totalOpened;
    }
}
