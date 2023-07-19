package Package1;

import java.util.Timer;
import java.util.TimerTask;

public class EnemyMovement {
Timer move;
	public EnemyMovement() {
		
		// Erzeugen eines Timer-Objekts
		move = new Timer();
		
		// Planen und Ausführen einer TimerTask
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				// Überprüfen der Position des Balls und Bewegung des Gegners entsprechend, Gegener Bewegeung erst nach Mittellinie + 100 Pixel
				if(GameVar.ballx >= GameVar.screenwidth/2 +100) {
					
			
				if(GameVar.bally == GameVar.enemyy) {
					
				}else if (GameVar.bally > GameVar.enemyy + 75) {
					
					// Bewegung des Gegners nach unten, wenn der Ball unterhalb der mitte des Gegners liegt
					if(GameVar.enemyy <= GameVar.screenheight -200) {
						GameVar.enemyy += 1;
					}
				}else if (GameVar.enemyy < GameVar.enemyy +75) {
					
					// Bewegung des Gegners nach oben, wenn der Ball oberhalb der mitte des Gegners liegt
					if(GameVar.enemyy >= 20) {
						GameVar.enemyy -= 1;
					}
				}
			}
				
			}
	//Timer Task Startverzögerung von 0 Millisekunden und in einer periode von 6 Millisekunden ausgeführt wird 		
	},0,6);

}
}
