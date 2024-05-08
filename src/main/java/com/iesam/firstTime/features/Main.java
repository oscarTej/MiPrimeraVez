package com.iesam.firstTime.features;

import com.iesam.firstTime.features.appConfig.presentation.AppConfigPresentation;
import com.iesam.firstTime.features.vote.presentation.VotePresentation;
import com.iesam.firstTime.features.welcome.presentation.WelcomePresentation;

public class Main {

    public static void main (String[] args){
        AppConfigPresentation.AppConfigOpened();
        WelcomePresentation.showWelcomeMessage();
        VotePresentation.showVoteApp();


    }
}
