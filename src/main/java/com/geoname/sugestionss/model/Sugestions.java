package com.geoname.sugestionss.model;

public class Sugestions {
    private final String name;
    private final String latitude;
    private final String longitude;
    private final double score;

    public Sugestions(String name, String latitude, String longitude, double score) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public double getScore() {
        return score;
    }
}
