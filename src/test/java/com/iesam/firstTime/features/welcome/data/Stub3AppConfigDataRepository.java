
package com.iesam.firstTime.features.welcome.data;

import com.iesam.firstTime.features.appConfig.domain.AppConfig;
import com.iesam.firstTime.features.appConfig.domain.AppConfigRepository;

public class Stub3AppConfigDataRepository  implements AppConfigRepository {

    @Override
    public AppConfig getAppConfig() {
        return new AppConfig(1);
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
