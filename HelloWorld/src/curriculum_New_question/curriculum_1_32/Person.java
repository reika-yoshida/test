package curriculum_New_question.curriculum_1_32;

class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	// 問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	public static int count = 0;

	// コンストラクタ作成
	Person(String name, int age, double height, double weight){
		// 各インスタンスフィールドに値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
		Person.count++;
	}
	
	// BMI
	public double bmi(){
		// インスタンスを返す
		return this.weight / height / height;
	}

	// コンソール出力
	public void print(){
		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "です");
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
	}
	
	// 問題4：クラスメソッド「printCount」を定義してください（データ型：void）
	public void printCount() {
		// 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
		System.out.println("合計" + Person.count + "人です");
	}
}