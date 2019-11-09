package nikifor.tatarkin.weatherapp;

public class SettingModel {
    String cityName= "Saint Petersburg";

    private static SettingModel instance;
    private SettingModel(){ }

    public static SettingModel getInstance(){
        instance = instance == null? new SettingModel() : instance;
        return instance;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }
}
