package Package1;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
    Timer move;

    public BallMovement() {
    	// Erzeugen eines Timer-Objekts
        move = new Timer();
        
     // Planen und Ausführen einer TimerTask
        move.scheduleAtFixedRate(new TimerTask() {
            
        	@Override
            public void run() {
        		// Aktualisierung der Position des Balls basierend auf der Bewegungsrichtung
                GameVar.ballx += GameVar.balldirx;
                GameVar.bally += GameVar.balldiry;
            }
        	
        	//Timer Task Startverzögerung von 0 Millisekunden und in einer periode von 4 Millisekunden ausgeführt wird 	
        }, 0, 4);
    }
}

