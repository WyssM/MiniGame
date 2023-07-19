package Package1;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameGui {

	public GameGui() {
		
		// Erzeugen des Fensters
		  GameVar.jf1 = new JFrame(); 
		  
		  	// Festlegen der Fenstergrösse
	        GameVar.jf1.setSize(GameVar.screenwidth, GameVar.screenwidth); 
	        
	        // Festlegen des Fenstertitels
	        GameVar.jf1.setTitle("Pong"); 
	        
	        // Beenden der Anwendung beim Schliessen des Fensters
	        GameVar.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        
	        // Verwenden eines benutzerdefinierten Layouts (null)
	        GameVar.jf1.setLayout(null); 
	        
	        // Deaktivieren der Grössenänderbarkeit des Fensters
	        GameVar.jf1.setResizable(false); 
	        
	        // Anzeigen des Fensters
	        GameVar.jf1.setVisible(true); 
	        
	        // Zentrieren des Fensters auf dem Bildschirm
	        GameVar.jf1.setLocationRelativeTo(null); 
	        
	        // Hinzufügen des KeyListeners für Tastatureingaben
	        GameVar.jf1.addKeyListener(new KeyHandler()); 
	        
	        // Fokus auf das Fenster setzen, um Tastatureingaben zu empfangen
	        GameVar.jf1.requestFocus(); 

	       /* GameDraw lbldraw = new GameDraw(); // Erzeugen eines GameDraw-Objekts
	        lbldraw.setBounds(0, 0, GameVar.screenwidth, GameVar.screenheight); // Festlegen der Position und Größe des GameDraw-Objekts
	        lbldraw.setVisible(true); 
	        GameVar.jf1.add(lbldraw); // Hinzufügen des GameDraw-Objekts zum Fenster
	        */

		
	        // Erzeugen eines GameDraw-Objekts
	        GameDraw lbldraw = new GameDraw(); 
	        
	        // Festlegen der bevorzugten Grösse des GameDraw-Objekts
	        lbldraw.setPreferredSize(new Dimension(GameVar.screenwidth, GameVar.screenheight)); 
	       
	        // Das GameDraw-Objekt sichtbar machen
	        lbldraw.setVisible(true); 
	        
	        // Das GameDraw-Objekt als Inhaltspanel des Hauptfensters setzen
	        GameVar.jf1.setContentPane(lbldraw); 
	        
	        // Das Fenster an die Grösse des GameDraw-Objekts anpassen
	        GameVar.jf1.pack(); 
	        
	        
	        
	        
	        
	        
	        
	        

		
	}

}
