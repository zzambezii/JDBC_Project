package com.cybertek.jdbc.day3;

import com.cybertek.jdbc.utility.DB_Utility;

public class SpartanDB_Practice {

    public static void main(String[] args) {

        // please create a package called utility
        // and move your DB_Utility under that package

        String url = "jdbc:oracle:thin:@52.71.242.164:1521:XE";

        DB_Utility.createConnection(url,"SP","SP");






    }


}
