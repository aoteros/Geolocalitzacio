package net.infobosccoma.titulars.models.business.entities;

import java.util.ArrayList;


public class PuntsInteres {

    private int id;
    private double latitude, longitude;
    private String name, city;


    public PuntsInteres(int id, double latitude, double longitude, String name, String city) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @SuppressWarnings("serial")
    public static class Llista extends ArrayList<PuntsInteres> {

    }

}
