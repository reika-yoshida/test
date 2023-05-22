package curriculum_New_question.curriculum1_25.example;
import java.util.Scanner;

import curriculum_New_question.curriculum1_25.process.Player;
import curriculum_New_question.curriculum1_25.process.Status;

public class Example {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！
		 
		 */
		// // インスタンスにscannerを代入
		Scanner scanner = new Scanner(System.in);
		//文字列の受け取り
		String name = scanner.next();
		//コンソール出力
		System.out.println("こんにちは「" + name + "」さん");
		// インスタンスに変数を代入
		Status status = new Status();
		Player player = new Player();	
		//コンソール出力
		status.priDate(player);
	}
}


