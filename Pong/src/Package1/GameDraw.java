package Package1;

import java.awt.*;

import javax.swing.JLabel;

public class GameDraw extends JLabel {



	// Überschreiben der paintComponent-Methode
	protected void paintComponent (Graphics g) {
		
		// Aufruf der paintComponent-Methode der übergeordneten Klasse
		super.paintComponent(g);  
		
		// Casten der Graphics g auf ein 2D-Objekt
		Graphics2D g2d = (Graphics2D) g; 
		
		// Aktivieren des Antialiasing für weichere Kanten
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON ); 
		
		//Hintergrundfarbe definieren
		g.setColor(Color.black); 
		
		// Zeichnen des Hintergrunds über das ganze Fenster
		g.fillRect(0, 0, GameVar.screenwidth, GameVar.screenheight); 
		
		 // Farbe der mittellinie definieren
		g.setColor(Color.white); 
		
		// Zeichnen der Mittellinie mit weißen Rechtecken
		for(int i = 0; i  <= 30; i++ ) {
			g.fillRect(GameVar.screenwidth/2 -5, i * 20, 10, 10);
		}
		
		// Player Zeichnen
		g.fillRect(GameVar.x, GameVar.y, 25	, 150); 
		
		//Enemy Zeichnen
		g.fillRect(GameVar.enemyx, GameVar.enemyy, 25	, 150);
		
		// Setzen der verwendeten Schriftart
		g.setFont(GameVar.pixelfont);
		
		// Zeichnen der Punktzahlen für Spieler und Gegner
		g.drawString("" + GameVar.playerpoints, GameVar.screenwidth/2 -95, 75);
		g.drawString("" + GameVar.enemypoints, GameVar.screenwidth/2 +50, 75);
		
		
		// Zeichnen des Balls
		g.fillRect(GameVar.ballx, GameVar.bally,20,20);
		
		
		// Repaint aufrufen, um die Komponente neu zu zeichnen
		repaint();
		
		
	}
}
