package com.capg.Trainee_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("trainee")
public class Trainee {
	@Value("${trainee.id}")
	private int traineeId;
	@Value("${trainee.name}")
	private String traineeName;
	@Value("${technology}")
	private String technology;
	
	@Autowired
	@Qualifier("trainer")
	Trainer trainer;
	
	//private String trainerName = trainer.getTrainerName();
//	
//	public Trainee(int traineeId, String traineeName, String technology) {
//		super();
//		this.traineeId = traineeId;
//		this.traineeName = traineeName;
//		this.technology = technology;
//	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
//	public String getTrainerName() {
//		return trainerName;
//	}
//	public void setTrainerName(String trainerName) {
//		this.trainerName = trainerName;
//	}
	public void getTraineeDetails() {
		System.out.println("Trainee Details:");
		System.out.println("Trainee ID:"+getTraineeId());
		System.out.println("Trainee Name:"+getTraineeName());
		System.out.println("Trainee Technology:"+getTechnology());
		//System.out.println("Trainer Name:"+tragetTrainerName());
	}
	public void getTrainerDetails() {
		System.out.println("Trainer Details:");
		System.out.println("Trainee Name:"+trainer.getTrainerName());
		System.out.println("Expertise:"+trainer.getExpertise());
	}
}
