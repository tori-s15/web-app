package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAddressMaster {

	public String run() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		// 接続文字列
		String url = "jdbc:postgresql://localhost/webdb";
		String user = "webap";
		String pass = "webap";

		String result = "";

		try {
            // postgreSQLのJDBCドライバを読み込み
            Class.forName("org.postgresql.Driver");

		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}

		try {
			// Postgresqlへ接続
			conn = DriverManager.getConnection(url, user, pass);

			// 自動コミットオフ
			conn.setAutoCommit(false);

			// selectの実行
			stmt = conn.createStatement();
			String sql = "SELECT * FROM TEST";
			rset = stmt.executeQuery(sql);

			rset.next();

			result = rset.getString("id") + "," + rset.getString("name");

		} catch(SQLException e) {
            // 接続、SELECT文の発行でエラーが発生した場合
            e.printStackTrace();

		} finally {
            // データベース接続の切断
            try {
            	if (rset != null) rset.close();
            	if (stmt != null) stmt.close();
            	if (conn != null) conn.close();
            } catch (SQLException e) {
                // データベース接続の切断でエラーが発生した場合
                e.printStackTrace();
            }
        }
		return result;
	}


}
