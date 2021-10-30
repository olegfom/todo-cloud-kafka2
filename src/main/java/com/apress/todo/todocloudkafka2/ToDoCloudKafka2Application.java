package com.apress.todo.todocloudkafka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;

import com.apress.todo.cloud.OrderBinder;

//EnableBinding will be Deprecated as of 3.1 in favor of functional programming model, stay tuned for the next tutorials
@EnableBinding(value = {OrderBinder.class})
@SpringBootApplication
@ComponentScan(basePackages={"com.apress.todo"})
public class ToDoCloudKafka2Application {

    public static void main(String[] args) {
        SpringApplication.run(ToDoCloudKafka2Application.class, args);
    }

}
