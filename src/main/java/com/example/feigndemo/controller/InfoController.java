package com.example.feigndemo.controller;

import com.example.feigndemo.dto.PokemonDto;
import com.example.feigndemo.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(
        value = "/info",
        //consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class InfoController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping(path = "/ok")
    public ResponseEntity<PokemonDto[]> testeOk() {
        return new ResponseEntity(pokemonService.getPokemonInfoFromExternalApi(), HttpStatus.OK);
    }
}
