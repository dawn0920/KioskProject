package essentialfunctions;

public class MenuItem {
    // 속성
    private String name;
    private double price;
    private String explanation;

    // 생성자
    public MenuItem(String name, double price, String explanation){
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // 기능
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;
    }
}
