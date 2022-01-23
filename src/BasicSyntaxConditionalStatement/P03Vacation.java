package BasicSyntaxConditionalStatement;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (typeOfGroup.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                price = groupOfPeople * 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                price = groupOfPeople * 9.80;
            } else if (dayOfWeek.equals("Sunday")) {
                price = groupOfPeople * 10.46;
            }
        }else if (typeOfGroup.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                price = groupOfPeople * 10.90;
            } else if (dayOfWeek.equals("Saturday")) {
                price = groupOfPeople * 15.60;
            } else if (dayOfWeek.equals("Sunday")) {
                price = groupOfPeople * 16;
            }
        }else if ((typeOfGroup.equals("Regular"))) {
                    if (dayOfWeek.equals("Friday")) {
                        price = groupOfPeople * 15;
                    } else if (dayOfWeek.equals("Saturday")) {
                        price = groupOfPeople * 20;
                    } else if (dayOfWeek.equals("Sunday")) {
                        price = groupOfPeople * 22.50;
                    }
                }
        if(typeOfGroup.equals("Students") && groupOfPeople >= 30){
            price = price - (price * 0.15);
        }else if (typeOfGroup.equals("Business") && groupOfPeople >= 100){
            double pricePerPerson = price / groupOfPeople;
            double pricePerTenPeople = pricePerPerson * 10;
            price = price - pricePerTenPeople;
        }else if(typeOfGroup.equals("Regular") && groupOfPeople >= 10 && groupOfPeople <= 20){
            price = price - (price * 0.05);
        }
        System.out.printf("Total price: %.2f", price);
    }
}