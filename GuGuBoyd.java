package jump2java.gugu;

import java.util.ArrayList;
import java.util.Scanner;

public class GuGuBoyd {
	
	public void sw(GGInterface gg) {
		gg.gudan();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> str = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		GuGuBoyd body = new GuGuBoyd();
		int i =0;
		Dan1 dan1 = new Dan1();
		Dan2 dan2 = new Dan2();
		Dan3 dan3 = new Dan3();
		Dan4 dan4 = new Dan4();
		Dan5 dan5 = new Dan5();
		Dan6 dan6 = new Dan6();
		Dan7 dan7 = new Dan7();
		Dan8 dan8 = new Dan8();
		Dan9 dan9 = new Dan9();
		System.out.print("출력하고 싶은 구구단을 입력하세요 : ");
		while(true) {
			str.add(Integer.parseInt(scan.next()));
			switch(str.get(i++)) {
			case 1:
				body.sw(dan1);
				break;
			case 2:
				body.sw(dan2);
				break;
			case 3:
				body.sw(dan3);
				break;
			case 4:
				body.sw(dan4);
				break;
			case 5:
				body.sw(dan5);
				break;
			case 6:
				body.sw(dan6);
				break;
			case 7:
				body.sw(dan7);
				break;
			case 8:
				body.sw(dan8);
				break;
			case 9:
				body.sw(dan9);
				break;
			default:
				System.out.println("1~9사이의 단을 입력해주세요.");
				break;
			}
		}
	}
}
