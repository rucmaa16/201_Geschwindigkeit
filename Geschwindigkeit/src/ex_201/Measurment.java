/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_201;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author fritz
 */
public class Measurment {
    private LocalDate date;
    private LocalTime time;
    private String zeichen;
    private double gemessen;
    private double erlaubt;

    public Measurment(LocalDate date, LocalTime time, String zeichen, double gemessen, double erlaubt) {
        this.date = date;
        this.time = time;
        this.zeichen = zeichen;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getZeichen() {
        return zeichen;
    }

    public double getGemessen() {
        return gemessen;
    }

    public double getErlaubt() {
        return erlaubt;
    }
    
}
