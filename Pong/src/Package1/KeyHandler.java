package Package1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	 // Implementierte Methoden für Tastatureingaben

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// Nicht benötigte Methode, da keyTyped Events nicht benötigt werden
	}

	@Override
	public void keyPressed(KeyEvent e) {
		    // Wenn die "Pfeiltaste nach oben" gedrückt wird...
		    if (e.getKeyCode() == KeyEvent.VK_UP) {
		    	
		    	// wird die moveup auf true gesetzt
		        GameVar.moveup = true;
		    }
		    
		    // Wenn die "Pfeiltaste nach unten" gedrückt wird...
		    else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		    	
		    	// wird movedown auf true gesetzt
		        GameVar.movedown = true;
		    }
		}
	
	@Override
		public void keyReleased(KeyEvent e) {

		  	// Wenn die "Pfeiltaste nach oben" losgelassen wird...
		    if (e.getKeyCode() == KeyEvent.VK_UP) {
		    	
		    	 // wird moveup auf false gesetzt
		        GameVar.moveup = false;
		        
		     // Wenn die "Pfeiltaste nach unten" losgelassen wird...
		    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		    	
		    	 // wird movedown auf false gesetzt
		        GameVar.movedown = false;
		    }
		}


}

