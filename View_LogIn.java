package View;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

public class View_LogIn extends JFrame {

// Kết nối đến cơ sở dữ liệu

    private JPanel contentPane;

    private JTextField txtsdt;

    private JPasswordField txtpass;

    /**

     * Launch the application.

     *

     * @throws SQLException

     */




    public View_LogIn() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 805, 560);

        contentPane = new JPanel();

        contentPane.setBackground(new Color(241, 229, 214));

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        contentPane.setLayout(null);

        JLabel paywithundol = new JLabel("Pay with UnDol");

        paywithundol.setFont(new Font("Lucida Grande", Font.ITALIC, 20));

        paywithundol.setBounds(307, 21, 230, 38);

        contentPane.add(paywithundol);

        txtsdt = new JTextField();

        txtsdt.setColumns(10);

        txtsdt.setBackground(Color.WHITE);

        txtsdt.setBounds(394, 141, 405, 26);

        contentPane.add(txtsdt);

        JLabel phonenumber = new JLabel("Phone Number");

        phonenumber.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

        phonenumber.setBounds(406, 125, 131, 16);

        contentPane.add(phonenumber);

        JLabel lblPassWord = new JLabel("PassWord");

        lblPassWord.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

        lblPassWord.setBounds(406, 213, 98, 16);

        contentPane.add(lblPassWord);

        JButton login = new JButton("Log In");

        login.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/ACCOUNT";

                    String username = "baobeo";

                    String password = "vanbaoub123";

                    ResultSet rs;

// Kết nối đến cơ sở dữ liệu

                    Connection connection = DriverManager.getConnection(url, username, password);

                    String sql = "SELECT* FROM DANGKY WHERE PhoneNumber=? and PassWord=?";// truy vấn đến sql

                    PreparedStatement ps = connection.prepareCall(sql);// cho phép chỉ định tham số đầu vào khi run

                    ps.setString(1, txtsdt.getText());// nhận vào 1 tham số khi ai nhập vào

                    ps.setString(2, txtpass.getText());// nhap apk mk

                    rs = ps.executeQuery();// executeQuery tra về thằng ResultSet khi thực hiện câu lệnh sellec

                    if (txtsdt.getText().isEmpty() | txtpass.getText().isEmpty()) {

                        JOptionPane.showMessageDialog(login, "Vui lòng không để trống");

                    } else if (rs.next())

// có dữ liệu

                    {

                        JOptionPane.showMessageDialog(login, "Đăng nhập thành công");

                        View_Home vh = new View_Home();

                        vh.setVisible(true);

                        dispose();

                    } else {

                        JOptionPane.showMessageDialog(login, "Đăng nhập thất bại");

                    }

                } catch (Exception e2) {

                    System.out.println(e2);

                }

            }

        });

        login.setBounds(611, 325, 161, 29);

        contentPane.add(login);

        JButton signup = new JButton("Sign Up");

        signup.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                View_SignUp bv = new View_SignUp();

                bv.setVisible(true);

                dispose();

            }

        });

        signup.setBounds(682, 9, 117, 29);

        contentPane.add(signup);

        txtpass = new JPasswordField();

        txtpass.setBounds(394, 228, 405, 26);

        contentPane.add(txtpass);

        JLabel undo_1 = new JLabel("Un");

        undo_1.setForeground(new Color(253, 253, 253));

        undo_1.setFont(new Font("Nanum Myeongjo", Font.PLAIN, 27));

        undo_1.setBounds(26, 13, 115, 53);

        contentPane.add(undo_1);

        JLabel dol = new JLabel("Dol");

        dol.setForeground(new Color(27, 39, 157));

        dol.setFont(new Font("Nanum Myeongjo", Font.PLAIN, 27));

        dol.setBounds(60, 38, 61, 28);

        contentPane.add(dol);

        JButton Cancel = new JButton("Cancel");

        Cancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }

        });

        Cancel.setBounds(435, 325, 117, 29);

        contentPane.add(Cancel);

        JPanel panel = new JPanel();

        panel.setBackground(new Color(116, 166, 226));

        panel.setBounds(0, 468, 805, 58);

        contentPane.add(panel);

        panel.setLayout(null);

        JLabel r = new JLabel("Full wealth and good luck for you");

        r.setBounds(6, 20, 208, 18);

        panel.add(r);

        r.setFont(new Font("Mali", Font.PLAIN, 13));

        this.setLocationRelativeTo(null);

    }

}