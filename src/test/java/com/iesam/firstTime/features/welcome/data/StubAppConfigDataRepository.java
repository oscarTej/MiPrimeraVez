package com.iesam.firstTime.features.welcome.data;

import com.iesam.firstTime.features.appConfig.domain.AppConfig;
import com.iesam.firstTime.features.appConfig.domain.AppConfigRepository;

public class StubAppConfigDataRepository implements AppConfigRepository {

    @Override
    public AppConfig getAppConfig() {
        return null;
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
