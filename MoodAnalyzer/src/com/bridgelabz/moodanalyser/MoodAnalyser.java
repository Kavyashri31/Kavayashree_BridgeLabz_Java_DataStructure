package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public MoodAnalyser() {
		super();
	}

	public String analyseMood(String message) throws MoodAnalysisException {
		this.message = message;
		return analyseMood();

	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Please enter proper message.");
		}
	}

	public String analyseMoodv1(String message) {
		this.message = message;
		return analyseMoodv1();

	}

	public String analyseMoodv1() {
		try {
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

}
