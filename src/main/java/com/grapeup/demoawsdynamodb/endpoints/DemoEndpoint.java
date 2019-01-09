package com.grapeup.demoawsdynamodb.endpoints;

import com.grapeup.demoawsdynamodb.entities.Demo;
import com.grapeup.demoawsdynamodb.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DemoEndpoint {

    @Autowired
    DemoRepository demoRepository;

    @PostMapping("/demo")
    public Demo createDemo(@RequestBody Demo demo) {
        return demoRepository.save(demo);
    }

    @GetMapping("/demo/{id}")
    public Demo getDemo(@PathVariable String id) {
        Optional<Demo> demoOpt = demoRepository.findById(id);
        if (demoOpt.isPresent()) {
            return demoOpt.get();
        }
        throw new RuntimeException("Demo item not found");
    }
}
