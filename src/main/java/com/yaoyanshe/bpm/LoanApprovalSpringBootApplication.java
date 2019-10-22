package com.yaoyanshe.bpm;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.DecisionService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.event.EventListener;

/**
 * @author lishuailei
 */
@EnableProcessApplication
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
public class LoanApprovalSpringBootApplication {
	/*@EventListener
	private void processPostDeploy(PostDeployEvent event){
		runtimeService.startProcessInstanceByKey("loanApproval");
	}*/

//	@PostDeploy
//	public void evaluateDecisionTable(ProcessEngine processEngine){
//		DecisionService decisionService = processEngine.getDecisionService();
//		VariableMap variableMap = Variables.createVariables()
//				.putValue("season","Spring")
//				.putValue("guestCount",10);
//		DmnDecisionTableResult dmnDecisionRuleResult = decisionService.evaluateDecisionTableByKey("dish",variableMap);
//		String desireDish = dmnDecisionRuleResult.getSingleEntry();
//		System.out.println("Desired dish: "+ desireDish);
//	}

	public static void main(String[] args) {
		SpringApplication.run(LoanApprovalSpringBootApplication.class, args);
	}

}
