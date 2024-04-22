
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.Desktop;

public class chatBot  extends JFrame {                      // ALso Keep The Class Name As ChatBot Or If You Want To Keep Create Your Bot Then Change The Class Name.
    private final JTextArea chatArea = new JTextArea();
    private final JTextField chatBox = new JTextField();

    public chatBot() {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        Container c=frame.getContentPane();
        c.setLayout(null);
        frame.setTitle("ChatBot");
        c.add(chatArea);
        c.add(chatBox);
        frame.setVisible(true);
//For TextArea
        chatArea.setSize(780, 750);
        chatArea.setLocation(2,2);
        chatArea.setBackground(Color.cyan);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\sahil\\Downloads\\123.jpg"));
        add(background);
        background.setLayout(new FlowLayout());


//For TextField
        chatBox.setSize(780, 30);
        chatBox.setLocation(2, 680);
        chatBox.setText("Enter the message");

        chatBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Gtext = chatBox.getText().toLowerCase();
                chatArea.append("You :- " + Gtext + "\n");
                chatBox.setText("");

                if (Gtext.contains("what is your name") || (Gtext.contains("your name"))||(Gtext.contains("who are u"))) {
                    Bot("My Name Is ChatBot");
                }
                if (Gtext.contains("how are you")) {
                    Bot("I'm Fine! What About you?");
                }
                if (Gtext.contains("i am fine too")) {
                    Bot("Great, From Where You Are?");
                }
                if (Gtext.contains("i am from ")) {
                    Bot("Great!!!Such A Beautiful Place");
                    Bot("Anything Else Would You Like To Ask?");
                }
                if (Gtext.contains("tell me about yourself") || (Gtext.contains("about yourself")) || Gtext.contains("yourself")) {
                    Bot("Hi I Am Sahil's Bot\n" +
                            "I'm Created By Sahil Srivastava\n" +
                            "I Have Been Developed Using Java\n" +
                            "My UI Is Created Using JavaX Swing & I'm Able To Interact With you Using Java AWT .\n" +
                            "(I.E. Abstract Window ToolKit)");
                }
                if (Gtext.contains("tell me about java")|| (Gtext.contains("java"))) {
                    Bot("Java is a popular programming language." +
                            "\n" +
                            "Java is used to develop mobile apps, web apps, desktop apps, games and much more.");

                    System.out.println("\n");
                    Bot("Would You Like To Learn More About Java?");
                }
                if (Gtext.contains("yes")) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.4:3306/ChatBotDB","root","23724351");
                        String query="select domain from chatbot where name='yes'";
                        PreparedStatement stml=conn.prepareStatement(query);
                        ResultSet result=stml.executeQuery();
                        if(result.next()) {
                            Desktop.getDesktop().browse(new URI(result.getString(1)));
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException | URISyntaxException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }

                if (Gtext.contains("oops")) {
                    Bot("OOP stands for Object-Oriented Programming.\n" +
                            " Procedural programming is about writing procedures or \n" +
                            "methods that perform operations on the data,\n" +
                            " while object-oriented programming is about creating objects that contain both data and methods.");
                    Bot("AnyThing Would You Still Like To Ask?");
                }
                if (Gtext.contains("yes tell me more about oops") || (Gtext.contains("more about oops"))) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.4:3306/ChatBotDB","root","23724351");
                        String query="select domain from chatbot where name='yes tell me more about oops'";
                        PreparedStatement stml=conn.prepareStatement(query);
                        ResultSet result=stml.executeQuery();
                        if(result.next()) {
                            Desktop.getDesktop().browse(new URI(result.getString(1)));
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException | URISyntaxException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
                if (Gtext.contains("dsa")) {
                    Bot(" Data Structure is a way to organized data in such a way that it can be used efficiently.\n" +
                            "Following terms are basic terms of a data structure.");
                    Bot("AnyThing Would You Still Like To Ask?");
                }
                if (Gtext.contains("yes tell me more about dsa") || Gtext.contains("more about dsa")) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.4:3306/ChatBotDB","root","23724351");
                        String query="select domain from chatbot where name='more about dsa'";
                        PreparedStatement stml=conn.prepareStatement(query);
                        ResultSet result=stml.executeQuery();
                        if(result.next()) {
                            Desktop.getDesktop().browse(new URI(result.getString(1)));
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException | URISyntaxException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
                if (Gtext.contains("open ronaldo videos") || (Gtext.contains("ronaldo videos")) || (Gtext.contains("ronaldo"))||(Gtext.contains("who is the best footbalplayer in the world?"))){
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.4:3306/ChatBotDB","root","23724351");
                        String query="select domain from chatbot where name='ronaldo'";
                        PreparedStatement stml=conn.prepareStatement(query);
                        ResultSet result=stml.executeQuery();
                        if(result.next()) {
                            Desktop.getDesktop().browse(new URI(result.getString(1)));
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException | URISyntaxException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
                if (Gtext.contains("open messi videos") || (Gtext.contains("messi videos")) || (Gtext.contains("messi"))||(Gtext.contains("who is messi ?"))){
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.4:3306/ChatBotDB","root","23724351");
                        String query="select domain from chatbot where name='messi'";
                        PreparedStatement stml=conn.prepareStatement(query);
                        ResultSet result=stml.executeQuery();
                        if(result.next()) {
                            Desktop.getDesktop().browse(new URI(result.getString(1)));
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException | URISyntaxException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
                if (Gtext.contains("open amazon.com") || (Gtext.contains("amazon"))){
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.4:3306/ChatBotDB","root","23724351");
                        String query="select domain from chatbot where name='amazon'";
                        PreparedStatement stml=conn.prepareStatement(query);
                        ResultSet result=stml.executeQuery();
                        if(result.next()) {
                            Desktop.getDesktop().browse(new URI(result.getString(1)));
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException | URISyntaxException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
                if (Gtext.contains("open flipkart.com") || (Gtext.contains("flipkart"))){
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.4:3306/ChatBotDB","root","23724351");
                        String query="select domain from chatbot where name='flipkart'";
                        PreparedStatement stml=conn.prepareStatement(query);
                        ResultSet result=stml.executeQuery();
                        if(result.next()) {
                            Desktop.getDesktop().browse(new URI(result.getString(1)));
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException | URISyntaxException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
                if (Gtext.contains("your favourite movie") || (Gtext.contains("which is your favourite movie")) || Gtext.contains("movie")){
                    Bot("Sorry To Say But My Favourite Movie Is Currently None Cause' I'm Not Interested In  Movies\n" +
                            "By The Way Tell Me About Your's Favourite");
                }
                if (Gtext.contains("my favourite movie is avatar")){
                    Bot("WOW!!! That's Pretty Cool");
                }
                if (Gtext.contains("who is your favourite football player")) {
                    Bot("My Favourite Football Players Are Iker Casillas & Cristiano Ronaldo");
                }
                if(Gtext.contains("tell me time") || (Gtext.contains("what is time now")) || Gtext.contains("time")){
                    LocalTime time = LocalTime.now();
                    String str = String.valueOf(time);
                    Bot("Right Now Time Is : " + str);
                }
                if (Gtext.contains("tell me date today") || (Gtext.contains("what is date today")) || (Gtext.contains("date"))){
                    LocalDate  date = LocalDate.now();
                    String st1 = String.valueOf(date);
                    Bot("Right Now Date Is : " + st1);
                }
                if (Gtext.contains("open notepad") || (Gtext.contains("notepad"))) {
                    Runtime run = Runtime.getRuntime();
                    try {
                        run.exec("notepad.exe");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                if (Gtext.contains("no")) {
                    Bot("Ok! Bye! See You Later.");
                }
                if (Gtext.contains("bye")) {
                    System.exit(0);
                }
            }
        }) ;
    }
    private void Bot(String str) {
        chatArea.setFont(new Font("arial",Font.BOLD,34));
        chatArea.append("Bot :- " + str + "\n");
    }

    public static void main(String[] args) {
        new chatBot();
    }
}
