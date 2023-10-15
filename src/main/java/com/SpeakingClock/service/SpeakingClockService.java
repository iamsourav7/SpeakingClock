package com.SpeakingClock.service;

import com.SpeakingClock.util.NumberToWords;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SpeakingClockService {

    public String convertTimeToWords(String time) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            Date date = dateFormat.parse(time);

            int hours = date.getHours();
            int minutes = date.getMinutes();

            if (time.equals("12:00")) {
                return "It's Midday";
            } else if (time.equals("00:00")) {
                return "It's Midnight";
            } else {
                String hoursInWords = (hours <= 12) ? NumberToWords.convertToWords(hours) : NumberToWords.convertToWords(hours - 12);
                String minutesInWords = (minutes != 0) ? NumberToWords.convertToWords(minutes) : "";

                return "It's " + hoursInWords + (minutes != 0 ? " " + minutesInWords : "");
            }
        } catch (ParseException e) {
            // Log the exception or handle it appropriately
            return "Invalid time format. Please provide time in HH:mm format.";
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
            return "An error occurred while processing the request.";
        }
    }
}
