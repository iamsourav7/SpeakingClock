package com.SpeakingClock;

import com.SpeakingClock.service.SpeakingClockService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpeakingClockApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	public void testConvertTimeToWords() {
		SpeakingClockService speakingClockService = new SpeakingClockService();

		// Test midday
		assertEquals("It's Midday", speakingClockService.convertTimeToWords("12:00"));

		// Test midnight
		assertEquals("It's Midnight", speakingClockService.convertTimeToWords("00:00"));

		// Test other times
		assertEquals("It's ten", speakingClockService.convertTimeToWords("10:00"));
		assertEquals("It's six thirty", speakingClockService.convertTimeToWords("18:30"));
	}

	@Test
	public void testConvertTimeToWordsInvalidFormat() {
		SpeakingClockService speakingClockService = new SpeakingClockService();

		// Test invalid format
		assertEquals("Invalid time format. Please provide time in HH:mm format.",
				speakingClockService.convertTimeToWords("invalidTime"));
	}



}
