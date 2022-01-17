package com.example.feigndemo.gateway;

import com.example.feigndemo.dto.PokemonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "${gateway.pokemon.url}",
        name = "getPokemonInfo")
public interface PokemonGateway {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "${gateway.pokemon.ok}",
            consumes = "application/json"
    )
    PokemonDto simulateOk();
}
