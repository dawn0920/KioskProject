package essentialfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk extends essentialfunctions.Menu{

    public void start(){
        Scanner sc = new Scanner(System.in);

        while(true) {
            MenuPrint();
            Number menu;
            System.out.print("선택 : ");
            menu = sc.nextInt();

            if (menu.intValue() == 1) {
                System.out.println("");
                BurgersItenPrint();
                Number order;
                while (true){
                    System.out.print("주문번호 : ");
                    order = sc.nextInt();

                    if (order.intValue() == 1) {
                        Menu.add(FirstBurger);
                    } else if (order.intValue() == 2) {
                        Menu.add(SecondBurger);
                    } else if (order.intValue() == 3) {
                        Menu.add(ThirdBurger);
                    } else if (order.intValue() == 4) {
                        Menu.add(FourthBurger);
                    } else if (order.intValue() == 0) {
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    }
                }
                System.out.println("선택한 메뉴 : " );
                for (MenuItem item : Menu)
                    System.out.println("   " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation());
                System.out.println("");
            } else if (menu.intValue() == 2) {
                System.out.println("\n미구현된 구역입니다.\n");
            } else if (menu.intValue() == 3) {
                System.out.println("\n미구현된 구역입니다.\n");
            } else if (menu.intValue() == 0) {
                System.out.println("\n주문을 종료합니다.");
                break;
            } else {
                System.out.println("\n잘못된 입력입니다. 다시 입력해주세요.\n");
            }
        }
    }
}