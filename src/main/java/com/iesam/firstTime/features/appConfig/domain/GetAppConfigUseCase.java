package com.iesam.firstTime.features.appConfig.domain;

public class GetAppConfigUseCase {


        private AppConfigRepository appConfigRepository;

        public GetAppConfigUseCase(AppConfigRepository appConfigRepository) {
            this.appConfigRepository = appConfigRepository;
        }


        public AppConfig execute(){
            return appConfigRepository.getAppConfig();
        }
    }

