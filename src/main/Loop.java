package main;

import javax.swing.JFrame;

public class Loop extends JFrame implements Runnable{

    /**
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
    public void run() {
        while(Var.running){
        	try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println(i);
        	i++;
        }

    }


}