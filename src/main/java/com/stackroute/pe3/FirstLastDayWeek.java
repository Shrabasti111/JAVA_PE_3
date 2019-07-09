package com.stackroute.PE3;
import java.util.*;
import java.time.*;
import java.text.*;
public class FirstLastDayWeek {

    //this function calculates the last day of the week
      public String calculateLastDayWeek() {
          // Get calendar set to current date and time
          Calendar calendar = Calendar.getInstance();

          // Set the calendar to monday of the current week
          calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

          System.out.println();
          // Print dates of the current week starting on Monday
          DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
          System.out.println(dateFormat.format(calendar.getTime()));
          for (int i = 0; i <6; i++) {
              calendar.add(Calendar.DATE, 1);
          }
          return dateFormat.format(calendar.getTime()).toString();

      }

      //this function calculates the first day of the week
      public String calculateFirstDayWeek() {
          Calendar calendar = Calendar.getInstance();

          // Set the calendar to monday of the current week
          calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

          DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");

          return dateFormat.format(calendar.getTime()).toString();
      }

}
