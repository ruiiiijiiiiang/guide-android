package edu.vanderbilt.vm.guide.util;

/**
 * This class holds singletons of certain objects we need to share
 * throughout the application, such as the user's agenda.  This is
 * simpler and easier than using a SQLite database to hold the agenda
 * and allows us to use several methods to make data transactions
 * with the agenda easier.
 * 
 * @author nicholasking
 *
 */
public class GlobalState {

	private static Agenda userAgendaSingleton = new Agenda();
	
	private GlobalState() { 
		throw new AssertionError("Do not instantiate this class.");
	}
	
	public static Agenda getUserAgenda() {
		return userAgendaSingleton;
	}
	
}
