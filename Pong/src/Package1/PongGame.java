package Package1;

public class PongGame {

	public static void main(String[] args) {
		
		// Erzeugen und Initialisieren der verschiedenen Spielkomponenten
		new GameGui();
		new GameVar();
		new GameMovement();
		new GameDraw();
		new EnemyMovement();
		new BallMovement();
		new Collision();
	}

}
