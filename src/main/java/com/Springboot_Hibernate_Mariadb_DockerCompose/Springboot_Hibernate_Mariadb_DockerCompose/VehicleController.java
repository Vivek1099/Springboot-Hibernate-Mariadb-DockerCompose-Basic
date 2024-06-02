package com.Springboot_Hibernate_Mariadb_DockerCompose.Springboot_Hibernate_Mariadb_DockerCompose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class VehicleController
{
    @Autowired
    VehicleRepository vrepo;

    @RequestMapping("/test")
    public String test()
    {
        return "This is demo vehicle project test";
    }

    @RequestMapping("/save")
    public String datasave(@RequestBody Vehicle vehicle)
    {
        vrepo.save(vehicle);
        return "Data Saved";
    }

    @RequestMapping("/show")
    List<Vehicle> datashow()
    {
        return vrepo.findAll();
    }
}
