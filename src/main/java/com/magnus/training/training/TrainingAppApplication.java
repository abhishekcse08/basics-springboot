package com.magnus.training.training;

import com.magnus.training.training.concepts.CarBMW;
import com.magnus.training.training.employee.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TrainingAppApplication{ //implements CommandLineRunner {

	/*private final CarBMW carBMW;

    public TrainingAppApplication(CarBMW carBMW) {
        this.carBMW = carBMW;
    }*/

    public static void main(String[] args) {
		ConfigurableApplicationContext run =
				SpringApplication.run(TrainingAppApplication.class, args);
		Employee e = run.getBean(Employee.class);
		e.performSomeTask();
		//run.close();
	}


	/*@Override
	public void run(String... args) throws Exception {
		carBMW.drive();
	}*/
}
