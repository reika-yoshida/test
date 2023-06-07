package curriculum_New_question.curriculum1_27;
import java.util.Scanner;

public class Process {

	public void priDate() {
		
		// インスタンスにscannerを代入
		Scanner scanner = new Scanner(System.in);
		String aa = scanner.next();
		scanner.close();

		// aaをカンマ区切りでarraysに格納
		String[] arrays = aa.split(",");

		// arraysを繰り返し出力
		for (String array : arrays) {
			// bbに”：”区切りで格納
			String[] bb = array.split(":");

			// コンソール出力
			System.out.println("");
			System.out.println("動物名：" + bb[0]);
			System.out.println("体長：" + bb[1] + "m");
			System.out.println("速度：" + bb[2] + "km/h");

			// if文で学名のコンソール出力
			if (bb[0].equals("ライオン")) {
				System.out.println("学名：パンテラ レオ");
			}else if(bb[0].equals("ゾウ")) {
				System.out.println("学名：ロキソドンタ・サイクロティス");
			}else if(bb[0].equals("パンダ")) {
				System.out.println("学名：アイルロポダ・メラノレウカ");
			}else if(bb[0].equals("チンパンジー")) {
				System.out.println("学名：パン・トゥログロディテス");
			}else if(bb[0].equals("シマウマ")) {
				System.out.println("学名：チャップマンシマウマ");
			}else if(bb[0].equals("インコ")) {
				System.out.println("学名：不明");
			}
		}
	}
}