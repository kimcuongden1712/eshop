package com.eshop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.eshop.entity","com.eshop.admin.user"})
public class EShopAdminApplication {

    /**
     * Main application EShop Admin
     * @param args something like that
     */
    public static void main(String[] args) {
        SpringApplication.run(EShopAdminApplication.class, args);
    }

}
