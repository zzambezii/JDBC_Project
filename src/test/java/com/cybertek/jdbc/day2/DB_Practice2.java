package com.cybertek.jdbc.day2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Practice2 {

    public static void main(String[] args) throws SQLException {

        // print out all data from Jobs Table
        DB_Utility.createConnection();
        ResultSet rs = DB_Utility.runQuery("SELECT * FROM JOBS");


        // get the first row data  | without knowing the column names
        int colCount = DB_Utility.getColumnCNT() ;
        rs.first() ; // moving to the first row
        for (int i = 1; i <= colCount ; i++) {
            System.out.print(  rs.getString( i )  + "\t" );
        }







    }

}
