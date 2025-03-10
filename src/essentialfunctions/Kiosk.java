package essentialfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menuItems = new ArrayList<>();
    MenuItem FirsetMune = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
    MenuItem SecondMune = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
    MenuItem ThirdMune = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
    MenuItem FourthMune = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");


    public void start(){
        System.out.println("[ SHAKESHACK MENU ]\n" +
                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                "0. 종료 \t\t\t | 종료\n");

        Scanner sc = new Scanner(System.in);

        Number order;
        while (true){
            System.out.print("주문번호 : ");
            order = sc.nextInt();
            if (order.intValue() == 1) {
                menuItems.add(FirsetMune);
            } else if (order.intValue() == 2) {
                menuItems.add(SecondMune);
            } else if (order.intValue() == 3) {
                menuItems.add(ThirdMune);
            } else if (order.intValue() == 4) {
                menuItems.add(FourthMune);
            } else if (order.intValue() == 0) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        System.out.println("선택한 메뉴 : " );
        for (MenuItem item : menuItems)
            System.out.println(item.getName() + " | W " + item.getPrice() + " | " + item.getExplanation());
    }
}
