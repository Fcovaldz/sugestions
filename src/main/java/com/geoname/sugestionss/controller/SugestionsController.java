package com.geoname.sugestionss.controller;

import com.geoname.sugestionss.model.Sugestions;
import com.geoname.sugestionss.service.SugestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SugestionsController {
    private final SugestionsService sugestionsService;
    public SugestionsController(@Autowired SugestionsService sugestionsService){
        this.sugestionsService = sugestionsService;
    }
    @GetMapping("/sugestions")
    public Iterable<Sugestions> getSugestions()
    {
        return sugestionsService.all();
    }
    @GetMapping("/sugestions/{id}")
    public Sugestions getSugestions(@PathVariable Integer id){
        return sugestionsService.get(id);
    }
    @PostMapping("/sugestions")
    public void addSugestions(@RequestBody Sugestions sugestions)
    {
        sugestionsService.add(sugestions);
    }
    @PutMapping("/sugestions")
    public void updateSugestion(@RequestBody Sugestions sugestions)
    {
        sugestionsService.update(sugestions);
    }
    @DeleteMapping("/sugestions/{id}")
    public Sugestions removeSugestions(@PathVariable Integer id)
    {
        return sugestionsService.delete(id);
    }
    Sugestions findById(@PathVariable("id") String id)
    {
        int geonameId = Integer.parseInt(id) - 1;
        return sugestionsService.findById(String.valueOf(geonameId));
    }
}
