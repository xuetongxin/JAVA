package Company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class emplyee {
	// MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

	static final String DB_URL = "jdbc:mysql://localhost:3306/xsl";

	// 数据库的用户名与密码，需要根据自己的设置
	static final String USER = "root";
	static final String PASS = "xsl203457";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try {
			// 注册 JDBC 驱动
			Class.forName(JDBC_DRIVER);

			// 打开链接
			System.out.println("连接数据库...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// 执行查询
			System.out.println(" 实例化Statement对象...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT ID,NAME,AGE,SALARY,ADDRESS,KPT  FROM employee");

			// 展开结果集数据库
			while (rs.next()) {
				// 通过字段检索

				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("age");
				int salary = rs.getInt("SALARY");
				String adress = rs.getString("ADDRESS");
				String kpi = rs.getString("KPT");

				// 输出数据
				System.out.print("id: " + id);
				System.out.print("\tname " + name);
				System.out.print("\tage " + age);
				System.out.print("\tsalary " + salary);
				System.out.print("\t" + adress);
				System.out.print("\tkpi " + kpi);
				System.out.print("\n");

			}
			// 完成后关闭
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// 处理 JDBC 错误
			se.printStackTrace();
		} catch (Exception e) {
			// 处理 Class.forName 错误
			e.printStackTrace();
		} finally {
			// 关闭资源
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // 什么都不做
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye!");
	}

}
