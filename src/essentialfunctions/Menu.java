package essentialfunctions;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String menuBurgers = "Burgers";
    private final String menuDrinks = "Drinks";
    private final String menuDesserts = "Desserts";

    List<MenuItem> BurgersItems;
    // = new ArrayList<>();
    List<MenuItem> Menu = new ArrayList<>();

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

    public void BurgersItenPrint(){
        System.out.println("[ " + getMenuBurgers() + " MENU ]");
        for (int i = 0; i < BurgersItems.size(); i++) { // 인덱스 필요로 인한 for문 사용
            MenuItem item = BurgersItems.get(i);
            System.out.println((i + 1) + ". " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation());
        }
        System.out.println("0. 뒤로가기");
//        for (MenuItem item : menuItems)
//        System.out.println(item + item.getName() + "\t| W " + item.getPrice() + "\t\t| " + item.getExplanation());
    }

    public void MenuPrint(){
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. " + getMenuBurgers());
        System.out.println("2. " + getMenuDesserts());
        System.out.println("3. " + getMenuDrinks());
        System.out.println("0. 종료");
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