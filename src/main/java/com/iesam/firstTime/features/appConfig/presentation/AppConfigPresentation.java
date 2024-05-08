package com.iesam.firstTime.features.appConfig.presentation;

import com.iesam.firstTime.features.appConfig.data.AppConfigDataRepository;
import com.iesam.firstTime.features.appConfig.data.local.FileLocalDataSource;

import com.iesam.firstTime.features.appConfig.domain.IncrementAppOpenedUseCase;

public class AppConfigPresentation {

    public static void AppConfigOpened (){


            IncrementAppOpenedUseCase incrementAppOpenedUseCase = new IncrementAppOpenedUseCase(
                    new AppConfigDataRepository(new FileLocalDataSource()));
            incrementAppOpenedUseCase.execute();
        }
    }








