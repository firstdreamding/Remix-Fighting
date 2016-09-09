package entity;
import java.awt.event.KeyEvent;

import input.Keyboard;
public class Player {
	

	public void render() {
		if(Keyboard.isKeyPressed(KeyEvent.VK_SPACE)) {
			System.out.println("pressed");
		}
	}
}
