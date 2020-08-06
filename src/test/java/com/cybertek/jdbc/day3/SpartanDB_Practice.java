package com.cybertek.jdbc.day3;

import com.cybertek.jdbc.utility.DB_Utility;
import static com.cybertek.jdbc.utility.DB_Utility.*;

public class SpartanDB_Practice {

    public static void main(String[] args) {

        // please create a package called utility
        // and move your DB_Utility under that package

        String url = "jdbc:oracle:thin:@52.71.242.164:1521:XE";

        DB_Utility.createConnection(url,"SP","SP");


//            Run query "SELECT * FROM SPARTANS"
        runQuery("SELECT * FROM SPARTANS");
//            1. Display all data in console
        displayAllData();
//            2. Print column count
//            3. Print row count
//            4. Print out 3rd row data as a list
//            5. Print out 2nd column data as a list
//            6, Print out Name column data as a list
//            7, Print out 4th row as a Map
//            8, Print out the data at row 5, column 1
//            9, Print out the data at row 53, phone column
//            10. Print out all the data as List of Map



    }


}
