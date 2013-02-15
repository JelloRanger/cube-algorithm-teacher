import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Display {
	
	private JFrame f = new JFrame("Cube Algorithm Teacher");
	
	private JMenuBar mb = new JMenuBar();
	private JMenu mnuFile = new JMenu("File");
	private JMenuItem mnuItemQuit = new JMenuItem("Quit");
	private JMenu mnuHelp = new JMenu("Help");
	private JMenuItem mnuItemAbout = new JMenuItem("About");
	
	// buttons
	private JPanel pnlNext = new JPanel();
	private JButton btnNext = new JButton("Roll");
	private JPanel pnlReveal = new JPanel();
	private JButton btnReveal = new JButton("Reveal Algorithm");
	
	private String currAlg;
	
	// constructor for the display
	public Display() {
		
		// set the menu bar
		f.setJMenuBar(mb);
		
		// build the menus
		mnuFile.add(mnuItemQuit);
		mnuHelp.add(mnuItemAbout);
		mb.add(mnuFile);
		mb.add(mnuHelp);
		
		// add buttons
		pnlNext.add(btnNext);
		pnlReveal.add(btnReveal);
		
		// set up the frame
		f.getContentPane().setLayout(new BorderLayout());
		f.getContentPane().add(pnlNext, BorderLayout.SOUTH);
		f.getContentPane().add(pnlReveal, BorderLayout.CENTER);
		
		f.addWindowListener(new ListenCloseWdw());
		
		mnuItemQuit.addActionListener(new ListenMenuQuit());
		
		// instantiate the set of algorithms
		final Set algorithms = new Set();
		
		// ~~~ button actions ~~~
		
		// pick a random algorithm
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				currAlg = algorithms.pickRandom();
				System.out.println(currAlg);
			}
		});
		
		// display the algorithm's moves
		btnReveal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				System.out.println(algorithms.getAlgorithm(currAlg));
			}
		});
		
	}

	
	public class ListenMenuQuit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	public class ListenCloseWdw extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public void launchFrame() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setSize(450, 550);
		f.setVisible(true);
	}
	
	public static void main(String args[]) {
		Display disp = new Display();
		disp.launchFrame();
	}
}
