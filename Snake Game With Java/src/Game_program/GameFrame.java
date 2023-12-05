package Game_program;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	GameFrame() {
		GamePanel panel = new GamePanel();
		this.add(panel);
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		// Create a restart button and add an ActionListener to handle the restart action
        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(e -> {
            panel.restartGame();
            restartButton.setVisible(false); // Hide the restart button after restart
        });
        // Add the restart button to the frame
       this.add(restartButton, BorderLayout.SOUTH);
	}
}