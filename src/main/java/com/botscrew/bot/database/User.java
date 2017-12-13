package com.botscrew.bot.database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    private String id;

    private String first_name;
    private String last_name;
    private String profile_pic;
    private String locale;
    private Number timezone;
    private String gender;
    private Boolean is_payment_enabled;

    public User() {
    }

    public User(String id, String first_name, String last_name, String profile_pic, String locale, Number timezone, String gender, Boolean is_payment_enabled) {

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.profile_pic = profile_pic;
        this.locale = locale;
        this.timezone = timezone;
        this.gender = gender;
        this.is_payment_enabled = is_payment_enabled;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Number getTimezone() {
        return timezone;
    }

    public void setTimezone(Number timezone) {
        this.timezone = timezone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getIs_payment_enabled() {
        return is_payment_enabled;
    }

    public void setIs_payment_enabled(Boolean is_payment_enabled) {
        this.is_payment_enabled = is_payment_enabled;
    }
}
