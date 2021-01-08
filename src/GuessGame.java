import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;


public class GuessGame extends JFrame {

	private final JLabel Image;
	private final JLabel Point;
	private final String[] image = {"A.jpg", "B.jpg", "C.jpg", "D.jpg", "E.jpg"};
	int Scoremake=0;
	int end=0;
	Random num = new Random();
	private String print;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				GuessGame frame = new GuessGame();
				frame.setVisible(true);
				frame.setTitle("Guess Game");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public GuessGame() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 400);
		JPanel contentPane = new JPanel();
		//contentPane.getName("Guess Game");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Image = new JLabel("");
		Image.setBackground(SystemColor.window);
		Image.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		Image.setBounds(63, 34, 290, 156);
		contentPane.add(Image);


		JButton a = new JButton("SOFA");
		a.setBackground(SystemColor.window);
		a.setBounds(20, 220, 150, 35);
		contentPane.add(a);
		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (print.equals(image[0])){
					Scoremake++;
					Point.setText(String.valueOf(Scoremake));
				}

			}
		});

		JButton b = new JButton("BED");
		b.setBackground(SystemColor.window);
		b.setBounds(180, 220, 150, 35);
		contentPane.add(b);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (print.equals(image[1])){
					Scoremake++;
					Point.setText(String.valueOf(Scoremake));
				}


			}
		});

		JButton c = new JButton("SOFA & TABLE");
		c.setBackground(SystemColor.window);
		c.setBounds(340, 220, 150, 35);
		contentPane.add(c);
		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (print.equals(image[2])){
					Scoremake++;
					Point.setText(String.valueOf(Scoremake));
				}

			}
		});

		JButton d = new JButton("CUPBOARD SET");
		d.setBackground(SystemColor.window);
		d.setBounds(40, 270, 150, 35);
		contentPane.add(d);
		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (print.equals(image[3])){
					Scoremake++;
					Point.setText(String.valueOf(Scoremake));
				}

			}
		});

		JButton E = new JButton("CUPBOARD");
		E.setBackground(SystemColor.window);
		E.setBounds(250, 270, 150, 35);
		contentPane.add(E);
		E.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (print.equals(image[4])){
					Scoremake++;
					Point.setText(String.valueOf(Scoremake));
				}

			}
		});

		Point = new JLabel("");
		Point.setBackground(Color.DARK_GRAY);
		Point.setBounds(420, 70, 50, 20);
		contentPane.add(Point);

		JLabel name = new JLabel("Score");
		name.setBackground(Color.DARK_GRAY);
		name.setBounds(420, 50, 100, 20);
		contentPane.add(name);

		TimerTask task=new TimerTask() {
			@Override
			public void run() {
				end++;
				int n = num.nextInt(5);
				print = image[n];
				Image.setIcon(new ImageIcon(print));
				if ((end==6)){
					System.out.println("your Score is  " +Scoremake);
					System.exit(0);
				}


			}
		};

		Timer timer=new Timer(2000, e -> task.run());
		timer.start();


	}

}