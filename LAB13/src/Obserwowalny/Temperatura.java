package Obserwowalny;

import Obserwatorzy.ObserwowalnyTerm;

import java.util.ArrayList;

public class Temperatura {
    private double stopnieCelsjusza;
    private ArrayList<ObserwowalnyTerm> termometry;

    public Temperatura(double stopnieCelsjusza) {
        this.stopnieCelsjusza = stopnieCelsjusza;
        this.termometry = new ArrayList<>();
    }

    public double getStopnieCelsjusza() {
        return stopnieCelsjusza;
    }

    public void zwiekszTemperature(double wzrostTemperatury) {
        stopnieCelsjusza += wzrostTemperatury;
        pokazTemperature();
        powiadomTermometry();
    }

    private void pokazTemperature() {
        System.out.println("\nTemperatura " + stopnieCelsjusza + " stopni Celsjusza");
    }

    public void dodajTermometr(ObserwowalnyTerm termometr) {
        termometry.add(termometr);
    }

    private void powiadomTermometry() {
        for (ObserwowalnyTerm termometr : termometry) {
            termometr.zaktualizujTemperature(this);
        }
    }
}
