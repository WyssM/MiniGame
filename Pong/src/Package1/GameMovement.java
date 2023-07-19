package Package1;

import java.util.Timer;
import java.util.TimerTask;

public class GameMovement {
Timer move;
	public GameMovement() {
		
		// Erzeugen eines Timer-Objekts
		move = new Timer();
		
		// Planen und Ausführen einer TimerTask
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				// Überprüfen des Bewegungszustands des Spielers
				if(GameVar.moveup == true){
					
					// Wenn moveup = true ist und das Paddle nicht an der oberen Grenze ist, bewege das Paddle nach oben
					if(GameVar.y >= 20) {
						GameVar.y -=2;
					}
				}else if (GameVar.movedown == true){
					
					// Wenn movedown = true ist und das Paddle nicht an der unteren Grenze ist, bewege das Paddle nach unten
					if(GameVar.y <= GameVar.screenheight -200) {
						GameVar.y += 2;
					}
				}
			}
			
			//Timer Task Startverzögerung von 0 Millisekunden und in einer periode von 6 Millisekunden ausgeführt wird 	
			},0,6);
			
		}
}

	
	
	



