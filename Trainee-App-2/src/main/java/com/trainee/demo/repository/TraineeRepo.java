package com.trainee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainee.demo.models.Trainee;

public interface TraineeRepo extends JpaRepository<Trainee,Integer> {

}
