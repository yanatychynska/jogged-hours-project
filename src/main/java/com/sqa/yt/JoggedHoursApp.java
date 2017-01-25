/**
 * File Name: JoggedHoursApp.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 17, 2017
 */
package com.sqa.yt;

/**
 * JoggedHoursApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class JoggedHoursApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "Jogged Hours";
		String userName = AppBasics.greetUserAndGetName(appName);
		calcHoursJogged();
		AppBasics.farewellUser(userName, appName);
	}

	private static void calcHoursJogged() {
		int totalJoggedHours = 0;
		int avgJoggedHours;
		int day1NumHours;
		int day2NumHours;
		int day3NumHours;
		int day4NumHours;
		int day5NumHours;
		int day6NumHours;
		int day7NumHours;
		String day1NumHoursInput = AppBasics.requestInfoFromUser("How many hours you jogged on Monday?");
		day1NumHours = Integer.parseInt(day1NumHoursInput);
		totalJoggedHours += day1NumHours;
		String day2NumHoursInput = AppBasics.requestInfoFromUser("How many hours you jogged on Tuesday?");
		day2NumHours = Integer.parseInt(day2NumHoursInput);
		totalJoggedHours += day1NumHours + day2NumHours;
		String day3NumHoursInput = AppBasics.requestInfoFromUser("How many hours you jogged on Wednesday?");
		day3NumHours = Integer.parseInt(day3NumHoursInput);
		totalJoggedHours += day1NumHours + day2NumHours + day3NumHours;
		String day4NumHoursInput = AppBasics.requestInfoFromUser("How many hours you jogged on Thursday?");
		day4NumHours = Integer.parseInt(day4NumHoursInput);
		totalJoggedHours += day1NumHours + day2NumHours + day3NumHours + day4NumHours;
		String day5NumHoursInput = AppBasics.requestInfoFromUser("How many hours you jogged on Friday?");
		day5NumHours = Integer.parseInt(day5NumHoursInput);
		totalJoggedHours += day1NumHours + day2NumHours + day3NumHours + day4NumHours + day5NumHours;
		String day6NumHoursInput = AppBasics.requestInfoFromUser("How many hours you jogged on Saturday?");
		day6NumHours = Integer.parseInt(day6NumHoursInput);
		totalJoggedHours += day6NumHours;
		String day7NumHoursInput = AppBasics.requestInfoFromUser("How many hours you jogged on Sunday?");
		day7NumHours = Integer.parseInt(day7NumHoursInput);
		totalJoggedHours += day7NumHours;
		avgJoggedHours = totalJoggedHours / 7;
		if (totalJoggedHours < 10 && totalJoggedHours > 0) {
			System.out.println("Amateur Jogger");
		} else if (totalJoggedHours < 20) {
			System.out.println("Dedicated Jogger");
		} else if (totalJoggedHours < 40) {
			System.out.println("Advanced Jogger");
		} else {
			System.out.println("Premium Jogger");
		}
	}
}
