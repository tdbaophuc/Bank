package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.ImageIcon;

import java.awt.Color;

import java.awt.Font;

import java.awt.CardLayout;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import javax.swing.JSeparator;

import javax.swing.JMenuItem;

import javax.swing.JOptionPane;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JButton;

import javax.swing.JTextField;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class View_Home extends JFrame {

    private JPanel contentPane;

    private JPanel pannermenubar;

    private JLabel Activity;

    private JLabel Personal;

    private JLabel undo;

    private JPanel panel_GOC;

    private JPanel homePANNEL;

    private JLabel Transfemoney;

    private JLabel HOME;

    private JLabel dol;

    private JSeparator separator;

    private JSeparator separator_1;

    private JPanel panel;

    private JMenuBar menuBar;

    private JMenu Account;

    private JMenuItem changePassword;

    private JPanel backgroungtransfer;

    private JLabel lblNewLabel_2;

    private JPanel panel_3;

    private JLabel PayPalBalance;

    private JTextField textField;

    private JPanel wallet_PANNEL;

    private JPanel personnal_PANNEL;

    private JPanel activiti_PANNEL;

    private JMenuItem accountinformation;

    private JMenuItem logout;

    private JMenuItem Seting;

    private JTextField phoneNumberTextField;

    /**

     * Launch the application.

     */

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                    View_Home frame = new View_Home();

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

// r1.028,d 84

    public View_Home() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 1028, 644);

        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        contentPane.setLayout(null);

        JPanel panel_main = new JPanel();

        panel_main.setBounds(0, 0, 1028, 616);

        contentPane.add(panel_main);

        panel_main.setLayout(null);

        pannermenubar = new JPanel();

        pannermenubar.addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

            }

        });

        pannermenubar.setLayout(null);

        pannermenubar.setBackground(new Color(86, 128, 225));

        pannermenubar.setBounds(0, 0, 1028, 88);

        panel_main.add(pannermenubar);

        Activity = new JLabel("Activity");

        Activity.addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

                homePANNEL.setVisible(false);

                wallet_PANNEL.setVisible(false);

                personnal_PANNEL.setVisible(false);

                activiti_PANNEL.setVisible(true);

            }

        });

        Activity.setForeground(Color.WHITE);

        Activity.setFont(new Font("Lucida Grande", Font.PLAIN, 18));

        Activity.setBounds(566, 25, 166, 24);

        pannermenubar.add(Activity);

        Personal = new JLabel("Personal");

        Personal.addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

                homePANNEL.setVisible(false);

                wallet_PANNEL.setVisible(false);

                personnal_PANNEL.setVisible(true);

                activiti_PANNEL.setVisible(false);

            }

        });

        Personal.setForeground(Color.WHITE);

        Personal.setFont(new Font("Lucida Grande", Font.PLAIN, 18));

        Personal.setBounds(736, 23, 86, 29);

        pannermenubar.add(Personal);

        undo = new JLabel("Un");

        undo.setForeground(new Color(253, 253, 253));

        undo.setFont(new Font("Nanum Myeongjo", Font.PLAIN, 30));

        undo.setBounds(20, 9, 115, 53);

        pannermenubar.add(undo);

        HOME = new JLabel("Home");

        HOME.setForeground(new Color(253, 253, 253));

        HOME.addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

                homePANNEL.setVisible(true);

                wallet_PANNEL.setVisible(false);

                personnal_PANNEL.setVisible(false);

                activiti_PANNEL.setVisible(false);

                ;

            }

        });

        HOME.setFont(new Font("Lucida Grande", Font.PLAIN, 18));

        HOME.setBounds(248, 29, 61, 16);

        pannermenubar.add(HOME);

        dol = new JLabel("Dol");

        dol.setForeground(new Color(27, 39, 157));

        dol.setFont(new Font("Nanum Myeongjo", Font.PLAIN, 27));

        dol.setBounds(57, 37, 61, 28);

        pannermenubar.add(dol);

        JLabel wallet = new JLabel("Wallet");

        wallet.addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

                homePANNEL.setVisible(false);

                wallet_PANNEL.setVisible(true);

                personnal_PANNEL.setVisible(false);

                activiti_PANNEL.setVisible(false);

            }

        });

        wallet.setForeground(new Color(253, 253, 253));

        wallet.setFont(new Font("Lucida Grande", Font.PLAIN, 17));

        wallet.setBounds(418, 29, 61, 16);

        pannermenubar.add(wallet);

        menuBar = new JMenuBar();

        menuBar.setBackground(new Color(66, 106, 227));

        menuBar.setBounds(847, 29, 132, 22);

        pannermenubar.add(menuBar);

        Account = new JMenu("Account");

        Account.setBackground(new Color(66, 106, 227));

        menuBar.add(Account);

        changePassword = new JMenuItem("Change Password");

        changePassword.setBackground(new Color(66, 106, 227));

        Account.add(changePassword);

        accountinformation = new JMenuItem("account information");

        Account.add(accountinformation);

        Seting = new JMenuItem("Seting");

        Account.add(Seting);

        logout = new JMenuItem("Log out");

        logout.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                View_LogIn vg = new View_LogIn() ;

                vg.setVisible(true);

                dispose();

            }

        });

        Account.add(logout);

        panel_GOC = new JPanel();

        panel_GOC.setBackground(new Color(247, 241, 235));

        panel_GOC.setBounds(0, 84, 1028, 532);

        panel_main.add(panel_GOC);

        panel_GOC.setLayout(new CardLayout(0, 0));

        homePANNEL = new JPanel();

        homePANNEL.setBackground(new Color(247, 241, 235));

        panel_GOC.add(homePANNEL, "name_333936788887292");

        homePANNEL.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("^");

        lblNewLabel_3.setBounds(996, 6, 26, 16);

        homePANNEL.add(lblNewLabel_3);

        lblNewLabel_3.addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

                closemenubar();

            }

// Đóng menubar

            void closemenubar() {

                new Thread(new Runnable() {

                    @Override

                    public void run() {

                        for (int i = HEIGHT; i > 0; i--) {

                            pannermenubar.setSize(i, WIDTH);

                            try {

                                Thread.sleep(10);

                            } catch (InterruptedException e) {

// TODO Auto-generated catch block

                                e.printStackTrace();

                            }

                        }

                    }

                }).start();

            }

        });

        lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 17));

        separator = new JSeparator();

        separator.setForeground(new Color(23, 50, 238));

        separator.setBounds(0, 0, 1043, 16);

        homePANNEL.add(separator);

        separator_1 = new JSeparator();

        separator_1.setBounds(0, 482, 1043, 16);

        homePANNEL.add(separator_1);

        panel = new JPanel();

        panel.setBackground(new Color(116, 166, 226));

        panel.setBounds(0, 489, 1028, 43);

        homePANNEL.add(panel);

        backgroungtransfer = new JPanel();

        backgroungtransfer.setBackground(new Color(200, 217, 237));

        backgroungtransfer.setBounds(67, 28, 285, 302);

        homePANNEL.add(backgroungtransfer);

        backgroungtransfer.setLayout(null);

        Transfemoney = new JLabel("Transfer money");

        Transfemoney.setBounds(58, 18, 150, 25);

        backgroungtransfer.add(Transfemoney);

        Transfemoney.setFont(new Font("Lucida Grande", Font.PLAIN, 19));

        lblNewLabel_2 = new JLabel("Pay Someonem, buy something , or give a gift");

        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

        lblNewLabel_2.setBounds(26, 235, 240, 47);

        backgroungtransfer.add(lblNewLabel_2);

        panel_3 = new JPanel();

        panel_3.setBackground(new Color(253, 253, 253));

        panel_3.setBounds(632, 6, 390, 482);

        homePANNEL.add(panel_3);

        panel_3.setLayout(null);

        JButton CreateardID = new JButton("Create Card ID");

        CreateardID.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }

        });

        CreateardID.setBounds(16, 85, 117, 29);

        panel_3.add(CreateardID);

        JLabel lblNewLabel_4 = new JLabel("Shop and send payments more securely. Link your ");

        lblNewLabel_4.setBounds(6, 144, 438, 61);

        panel_3.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("credit card now.");

        lblNewLabel_5.setBounds(6, 182, 211, 16);

        panel_3.add(lblNewLabel_5);

        phoneNumberTextField = new JTextField();

        phoneNumberTextField.setBounds(26, 118, 130, 26);

        panel_3.add(phoneNumberTextField);

        phoneNumberTextField.setColumns(10);

        PayPalBalance = new JLabel("PayPal Balance");

        PayPalBalance.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

        PayPalBalance.setBounds(67, 342, 128, 30);

        homePANNEL.add(PayPalBalance);

        JButton TransferFunds = new JButton("Transfer Funds");

        TransferFunds.setBounds(67, 412, 138, 29);

        homePANNEL.add(TransferFunds);

        textField = new JTextField();

        textField.setText("$00.00");

        textField.setBounds(67, 374, 130, 26);

        homePANNEL.add(textField);

        textField.setColumns(10);

        wallet_PANNEL = new JPanel();

        panel_GOC.add(wallet_PANNEL, "name_395318853280000");

        JLabel lblNewLabel_6 = new JLabel("ví");

        wallet_PANNEL.add(lblNewLabel_6);

        personnal_PANNEL = new JPanel();

        personnal_PANNEL.setBackground(new Color(249, 242, 210));

        panel_GOC.add(personnal_PANNEL, "name_396862147902250");

        activiti_PANNEL = new JPanel();

        activiti_PANNEL.setBackground(new Color(140, 247, 159));

        panel_GOC.add(activiti_PANNEL, "name_396869203392541");

        JLabel nhà = new JLabel("");

        nhà.setIcon(new ImageIcon("/Users/nguyenvan/Downloads/home-icon-2.png"));

        nhà.setBounds(23, 29, 48, 43);

        panel_main.add(nhà);

        int WIDTH = 1028;

        int HEIGHT = 84;

        nhà.addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

                openmenubar();

            }

///// mở menu mượt

            private void openmenubar() {

                new Thread(new Runnable() {

                    @Override

                    public void run() {

// Vòng lặp để tăng dần chiều cao của thanh menu

                        for (int i = 0; i < HEIGHT; i++) {

// Đặt kích thước của thanh menu với chiều cao tăng dần

                            pannermenubar.setSize(WIDTH,i);

                            try {

// Tạm dừng luồng trong một khoảng thời gian ngắn để tạo hiệu ứng chuyeenr donmg

                                Thread.sleep(10);

                            } catch (InterruptedException e) {

// Handle interruptions (if any)

                                e.printStackTrace();

                            }

                        }

                    }

                }).start();

            }

        });

    }

}