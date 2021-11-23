package com.geoname.sugestionss.service;

import com.geoname.sugestionss.model.Sugestions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SugestionsServiceImpl implements SugestionsService{
    private final List<Sugestions> sugestionsList = new ArrayList<>();

    public SugestionsServiceImpl(){
        sugestionsGeoname();
    }

    @Override
    public void add(Sugestions sugestions) {
        sugestionsList.add(sugestions);
    }

    @Override
    public void delete(Sugestions sugestions) {
        sugestionsList.remove(sugestions);
    }

    @Override
    public List<Sugestions> all() {
        return sugestionsList;
    }

    @Override
    public void update(Sugestions sugestions) {
        sugestionsList.add(sugestions);
    }

    @Override
    public Sugestions get(int geonameId) {
        return sugestionsList.get(geonameId);
    }

    @Override
    public Sugestions findById(String id) {
        return sugestionsList.get(Integer.parseInt(id));
    }

    @Override
    public Sugestions delete(Integer id) {
        sugestionsList.remove(id);
        return null;
    }

    private void sugestionsGeoname(){
        sugestionsList.add(new Sugestions("London, ON, Canada","42.98339","-81.23304",0.9));
        sugestionsList.add(new Sugestions("London, OH, USA","39.88645","-83.44825",0.5));
        sugestionsList.add(new Sugestions("London, KY, USA","37.12898","-84.08326",0.5));
        sugestionsList.add(new Sugestions("Londontowne, MD, USA","38.93345","-76.54941",0.3));
    }
}
