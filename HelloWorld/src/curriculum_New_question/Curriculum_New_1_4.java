package curriculum_New_question;

public class Curriculum_New_1_4 {
 public static void main(String[] args) {
    	 
	     // Q1 下記9個をクラス変数として宣言のみしてください
	     //		・バイト型・短整数型・整数型・長整数型
	     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
	     //   	・文字型・文字列型
	     //	 	・ブーリアン型 
    	 
	 		byte byte1;
	 		short s1;
	 		int i;
	 		long l;
	 		float f;
	 		double d;
	 		char c;
	 		String s;
	 		boolean b;
	 		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
	 		byte1 = 0;
	 		s1 = 0;
	 		i = 0;
	 		l = 0;
	 		f = 0.0f;
	 		d = 0.0d;
	 		c = '\u0000';
	 		s = null;
	 		b = false;
	     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
	
	     // ・バイト型                 10
	 		byte1 = 10;
	     // ・短整数型                 100
	 		s1 = 100;
	     // ・整数型                	 1000
	 		i = 1000;
	     // ・長整数型                 10000
	 		l = 10000;
	     // ・単精度浮動小数点数型   	 9.5
	 		f = 9.5f;
	     // ・倍精度浮動小数点数型		 10.5
	 		d = 10.5;
	     // ・文字型                   a
	 		c = 'a';
	     // ・文字列型              	 ハロー
	 		s = "ハロー";
	     // ・ブーリアン型          	 true
	    	 b = true;
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	
	     // 11110
	    	 System.out.println(byte1 + s1 + i +l); 
	     // 20.0
	    	 System.out.println(f * 2 +1);
	     // a ハロー true
	    	 System.out.println(c + s + b);
	     // 11130.0                    数字を全て足す1
	    	 System.out.println(byte1 + s1 + i + l + f + d);
	     // 10000000000                小数点以外の数字を全てかける
	    	 System.out.println(byte1 * s1 * i * l);
	     // 0.105                      10.5割る100をする
	    	 System.out.println(d / 100);
	     // -90                        10引く100をする
	    	 System.out.println(byte1 - 100);
    	// Q5 
    	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
 		int num = 20;
 		int num1 = 23;
 		System.out.println("ハローJAVA" + (num + num1));
 		 
     }
}
