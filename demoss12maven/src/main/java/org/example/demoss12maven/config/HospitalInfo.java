package org.example.demoss12maven.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HospitalInfo {

    @Value("${hospital.name}")
    private String hospitalName;

    @Value("${hospital.hotline}")
    private String hotline;

    @PostConstruct
    public void init() {
        System.out.println("========= THÔNG TIN BỆNH VIỆN =========");
        System.out.println("Tên: " + hospitalName);
        System.out.println("Hotline: " + hotline);
        System.out.println("=======================================");
    }
}