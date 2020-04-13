package grocery;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String more;
        User user;
        String sb;
        int choice;

        Product prod = new Product(101, "POTATO", 30);
        Product prod1 = new Product(102, "TOMATO", 90);
        Product prod2 = new Product(103, "ONINO", 70);
        Product prod3 = new Product(104, "LADIES FINGER", 10);
        Product prod4 = new Product(105, "COCONUT", 30);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Display all the items");
            System.out.println("2. Buy items");
            System.out.println("3. View today's rate");
            System.out.println("4. Exit");

            System.out.println("Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("PID --" + prod.get_id() + " PNAME --" + prod.get_name() + " PRICE --" + prod.get_price());
                    System.out.println("PID --" + prod1.get_id() + " PNAME --" + prod1.get_name() + " PRICE --" + prod1.get_price());
                    System.out.println("PID --" + prod2.get_id() + " PNAME --" + prod2.get_name() + " PRICE --" + prod2.get_price());
                    System.out.println("PID --" + prod3.get_id() + " PNAME --" + prod3.get_name() + " PRICE --" + prod3.get_price());
                    System.out.println("PID --" + prod4.get_id() + " PNAME --" + prod4.get_name() + " PRICE --" + prod4.get_price());
                    break;

                case 2:
                    System.out.println("userid:");
                    int Uid = sc.nextInt();
                    System.out.println("FIRSTname:");
                    String Uname1 = sc.next();
                    System.out.println("LASTname:");
                    String Uname2 = sc.next();
                    user = new User(Uid, Uname1, Uname2);
                    System.out.println("*************");
                    do {
                        System.out.println("Enter product id:");
                        int pid = sc.nextInt();
                        System.out.println("quantity:");
                        int quan = sc.nextInt();
                switch (pid) {
                    case 101:
                        {
                            Bill bill = new Bill();
                            bill.Bill(user, prod, quan);
                            Discount discount = new Discount();
                            Discount.total();
                            discount.Discount();
                            break;
                        }
                    case 102:
                        {
                            Bill bill = new Bill();
                            bill.Bill(user, prod1, quan);
                            Discount discount = new Discount();
                            Discount.total();
                            discount.Discount();
                            break;
                        }
                    case 103:
                        {
                            Bill bill = new Bill();
                            bill.Bill(user, prod2, quan);
                            Discount discount = new Discount();
                            Discount.total();
                            discount.Discount();
                            break;
                        }
                    case 104:
                        {
                            Bill bill = new Bill();
                            bill.Bill(user, prod3, quan);
                            Discount discount = new Discount();
                            Discount.total();
                            discount.Discount();
                            break;
                        }
                    case 105:
                        {
                            Bill bill = new Bill();
                            bill.Bill(user, prod4, quan);
                            Discount discount = new Discount();
                            Discount.total();
                            discount.Discount();
                            break;
                        }
                    default:
                        System.out.println("product not available");
                        break;
                }
                        System.out.println("more items?");

                        more = sc.next();
                    } while (more.equals("yes"));
                    break;
                case 3:
                    do {

                        System.out.println("1.Potato");
                        System.out.println("2.Tomato");
                        System.out.println("3.Onion");
                        System.out.println("4.Ladies finger");
                        System.out.println("5.Cocunut");
                        int ch;
                        ch = sc.nextInt();
                        switch (ch) {

                            case 1:
                                Info info = new Info();
                                Info.Info1();
                                info = new Potato();
                                info.Info1();
                                break;

                            case 2:
                                Info info2 = new Tomato();
                                info2.Info1();
                                Info.Info1();
                                break;

                            case 3:
                                Info info3 = new Onion();
                                info3.Info1();
                                Info.Info1();
                                break;

                            case 4:
                                Info info4 = new Ladies();
                                info4.Info1();
                                Info.Info1();
                                break;

                            case 5:
                                Info info5 = new Coconut();
                                info5.Info1();
                                Info.Info1();
                                break;

                        }
                        System.out.println("want to check more??");
                        sb = sc.next();
                    } while (sb.equals("yes"));
                    break;

                case 4:
                    System.out.println("Thank you");
                    break;

            }
        } while (4 > choice);

    }

}
