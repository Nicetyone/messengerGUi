//Code nur zur Demonstration; Quelle: https://www.kstbb.de/informatik/oo/17/17_1_Meine_erste_GUI.html

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class ClientGUI extends JFrame{
    
    private ChatClient client;
    
    private JPanel contentPane;
    private JTextField tfNeuerTitel;
    private JPasswordField tfPasswordField;
    private JTextField tfLoginField;
    String[] UserStrings = { "Travis Scott", "Terry Crews", "Merry Jane", "Bernd das Brot", "Denny" };


    public ClientGUI() {
        setTitle("Chat Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(900, 100, 300, 480);
        

        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(159, 122, 244));
        
        int size;
        size = 0;

        tfPasswordField = new JPasswordField();
        tfPasswordField.setBounds(70, 132, 150, 20);
        contentPane.add(tfPasswordField);
        
        tfLoginField = new JTextField();
        tfLoginField.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tfLoginField.setBounds(70, 98, 150, 20);
        contentPane.add(tfLoginField);
        
        JLabel lbLogin = new JLabel("Login:");
        lbLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbLogin.setBounds(30, 18, 154, 180);
        contentPane.add(lbLogin);
        
        JLabel lbPasswort = new JLabel("Passwort:");
        lbPasswort.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbPasswort.setBounds(10, 18, 154, 250);
        contentPane.add(lbPasswort);
        
        JLabel lbSmilie = new JLabel("");
        lbSmilie.setBounds(75, 25, 250, 50);
        lbSmilie.setIcon(new ImageIcon(ClientGUI.class.getResource("logo.png")));
        contentPane.add(lbSmilie);

        JButton btCancel = new JButton("Schlieﬂen");
        btCancel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                beenden();
            }
        });
        btCancel.setBounds(15, 200, 125, 25);
        contentPane.add(btCancel);
        
        JButton btAendern2 = new JButton("Login");
        btAendern2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btAendern2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                clientGUI1();
            }
        });
        btAendern2.setBounds(145, 200, 125, 25);
        contentPane.add(btAendern2);
        
    
        
        
        
        setVisible(true);
        
    }

    private void aendereTitel() {
        setTitle(tfNeuerTitel.getText());
    }
    
    private void clientGUI1() {
        setTitle("Chat Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(900, 100, 300, 480);
        

        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(159, 122, 244));
        
        int size;
        size = 0;

        //tfNeuerTitel = new JTextField();
        //tfNeuerTitel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        //tfNeuerTitel.setBounds(20, 46, 190, 20);
        //contentPane.add(tfNeuerTitel);
        
        //JLabel lbNeuerTitel = new JLabel("Nachricht Senden:");
        //lbNeuerTitel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        //lbNeuerTitel.setBounds(10, 18, 154, 14);
        //contentPane.add(lbNeuerTitel);
        
        JLabel lbSmilie = new JLabel("");
        lbSmilie.setBounds(75, 25, 250, 50);
        lbSmilie.setIcon(new ImageIcon(ClientGUI.class.getResource("logo.png")));
        contentPane.add(lbSmilie);


        JComboBox userList = new JComboBox(UserStrings);
        userList.setSelectedIndex(4);
        userList.setBounds(20,100, 250, 50);
        contentPane.add(userList);

        JButton btBeenden = new JButton("+");
        btBeenden.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //chatErstellen();
            }
        });
        btBeenden.setBounds(121, 352, 45, 45);
        contentPane.add(btBeenden);
        
        JButton btSuchen = new JButton("Q");
        btSuchen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //suchen();
            }
        });
        btSuchen.setBounds(225, 352, 45, 45);
        contentPane.add(btSuchen);
        
        
        JButton btLoeschen = new JButton("X");
        btLoeschen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                beenden();
            }
        });
        btLoeschen.setBounds(20, 352, 45, 45);
        contentPane.add(btLoeschen);
        
        
    }
    
    private void clientGUI2() {
        setTitle("PersonClient");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 100, 300, 560);

        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(159, 122, 244));
        
        int size;
        size = 0;

        tfNeuerTitel = new JTextField();
        tfNeuerTitel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tfNeuerTitel.setBounds(20, 480, 190, 20);
        contentPane.add(tfNeuerTitel);
        
        //JLabel lbNeuerTitel = new JLabel("Nachricht Senden:");
        //lbNeuerTitel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        //lbNeuerTitel.setBounds(10, 450, 154, 14);
        //contentPane.add(lbNeuerTitel);
        
        JLabel photoLayout = new JLabel("");
        photoLayout.setBounds(0, 0, 350, 58);
        photoLayout.setIcon(new ImageIcon(ClientGUI.class.getResource("overlay.png")));
        contentPane.add(photoLayout);
        
        JLabel photoPerson = new JLabel("");
        photoPerson.setBounds(5, 5, 250, 50);
        photoPerson.setIcon(new ImageIcon(ClientGUI.class.getResource("person1.png")));
        contentPane.add(photoPerson);
        
        JLabel photoSendOverlay = new JLabel("");
        photoSendOverlay.setBounds(0, 0, 350, 580);
        photoSendOverlay.setIcon(new ImageIcon(ClientGUI.class.getResource("send-overlay.png")));
        contentPane.add(photoSendOverlay);
        
        JLabel personName = new JLabel("Terry Crews");
        personName.setFont(new Font("Tahoma", Font.PLAIN, 22));
        personName.setBounds(55, 0, 154, 54);
        contentPane.add(personName);
    }
    
    
     private void kontaktOeffnen() {
       setTitle(tfNeuerTitel.getText());
    }
   private void beenden() {
        dispose();
        System.exit(0);
    }
}
