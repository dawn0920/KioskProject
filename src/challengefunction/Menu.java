package challengefunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Menu {
    private final String menuBurgers = "Burgers";
    private final String menuDrinks = "Drinks";
    private final String menuDesserts = "Desserts";

    List<MenuItem> BurgersItems = new ArrayList<>();
    List<MenuItem> Menu = new ArrayList<>();
    List<MenuItem> Order = new ArrayList<>();

    protected MenuItem FirstBurger;
    protected MenuItem SecondBurger;
    protected MenuItem ThirdBurger;
    protected MenuItem FourthBurger;


    public Menu() {
        BurgersItems = new ArrayList<>();
        FirstBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        SecondBurger = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        ThirdBurger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        FourthBurger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        BurgersItems.add(FirstBurger);
        BurgersItems.add(SecondBurger);
        BurgersItems.add(ThirdBurger);
        BurgersItems.add(FourthBurger);
    }

    public void BurgersItemPrint(){
        // 이해 필요 !
        System.out.println("[ " + getMenuBurgers() + " MENU ]");

        // AtomicInteger를 사용하여 번호를 증가시킴
        AtomicInteger index = new AtomicInteger(1);

        List<String> BurgerPrint = BurgersItems.stream()
                .map(item -> index.getAndIncrement() + ". " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation())
                .collect(Collectors.toList());

        // 출력
        BurgerPrint.forEach(System.out::println);
        System.out.println("0. 뒤로가기");
    }

    public void MenuPrint(){
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. " + getMenuBurgers());
        System.out.println("2. " + getMenuDesserts());
        System.out.println("3. " + getMenuDrinks());
        System.out.println("0. 종료\t\t| 종료");
    }

    public void OrderPrint() {
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Orders\t| 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel\t| 진행중인 주문을 취소합니다.");
    }

    public void rmoveMenu(String removeMenu){
        if ("ShackBurger".equals(removeMenu) ||
                "SmokeShack".equals(removeMenu) ||
                "Cheeseburger".equals(removeMenu) ||
                "Hamburger".equals(removeMenu)) {
            Order = Order.stream()
                    .filter(item -> !removeMenu.equals(item.getName()))
                    .collect(Collectors.toList());
        } else {
            System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
        }
    }


    public List<MenuItem> getBurgersItems() {
        return BurgersItems;
    }

    public String getMenuBurgers() {
        return menuBurgers;
    }

    public String getMenuDesserts() {
        return menuDesserts;
    }

    public String getMenuDrinks() {
        return menuDrinks;
    }
}