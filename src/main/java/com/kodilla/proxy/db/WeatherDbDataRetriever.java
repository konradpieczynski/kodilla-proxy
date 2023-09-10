package com.kodilla.proxy.db;

public interface WeatherDbDataRetriever {
   String getWeatherData() throws InterruptedException;
}