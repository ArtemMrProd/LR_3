import java.util.Random;

public class Coin {

	public static void main(String[] args) {
	Random rnd = new Random();
        int or = rnd.ints(0,2)
                .limit(10000)
                .sum();
        System.out.printf("���� ����� %d ���(a), �� 10000 ��������, ����� %d", or, 10000 - or);

	}

}
