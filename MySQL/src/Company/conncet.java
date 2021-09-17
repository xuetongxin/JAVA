package Company;

import java.sql.*;
class conncet{
        public static void main(String[] args){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl","root","xsl203457");
        Statement stmt =con.createStatement();

        ResultSet rs=stmt.executeQuery("select * from employee");
        while(rs.next()){
                System.out.println(rs.getInt(1));
        }
        con.close();
        }
        catch(Exception ex){
                System.out.println(ex);
                }
        }
}


/*

Statement stmt=null;
ResultSet rs_passwd = null;
ResultSet rs_account=null;
String result_passwd = null ;
String result_account = null ;
String result_passwd1 = null ;
String result_account1 = null ;

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
	stmt=con.createStatement();	
}catch(Exception ex) {
	ex.getStackTrace();
}
rs_passwd=stmt.executeQuery("select passwd from passwd_date where account=txfd1.getText()");
while(rs_passwd.next()) {
	result_passwd=rs_passwd.getString(1);
}

result_passwd1=result_passwd;

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
	stmt=con.createStatement();	
}catch(Exception ex) {
	ex.getStackTrace();
}
rs_account=stmt.executeQuery("select passwd from passwd_date where account=txfd2.getText()");
while(rs_account.next()) {
	result_account=rs_passwd.getString(1);
}
result_account1=result_account;
*/