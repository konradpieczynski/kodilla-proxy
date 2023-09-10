package com.kodilla.proxy.db;

public class LazyWeatherDataRetrieverProxy implements WeatherDbDataRetriever {

   private WeatherDbDataRetriever retriever;

   @Override
   public String getWeatherData() throws InterruptedException {
      if (retriever == null)
         retriever = new WeatherDataRetriever();
      return retriever.getWeatherData();
   }
}