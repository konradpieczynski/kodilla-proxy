package com.kodilla.proxy;

import com.kodilla.proxy.db.*;

import java.util.Random;

public class ProxyApp {

   public static void main(String[] args) throws InterruptedException {
      long begin = System.currentTimeMillis();
      DbDataRetriever dbDataRetriever = new LazyDataRetrieverProxy();
      for (int n = 0; n < 5; n++) {
         int number = new Random().nextInt(100);
         if (number < 10)
            System.out.println(dbDataRetriever.getFirstValue());
         else if (number < 20)
            System.out.println(dbDataRetriever.getSecondValue());
         else if (number < 30)
           System.out.println(dbDataRetriever.getThirdValue());

         System.out.println("Execution #" + n + " just finished");
      }

      long end = System.currentTimeMillis();
      System.out.println("The execution took: " + (end - begin) + " [ms]");

      long begin2 = System.currentTimeMillis();
      WeatherDbDataRetriever weatherDbDataRetriever = new LazyWeatherDataRetrieverProxy();
      for (int n = 0; n < 5; n++) {
         int number = new Random().nextInt(100);
         if (number < 20)
            System.out.println(weatherDbDataRetriever.getWeatherData());

         System.out.println("Execution #" + n + " just finished");
      }

      long end2 = System.currentTimeMillis();
      System.out.println("The execution took: " + (end2 - begin2) + " [ms]");
   }

}