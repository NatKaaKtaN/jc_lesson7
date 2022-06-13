package lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
  //  @JsonProperty("DailyForecasts")  // затрудняюсь с указанием property
    private String city;
    private String date;
    private float temperatureMinimum;
    private float temperatureMaximum;
    private String unit;

    public Weather(){
    }

    public Weather(String city, String date, float temperatureMinimum, float temperatureMaximum, String unit) {
        this.city = city;
        this.date = date;
        this.temperatureMinimum = temperatureMinimum;
        this.temperatureMaximum = temperatureMaximum;
        this.unit = unit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTemperatureMinimum() {
        return temperatureMinimum;
    }

    public void setTemperatureMinimum(float temperatureMinimum) {
        this.temperatureMinimum = temperatureMinimum;
    }

    public float getTemperatureMaximum() {
        return temperatureMaximum;
    }

    public void setTemperatureMaximum(float temperatureMaximum) {
        this.temperatureMaximum = temperatureMaximum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", temperatureMinimum=" + temperatureMinimum +
                ", temperatureMaximum=" + temperatureMaximum +
                ", unit='" + unit + '\'' +
                '}';
    }
}

