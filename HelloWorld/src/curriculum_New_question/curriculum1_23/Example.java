package curriculum_New_question.curriculum1_23;

public class Example {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
		
		Process process = new Process("うさぎ", 1f, 2);
		// setter
		process.setRion("ライオン");
		process.setHeight(2.1f);
		process.setSpeed(80);
		// コンソール出力
		process.priDate();
	}

}
