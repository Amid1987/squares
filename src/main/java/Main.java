import ru.netology.sqr.squares.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrt(0, 99));
    }
}

