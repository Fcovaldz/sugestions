package com.geoname.sugestionss.service;

import com.geoname.sugestionss.model.Sugestions;

import java.util.List;

public interface SugestionsService {
    void add(Sugestions sugestions);
    void delete( Sugestions sugestions);
    List<Sugestions> all();
    Sugestions findById(String id);
}
