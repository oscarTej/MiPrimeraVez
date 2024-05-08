package com.iesam.firstTime.features.welcome.domain;

import com.iesam.firstTime.features.welcome.data.Stub2AppConfigDataReposiroty;
import com.iesam.firstTime.features.welcome.data.Stub3AppConfigDataRepository;
import com.iesam.firstTime.features.welcome.data.StubAppConfigDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShowWelcomeMessageUseCaseTest {

    private ShowWelcomeMessageUseCase showWelcomeMessageUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

        showWelcomeMessageUseCase=null;
    }

    @Test
    void cuandoObtengoUnNuloEntoncesNoMuestroElMensaje() {

        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(
                new StubAppConfigDataRepository()
        );
        boolean showMessage = showWelcomeMessageUseCase.execute();

        Assertions.assertTrue(showMessage);
    }
    @Test
    void cuandoObtengoUnCeroEntoncesMuestroElMensaje() {

        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(
                new Stub2AppConfigDataReposiroty()
        );

        boolean showMessage = showWelcomeMessageUseCase.execute();

        Assertions.assertFalse(showMessage);
    }

    @Test
    void cuandoObtengoUnnumeroDiferente0entoncesnoMuestroMensaje() {
        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(
                new Stub3AppConfigDataRepository()
        );

        boolean showMessage = showWelcomeMessageUseCase.execute();

        Assertions.assertFalse(showMessage);
    }



}