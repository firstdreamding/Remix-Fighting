package input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;

public class Keyboard extends KeyAdapter {
	
	private static Set<Integer> pressedKeys = new HashSet<Integer>();
	private static Set<Integer> typedKeys = new HashSet<Integer>();
	
	public static boolean isKeyPressed (int keycode) {
		return pressedKeys.contains(keycode);
	}
	
	public static boolean isKeyTyped (int keycode) {
		return typedKeys.contains(keycode);
	}
	
	public void keyPressed (KeyEvent e) {
		if (!pressedKeys.contains(e.getKeyCode()))
			typedKeys.add(e.getKeyCode());
		pressedKeys.add(e.getKeyCode());
	}
	public void keyReleased (KeyEvent e) {
		pressedKeys.remove(e.getKeyCode());
	}
	
	public static void clear() {
		typedKeys.clear();
	}
}
