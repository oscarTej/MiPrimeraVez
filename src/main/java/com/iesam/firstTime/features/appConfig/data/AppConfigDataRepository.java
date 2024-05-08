package com.iesam.firstTime.features.appConfig.data;


import com.iesam.firstTime.features.appConfig.data.local.FileLocalDataSource;
import com.iesam.firstTime.features.appConfig.domain.AppConfig;
import com.iesam.firstTime.features.appConfig.domain.AppConfigRepository;

public class AppConfigDataRepository implements AppConfigRepository {


    private final FileLocalDataSource fileLocalDataSource;



    public AppConfigDataRepository(FileLocalDataSource fileLocalDataSource) {
            this.fileLocalDataSource = fileLocalDataSource;




    }

        @Override
        public AppConfig getAppConfig() {
            return fileLocalDataSource.obtain();
        }

        @Override
        public void saveAppConfig(AppConfig appConfig) {
            fileLocalDataSource.save(appConfig);
        }
    }

