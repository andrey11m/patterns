package com.example.patterns.factory;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(tags = "Factory pattern controller")
public class FactoryController {

    private final UserFactory userFactory;

    @GetMapping("/factory/{user}")
    public String createUser(@PathVariable(value = "user") String userType) {
        User user = userFactory.create(userType);
        return user.announce();
    }
}
