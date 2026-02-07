package com.marakicode.designpatterns.behavioral.chainofresponsiblity.exercise1;

public class TestDataReader {
    public static void test() {
        var quickBook = new QuickBook(null);
        var excel = new ExcelSpreadSheet(quickBook);
        var numberSheet = new NumberSpreadSheet(excel);
        var reader = new DataReader(numberSheet);
        reader.read(new File("Content"));
    }
}
