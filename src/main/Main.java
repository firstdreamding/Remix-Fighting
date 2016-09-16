package main;

public class Main {
/*
 * This is the main class
 * 
 * Init starts up methods and classes and only runs them once.
 * Init will start up the graphic init which will start up the graphic thread.
 */
	private static Main main;
	private void init() {
		graphicInit();
	}
	
	private void graphicInit(){
		Thread loop = new Thread(new Loop(1500, 750, "Fighting Remix"));
		loop.start();
	}
	
	public static void main(String[] args) {
		main = new Main();
		main.init();		
	}
}
