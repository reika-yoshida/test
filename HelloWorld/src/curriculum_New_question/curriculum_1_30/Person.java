package curriculum_New_question.curriculum_1_30;

class Person{
	// 問題1：インスタンスフィールドを定義してください
	public  String name;
	public int age;
	public double height;
	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	public double weight;
	public int num = 0;

	// 問題2：コンストラクタを定義してください
	// 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		num++;
	}

	// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	public double bmi() {
		double bmi = weight / height / height;
		// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
		return bmi;
	}
	

	// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	public void print() {
		// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
	}
}