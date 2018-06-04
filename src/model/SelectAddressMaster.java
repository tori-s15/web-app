package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class SelectAddressMaster {

	public List<AddressMaster> run() {

        InitialContext ctx = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		List<AddressMaster> masterlist = new ArrayList<AddressMaster>();


        try {

			// Postgresqlへ接続（データプール）
        	ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/postgres");
            conn = ds.getConnection();

			// 自動コミットオフ
			conn.setAutoCommit(false);

			// selectの実行
			stmt = conn.createStatement();
			String sql = "SELECT * FROM TEST";
			rset = stmt.executeQuery(sql);

			while(rset.next()) {

				masterlist.add(new AddressMaster(rset.getInt("id"),rset.getString("name"),rset.getString("adress")));
			}


        } catch (NamingException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
		} finally {

		}
		return masterlist;
	}

}
