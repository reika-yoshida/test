package curriculum_New_question.curriculum1_25.example;
import java.util.Scanner;

import curriculum_New_question.curriculum1_25.process.Player;
import curriculum_New_question.curriculum1_25.process.Status;

public class Example {
	public static void main(String[] args) {
		// インスタンスにscannerを代入
		Scanner scanner = new Scanner(System.in);
		// 文字列の受け取り
		String name = scanner.next();
		// コンソール出力
		System.out.println("こんにちは「" + name + "」さん");
		// インスタンスに変数を代入
		Status status = new Status();
		Player player = new Player();	
		// コンソール出力
		status.priDate(player);
	}
}


