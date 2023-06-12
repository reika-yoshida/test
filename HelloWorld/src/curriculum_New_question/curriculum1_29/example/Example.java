package curriculum_New_question.curriculum1_29.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import curriculum_New_question.curriculum1_29.process.Process;

public class Example {

	public static void main(String[] args) {
		
		// map作成し都道府県情報を格納
		Map<Integer,Process> map = new HashMap<>();
		map.put(0, new Process("北海道", "札幌市", 83424));
		map.put(1, new Process("青森県", "青森市", 9646));
		map.put(2, new Process("岩手県", "盛岡市", 15275));
		map.put(3, new Process("宮城県", "仙台市", 7282));
		map.put(4, new Process("秋田県", "秋田市", 11638));
		map.put(5, new Process("山形県", "山形市", 9323));
		map.put(6, new Process("福島県", "福島市", 13784));
		map.put(7, new Process("茨城県", "水戸市", 6097));
		map.put(8, new Process("栃木県", "宇都宮市", 6408));
		map.put(9, new Process("群馬県", "前橋市", 6362));
		map.put(10, new Process("埼玉県", "さいたま市", 3798));
		
		// コンソール出力
		System.out.println("コンソールに数字と並び順を入力してください");	

		// インスタンスにscannerを代入
		Scanner scanner = new Scanner(System.in);
		String aa = scanner.nextLine();
		scanner.close();
		
		// 配列に格納しカンマ区切り
		String[] arrays = aa.split(",");
		
		// arrays配列の最後をlastへ格納
		String last = arrays[arrays.length - 1];
		
		// 昇順・降順を定義
		String up = "昇順";
		String down = "降順";
		
		// if文で昇降順判別
		if(last.equals(up)) {
			Arrays.sort(arrays);
		}else if(last.equals(down)) {
			Arrays.sort(arrays, Comparator.reverseOrder());
		}
		
		// 配列をlist化
		List<String> newList = new ArrayList<>(Arrays.asList(arrays));
		// 文字列を削除
		newList.remove("降順");
		newList.remove("昇順");
		
		// 拡張for文
		for(String key : newList) {
			
			// String型からint型へ
			int index = Integer.parseInt(key);
			
			// indexをprocessに格納
			Process process = map.get(index);
			
			// 条件分岐し出力
			if(process != null) {
				process.date();
			}else {
				System.out.println("登録されていません");
			}
		}
	}
}