package com.capg.Trainee_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("trainer")
public class Trainer {
	@Value("${trainer.name}")
	private String trainerName;
	@Value("#{${expertise}}")
	private List<String> expertise;
//	public Trainer(String trainerName, List<String> expertise) {
//		super();
//		this.trainerName = trainerName;
//		this.expertise = expertise;
//	}	
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public List<String> getExpertise() {
		return expertise;
	}
	public void setExpertise(List<String> expertise) {
		this.expertise = expertise;
	}
}
