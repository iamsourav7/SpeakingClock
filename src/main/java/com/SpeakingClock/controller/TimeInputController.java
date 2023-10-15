package com.SpeakingClock.controller;

import com.SpeakingClock.service.SpeakingClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TimeInputController {


    @Autowired
    private SpeakingClockService speakingClockService;

    @GetMapping("/convert")
    public String convertTimeToWords(@RequestParam String time) {
        return speakingClockService.convertTimeToWords(time);
    }


}
