package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

class MoodAnalyserTest {

	@Test
	void givenSadMessageShouldReturnSAD() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMoodv1("I am in Sad Mood");
		Assert.assertEquals(mood, "SAD");
	}

	@Test
	void givenAnyMessageShouldReturnHAPPY() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMoodv1("I am in Any Mood");
		Assert.assertEquals(mood, "HAPPY");
	}

	@Test
	void givenSadMessageInConstructorShouldReturnSAD() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMoodv1();
		Assert.assertEquals(mood, "SAD");
	}

	@Test
	void givenAnyMessageInConstructorShouldReturnHAPPY() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMoodv1();
		Assert.assertEquals(mood, "HAPPY");
	}

	@Test
	void givenNullMoodShouldReturnHAPPY() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			Assert.assertEquals(mood, "HAPPY");
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

}
