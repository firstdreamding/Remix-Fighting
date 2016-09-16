package main;
import entity.Player;
import main.Hud;

import javax.swing.JFrame;

public class Loop extends JFrame implements Runnable{

    /*
     * 
     */
	
	int i = 0;
	
    private static final long serialVersionUID = 1L;
    Loop(int w, int h,String name){
        setSize(w,h);
        setName(name);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    
    /*
     * This is the run class that loops over and over. The thread buffers
     * the program so that it runs 60 frames every 1 second
     */
    public void run() {
    Player player = new Player();
    Hud hud = new Hud();
        while(Var.running){
        	try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	player.render();
        	hud.render();
        }

    }


}