package com.iesam.firstTime.features.appConfig.domain;

public interface AppConfigRepository {

    AppConfig getAppConfig();

    void saveAppConfig(AppConfig appConfig);
}

