package com.mycompany.st1047504_prog6112_exam;

public class MainApp {
    public static void main(String[] args) {
        
        // 1. Setup the 2D array data from the screenshot
        int[][] sampleData = {
            {25, 18, 20}, 
            {15, 12, 10},
            {18, 15, 20}
        };

        // 2. Create the Product object
        Product productReport = new Product(sampleData);
        
        // 3. Create the Printer object
        PrintProduct printer = new PrintProduct();
        
        // 4. Print the report to the console
        printer.printFullReport(productReport);
    }
}