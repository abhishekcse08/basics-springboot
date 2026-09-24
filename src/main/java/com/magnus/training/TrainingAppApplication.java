package com.magnus.training;

import com.magnus.training.employee.EmployeeDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.magnus.training.training.jpa")
public class TrainingAppApplication{ //implements CommandLineRunner {

	/*private final CarBMW carBMW;

    public TrainingAppApplication(CarBMW carBMW) {
        this.carBMW = carBMW;
    }*/

    public static void main(String[] args) {
		ConfigurableApplicationContext run =
				SpringApplication.run(TrainingAppApplication.class, args);
		EmployeeDTO e = run.getBean(EmployeeDTO.class);
		e.performSomeTask();
		//run.close();
	}


	/*@Override
	public void run(String... args) throws Exception {
		carBMW.drive();
	}*/
}
