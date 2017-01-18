/**
 * File Name: AppBasic.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 14, 2017
 */
package com.sqa.yt;

import java.util.*;

public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String userName, String appName) {
		System.out.println("Thank you for using the " + appName + "application");
		System.out.println("Good Bye " + userName);
	}

	/**
	 * @param appName
	 * @return
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Hello, Welcome to the " + appName + "App.");
		System.out.print("Could I please get your name?");
		return scanner.nextLine();
	}

	/**
	 * @param question
	 * @return
	 */
	public static String requestInfoFromUser(String question) {
		String response;
		System.out.println(question + "");
		response = scanner.nextLine();
		return response;
	}
}
