package com.mphasis.weatherapp;

public class WeatherService {
	public String getWeather(String city) {
		if(city.equals("Pune"))
			return "Hot..Sunny Weather";
		if(city.equals("Delhi"))
			return "windy, hot.";
		else
			return "Unkown";
	}

}
