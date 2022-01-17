package com.example.feigndemo.service;

import com.example.feigndemo.dto.PokemonDto;
import com.example.feigndemo.gateway.PokemonGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    PokemonGateway pokemonGateway;

    public PokemonDto getPokemonInfoFromExternalApi() {
        return pokemonGateway.simulateOk();
    }
}
