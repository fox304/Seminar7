package Seminar7.model;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
выполняет логирование
 */

public class ConsoleLogs {
    WriteIntoFile writeIntoFile = new WriteFile();

    public void printLog(StringBuffer str) {
        Date date = new Date();
        SimpleDateFormat formatForDateNow =
                new SimpleDateFormat("yyyy.MM.dd ' время:' hh:mm:ss a");
        String str1 = String.format("(%s): %s\n",
                formatForDateNow.format(date), str);
        writeIntoFile.writeF(str1);
        System.out.printf(str1);

    }
}
