import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExpenseTracker {

    public static void main(String[] args) {
        List<Expense> expenses = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            
            while (true) {
                System.out.print("Enter expense date (MM/DD/YYYY), category, and amount (or 'exit' to finish): ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                String[] parts = input.split(",");
                if (parts.length != 3) {
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }
                String date = parts[0].trim();
                String category = parts[1].trim();
                double amount = Double.parseDouble(parts[2].trim());
                expenses.add(new Expense(date, category, amount));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount format. Please enter a valid number.");
        }

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Expenses");
            int rowNum = 0;
            for (Expense expense : expenses) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(expense.getDate());
                row.createCell(1).setCellValue(expense.getCategory());
                row.createCell(2).setCellValue(expense.getAmount());
            }

            try (FileOutputStream outputStream = new FileOutputStream("ExpenseTracker.xlsx")) {
                workbook.write(outputStream);
            }
            System.out.println("Expenses exported to ExpenseTracker.xlsx");
        } catch (IOException e) {
            System.out.println("Error occurred while exporting to Excel: " + e.getMessage());
        }
    }
}

class Expense {
    private String date;
    private String category;
    private double amount;

    public Expense(String date, String category, double amount) {
        this.date = date;
        this.category = category;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}

