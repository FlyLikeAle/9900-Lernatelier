package com.mycompany.la;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
/**
 * 
 * @author Alessandro Baumgartner
 */

@Named(value = "userInputBean")
@ApplicationScoped
public class UserInputBean {
    private String kids;
    private String weekdays;
    private String weather;
    private String schooltime;
    private String time;
    

    public UserInputBean() {
    }

    public String getKids() {
        return kids;
    }

    public String getWeekdays() {
        return weekdays;
    }

    public String getWeather() {
        return weather;
    }

    public String getSchooltime() {
        return schooltime;
    }

    public String getTime() {
        return time;
    }

    public void setKids(String kids) {
        this.kids = kids;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setSchooltime(String schooltime) {
        this.schooltime = schooltime;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
  }
   

