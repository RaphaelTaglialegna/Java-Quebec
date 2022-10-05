package br.com.bootcamp;

public class Greetings {
    public static String getMessage(double hour) {
      if (hour >= 5 && hour <= 12) {
        return "Good Morning";
      }

      else if (hour >= 13 && hour <= 17) {
        return "Good Afternoon";
      }
      
      else if (hour >= 18 && hour <= 23) {
        return "Good Evining";
      }
      
      else if (hour >= 0  && hour <= 4) {
        return "Good Night";
      }
      return "Wrong number time";

    }
}
