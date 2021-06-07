package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import javax.management.relation.Relation;
import java.sql.*;


public class LAB_FAT_19BCE2186 extends Application {

    @Override
    public void start(Stage Stage) {
        Text text = new Text("Syllabi");
        Text text1 = new Text("CouseName: ");
        TextField cname = new TextField();
        Text text2 = new Text("CourseCode: ");
        TextField ccode = new TextField();
        Text text3 = new Text("M1: empid");
        TextField eid = new TextField();
        Text text4 = new Text("M1: name");
        TextField ename = new TextField();
        Text text5 = new Text("M1: phno");
        TextField ephno = new TextField();
        Text text6 = new Text("M1: NumberOfTimes ");
        TextField enot = new TextField();
        Text text7 = new Text("M2: empid");
        TextField e1id = new TextField();
        Text text8 = new Text("M2: name");
        TextField e1name = new TextField();
        Text text9 = new Text("M2: phno");
        TextField e1phno = new TextField();
        Text text10 = new Text("M2: NumberOfTimes");
        TextField e1not = new TextField();

        Text text11 = new Text("MODERATOR: empid");
        TextField e3id = new TextField();
        Text text12 = new Text("MODERATOR: name");
        TextField e3name = new TextField();
        Text text13 = new Text("MODERATOR: phno");
        TextField e3phno = new TextField();
        Text text14 = new Text("MODERATOR: whe");
        TextField e3whe = new TextField();

        Button SubmitButton = new Button("Submit");
        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String s1 = cname.getText();
                String s2 = ccode.getText();
                String s3 = eid.getText();
                String s4 = ename.getText();
                String s5 = ephno.getText();
                String s6 = enot.getText();
                String s7 = e1id.getText();
                String s8 = e1name.getText();
                String s9 = e1phno.getText();
                String s10 = e1not.getText();
                String s11 = e3id.getText();
                String s12 = e3name.getText();
                String s13 = e3phno.getText();
                String s14 = e3whe.getText();
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(s4);
                System.out.println(s5);
                System.out.println(s6);
                System.out.println(s7);
                System.out.println(s8);
                System.out.println(s9);
                System.out.println(s10);
                System.out.println(s11);
                System.out.println(s12);
                System.out.println(s13);
                System.out.println(s14);


                try{
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con= DriverManager.getConnection(
                            "jdbc:oracle:thin:@localhost:1521:XE","system","nitin19bce2186");
                    Statement stmt=con.createStatement();


                    PreparedStatement rt=con.prepareStatement("insert into members_19bce2186 (coursecode, coursename, empid, name,phno, nothe,empid1, name1,phno1,nothe1) values(?,?,?,?,?,?,?,?,?,?)");
                    rt.setString(1,s1);
                    rt.setLong(2, Long.parseLong(s2));
                    rt.setLong(3, Long.parseLong(s3));
                    rt.setString(4,s4);

                    rt.setLong(5, Long.parseLong(s5));
                    rt.setLong(6, Long.parseLong(s6));
                    rt.setLong(7, Long.parseLong(s7));
                    rt.setString(8,s8);

                    rt.setLong(9, Long.parseLong(s9));
                    rt.setLong(10, Long.parseLong(s10));
                    ResultSet rs=stmt.executeQuery("select * from members_19bce2186");
                    PreparedStatement rt1=con.prepareStatement("insert into moderator_19bce2186 (coursecode, coursename, empid3, name3,phno3, whe) values(?,?,?,?,?,?)");
                    rt1.setString(1,s1);
                    rt1.setLong(2, Long.parseLong(s2));
                    rt1.setLong(11, Long.parseLong(s11));
                    rt1.setString(12,s12);

                    rt1.setLong(13, Long.parseLong(s13));
                    rt1.setLong(14, Long.parseLong(s14));


                    rt.execute();
                    rt1.execute();
                    System.out.println("successful");
                    rt.close();
                    rt1.close();


                    //stmt.executeUpdate(QS);
                }catch(Exception e){ System.out.println(e);}
            }
        };
        SubmitButton.addEventFilter(MouseEvent.MOUSE_CLICKED, handler);
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500, 500);
        gridPane.setPadding(new Insets(8, 8, 8, 8));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text, 1, 0);
        gridPane.add(text1, 0, 1);
        gridPane.add(cname, 2, 1);
        gridPane.add(text2, 0, 2);
        gridPane.add(ccode, 2, 2);
        gridPane.add(text3, 0, 3);
        gridPane.add(eid, 2, 3);
        gridPane.add(text4, 0, 4);
        gridPane.add(ename, 2, 4);
        gridPane.add(text5, 0, 5);
        gridPane.add(ephno, 2, 5);
        gridPane.add(text6, 0, 6);
        gridPane.add(enot, 2, 6);
        gridPane.add(text7, 0, 7);
        gridPane.add(e1id, 2, 7);
        gridPane.add(text8, 0, 8);
        gridPane.add(e1name, 2, 8);
        gridPane.add(text9, 0, 9);
        gridPane.add(e1phno, 2, 9);

        gridPane.add(text10, 0, 10);
        gridPane.add(e1not, 2, 10);

        gridPane.add(text11, 0, 11);
        gridPane.add(e3id, 2, 11);

        gridPane.add(text12, 0, 12);
        gridPane.add(e3name, 2, 12);

        gridPane.add(text13, 0, 13);
        gridPane.add(e3phno, 2, 13);

        gridPane.add(text14, 0, 14);
        gridPane.add(e3whe, 2, 14);

        gridPane.add(SubmitButton, 1, 15);
        SubmitButton.setStyle("-fx-background-color: chocolate; -fx-textfill: silver;");
        gridPane.setStyle("-fx-background-color: turquoise;");
        Scene scene = new Scene(gridPane, 950, 470);
        text.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text1.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text2.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text3.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text4.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text5.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text6.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text7.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text8.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text9.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text10.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text11.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text12.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text13.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        text14.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));

        SubmitButton.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, FontPosture.REGULAR, 23));
        Stage.setTitle("My Syllabi - 19BCE2186");
        Stage.setScene(scene);
        Stage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }

}