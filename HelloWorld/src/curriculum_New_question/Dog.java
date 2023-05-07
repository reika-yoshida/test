package curriculum_New_question;

public class Dog {
	//Q1：フィールドに動物の名前の変数を定義してください。
	// 動物の名前の変数を定義
	String name;
	
	//Q2：フィールドに動物の数の変数を定義してください。
	// 動物の数の変数を定義
	int animalCount;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		// 変数に「犬」を代入
		name = "犬";
	}
	
	public String dogName() {
		// nameを返す
		return name;
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int count) {
		//　作成した変数に引数を代入
		animalCount = count;
	}
	
	public int animalCount() {
		// animalCountを返す
		return animalCount;
	}
}

