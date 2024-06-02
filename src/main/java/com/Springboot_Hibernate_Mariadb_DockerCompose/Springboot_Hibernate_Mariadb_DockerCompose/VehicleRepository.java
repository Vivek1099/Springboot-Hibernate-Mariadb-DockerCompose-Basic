package com.Springboot_Hibernate_Mariadb_DockerCompose.Springboot_Hibernate_Mariadb_DockerCompose;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
