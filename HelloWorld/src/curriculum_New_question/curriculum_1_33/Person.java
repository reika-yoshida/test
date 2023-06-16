package curriculum_New_question.curriculum_1_33;

class Person{
	// インスタンスフィールドを定義
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	// 問題1：インスタンスフィールドに「lastName」を追加しましょう
	public String lastName;

	// コンストラクタを定義
	// 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください※順番はfirstNameの次
	// 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
	Person(String firstName, String lastName, int age, double height, double weight){
		// count+!
		Person.count++;
		// 各インスタンスフィールドに値をセット
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// fullName
	public String fullName(){
		return this.firstName + this.lastName;
	}
	
	// コンソール出力
	public void print(){
		// fullName
		System.out.println("名前は" + this.fullName() + "です");
		// age
		System.out.println("年は" + this.age + "です");
		// bmi
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
	}

	// BMI
	public double bmi(){
		return this.weight / this.height / this.height;
	}

	// 合計人数
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}