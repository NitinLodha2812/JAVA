import java.sql.*;
class MysqlCon{
    public static void main(String args[]){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE","system","nitin19bce2186");
            Statement stmt=con.createStatement();
            PreparedStatement rt=con.prepareStatement("INSERT INTO emp (empid, ename, desig, dept) VALUES (?, ?, ?, ?)");
            rt.setInt(1,121);
            rt.setString(2,"tin");
            rt.setString(3,"vc");
            rt.setString(4,"batsman");


            rt.execute();

            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(4));
            con.close();
            rt.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
