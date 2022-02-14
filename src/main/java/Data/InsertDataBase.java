package Data;

import Utils.DataBase.SQLConnection;

import java.sql.*;

public class InsertDataBase {
    UserData data;

    public void insertUser() {
        data = new UserData();
        Connection conn = null;
        PreparedStatement psInsert = null;

        try {
            conn = SQLConnection.getConnection();

            String sqlInsert = "INSERT INTO [users].[dbo].[users](firstName, lastName, phone, password," +
                    "address, email, country, state, city, zip) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            psInsert = conn.prepareStatement(sqlInsert);

            psInsert.setString(1, data.firstName);
            psInsert.setString(2, data.lastName);
            psInsert.setString(3, data.phone);
            psInsert.setString(4, data.password);
            psInsert.setString(5, data.address);
            psInsert.setString(6, data.email);
            psInsert.setString(7, data.country);
            psInsert.setString(8, data.state);
            psInsert.setString(9, data.city);
            psInsert.setInt(10, data.zip);

            psInsert.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(psInsert != null) psInsert.close();
                if(conn != null) conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}