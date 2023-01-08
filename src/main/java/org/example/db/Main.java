package org.example.db;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorisation a = new Authorisation();
        if (a.Authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
