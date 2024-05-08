package com.iesam.firstTime.features.vote.presentation;

import com.iesam.firstTime.features.appConfig.data.AppConfigDataRepository;
import com.iesam.firstTime.features.appConfig.data.local.FileLocalDataSource;
import com.iesam.firstTime.features.vote.domain.VoteAppUseCase;

public class VotePresentation {
    public static void showVoteApp(){

        VoteAppUseCase voteAppUseCase = new VoteAppUseCase(new AppConfigDataRepository(new FileLocalDataSource()));

        boolean showVoteApp = voteAppUseCase.execute();

        if (showVoteApp){
            System.out.println("por favor vote nuestra app");
        }
    }
}
