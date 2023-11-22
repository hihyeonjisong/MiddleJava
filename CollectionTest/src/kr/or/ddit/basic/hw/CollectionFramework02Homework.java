package kr.or.ddit.basic.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFramework02Homework {
	/*
	 * 로또를 구매하는 프로그램 작성하기
	 * 
	 * 사용자는 로또를 구매할 때 구매할 금액을 입력하고 입력한 금액에 맞게 로또번호를 출력한다. (단, 로또 한장의 금액은 1000원이고
	 * 거스름돈도 계산하여 출력한다.)
	 * 
	 * ========================== 
	 * Lotto 프로그램
	 *  -------------------------- 
	 *  1. Lotto 구입
	 * 2. 프로그램 종료
	 *  ========================== 
	 *  메뉴선택 : 1 <-- 입력
	 * 
	 * Lotto 구입 시작
	 * 
	 * (1000원에 로또번호 하나입니다.) 금액 입력 : 2500 <-- 입력
	 * 
	 * 행운의 로또번호는 아래와 같습니다. 로또번호1 : 2,3,4,5,6,7 로또번호2 : 20,21,22,23,24,25
	 * 
	 * 받은 금액은 2500원이고 거스름돈은 500원입니다.
	 * 
	 * ========================== 
	 * Lotto 프로그램
	 *  -------------------------- 
	 *  1. Lotto 구입
	 * 2. 프로그램 종료 
	 * ========================== 
	 * 메뉴선택 : 2 <-- 입력
	 * 
	 * 감사합니다
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printLottoHome();
		System.out.println("메뉴를 선택해주세요.");
		int selectNo = sc.nextInt();

		if (selectNo == 1) {
			System.out.println("Lotto 구입시작");
			System.out.println("가격:1000원에 로또한장");
			System.out.println("금액을 입력해주세요");
			int money = sc.nextInt();

//			Set<Integer> lottoNum = new TreeSet();
			List lottoNum = new ArrayList();
			while (lottoNum.size()<6) {
				int ran = (int) ((Math.random()*45)+1);
				lottoNum.add(ran);
			}
			System.out.println("랜덤로또값: "+ lottoNum);
//			System.out.println("행운의 로또 번호는:" + lottoNum);

			int getlotto = money / 1000;
			int change = money - getlotto * 1000;
			// int change = money%1000;

			for (int num = 1; num <= getlotto; num++) {
				System.out.print("로또번호" + num + ":");

				for (int i = 1; i < getlotto+2; i++) {
					lottoNum.clear();
					while (lottoNum.size() < 6) {
						int ran = (int)(Math.random() * 45) + 1;
						if(!lottoNum.contains(ran)) {
						lottoNum.add(ran);
					}
				}
					System.out.print(i + ",");
			}
			Collections.sort(lottoNum);
			}
		}else if(selectNo==2) {
			System.out.println("감사합니다");
			
		}

//		HashSet lotto1 = new HashSet();
//		lotto1.add(2);
//		lotto1.add(3);
//		lotto1.add(4);
//		lotto1.add(5);
//		lotto1.add(6);
//		lotto1.add(7);	
//		
//		HashSet lotto2 = new HashSet();
//		lotto2.add(20);
//		lotto2.add(21);
//		lotto2.add(22);
//		lotto2.add(23);
//		lotto2.add(24);
//		lotto2.add(25);	
//		
//		System.out.println(lotto1);
//		System.out.println(lotto2);
//		
//		HashSet lotto = new HashSet();
//		while (lotto.size()<6) {
//			int ran = (int) ((Math.random()*45)+1);
//			lotto.add(ran);
//		}
//		System.out.println("랜덤로또값: "+ lotto);
	}

	public static void printLottoHome() {
		System.out.println("=================");
		System.out.println("Lotto 프로그램");
		System.out.println("-----------------");
		System.out.println("1.Lotto 구입");
		System.out.println("2.프로그램 종료");
		System.out.println("=================");

	}
}
