package curriculum_New_question;

public class Curriculum_New_1_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列int test[][]に以下の成績を格納し、表示してください。
			出力結果：生徒1：国語64点、数学73点、英語69点
					  生徒2：国語58点、数学81点、英語75点
					  生徒3：国語86点、数学68点、英語79点
					  生徒4：国語72点、数学55点、英語80点
			
		②それぞれの教科の平均点を表示してください。
			出力結果：国語の平均点は○○点です。
					  数学の平均点は○○点です。
					  英語の平均点は○○点です。
		*/
		
		// 多次元配列格納
		int[][] num = {
			{64,73,69},
			{58,81,75},
			{86,68,79},
			{72,55,80}
		};
		
		// 出力
		System.out.println("生徒1 " + "国語" + num[0][0] + "点、" + "数学" + num[0][1] + "点、"+ "英語" + num[0][2] + "点");
		System.out.println("生徒2 " + "国語" + num[1][0] + "点、" + "数学" + num[1][1] + "点、"+ "英語" + num[1][2] + "点");
		System.out.println("生徒3 " + "国語" + num[2][0] + "点、" + "数学" + num[2][1] + "点、"+ "英語" + num[2][2] + "点");
		System.out.println("生徒4 " + "国語" + num[3][0] + "点、" + "数学" + num[3][1] + "点、"+ "英語" + num[3][2] + "点");
		
		// int 格納
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		// 平均値
		for(int i =0; i<4;i++) {
			sum += num[i][0];
			sum1 += num[i][1];
			sum2 += num[i][2];
		}		
		
		// 平均値出力
		System.out.println("国語の平均点" + sum/4+ "点です。");
		System.out.println("数学の平均点" + sum1/4 + "点です。");
		System.out.println("英語の平均点" + sum2/4 + "点です。");
	}

}
