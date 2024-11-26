package LAB01_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DisplayDaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> monthMap = new HashMap<>();
        monthMap.put("january", 1);
        monthMap.put("jan", 1);
        monthMap.put("jan.", 1);
        monthMap.put("1", 1);
        
        monthMap.put("february", 2);
        monthMap.put("feb", 2);
        monthMap.put("feb.", 2);
        monthMap.put("2", 2);
        
        monthMap.put("march", 3);
        monthMap.put("mar", 3);
        monthMap.put("mar.", 3);
        monthMap.put("3", 3);
        
        monthMap.put("april", 4);
        monthMap.put("apr", 4);
        monthMap.put("apr.", 4);
        monthMap.put("4", 4);
  
        monthMap.put("may", 5);
        monthMap.put("5", 5);
        
        monthMap.put("june", 6);
        monthMap.put("jun", 6);
        monthMap.put("6", 6);
        
        monthMap.put("july", 7);
        monthMap.put("jul", 7);
        monthMap.put("7", 7);
        
        monthMap.put("august", 8);
        monthMap.put("aug", 8);
        monthMap.put("aug.", 8);
        monthMap.put("8", 8);
        
        monthMap.put("september", 9);
        monthMap.put("sep", 9);
        monthMap.put("sept.", 9);
        monthMap.put("9", 9);
        
        monthMap.put("october", 10);
        monthMap.put("oct", 10);
        monthMap.put("oct.", 10);
        monthMap.put("10", 10);
        
        monthMap.put("november", 11);
        monthMap.put("nov", 11);
        monthMap.put("nov.", 11);
        monthMap.put("11", 11);
        
        monthMap.put("december", 12);
        monthMap.put("dec", 12);
        monthMap.put("dec.", 12);
        monthMap.put("12", 12);

      
        System.out.print("Enter a month: ");
        String inputMonth = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (!monthMap.containsKey(inputMonth)) {
            System.out.println("Invalid month input.");
            scanner.close();
            return;
        }
        int month = monthMap.get(inputMonth);

        int daysInMonth = 0;
        String monthName = "";

       
        switch (month) {
            case 1:
                monthName = "January";
                daysInMonth = 31;
                break;
            case 2:
                monthName = "February";
                // Kiểm tra năm nhuận
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Năm nhuận
                } else {
                    daysInMonth = 28; // Không phải năm nhuận
                }
                break;
            case 3:
                monthName = "March";
                daysInMonth = 31;
                break;
            case 4:
                monthName = "April";
                daysInMonth = 30;
                break;
            case 5:
                monthName = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthName = "June";
                daysInMonth = 30;
                break;
            case 7:
                monthName = "July";
                daysInMonth = 31;
                break;
            case 8:
                monthName = "August";
                daysInMonth = 31;
                break;
            case 9:
                monthName = "September";
                daysInMonth = 30;
                break;
            case 10:
                monthName = "October";
                daysInMonth = 31;
                break;
            case 11:
                monthName = "November";
                daysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                daysInMonth = 31;
                break;
            default:
                System.out.println("Invalid month input.");
                scanner.close();
                return;
        }

        
        System.out.println(monthName + " " + year + " has " + daysInMonth + " days.");

        scanner.close();
    }
}
