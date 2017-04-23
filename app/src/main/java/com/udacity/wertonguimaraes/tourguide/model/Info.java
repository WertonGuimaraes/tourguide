package com.udacity.wertonguimaraes.tourguide.model;

/**
 * Created by wertonguimaraes on 27/03/17.
 */

public class Info {

    private int id;
    private String name;
    private String street;
    private String phone;
    private String description;
    private int photo;

    public Info(int id, String name, String street, String phone, String description, int photo) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.phone = phone;
        this.description = description;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


}
