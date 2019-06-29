
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class java extends JFrame implements ActionListener {

    static int w = 650;
    static int h = 450;
    Font TitleFont = new Font("Helvetica", Font.BOLD + Font.PLAIN, 25);
    Font mottoFont = new Font("Helvetica", Font.PLAIN, 13);
    Font mottoFont1 = new Font("Helvetica", Font.BOLD + Font.PLAIN, 13);
    Font textfont = new Font("Helvetica", Font.PLAIN, 14);
    Dimension labelSize = new Dimension(100, 45);
    Dimension textSize1 = new Dimension(200, 25);
    Dimension textSize = new Dimension(75, 25);
    JPanel toppanel = new JPanel();
    JPanel logopanel = new JPanel();
    JLabel lbllogo = new JLabel();
    JPanel titlepanel = new JPanel();
    JLabel lbltitle = new JLabel("KIBABII UNIVERSITY");
    JPanel mottopanel = new JPanel();
    JLabel lblmotto = new JLabel("Knowledge for Development.");

    JPanel centerpanel = new JPanel();
    JPanel iconpanel = new JPanel();
    JLabel lblicon = new JLabel();
    JPanel conentpanel = new JPanel();
    JPanel usernamepanel = new JPanel();
    JLabel lblusername = new JLabel("UserName : ");
    JTextField txtusername = new JTextField();
    JPanel passwordpanel = new JPanel();
    JLabel lblpassword = new JLabel("Password : ");
    JPasswordField pwdpassword = new JPasswordField();
    JPanel buttonPanel = new JPanel();
    JPanel p = new JPanel();
    JPanel mypanel = new JPanel();
    JPanel lbl1 = new JPanel();
    JPanel lbl2 = new JPanel();
    JPanel lbl3 = new JPanel();
    JPanel lbl4 = new JPanel();
    JPanel lbl5 = new JPanel();
    JPanel lbl6 = new JPanel();
    JButton btnlogin = new JButton("Login");
    JButton btnfogot = new JButton("Forgot PWord?");
    JButton btnexit = new JButton("Exit");

    public java() {
        init();
    }

    private void init() {
        setSize(w, h);
        setLocationRelativeTo(null);
//    setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/kibulogo.png")).getImage());
        setTitle("Kibabii University Ticket-System");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        toppanel.setLayout(new BorderLayout());
        toppanel.setBorder(new TitledBorder(""));
        toppanel.add(logopanel, "West");
        logopanel.add(lbllogo);
        toppanel.add(titlepanel, "Center");
        titlepanel.setLayout(new FlowLayout());
        titlepanel.add(lbltitle, "North");
        lbltitle.setForeground(new Color(35, 82, 124, 255));
        lbltitle.setFont(TitleFont);
        titlepanel.add(lblmotto, "South");
        lblmotto.setFont(mottoFont1);
        titlepanel.setBackground(new Color(255, 255, 255));
        logopanel.setBackground(Color.white);
        lblmotto.setPreferredSize(new Dimension(350, 50));
//    lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kibulogo.png")));
        centerpanel.setLayout(new BorderLayout());
        centerpanel.add(iconpanel, "West");
        centerpanel.add(conentpanel, "Center");
        iconpanel.setLayout(new BorderLayout());
        iconpanel.setBorder(new TitledBorder("User"));
        iconpanel.add(lblicon, "Center");

//    lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User.png")));
        lblicon.setPreferredSize(new Dimension(220, 100));
        conentpanel.setLayout(new GridLayout(2, 1, 5, 5));
        conentpanel.add(usernamepanel);
        conentpanel.add(passwordpanel);
        conentpanel.setBorder(new TitledBorder("Login Credentials"));
        usernamepanel.add(lblusername);
        lblusername.setPreferredSize(labelSize);
        usernamepanel.add(txtusername);
        txtusername.setPreferredSize(textSize1);
        txtusername.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                login();
            }
        });
        txtusername.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent event) {
                char c = (char) event.getKeyCode();
                char d = event.getKeyChar();
                if (c == KeyEvent.VK_UP || d == KeyEvent.VK_UP) {
                    pwdpassword.requestFocus(true);
                }
                if (event.getKeyCode() == KeyEvent.VK_DOWN || event.getKeyChar() == KeyEvent.VK_DOWN) {
                    pwdpassword.requestFocus(true);
                }
            }
        });
        txtusername.setFont(textfont);
        passwordpanel.add(lblpassword);
        lblpassword.setPreferredSize(labelSize);
        passwordpanel.add(pwdpassword);
        pwdpassword.setPreferredSize(textSize1);
        pwdpassword.setFont(textfont);
        pwdpassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                login();
            }
        });
        pwdpassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent event) {
                char c = (char) event.getKeyCode();
                char d = event.getKeyChar();
                if (c == KeyEvent.VK_UP || d == KeyEvent.VK_UP) {
                    txtusername.requestFocus(true);
                }
                if (event.getKeyCode() == KeyEvent.VK_DOWN || event.getKeyChar() == KeyEvent.VK_DOWN) {
                    txtusername.requestFocus(true);
                }
            }
        });
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.setBorder(new TitledBorder("Click An Option"));
        buttonPanel.add(mypanel);
        buttonPanel.add(p);

        p.add(btnlogin);
//    btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tick.PNG")));

        btnlogin.addActionListener(this);
        btnlogin.setPreferredSize(new Dimension(70, 30));
        p.add(btnfogot);
//    btnfogot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help..PNG")));
        btnfogot.addActionListener(this);
        btnfogot.setPreferredSize(new Dimension(140, 30));
        btnfogot.setActionCommand("Fogot PWord?");
        p.add(btnexit);
        btnexit.setPreferredSize(new Dimension(60, 30));
//    btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.PNG")));
        btnexit.addActionListener(this);
        buttonPanel.setPreferredSize(new Dimension(900, 65));
        p.setPreferredSize(new Dimension(450, 60));
        add(toppanel, "North");
        add(centerpanel, "Center");
        add(buttonPanel, "South");
        mypanel.setLayout(new GridLayout(1, 6, 5, 5));
        mypanel.setPreferredSize(new Dimension(this.getWidth() / 2, 60));
        mypanel.add(lbl1);
        //lbl1.setBorder(new TitledBorder(""));
        mypanel.add(lbl2);
        //lbl2.setBorder(new TitledBorder(""));
        mypanel.add(lbl3);
        //lbl3.setBorder(new TitledBorder(""));
        mypanel.add(lbl4);
        //lbl4.setBorder(new TitledBorder(""));
        mypanel.add(lbl5);
        //lbl5.setBorder(new TitledBorder(""));

        mypanel.add(lbl6);
        //lbl6.setBorder(new TitledBorder(""));
        mypanel.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String n = event.getActionCommand();
        switch (n) {
            case "Login":
                login();
                break;
            case "Fogot PWord?":

                break;
            case "Exit":
                this.dispose();
                break;
            default:
                break;
        }
    }

    public void login() {
        String user = txtusername.getText();
        String pass = Arrays.toString(pwdpassword.getPassword());
        char pass1[] = pwdpassword.getPassword();
        String comp = "";
        if (user.equals(comp)) {
            c("Provide Username!", "Username Error", 2);
            txtusername.requestFocus(true);
        } else if (pass1.length == 0) {
            c("Provide Password!", "Password Error", 2);
            pwdpassword.requestFocus(true);
        } else {
            String credentials[] = {user, pwdpassword.getText()};
            myHTTPClass ht = new myHTTPClass();
            JSONObject js = new JSONObject();
//            JSONArray js
            js.put("username", user);
            js.put("password", pwdpassword.getText());
            js.put("array", credentials);
            String response = js.toJSONString();
            String json = ht.ArrayToString(credentials);
           ht.setUrl("http://localhost:8080/Demos/mimic.php?catGet=loginaction&credentials="+json);
          // String response = ht.sendGetter();
           c(response,"Welcome",1);
//            c(json + "\n" + credentials, "", 1);
        }
    }

    public void c(Object o, String title, int a) {
        JOptionPane.showMessageDialog(null, o, title, a);
    }

    public static void main(String[] args) {
        new java().setVisible(true);
    }
}
