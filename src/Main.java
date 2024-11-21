import com.example.kiosk.Kiosk;
import com.example.kiosk.item.Menu;
import com.example.kiosk.item.MenuItem;

public class Main {
    public static void main(String[] args) {
        // Burgers
        Menu burgers = new Menu("Burgers");
        burgers.setMenuItems(
                new MenuItem("ShackBurger", 8.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        );

        // Drinks
        Menu drinks = new Menu("Drinks");
        drinks.setMenuItems(
                new MenuItem("Lemonade", 3.9, "상큼한 레몬을 사용한 시원한 음료"),
                new MenuItem("Coke", 2.9, "탄산이 강렬한 코카콜라"),
                new MenuItem("Iced Tea", 3.4, "시원한 아이스 티"),
                new MenuItem("Shake", 5.9, "다양한 맛의 부드러운 쉐이크")
        );

        // Desserts
        Menu desserts = new Menu("Desserts");
        desserts.setMenuItems(
                new MenuItem("Vanilla Custard", 4.9, "달콤한 바닐라 커스터드"),
                new MenuItem("Chocolate Cookie", 3.9, "초콜릿 칩이 가득한 쿠키"),
                new MenuItem("Ice Cream", 4.5, "부드럽고 달콤한 아이스크림"),
                new MenuItem("Brownie", 5.4, "진한 초콜릿 맛의 브라우니")
        );

        // Kiosk
        Kiosk kiosk = new Kiosk(burgers, drinks, desserts);
        kiosk.start();
    }
}