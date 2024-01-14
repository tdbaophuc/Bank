package View;



	import Controler.SignUp_LogIn;

	import java.awt.EventQueue;

	import javax.swing.JFrame;

	import javax.swing.JPanel;

	import javax.swing.border.EmptyBorder;

	import javax.swing.JLabel;

	import javax.swing.JOptionPane;

	import javax.swing.JSeparator;

	import java.awt.Color;

	import java.awt.Font;

	import javax.swing.JTextField;

	import javax.swing.JButton;

	import javax.security.auth.spi.LoginModule;

	import javax.swing.ImageIcon;

	import java.awt.event.ActionListener;

	import java.sql.Connection;

	import java.sql.DriverManager;

	import java.sql.PreparedStatement;

	import java.sql.SQLException;

	import java.awt.event.ActionEvent;

	import javax.swing.JPasswordField;

	import javax.swing.JRadioButton;

	import javax.swing.JCheckBox;

	import javax.swing.UIManager;

	public class View_SignUp extends JFrame {

	    StringBuilder stb = new StringBuilder();

	    private JTextField txtUserName;

	    private JPasswordField passwordField_2;

	    private JPasswordField passwordField_3;

	    private JTextField nation;


	    private JTextField txtphone;

	    private JTextField gmail;



	    public View_SignUp() {
	        ActionListener actionListener=new SignUp_LogIn (this);

	        getContentPane().setBackground(new Color(245, 245, 245));

	        getContentPane().setLayout(null);

	        txtUserName = new JTextField();

	        txtUserName.setBackground(Color.WHITE);

	        txtUserName.setBounds(6, 130, 764, 26);

	        getContentPane().add(txtUserName);

	        txtUserName.setColumns(10);
	        txtUserName.addActionListener(actionListener);

	        JLabel paywithundol = new JLabel("Pay with UnDol");

	        paywithundol.setFont(new Font("Lucida Grande", Font.ITALIC, 17));

	        paywithundol.setBounds(322, 35, 230, 29);

	        getContentPane().add(paywithundol);

	        JLabel lblNewLabel_1 = new JLabel(

	                "With a UnDol account, you're eligible for free return shipping, Purchase Protection, and more.");

	        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));

	        lblNewLabel_1.setBounds(157, 63, 613, 16);

	        getContentPane().add(lblNewLabel_1);

	        JLabel lblNewLabel = new JLabel("");

	        lblNewLabel.setBounds(27, 112, 61, 16);

	        getContentPane().add(lblNewLabel);

	        JLabel UserName = new JLabel("User Name");

	        UserName.setBounds(6, 108, 105, 16);

	        getContentPane().add(UserName);

	        JLabel lblNewLabel_2 = new JLabel("Gmail");

	        lblNewLabel_2.setBounds(6, 168, 61, 16);

	        getContentPane().add(lblNewLabel_2);

	        JLabel NationID = new JLabel("Nation ID");

	        NationID.setBounds(6, 224, 134, 16);

	        getContentPane().add(NationID);

	        JLabel Password = new JLabel("Password");

	        Password.setBounds(6, 356, 100, 16);

	        getContentPane().add(Password);

	        passwordField_2 = new JPasswordField(null);

	        passwordField_2.setBackground(Color.WHITE);

	        passwordField_2.setBounds(6, 384, 764, 16);

	        getContentPane().add(passwordField_2);
	        passwordField_2.addActionListener(actionListener);

	        passwordField_3 = new JPasswordField(null);

	        passwordField_3.setBackground(Color.WHITE);

	        passwordField_3.setBounds(6, 438, 764, 16);

	        getContentPane().add(passwordField_3);
	        passwordField_3.addActionListener(actionListener);

	        JLabel confirmpassss = new JLabel("confirmpassss");

	        confirmpassss.setBounds(6, 412, 105, 14);

	        getContentPane().add(confirmpassss);

	        JButton btnNewButton = new JButton("Log In");

	        btnNewButton.addActionListener(null);

	        btnNewButton.setBounds(667, 10, 117, 29);

	        getContentPane().add(btnNewButton);

	        nation = new JTextField();

	        nation.setBounds(6, 252, 764, 29);

	        getContentPane().add(nation);

	        nation.setColumns(10);
	        nation.addActionListener(actionListener);

	        JLabel lblNewLabel_4 = new JLabel("Phone Number");

	        lblNewLabel_4.setBounds(6, 293, 105, 16);

	        getContentPane().add(lblNewLabel_4);

	        txtphone = new JTextField();

	        txtphone.setBounds(6, 307, 764, 26);

	        getContentPane().add(txtphone);

	        txtphone.setColumns(10);
	        txtphone.addActionListener(actionListener);

	        gmail = new JTextField();

	        gmail.setColumns(10);

	        gmail.setBounds(6, 183, 764, 29);


	        getContentPane().add(gmail);
	        gmail.addActionListener(actionListener);

	        JLabel dol = new JLabel("Dol");

	        dol.setForeground(new Color(27, 39, 157));

	        dol.setFont(new Font("Nanum Myeongjo", Font.PLAIN, 27));

	        dol.setBounds(60, 33, 61, 28);

	        getContentPane().add(dol);

	        JLabel undo_1 = new JLabel("Un");

	        undo_1.setForeground(new Color(253, 253, 253));

	        undo_1.setFont(new Font("Nanum Myeongjo", Font.PLAIN, 27));

	        undo_1.setBounds(25, 10, 115, 53);

	        getContentPane().add(undo_1);

	        JPanel panel = new JPanel();

	        panel.setBackground(new Color(116, 166, 226));

	        panel.setBounds(-39, 466, 838, 66);

	        getContentPane().add(panel);

	        panel.setLayout(null);

	        JButton Exit = new JButton("Cancel");

	        Exit.setBounds(546, 18, 97, 29);

	        panel.add(Exit);

	        JButton SignUp = new JButton("Sign Up");

	        SignUp.setBounds(677, 18, 117, 29);

	        panel.add(SignUp);

	        JCheckBox Stayloggedinforfaster = new JCheckBox("Stay logged in for faster purchases");

	        Stayloggedinforfaster.setBounds(72, 17, 230, 29);

	        panel.add(Stayloggedinforfaster);

	        Stayloggedinforfaster.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

	//////////// controller

	        SignUp.addActionListener(new ActionListener() {

	            StringBuilder stb = new StringBuilder();

	            public void actionPerformed(java.awt.event.ActionEvent evt) {



	                if (gmail.getText().equals("")) {

	                    stb.append("Vui long nhap thong tin !\n");

	                    gmail.setBackground(Color.RED);

	                } else {

	                    gmail.setBackground(Color.WHITE);

	                }

	                if (nation.getText().equals("")) {

	                    stb.append("Vui long nhap thong tin !\n");

	                    nation.setBackground(Color.RED);

	                } else {

	                    nation.setBackground(Color.WHITE);

	                }

	                if (txtphone.getText().equals("")) {

	                    stb.append("Vui long nhap thong tin !\n");

	                    txtphone.setBackground(Color.RED);

	                } else {

	                    txtphone.setBackground(Color.WHITE);

	                }

	                if (txtUserName.getText().equals("")) {

	                    stb.append("Vui long nhap thong tin !\n");

	                    txtUserName.setBackground(Color.RED);

	                } else {

	                    txtUserName.setBackground(Color.WHITE);

	                }

	                if (passwordField_2.getText().equals("")) {

	                    stb.append("Vui long nhap thong tin !\n");

	                    passwordField_2.setBackground(Color.RED);

	                } else {

	                    passwordField_2.setBackground(Color.WHITE);

	                }

	                if (passwordField_3.getText().equals("")) {

	                    stb.append("Vui long nhap thong tin !\n");

	                    passwordField_3.setBackground(Color.RED);

	                } else {

	                    passwordField_3.setBackground(Color.WHITE);

	                }

	// kiem tra co chuoi nhap vao hay khong

	// hien thi thong bao khi an vao nut dang ky

	                int Dk = JOptionPane.showConfirmDialog(SignUp, "Would you like to register?", "",

	                        JOptionPane.YES_NO_OPTION);

	                if (Dk != JOptionPane.YES_OPTION) {

	                    return;

	                }

	// kết nối cơ sở dữ liệu

	                try {

	// Load JDBC driver

	                    Class.forName("com.mysql.cj.jdbc.Driver");

	                    String url = "jdbc:mysql://localhost:3306/ACCOUNT";

	                    String username = "baobeo";

	                    String password = "vanbaoub123";

	// Kết nối đến cơ sở dữ liệu

	                    Connection connection = DriverManager.getConnection(url, username, password);

	                    String sql = "INSERT INTO DANGKY(UserName, Gmail, NationID, PhoneNumber, PassWord, ConfirmPassword) VALUES (?, ?, ?, ?, ?, ?)";// câu

	// kết

	// nối

	// qua

	// bên

	// tê

	                    PreparedStatement ps = connection.prepareStatement(sql);// cho phép chỉ định tham số đầu vào khi

	// chạy

	                    ps.setString(1, txtUserName.getText());

	                    ps.setString(2, gmail.getText());

	                    ps.setString(3, nation.getText());

	                    ps.setString(4, txtphone.getText());

	                    ps.setString(5, passwordField_2.getText());

	                    ps.setString(6, passwordField_3.getText());

	//////////////////////////////////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////////////////

	///////////////////////////////////////////////////////////////////////////

	// khúc ni bị sai

	                    int n = ps.executeUpdate(); // update dữ liệu lên

	                    if (txtUserName.getText().equals("") | gmail.getText().equals("") | nation.getText().equals("")

	                            | txtphone.getText().equals("") | passwordField_2.getPassword().equals("")

	                            | passwordField_3.getPassword().equals("")) {

	                        JOptionPane.showMessageDialog(null, "Do not leave the content empty");

	                    } else if (n != 0) {

	                        JOptionPane.showMessageDialog(null, "You have successfully registered");

	                    } else {

	                        JOptionPane.showMessageDialog(null, "Registration failed");

	                    }

	                } catch (ClassNotFoundException | SQLException e) {

	                    System.out.println(e);

	                    ;

	                }

	            }

	        });

	        Exit.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {

	                View_LogIn vlg = new View_LogIn();

	                vlg.setVisible(true);

	                dispose();

	            }

	        });

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        setBounds(100, 100, 805, 560);

	        this.setLocationRelativeTo(null);

	        this.setVisible(true);

	    }

	}

