package org.miniecom.miniecomtow;

import org.springframework.boot.SpringApplication;

public class TestMIniEcomtowApplication {

    public static void main(String[] args) {
        SpringApplication.from(MIniEcomtowApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
