package com.example.webclientsession;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rm")
@RequiredArgsConstructor
public class RMCharacterListController {

   private final RMService rmService;


    @GetMapping
    public  List<Results> getCharacters() {

        return rmService.getCharacters();
    }


}



