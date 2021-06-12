package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.DemoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationIT {

    @Value("${env}")
    private String env;

    @Value("${envName2}")
    private String envName2;

    @Test
    public void contextLoads() {
        System.out.println("my test env: " + env);
        System.out.println("my test envName2: " + envName2);

    }

}