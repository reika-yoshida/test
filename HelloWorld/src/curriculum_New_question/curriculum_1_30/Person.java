package curriculum_New_question.curriculum_1_30;

class Person{
	// インスタンスフィールドを定義
	public static String name;
	public static int age;
	public static double height;
	public static double weight;
	public static int num;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight, int num){
		Person.name = name;
		Person.age = age;
		Person.height = height;
		Person.weight = weight;
		Person.num = num;
	}

	// BMI
	public static double bmi() {
		double bmi = weight / (height * height);
		return bmi;
	}
	

	// コンソール出力
	public static void print() {
		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "です");
		System.out.println("BMIは" + (String.format("%.1f",bmi())) + "です");
		System.out.println("合計" + num + "人です");
	}
}