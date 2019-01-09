package com.grapeup.demoawsdynamodb.repositories;

import com.grapeup.demoawsdynamodb.entities.Demo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface DemoRepository extends
        CrudRepository<Demo, String> {
    Optional<Demo> findById(String id);
}