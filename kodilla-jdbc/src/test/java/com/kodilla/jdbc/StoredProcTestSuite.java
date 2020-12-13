package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"NOT SET\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //when
        String sqlProcedureCall = "Call updateVipLevels()";
        statement.execute(sqlProcedureCall);
        //then
        String sqlCheckTable = "Select count(*) as HOW_MANY FROM READERS WHERE VIP_LEVEL=\"NOT SET\"";
        ResultSet resultSet = statement.executeQuery(sqlCheckTable);

        int howMany = -1;
        if (resultSet.next()) {
            howMany = resultSet.getInt("HOW_MANY");
        }
        Assert.assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=\"2\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //when
        String sqlProcedureCall = "Call updateBestsellers()";
        statement.execute(sqlProcedureCall);
        //then
        String sqlCheckTable = "Select count(*) as HOW_MANY FROM BOOKS WHERE BESTSELLER=\"2\"";
        ResultSet resultSet = statement.executeQuery(sqlCheckTable);

        int howMany = -1;
        if (resultSet.next()) {
            howMany = resultSet.getInt("HOW_MANY");
        }
        Assert.assertEquals(0, howMany);
    }

}

