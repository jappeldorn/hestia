package com.appel.hestia.cucumber.stepdefs;

import com.appel.hestia.HestiaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HestiaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
