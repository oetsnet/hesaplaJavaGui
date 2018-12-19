import java.awt.EventQueue;
import java.lang.Math;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class Calculator {

	private JFrame frmHesapla;
	private JTextField birinciSayiText;
	private JTextField ikinciSayiText;
	private JButton btnBolme;
	private JLabel birinciSayiLabel;
	private JLabel ikinciSayiLabel;
	private JButton btnBirinciSayininKaresi;
	private JButton btnIkinciSayininKaresi;
	private JButton btnBirinciSayininKoku;
	private JButton btnIkinciSayininKoku;
	private JLabel tariksune;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmHesapla.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHesapla = new JFrame();
		frmHesapla.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		frmHesapla.setForeground(SystemColor.control);
		frmHesapla.setTitle("Hesapla");
		frmHesapla.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 11));
		frmHesapla.setBounds(100, 100, 312, 500);
		frmHesapla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHesapla.getContentPane().setLayout(null);
		
		birinciSayiText = new JTextField();
		birinciSayiText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		birinciSayiText.setForeground(Color.BLACK);
		birinciSayiText.setBounds(153, 78, 81, 20);
		frmHesapla.getContentPane().add(birinciSayiText);
		birinciSayiText.setColumns(10);
		
		ikinciSayiText = new JTextField();
		ikinciSayiText.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ikinciSayiText.setForeground(Color.BLACK);
		ikinciSayiText.setColumns(10);
		ikinciSayiText.setBounds(153, 109, 81, 20);
		frmHesapla.getContentPane().add(ikinciSayiText);
		
		JLabel sonucText = new JLabel("SONUÇ");
		sonucText.setForeground(new Color(255, 20, 147));
		sonucText.setFont(new Font("Courier New", Font.BOLD, 32));
		sonucText.setHorizontalAlignment(SwingConstants.CENTER);
		sonucText.setBounds(10, 367, 276, 58);
		frmHesapla.getContentPane().add(sonucText);
		
		JButton btnToplama = new JButton("Toplama");
		btnToplama.setForeground(Color.BLACK);
		btnToplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				float birinciSayi,ikinciSayi,sonuc;
				
				try {
					birinciSayi=Float.parseFloat(birinciSayiText.getText());
					ikinciSayi=Float.parseFloat(ikinciSayiText.getText());
					sonuc=birinciSayi+ikinciSayi;
					sonucText.setText(Float.toString(sonuc));
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Geçerli Bir Sayı Giriniz!");
				}
			}
		});
		btnToplama.setBounds(61, 153, 89, 23);
		frmHesapla.getContentPane().add(btnToplama);
		
		JButton btnCikarma = new JButton("Çıkarma");
		btnCikarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float birinciSayi,ikinciSayi,sonuc;
				
								
				try {
					birinciSayi = Float.parseFloat(birinciSayiText.getText());
					ikinciSayi= Float.parseFloat(ikinciSayiText.getText());
					sonuc=birinciSayi-ikinciSayi;
					sonucText.setText(Float.toString(sonuc));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Geçerli Bir Sayı Giriniz!");
				}
				
			}
		});
		btnCikarma.setBounds(154, 153, 89, 23);
		frmHesapla.getContentPane().add(btnCikarma);
		
		JButton btnCarpma = new JButton("Çarpma");
		btnCarpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float birinciSayi,ikinciSayi,sonuc;
				
				try {
					birinciSayi= Float.parseFloat(birinciSayiText.getText());
					ikinciSayi= Float.parseFloat(ikinciSayiText.getText());
					sonuc = birinciSayi*ikinciSayi;
					sonucText.setText(Float.toString(sonuc));
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"Geçerli Bir Sayı Giriniz!");
				}
			
			}
		});
		btnCarpma.setBounds(61, 187, 89, 23);
		frmHesapla.getContentPane().add(btnCarpma);
		
		btnBolme = new JButton("Bölme");
		btnBolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float birinciSayi,ikinciSayi,sonuc;
				
				try {
					birinciSayi = Float.parseFloat(birinciSayiText.getText());
					ikinciSayi = Float.parseFloat(ikinciSayiText.getText());
					sonuc = birinciSayi/ikinciSayi;
					sonucText.setText(Float.toString(sonuc));
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"Geçerli Bir Sayı Giriniz!");
				}
				
			}
		});
		btnBolme.setBounds(154, 187, 89, 23);
		frmHesapla.getContentPane().add(btnBolme);
		
		JLabel hesaplamalarLabel = new JLabel("HESAPLA");
		hesaplamalarLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hesaplamalarLabel.setForeground(new Color(25, 25, 112));
		hesaplamalarLabel.setFont(new Font("OCR A Extended", Font.BOLD, 26));
		hesaplamalarLabel.setBounds(10, 11, 276, 42);
		frmHesapla.getContentPane().add(hesaplamalarLabel);
		
		birinciSayiLabel = new JLabel("Birinci Sayı:");
		birinciSayiLabel.setHorizontalAlignment(SwingConstants.CENTER);
		birinciSayiLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		birinciSayiLabel.setBounds(75, 77, 68, 20);
		frmHesapla.getContentPane().add(birinciSayiLabel);
		
		ikinciSayiLabel = new JLabel("İkinci Sayı:");
		ikinciSayiLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ikinciSayiLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ikinciSayiLabel.setBounds(75, 108, 68, 20);
		frmHesapla.getContentPane().add(ikinciSayiLabel);
		
		btnBirinciSayininKaresi = new JButton("Birinci Sayının Karesi");
		btnBirinciSayininKaresi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				float birinciSayi,sonuc;
				
				try {
					birinciSayi = Float.parseFloat(birinciSayiText.getText());
					sonuc = birinciSayi*birinciSayi;
					sonucText.setText(Float.toString(sonuc));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Geçerli Bir Sayı Giriniz!");
				}
			
			}
		});
		btnBirinciSayininKaresi.setBounds(61, 221, 182, 23);
		frmHesapla.getContentPane().add(btnBirinciSayininKaresi);
		
		btnIkinciSayininKaresi = new JButton("İkinci Sayının Karesi");
		btnIkinciSayininKaresi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float ikinciSayi,sonuc;
				try {
					ikinciSayi= Float.parseFloat(ikinciSayiText.getText());
					sonuc=ikinciSayi*ikinciSayi;
					sonucText.setText(Float.toString(sonuc));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Geçerli Bir Sayı Giriniz!");
				}
				
				
			}
		});
		btnIkinciSayininKaresi.setBounds(61, 255, 182, 23);
		frmHesapla.getContentPane().add(btnIkinciSayininKaresi);
		
		btnBirinciSayininKoku = new JButton("Birinci Sayının Kökü");
		btnBirinciSayininKoku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float birinciSayi;
				double sonuc;
				
				try {
					birinciSayi = Float.parseFloat(birinciSayiText.getText());
					sonuc = Math.sqrt(birinciSayi);
					sonucText.setText(Double.toString(sonuc));
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		btnBirinciSayininKoku.setBounds(61, 289, 182, 23);
		frmHesapla.getContentPane().add(btnBirinciSayininKoku);
		
		btnIkinciSayininKoku = new JButton("İkinci Sayının Kökü");
		btnIkinciSayininKoku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float ikinciSayi;
				double sonuc;
				try {
					ikinciSayi = Float.parseFloat(ikinciSayiText.getText());
					sonuc = Math.sqrt(ikinciSayi);
					sonucText.setText(Double.toString(sonuc));
					
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Geçerli Bir Sayı Giriniz!");
				}
				
				
				
			}
		});
		btnIkinciSayininKoku.setBounds(61, 323, 182, 23);
		frmHesapla.getContentPane().add(btnIkinciSayininKoku);
		
			
		tariksune = new JLabel("tariksune.com");
		tariksune.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Desktop masaustu = Desktop.getDesktop();
				try {
					masaustu.browse(new URI("https://www.tariksune.com/"));
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Hata! Tekrar Deneyiniz.");
				}
			}
		});
		tariksune.setForeground(SystemColor.controlShadow);
		tariksune.setHorizontalAlignment(SwingConstants.CENTER);
		tariksune.setBounds(10, 419, 276, 42);
		frmHesapla.getContentPane().add(tariksune);
		
		
		
		
		
	}
}
