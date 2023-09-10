package com.kodilla.proxy.db;

public class WeatherDataRetriever implements WeatherDbDataRetriever {

   public WeatherDataRetriever() throws InterruptedException {
      Thread.sleep(5000);
   }

   @Override
   public String getWeatherData() {
      return "Weather data";
   }
}