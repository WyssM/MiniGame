package Package1;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class GameVar {
	
	static JFrame jf1;
	
	// Definieren der Fenstergröße
	static int screenwidth = 800, screenheight = 600; 
	
	// Player koordinaten
	static int x = 20, y = 185;		
	
	// Startkoordinaten des Gegners
	static int enemyx = 755, enemyy = 185;  
	
	// Startkoordinaten des Balls
	static int ballx= 200, bally = 200; 
	
	// Move Boolean
	static boolean moveup = false, movedown = false;
	
	//Anfangsrichtung des Balls
	static int balldirx = 1, balldiry = -1;
	
	// Definieren der Anfangspunkte
	static int playerpoints = 0, enemypoints = 0; 
	
	static Font pixelfont;
	
	
	public GameVar() {
		
		 // Einfügen und Anpassen der Schriftart. Verwendung eines Try-Catch-Blocks, um Abstürze zu vermeiden
		try {
		pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("D:\\Eclipse\\coders_crux.ttf")).deriveFont(125F);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("D:\\Eclipse\\coders_crux.ttf")));
		}catch (FontFormatException | IOException e) {
			 e.printStackTrace();
		}
	}
}

	

