package Data;

import Utils.DataBase.SQLConnection;

import java.sql.*;

public class GetDataBase {
    InsertDataBase insert = new InsertDataBase();
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    public String getFirstName() {
        String firstName = "";
        try{
            String sqlSelect = "SELECT firstName FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) firstName = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return firstName;
    }

    public String getLastName() {
        String lastName = "";
        try{
            String sqlSelect = "SELECT lastName FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) lastName = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lastName;
    }

    public String getEmail() {
        String email = "";
        try{
            String sqlSelect = "SELECT email FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) email = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return email;
    }

    public String getPhone() {
        String phone = "";
        try{
            String sqlSelect = "SELECT phone FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) phone = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return phone;
    }

    public String getPassword() {
        String password = "";
        try{
            String sqlSelect = "SELECT password FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) password = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return password;
    }

    public String getAddress() {
        String address = "";
        try{
            String sqlSelect = "SELECT address FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) address = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return address;
    }

    public String getCity() {
        String city = "";
        try{
            String sqlSelect = "SELECT city FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) city = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return city;
    }

    public String getCountry() {
        String country = "";
        try{
            String sqlSelect = "SELECT country FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) country = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return country;
    }

    public String getState() {
        String state = "";
        try{
            String sqlSelect = "SELECT state FROM [users].[dbo].[users];";
            conn = SQLConnection.getConnection();
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sqlSelect);
            rs.afterLast();
            if(rs.previous()) state = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return state;
    }
}
