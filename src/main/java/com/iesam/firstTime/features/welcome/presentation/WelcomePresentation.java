package com.iesam.firstTime.features.welcome.presentation;

import com.iesam.firstTime.features.appConfig.data.AppConfigDataRepository;
import com.iesam.firstTime.features.appConfig.data.local.FileLocalDataSource;
import com.iesam.firstTime.features.welcome.domain.ShowWelcomeMessageUseCase;

public class WelcomePresentation {
    public static void showWelcomeMessage (){
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(
                new AppConfigDataRepository(new FileLocalDataSource()));

        boolean isFirstTime = showWelcomeMessageUseCase.execute();

        if (isFirstTime){
            System.out.println("bienvenidos a la aplicacion");
        }
    }
}
