package com.geoname.sugestionss.controller;

import com.geoname.sugestionss.model.Sugestions;
import com.geoname.sugestionss.service.SugestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SugestionsController {
    private final SugestionsService sugestionsService;
    public SugestionsController(@Autowired SugestionsService sugestionsService){
        this.sugestionsService = sugestionsService;
    }
    @GetMapping("/sugestions/{id}")
    Sugestions findById(@PathVariable("id") String id)
    {
        int geonameId = Integer.parseInt(id) - 1;
        return sugestionsService.findById(String.valueOf(geonameId));
    }
}
