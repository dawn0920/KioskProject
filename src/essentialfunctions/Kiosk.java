package essentialfunctions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk extends Menu{

    public void start(){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        // double 덧셈 사용시 숫자가 고장나는걸 대비 소숫점 이하 두자리로 제한

        while(true) {
            MenuPrint();
            Number menu;

            // Order List에 값이 없을때(처음) 실행
            if (Order.isEmpty() == true){
                System.out.print("선택 : ");
                menu = sc.nextInt();

                // 번호 1을 입력시 아래 코드 실행
                if (menu.intValue() == 1) {
                    System.out.println("");
                    BurgersItemPrint();
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
                            System.out.println("잘못된 입력입니다. 다시 입력해주세요.\n");
                            break;
                        }
                        while(true){
                            System.out.println("선택한 메뉴 : " );
                            for (MenuItem item : Menu) {
                                System.out.println("   " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation());
                                System.out.println("\n\" " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation() + " \"");
                            }
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인\t\t2. 취소");
                            Number choose = sc.nextInt();

                            if (choose.intValue() == 1){
                                MenuItem OrderMenu = Menu.get(Menu.size() - 1);
                                Order.add(OrderMenu);
                                Menu.clear();
                                System.out.println("");
                                System.out.println(OrderMenu.getName() + " 이 장바구니에 추가되었습니다.\n");
                                break;
                            } else if (choose.intValue() == 2) {
                                Menu.clear();
                                break;
                            } else {
                                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                            }
                        } break;

                    }
                }
                else if (menu.intValue() == 2) {
                    System.out.println("\n미구현된 구역입니다.\n");
                }
                else if (menu.intValue() == 3) {
                    System.out.println("\n미구현된 구역입니다.\n");
                }
                else if (menu.intValue() == 0) {
                    System.out.println("\n주문을 종료합니다.");
                    break;
                }
                else {
                    System.out.println("\n잘못된 입력입니다. 다시 입력해주세요.\n");
                }
            }

            // Order List에 값이 들어온 후 실행
            else {
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
                OrderPrint();
                System.out.print("선택 : ");
                menu = sc.nextInt();

                // 번호 1을 입력시 아래 코드 실행
                if (menu.intValue() == 1) {
                    System.out.println("");
                    BurgersItemPrint();
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
                            break;
                        }
                        while(true){
                            System.out.println("선택한 메뉴 : " );
                            for (MenuItem item : Menu) {
                                System.out.println("   " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation());
                                System.out.println("\n\" " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation() + " \"");
                            }
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인\t\t2. 취소");
                            Number choose = sc.nextInt();

                            if (choose.intValue() == 1){
                                MenuItem OrderMenu = Menu.get(Menu.size() - 1);
                                Order.add(OrderMenu);
                                Menu.clear();
                                System.out.println("");
                                System.out.println(OrderMenu.getName() + " 이 장바구니에 추가되었습니다.\n");
                                break;
                            } else if (choose.intValue() == 2) {
                                Menu.clear();
                                break;
                            } else {
                                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                            }
                        } break;
                    }
                }
                else if (menu.intValue() == 2) {
                    System.out.println("\n미구현된 구역입니다.\n");
                }
                else if (menu.intValue() == 3) {
                    System.out.println("\n미구현된 구역입니다.\n");
                }
                else if (menu.intValue() == 0) {
                    System.out.println("\n주문을 종료합니다.");
                    break;
                }
                // 번호 4를 입력시 아래 코드 실행
                else if(menu.intValue() == 4){
                    System.out.println("\n아래와 같이 주문하시겠습니까?\n");
                    System.out.println("[ Orders ]");
                    double total = 0;
                    for (MenuItem item : Order){
                        System.out.println("   " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation());
                        total += item.getPrice();
                    }
                    System.out.println("\n[ Total ]");
                    System.out.println("\t W " + df.format(total) +"\n");

                    while(true){
                        System.out.println("\n1. 주문\t\t2. 메뉴판\t3. 메뉴삭제");
                        Number FinalCheck = sc.nextInt();
                        if (FinalCheck.intValue() == 1){

                            System.out.println("\n할인 정보를 입력해주세요.");
                            System.out.println("1. 국가 유공자\t : 10%\n" +
                                    "2. 군인\t\t\t : 5%\n" +
                                    "3. 학생\t\t\t : 3%\n" +
                                    "4. 일반\t\t\t : 0%");
                            while(true){
                                int ChooseCustomer = sc.nextInt();
                                if (ChooseCustomer == 1){
                                    total = (double) Customer.VETERAN.apply(total);
                                    break;
                                } else if (ChooseCustomer == 2){
                                    total = (double) Customer.SOLDIER.apply(total);
                                    break;
                                } else if (ChooseCustomer == 3){
                                    total = (double) Customer.STUDENT.apply(total);
                                    break;
                                } else if (ChooseCustomer == 4){
                                    total = (double) Customer.COMMON.apply(total);
                                    break;
                                } else {
                                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                                }
                            }
                            System.out.println("\n주문이 완료되었습니다. 금액은 W "+ df.format(total) +" 입니다.");
                            return; // return을 사용하면 프로그램이 완전히 종료된다.
                        }
                        else if(FinalCheck.intValue() == 2) {
                            break;
                        } else if (FinalCheck.intValue() == 3) {
                            System.out.println("장바구니에서 지울 메뉴이름을 입력해주세요");
                            String removeMenu = sc.next();
                            rmoveMenu(removeMenu);

                            total = 0;
                            for (MenuItem item : Order){
                                System.out.println("   " + item.getName() + "\t| W " + item.getPrice() + "\t| " + item.getExplanation());
                                total += item.getPrice();
                            }
                            System.out.println("\n[ Total ]");
                            System.out.println("\t W " + df.format(total) +"\n");
                        } else {
                            System.out.println("\n잘못된 입력입니다. 다시 입력해주세요.\n");
                        }
                    }

                }
                else if(menu.intValue() == 5) {
                    Menu.clear(); // 리스트를 한번에 삭제
                }
                else {
                    System.out.println("\n잘못된 입력입니다. 다시 입력해주세요.\n");
                }
            }
        }
    }
}
