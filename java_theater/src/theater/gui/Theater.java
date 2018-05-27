package theater.gui;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.ComboBox;

public class Theater extends JFrame {

	
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Theater frame = new Theater();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Theater() {
		setTitle("영화관 예약 프로그램");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		contentPane.add(panel_3, "panel_3");
		
		panel = new JPanel();
		contentPane.add(panel, "panel");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("C-1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnNewButton.getText();
				System.out.println(seat);
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		btnNewButton.setBounds(0, 316, 64, 50);
		panel.add(btnNewButton);
		
		JButton btnA = new JButton("C-2");
		btnA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnA.getText();
				System.out.println(seat);
			}
		});
		btnA.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		btnA.setBounds(76, 316, 64, 50);
		panel.add(btnA);
		
		JButton btnC = new JButton("C-3");
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnC.getText();
				System.out.println(seat);
			}
		});
		btnC.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		btnC.setBounds(152, 316, 64, 50);
		panel.add(btnC);
		
		JButton btnC_1 = new JButton("C-4");
		btnC_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnC_1.getText();
				System.out.println(seat);
			}
		});
		btnC_1.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		btnC_1.setBounds(228, 316, 64, 50);
		panel.add(btnC_1);
		
		JButton btnC_2 = new JButton("C-5");
		btnC_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnC_2.getText();
				System.out.println(seat);
			}
		});
		btnC_2.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		btnC_2.setBounds(322, 316, 64, 50);
		panel.add(btnC_2);
		
		JButton btnC_3 = new JButton("C-6");
		btnC_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnC_3.getText();
				System.out.println(seat);
			}
		});
		btnC_3.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		btnC_3.setBounds(398, 316, 64, 50);
		panel.add(btnC_3);
		
		JButton btnC_4 = new JButton("C-7");
		btnC_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnC_4.getText();
				System.out.println(seat);
			}
		});
		btnC_4.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		btnC_4.setBounds(474, 316, 64, 50);
		panel.add(btnC_4);
		
		JButton btnC_5 = new JButton("C-8");
		btnC_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnC_5.getText();
				System.out.println(seat);
			}
		});
		btnC_5.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		btnC_5.setBounds(550, 316, 64, 50);
		panel.add(btnC_5);
		
		JButton btnDa = new JButton("D-1");
		btnDa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnDa.getText();
				System.out.println(seat);
			}
		});
		btnDa.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnDa.setBounds(0, 382, 64, 50);
		panel.add(btnDa);
		
		JButton btnD = new JButton("D-2");
		btnD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnD.getText();
				System.out.println(seat);
			}
		});
		btnD.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnD.setBounds(76, 382, 64, 50);
		panel.add(btnD);
		
		JButton btnD_1 = new JButton("D-3");
		btnD_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnD_1.getText();
				System.out.println(seat);
			}
		});
		btnD_1.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnD_1.setBounds(152, 382, 64, 50);
		panel.add(btnD_1);
		
		JButton btnD_2 = new JButton("D-4");
		btnD_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnD_2.getText();
				System.out.println(seat);
			}
		});
		btnD_2.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnD_2.setBounds(228, 382, 64, 50);
		panel.add(btnD_2);
		
		JButton btnD_3 = new JButton("D-5");
		btnD_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnD_3.getText();
				System.out.println(seat);
			}
		});
		btnD_3.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnD_3.setBounds(322, 382, 64, 50);
		panel.add(btnD_3);
		
		JButton btnD_4 = new JButton("D-6");
		btnD_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnD_4.getText();
				System.out.println(seat);
			}
		});
		btnD_4.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnD_4.setBounds(398, 382, 64, 50);
		panel.add(btnD_4);
		
		JButton btnD_5 = new JButton("D-7");
		btnD_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnD_5.getText();
				System.out.println(seat);
			}
		});
		btnD_5.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnD_5.setBounds(474, 382, 64, 50);
		panel.add(btnD_5);
		
		JButton btnD_6 = new JButton("D-8");
		btnD_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnD_6.getText();
				System.out.println(seat);
			}
		});
		btnD_6.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnD_6.setBounds(550, 382, 64, 50);
		panel.add(btnD_6);
		
		JButton btnB = new JButton("B-1");
		btnB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnB.getText();
				System.out.println(seat);
			}
		});
		btnB.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnB.setBounds(0, 247, 64, 50);
		panel.add(btnB);
		
		JButton btnB_7 = new JButton("B-8");
		btnB_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnB_7.getText();
				System.out.println(seat);
			}
		});
		btnB_7.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnB_7.setBounds(550, 247, 64, 50);
		panel.add(btnB_7);
		
		JButton btnB_6 = new JButton("B-7");
		btnB_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnB_6.getText();
				System.out.println(seat);
			}
		});
		btnB_6.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnB_6.setBounds(474, 247, 64, 50);
		panel.add(btnB_6);
		
		JButton btnB_5 = new JButton("B-6");
		btnB_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnB_5.getText();
				System.out.println(seat);
			}
		});
		btnB_5.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnB_5.setBounds(398, 247, 64, 50);
		panel.add(btnB_5);
		
		JButton btnB_4 = new JButton("B-5");
		btnB_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnB_4.getText();
				System.out.println(seat);
			}
		});
		btnB_4.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnB_4.setBounds(322, 247, 64, 50);
		panel.add(btnB_4);
		
		JButton btnB_3 = new JButton("B-4");
		btnB_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnB_3.getText();
				System.out.println(seat);
			}
		});
		btnB_3.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnB_3.setBounds(228, 247, 64, 50);
		panel.add(btnB_3);
		
		JButton btnB_2 = new JButton("B-3");
		btnB_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnB_2.getText();
				System.out.println(seat);
			}
		});
		btnB_2.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnB_2.setBounds(152, 247, 64, 50);
		panel.add(btnB_2);
		
		JButton btnB_1 = new JButton("B-2");
		btnB_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnB_1.getText();
				System.out.println(seat);
			}
		});
		btnB_1.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnB_1.setBounds(76, 247, 64, 50);
		panel.add(btnB_1);
		
		JButton button_22 = new JButton("A-1");
		button_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + button_22.getText();
				System.out.println(seat);
			}
		});
		button_22.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_22.setBounds(0, 183, 64, 50);
		panel.add(button_22);
		
		JButton btnA_7 = new JButton("A-8");
		btnA_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnA_7.getText();
				System.out.println(seat);
			}
		});
		btnA_7.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnA_7.setBounds(550, 183, 64, 50);
		panel.add(btnA_7);
		
		JButton btnA_6 = new JButton("A-7");
		btnA_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnA_6.getText();
				System.out.println(seat);
			}
		});
		btnA_6.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnA_6.setBounds(474, 183, 64, 50);
		panel.add(btnA_6);
		
		JButton btnA_5 = new JButton("A-6");
		btnA_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnA_5.getText();
				System.out.println(seat);
			}
		});
		btnA_5.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnA_5.setBounds(398, 183, 64, 50);
		panel.add(btnA_5);
		
		JButton btnA_4 = new JButton("A-5");
		btnA_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnA_4.getText();
				System.out.println(seat);
			}
		});
		btnA_4.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnA_4.setBounds(322, 183, 64, 50);
		panel.add(btnA_4);
		
		JButton btnA_3 = new JButton("A-4");
		btnA_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnA_3.getText();
				System.out.println(seat);
			}
		});
		btnA_3.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnA_3.setBounds(228, 183, 64, 50);
		panel.add(btnA_3);
		
		JButton btnA_2 = new JButton("A-3");
		btnA_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnA_2.getText();
				System.out.println(seat);
			}
		});
		btnA_2.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnA_2.setBounds(152, 183, 64, 50);
		panel.add(btnA_2);
		
		JButton btnA_1 = new JButton("A-2");
		btnA_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String seat = (String)comboBox.getSelectedItem();
				seat = seat + " " + lblNewLabel.getText() + " " + btnA_1.getText();
				System.out.println(seat);
			}
		});
		btnA_1.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		btnA_1.setBounds(76, 183, 64, 50);
		panel.add(btnA_1);
		
		lblNewLabel = new JLabel("1관");
		lblNewLabel.setFont(new Font("휴먼굵은샘체", Font.BOLD, 44));
		lblNewLabel.setBounds(279, 10, 73, 108);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("2관");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				repaint();
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_1.setBounds(516, 0, 108, 38);
		panel.add(btnNewButton_1);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		contentPane.add(panel_1, "panel_1");
		
		JButton button = new JButton("C-1");
		button.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button.setBounds(0, 316, 64, 50);
		panel_1.add(button);
		
		JButton button_1 = new JButton("C-2");
		button_1.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_1.setBounds(76, 316, 64, 50);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("C-3");
		button_2.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_2.setBounds(152, 316, 64, 50);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("C-4");
		button_3.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_3.setBounds(228, 316, 64, 50);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("C-5");
		button_4.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_4.setBounds(322, 316, 64, 50);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("C-6");
		button_5.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_5.setBounds(398, 316, 64, 50);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("C-7");
		button_6.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_6.setBounds(474, 316, 64, 50);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("C-8");
		button_7.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_7.setBounds(550, 316, 64, 50);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("D-1");
		button_8.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_8.setBounds(0, 382, 64, 50);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("D-2");
		button_9.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_9.setBounds(76, 382, 64, 50);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("D-3");
		button_10.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_10.setBounds(152, 382, 64, 50);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("D-4");
		button_11.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_11.setBounds(228, 382, 64, 50);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton("D-5");
		button_12.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_12.setBounds(322, 382, 64, 50);
		panel_1.add(button_12);
		
		JButton button_13 = new JButton("D-6");
		button_13.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_13.setBounds(398, 382, 64, 50);
		panel_1.add(button_13);
		
		JButton button_14 = new JButton("D-7");
		button_14.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_14.setBounds(474, 382, 64, 50);
		panel_1.add(button_14);
		
		JButton button_15 = new JButton("D-8");
		button_15.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_15.setBounds(550, 382, 64, 50);
		panel_1.add(button_15);
		
		JButton button_16 = new JButton("B-1");
		button_16.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_16.setBounds(0, 247, 64, 50);
		panel_1.add(button_16);
		
		JButton button_17 = new JButton("B-8");
		button_17.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_17.setBounds(550, 247, 64, 50);
		panel_1.add(button_17);
		
		JButton button_18 = new JButton("B-7");
		button_18.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_18.setBounds(474, 247, 64, 50);
		panel_1.add(button_18);
		
		JButton button_19 = new JButton("B-6");
		button_19.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_19.setBounds(398, 247, 64, 50);
		panel_1.add(button_19);
		
		JButton button_20 = new JButton("B-5");
		button_20.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_20.setBounds(322, 247, 64, 50);
		panel_1.add(button_20);
		
		JButton button_21 = new JButton("B-4");
		button_21.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_21.setBounds(228, 247, 64, 50);
		panel_1.add(button_21);
		
		JButton button_23 = new JButton("B-3");
		button_23.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_23.setBounds(152, 247, 64, 50);
		panel_1.add(button_23);
		
		JButton button_24 = new JButton("B-2");
		button_24.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_24.setBounds(76, 247, 64, 50);
		panel_1.add(button_24);
		
		JButton button_25 = new JButton("A-1");
		button_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("2관의 1");
			}
		});
		button_25.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_25.setBounds(0, 183, 64, 50);
		panel_1.add(button_25);
		
		JButton button_26 = new JButton("A-8");
		button_26.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_26.setBounds(550, 183, 64, 50);
		panel_1.add(button_26);
		
		JButton button_27 = new JButton("A-7");
		button_27.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_27.setBounds(474, 183, 64, 50);
		panel_1.add(button_27);
		
		JButton button_28 = new JButton("A-6");
		button_28.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_28.setBounds(398, 183, 64, 50);
		panel_1.add(button_28);
		
		JButton button_29 = new JButton("A-5");
		button_29.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_29.setBounds(322, 183, 64, 50);
		panel_1.add(button_29);
		
		JButton button_30 = new JButton("A-4");
		button_30.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_30.setBounds(228, 183, 64, 50);
		panel_1.add(button_30);
		
		JButton button_31 = new JButton("A-3");
		button_31.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_31.setBounds(152, 183, 64, 50);
		panel_1.add(button_31);
		
		JButton button_32 = new JButton("A-2");
		button_32.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_32.setBounds(76, 183, 64, 50);
		panel_1.add(button_32);
		
		JLabel label = new JLabel("2관");
		label.setFont(new Font("휴먼굵은샘체", Font.BOLD, 44));
		label.setBounds(279, 10, 73, 108);
		panel_1.add(label);
		
		JButton button_33 = new JButton("3관");
		button_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				repaint();
			}
		});
		button_33.setFont(new Font("굴림", Font.BOLD, 12));
		button_33.setBounds(516, 0, 108, 38);
		panel_1.add(button_33);
		
		JButton button_34 = new JButton("1관");
		button_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(true);
				panel_1.setVisible(false);
				repaint();
			}
		});
		button_34.setFont(new Font("굴림", Font.BOLD, 12));
		button_34.setBounds(0, 0, 108, 38);
		panel_1.add(button_34);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		contentPane.add(panel_2, "panel_2");
		
		JButton button_35 = new JButton("C-1");
		button_35.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_35.setBounds(0, 316, 64, 50);
		panel_2.add(button_35);
		
		JButton button_36 = new JButton("C-2");
		button_36.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_36.setBounds(76, 316, 64, 50);
		panel_2.add(button_36);
		
		JButton button_37 = new JButton("C-3");
		button_37.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_37.setBounds(152, 316, 64, 50);
		panel_2.add(button_37);
		
		JButton button_38 = new JButton("C-4");
		button_38.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_38.setBounds(228, 316, 64, 50);
		panel_2.add(button_38);
		
		JButton button_39 = new JButton("C-5");
		button_39.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_39.setBounds(322, 316, 64, 50);
		panel_2.add(button_39);
		
		JButton button_40 = new JButton("C-6");
		button_40.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_40.setBounds(398, 316, 64, 50);
		panel_2.add(button_40);
		
		JButton button_41 = new JButton("C-7");
		button_41.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_41.setBounds(474, 316, 64, 50);
		panel_2.add(button_41);
		
		JButton button_42 = new JButton("C-8");
		button_42.setFont(new Font("휴먼매직체", Font.BOLD, 15));
		button_42.setBounds(550, 316, 64, 50);
		panel_2.add(button_42);
		
		JButton button_43 = new JButton("D-1");
		button_43.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_43.setBounds(0, 382, 64, 50);
		panel_2.add(button_43);
		
		JButton button_44 = new JButton("D-2");
		button_44.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_44.setBounds(76, 382, 64, 50);
		panel_2.add(button_44);
		
		JButton button_45 = new JButton("D-3");
		button_45.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_45.setBounds(152, 382, 64, 50);
		panel_2.add(button_45);
		
		JButton button_46 = new JButton("D-4");
		button_46.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_46.setBounds(228, 382, 64, 50);
		panel_2.add(button_46);
		
		JButton button_47 = new JButton("D-5");
		button_47.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_47.setBounds(322, 382, 64, 50);
		panel_2.add(button_47);
		
		JButton button_48 = new JButton("D-6");
		button_48.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_48.setBounds(398, 382, 64, 50);
		panel_2.add(button_48);
		
		JButton button_49 = new JButton("D-7");
		button_49.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_49.setBounds(474, 382, 64, 50);
		panel_2.add(button_49);
		
		JButton button_50 = new JButton("D-8");
		button_50.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_50.setBounds(550, 382, 64, 50);
		panel_2.add(button_50);
		
		JButton button_51 = new JButton("B-1");
		button_51.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_51.setBounds(0, 247, 64, 50);
		panel_2.add(button_51);
		
		JButton button_52 = new JButton("B-8");
		button_52.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_52.setBounds(550, 247, 64, 50);
		panel_2.add(button_52);
		
		JButton button_53 = new JButton("B-7");
		button_53.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_53.setBounds(474, 247, 64, 50);
		panel_2.add(button_53);
		
		JButton button_54 = new JButton("B-6");
		button_54.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_54.setBounds(398, 247, 64, 50);
		panel_2.add(button_54);
		
		JButton button_55 = new JButton("B-5");
		button_55.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_55.setBounds(322, 247, 64, 50);
		panel_2.add(button_55);
		
		JButton button_56 = new JButton("B-4");
		button_56.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_56.setBounds(228, 247, 64, 50);
		panel_2.add(button_56);
		
		JButton button_57 = new JButton("B-3");
		button_57.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_57.setBounds(152, 247, 64, 50);
		panel_2.add(button_57);
		
		JButton button_58 = new JButton("B-2");
		button_58.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_58.setBounds(76, 247, 64, 50);
		panel_2.add(button_58);
		
		JButton button_59 = new JButton("A-1");
		button_59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("3관의 1");
			}
		});
		button_59.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_59.setBounds(0, 183, 64, 50);
		panel_2.add(button_59);
		
		JButton button_60 = new JButton("A-8");
		button_60.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_60.setBounds(550, 183, 64, 50);
		panel_2.add(button_60);
		
		JButton button_61 = new JButton("A-7");
		button_61.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_61.setBounds(474, 183, 64, 50);
		panel_2.add(button_61);
		
		JButton button_62 = new JButton("A-6");
		button_62.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_62.setBounds(398, 183, 64, 50);
		panel_2.add(button_62);
		
		JButton button_63 = new JButton("A-5");
		button_63.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_63.setBounds(322, 183, 64, 50);
		panel_2.add(button_63);
		
		JButton button_64 = new JButton("A-4");
		button_64.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_64.setBounds(228, 183, 64, 50);
		panel_2.add(button_64);
		
		JButton button_65 = new JButton("A-3");
		button_65.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_65.setBounds(152, 183, 64, 50);
		panel_2.add(button_65);
		
		JButton button_66 = new JButton("A-2");
		button_66.setFont(new Font("휴먼매직체", Font.BOLD, 16));
		button_66.setBounds(76, 183, 64, 50);
		panel_2.add(button_66);
		
		JLabel label_1 = new JLabel("3관");
		label_1.setFont(new Font("휴먼굵은샘체", Font.BOLD, 44));
		label_1.setBounds(279, 10, 73, 108);
		panel_2.add(label_1);
		
		JButton button_68 = new JButton("2관");
		button_68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				repaint();
			}
		});
		button_68.setFont(new Font("굴림", Font.BOLD, 12));
		button_68.setBounds(0, 0, 108, 38);
		panel_2.add(button_68);
		
		
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"강남점", "서초점", "삼성점"}));
		comboBox.setBounds(108, 364, 410, 21);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//(String)comboBox.getSelectedItem();
				panel_3.setVisible(false);
				panel.setVisible(true);
				repaint();
			}
		});
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("JAVA");
		lblNewLabel_1.setFont(new Font("한컴 소망 M", Font.BOLD, 50));
		lblNewLabel_1.setBounds(216, 0, 188, 111);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("THEATER");
		lblNewLabel_2.setFont(new Font("한컴 소망 M", Font.BOLD, 50));
		lblNewLabel_2.setBounds(160, 56, 314, 111);
		panel_3.add(lblNewLabel_2);
	}
}
