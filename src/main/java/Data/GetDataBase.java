package Data;

import Utils.DataBase.SQLConnection;

import java.sql.*;

public class GetDataBase {


    private static final String TABLE_NAME = "[users].[dbo].[users]";

    private String getData(String columnName) {
        String sqlSelect = "SELECT " + columnName + " FROM " + TABLE_NAME + ";";

        try (Connection conn = SQLConnection.getConnection();
             Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = st.executeQuery(sqlSelect)) {

            if (rs.last()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            // Handle exception properly or rethrow as a custom exception
            System.out.println(ex.getMessage());
        }
        return "";
    }

    public String getFirstName() {
        return getData("firstName");
    }

    public String getLastName() {
        return getData("lastName");
    }

    public String getEmail() {
        return getData("email");
    }

    public String getPhone() {
        return getData("phone");
    }

    public String getPassword() {
        return getData("password");
    }

    public String getAddress() {
        return getData("address");
    }

    public String getCity() {
        return getData("city");
    }

    public String getCountry() {
        return getData("country");
    }

    public String getState() {
        return getData("state");
    }
}
