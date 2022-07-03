package com.makaix.graphql001.configurer;

import com.makaix.graphql001.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;
import org.springframework.stereotype.Component;


@Component
public class UserConfigurer {

    @Bean
    RuntimeWiringConfigurer runtimeWiringConfigurer(UserService userService){
        return builder->
                builder.type("Query", wiring ->
                        wiring.dataFetcher("getById", env ->  userService.getById(Integer.parseInt(env.getArgument("id"))))
                                .dataFetcher("findAll", env -> userService.findAll())
        );
    }
}
