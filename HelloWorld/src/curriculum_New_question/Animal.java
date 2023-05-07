package curriculum_New_question;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		System.out.println(dog.dogName());

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(3);
		System.out.println(dog2.animalCount());
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在日時情報で初期化されたインスタンスの取得
		 LocalDateTime nowDateTime = LocalDateTime.now(); 
		 DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		 // 日時情報を指定フォーマットの文字列で取得
		 String date = nowDateTime.format(java8Format);
		 System.out.println(date);
	}

}
