package jump2java.gugu;

import java.util.ArrayList;
import java.util.Scanner;

public class GuGuBody {
	public void oeGGD(GGInterface gg) {
		gg.gudan();
	}
	public void input(GGInterface gg) {
		gg.inputGudan();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> str = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		GuGuDan dan = new GuGuDan();
		GuGuBody body = new GuGuBody();
		EvenGGD eggd = new EvenGGD();
		OddGGD oggd = new OddGGD();
		int i =0;

		while(true) {
			System.out.print("출력하고 싶은 구구단을 선택하세요.\r");
			System.out.print("홀수단 출력 : 1\r");
			System.out.print("짝수단 출력 : 2\r");
			System.out.print("직접 입력한 숫자단 출력 : 3\r");
			System.out.print("직접 입력한 홀수단 출력 : 4\r");
			System.out.print("직접 입력한 짝수단 출력 : 5\n\r");
			str.add(Integer.parseInt(scan.next()));
			switch(str.get(i)) {
				case 1:
					body.oeGGD(oggd);
					break;
				case 2:
					body.oeGGD(eggd);
					break;
				case 3:
					i++;
					System.out.print("출력을 원하는 숫자를 입력하세요.");
					str.add(Integer.parseInt(scan.next()));
					dan.gudan(str.get(i));
					break;
				case 4:
					i++;
					System.out.print("출력을 원하는 숫자를 입력하세요.");
					str.add(Integer.parseInt(scan.next()));
					oggd.setDan(str.get(i));
					body.input(oggd);
					break;
				case 5:
					i++;
					System.out.print("출력을 원하는 숫자를 입력하세요.");
					str.add(Integer.parseInt(scan.next()));
					eggd.setDan(str.get(i));
					body.input(eggd);
					break;
				default:
					break;
			}
			i++;
		}
	}
}
