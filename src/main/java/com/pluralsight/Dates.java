package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTimeEST = LocalTime.now(ZoneId.of("America/New_York"));
        LocalTime currentTimeGMT = LocalTime.now(ZoneId.of("Etc/GMT"));
        LocalDateTime currentDateTime = LocalDateTime.now();
        String output1 = currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        String output2 = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String output3 = currentDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy"));
        String output4 = currentDate.format(DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy"))
                    + " " + currentTimeGMT.format(DateTimeFormatter.ofPattern("H:m"));
        String output5 = currentTimeEST.format(DateTimeFormatter.ofPattern("h:m a"))
                + " on " + currentDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        System.out.println(output1 + "\n" + output2 + "\n" + output3 + "\n" + output4 + "\n" + output5);
    }
}
