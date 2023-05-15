package curriculum_New_question.curriculum1_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Process {
	// String型cunntryを宣言
	String cunntry;
	// String型sushiを宣言
	String sushi;
	// String型wasyokuを宣言
	String wasyoku;
	// 現在日時情報で初期化されたインスタンスの取得
	LocalDateTime nowDateTime = LocalDateTime.now(); 
	DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	// 日時情報を指定フォーマットの文字列で取得
	String date = nowDateTime.format(java8Format);
	
	public Process(String cunntry,String sushi,String wasyoku) {
		// cunntryを定義
		this.cunntry = cunntry;
		// sushiを定義
		this.sushi = sushi;
		// wasyokuを定義
		this.wasyoku = wasyoku;
	}

	// null判定
	public String cunntry() {
		if(Objects.isNull(cunntry)) {
			System.out.println("Erro");
		}
		if(Objects.nonNull(cunntry)){
			return this.cunntry;
		}
		return cunntry;
	}
	// null判定
	public String sushi() {
		if(Objects.isNull(sushi)) {
			System.out.println("Erro");
		}
		if(Objects.nonNull(sushi)){
			return this.sushi;
		}
		return sushi;
	}
	// null判定
	public String wasyoku() {
		if(Objects.isNull(wasyoku)) {
			System.out.println("Erro");
		}
		if(Objects.nonNull(wasyoku)){
			return this.wasyoku;
		}
		return wasyoku;
	}
	// null判定
	public String date() {
		if(Objects.isNull(date)) {
			System.out.println("Erro");
		}
		if(Objects.nonNull(date)){
			return this.date;
		}
		return date;
	}
	
	public void priDate() {
		// cunntryをコンソールに出力
		System.out.println(this.cunntry());
		// 	sushiをコンソールに出力
		System.out.println(this.sushi());
		// wasyokuをコンソールに出力
		System.out.println(this.wasyoku());
		// dateをコンソールに出力
		System.out.println(this.date());
	}

}
