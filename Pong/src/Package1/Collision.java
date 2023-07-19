package Package1;

import java.util.Timer;
import java.util.TimerTask;

public class Collision {
    Timer collision;

    public Collision() {
        collision = new Timer();
        collision.scheduleAtFixedRate(new TimerTask() {
            
        	@Override
            public void run() {
        		// Überprüfen der Kollisionen des Balls mit den Bildschirmrändern
                if (GameVar.bally + 20 >= GameVar.screenheight) {
                    GameVar.balldiry = - 1;
                }
                
                if (GameVar.bally <= 0) {
                		GameVar.balldiry = 1;
                }
                
                if (GameVar.ballx + 20 >= GameVar.screenwidth) {
                   
                	GameVar.ballx = GameVar.screenwidth / 2 - 10;
                    GameVar.bally = GameVar.screenwidth / 2 - 10;
                    
                 // Ändern der Richtung des Balls und Erhöhen der Spielerpunkte
                    GameVar.balldirx = -1;
                    GameVar.playerpoints += 1;
                }
                
                if (GameVar.ballx <= 0) {
                    
                	 // Zurücksetzen der Position des Balls
                	GameVar.ballx = GameVar.screenwidth / 2 - 10;
                    GameVar.bally = GameVar.screenwidth / 2 - 10;
                    
                 // Ändern der Richtung des Balls und Erhöhen der Gegnerpunkte
                    GameVar.balldirx =  +1;
                    GameVar.enemypoints += 1;
                }
                
             // Überprüfen der Kollisionen des Balls mit dem Player
                if (GameVar.ballx < GameVar.x + 25 && GameVar.ballx > GameVar.x && GameVar.bally - 20 <= GameVar.y + 150 && GameVar.bally > GameVar.y) {
                    GameVar.balldirx = 1;
                }
                
             // Überprüfen der Kollisionen des Balls mit dem Gegner
                if (GameVar.ballx < GameVar.enemyx && GameVar.ballx > GameVar.enemyx - 20 && GameVar.bally - 20 <= GameVar.enemyy + 150 && GameVar.bally > GameVar.enemyy) {
                    GameVar.balldirx = -1;
                }
                
            }
        
        	//Timer Task Startverzögerung von 0 Millisekunden und in einer periode von 5 Millisekunden ausgeführt wird 	
        }, 0, 5);
    }
    
}

