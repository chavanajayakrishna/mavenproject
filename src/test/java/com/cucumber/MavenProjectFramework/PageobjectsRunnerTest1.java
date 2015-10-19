package com.cucumber.MavenProjectFramework;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features= "src/test/resourse/multiplesitesFeature.feature")
public class PageobjectsRunnerTest1 {

}
