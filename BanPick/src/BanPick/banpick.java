package BanPick;

import java.util.ArrayList;
import java.util.Scanner;

public class banpick {
	public static void main(String[] args) {
		ArrayList<Name> name = new ArrayList<>();
		ArrayList<Name> redPickname = new ArrayList<>();
		ArrayList<Name> bluePickname = new ArrayList<>();
		ArrayList<Name> redBanname = new ArrayList<>();
		ArrayList<Name> blueBanname = new ArrayList<>();
		Display d = new Display();

		Name name1 = new Name("가렌");
		Name name2 = new Name("갈리오");
		Name name3 = new Name("갱플랭크");
		Name name4 = new Name("그라가스");
		Name name5 = new Name("그레이브즈");
		Name name6 = new Name("그웬");
		Name name7 = new Name("나르");
		Name name8 = new Name("나미");
		Name name9 = new Name("나서스");
		Name name10 = new Name("노틸러스");
		Name name11 = new Name("녹턴");
		Name name12 = new Name("누누");
		Name name13 = new Name("니달리");
		Name name14 = new Name("닐라");
		Name name15 = new Name("다리우스");
		Name name16 = new Name("다이애나");
		Name name17 = new Name("드레이븐");
		Name name18 = new Name("라이즈");
		Name name19 = new Name("라칸");
		Name name20 = new Name("람머스");
		Name name21 = new Name("럭스");
		Name name22 = new Name("럼블");
		Name name23 = new Name("레나타글라스크");
		Name name24 = new Name("레넥톤");
		Name name25 = new Name("레오나");
		Name name26 = new Name("렉사이");
		Name name27 = new Name("렐");
		Name name28 = new Name("렝가");
		Name name29 = new Name("루시안");
		Name name30 = new Name("룰루");
		Name name31 = new Name("르블랑");
		Name name32 = new Name("리신");
		Name name33 = new Name("리븐");
		Name name34 = new Name("리산드라");
		Name name35 = new Name("릴리아");
		Name name36 = new Name("마스터이");
		Name name37 = new Name("마오카이");
		Name name38 = new Name("말자하");
		Name name39 = new Name("말파이트");
		Name name40 = new Name("모데카이저");
		Name name41 = new Name("모르가나");
		Name name42 = new Name("문도박사");
		Name name43 = new Name("미스포츈");
		Name name44 = new Name("바드");
		Name name45 = new Name("바루스");
		Name name46 = new Name("바이");
		Name name47 = new Name("베이가");
		Name name48 = new Name("베인");
		Name name49 = new Name("벡스");
		Name name50 = new Name("벨코즈");
		Name name51 = new Name("벨베스");
		Name name52 = new Name("볼리베어");
		Name name53 = new Name("브라움");
		Name name54 = new Name("브랜드");
		Name name55 = new Name("블라디미르");
		Name name56 = new Name("블리츠크랭크");
		Name name57 = new Name("비에고");
		Name name58 = new Name("빅토르");
		Name name59 = new Name("뽀삐");
		Name name60 = new Name("사미라");
		Name name61 = new Name("사이온");
		Name name62 = new Name("사일러스");
		Name name63 = new Name("샤코");
		Name name64 = new Name("세나");
		Name name65 = new Name("세라핀");
		Name name66 = new Name("세주아니");
		Name name67 = new Name("세트");
		Name name68 = new Name("소나");
		Name name69 = new Name("소라카");
		Name name70 = new Name("쉔");
		Name name71 = new Name("쉬바나");
		Name name72 = new Name("스웨인");
		Name name73 = new Name("스카너");
		Name name74 = new Name("시비르");
		Name name75 = new Name("신짜오");
		Name name76 = new Name("신드라");
		Name name77 = new Name("신지드");
		Name name78 = new Name("쓰레쉬");
		Name name79 = new Name("아리");
		Name name80 = new Name("아무무");
		Name name81 = new Name("아우렐리온솔");
		Name name82 = new Name("아이번");
		Name name83 = new Name("아지르");
		Name name84 = new Name("아칼리");
		Name name85 = new Name("아크샨");
		Name name86 = new Name("아트록스");
		Name name87 = new Name("아펠리오스");
		Name name88 = new Name("알리스타");
		Name name89 = new Name("애니");
		Name name90 = new Name("애니비아");
		Name name91 = new Name("애쉬");
		Name name92 = new Name("야스오");
		Name name93 = new Name("에코");
		Name name94 = new Name("엘리스");
		Name name95 = new Name("오공");
		Name name96 = new Name("오른");
		Name name97 = new Name("오리아나");
		Name name98 = new Name("올라프");
		Name name99 = new Name("요네");
		Name name100 = new Name("요릭");
		Name name101 = new Name("우디르");
		Name name102 = new Name("워윅");
		Name name103 = new Name("유미");
		Name name104 = new Name("이렐리아");
		Name name105 = new Name("이블린");
		Name name106 = new Name("이즈리얼");
		Name name107 = new Name("일라오이");
		Name name108 = new Name("자르반4세");
		Name name109 = new Name("자야");
		Name name110 = new Name("자이라");
		Name name111 = new Name("자크");
		Name name112 = new Name("잔나");
		Name name113 = new Name("잭스");
		Name name114 = new Name("제드");
		Name name115 = new Name("제라스");
		Name name116 = new Name("제리");
		Name name117 = new Name("제이스");
		Name name118 = new Name("조이");
		Name name119 = new Name("직스");
		Name name120 = new Name("진");
		Name name121 = new Name("질리언");
		Name name122 = new Name("징크스");
		Name name123 = new Name("초가스");
		Name name124 = new Name("카르마");
		Name name125 = new Name("카밀");
		Name name126 = new Name("카사딘");
		Name name127 = new Name("카서스");
		Name name128 = new Name("카시오페아");
		Name name129 = new Name("카이사");
		Name name130 = new Name("카직스");
		Name name131 = new Name("카타리나");
		Name name132 = new Name("칼리스타");
		Name name133 = new Name("케넨");
		Name name134 = new Name("케이틀린");
		Name name135 = new Name("케인");
		Name name136 = new Name("케일");
		Name name137 = new Name("코그모");
		Name name138 = new Name("코르키");
		Name name139 = new Name("퀸");
		Name name140 = new Name("클레드");
		Name name141 = new Name("키아나");
		Name name142 = new Name("킨드레드");
		Name name143 = new Name("타릭");
		Name name144 = new Name("탈론");
		Name name145 = new Name("탈리야");
		Name name146 = new Name("탐켄치");
		Name name147 = new Name("트런들");
		Name name148 = new Name("트리스타나");
		Name name149 = new Name("트린다미어");
		Name name150 = new Name("트위스티드페이트");
		Name name151 = new Name("트위치");
		Name name152 = new Name("티모");
		Name name153 = new Name("파이크");
		Name name154 = new Name("판테온");
		Name name155 = new Name("피들스틱");
		Name name156 = new Name("피오라");
		Name name157 = new Name("피즈");
		Name name158 = new Name("하이머딩거");
		Name name159 = new Name("헤카림");
		Name name160 = new Name("니코");
		Name name161 = new Name("우르곳");

		name.add(name1);
		name.add(name2);
		name.add(name3);
		name.add(name4);
		name.add(name5);
		name.add(name6);
		name.add(name7);
		name.add(name8);
		name.add(name9);
		name.add(name10);
		name.add(name11);
		name.add(name12);
		name.add(name13);
		name.add(name14);
		name.add(name15);
		name.add(name16);
		name.add(name17);
		name.add(name18);
		name.add(name19);
		name.add(name20);
		name.add(name21);
		name.add(name22);
		name.add(name23);
		name.add(name24);
		name.add(name25);
		name.add(name26);
		name.add(name27);
		name.add(name28);
		name.add(name29);
		name.add(name30);
		name.add(name31);
		name.add(name32);
		name.add(name33);
		name.add(name34);
		name.add(name35);
		name.add(name36);
		name.add(name37);
		name.add(name38);
		name.add(name39);
		name.add(name40);
		name.add(name39);
		name.add(name40);
		name.add(name41);
		name.add(name42);
		name.add(name43);
		name.add(name44);
		name.add(name45);
		name.add(name46);
		name.add(name47);
		name.add(name48);
		name.add(name49);
		name.add(name50);
		name.add(name51);
		name.add(name52);
		name.add(name53);
		name.add(name54);
		name.add(name55);
		name.add(name56);
		name.add(name57);
		name.add(name58);
		name.add(name59);
		name.add(name60);
		name.add(name61);
		name.add(name62);
		name.add(name63);
		name.add(name64);
		name.add(name65);
		name.add(name66);
		name.add(name67);
		name.add(name68);
		name.add(name69);
		name.add(name70);
		name.add(name71);
		name.add(name72);
		name.add(name73);
		name.add(name74);
		name.add(name75);
		name.add(name76);
		name.add(name77);
		name.add(name78);
		name.add(name79);
		name.add(name80);
		name.add(name81);
		name.add(name82);
		name.add(name83);
		name.add(name84);
		name.add(name85);
		name.add(name86);
		name.add(name87);
		name.add(name88);
		name.add(name89);
		name.add(name90);
		name.add(name91);
		name.add(name92);
		name.add(name93);
		name.add(name94);
		name.add(name95);
		name.add(name96);
		name.add(name97);
		name.add(name98);
		name.add(name99);
		name.add(name100);
		name.add(name101);
		name.add(name102);
		name.add(name103);
		name.add(name104);
		name.add(name105);
		name.add(name106);
		name.add(name107);
		name.add(name108);
		name.add(name109);
		name.add(name110);
		name.add(name111);
		name.add(name112);
		name.add(name113);
		name.add(name114);
		name.add(name115);
		name.add(name116);
		name.add(name117);
		name.add(name118);
		name.add(name119);
		name.add(name120);
		name.add(name121);
		name.add(name122);
		name.add(name123);
		name.add(name124);
		name.add(name125);
		name.add(name126);
		name.add(name127);
		name.add(name128);
		name.add(name129);
		name.add(name130);
		name.add(name131);
		name.add(name132);
		name.add(name133);
		name.add(name134);
		name.add(name135);
		name.add(name136);
		name.add(name137);
		name.add(name138);
		name.add(name139);
		name.add(name140);
		name.add(name141);
		name.add(name142);
		name.add(name143);
		name.add(name144);
		name.add(name145);
		name.add(name146);
		name.add(name147);
		name.add(name148);
		name.add(name149);
		name.add(name150);
		name.add(name151);
		name.add(name152);
		name.add(name153);
		name.add(name154);
		name.add(name155);
		name.add(name156);
		name.add(name157);
		name.add(name158);
		name.add(name159);
		name.add(name160);
		name.add(name161);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("");
			System.out.println("밴픽을 시작합니다");
			d.nowChamp(name);
			System.out.println("");
			System.out.println("우리팀 첫번째 밴 챔피언 선택");

			String meban1 = sc.next();

			xxx: while (true) {
				for (int i = 0; i < name.size(); i++) {
					if (meban1.equals(name.get(i).name)) {
						redBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
//					else if(!meban1.equals(name.get(i).name)) {
//						System.out.println("입력한 챔피언은 존재하지 않습니다. 다시 입력해주세요");
//						return;
//					}
					if (meban1.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("적팀 첫번째 밴 챔피언 선택");
				String amban1 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (amban1.equals(name.get(i).name)) {
						blueBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
					if (amban1.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("우리팀 두번째 밴 챔피언 선택");
				String meban2 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (meban2.equals(name.get(i).name)) {
						redBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
					if (meban2.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}

				}
				System.out.println("");
				System.out.println("적팀 두번째 밴 챔피언 선택");
				String amban2 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (amban2.equals(name.get(i).name)) {
						blueBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
					if (amban2.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("우리팀 세번째 밴 챔피언 선택");
				String meban3 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (meban3.equals(name.get(i).name)) {
						redBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
					if (meban3.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("적팀 세번째 밴 챔피언 선택");
				String amban3 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (amban3.equals(name.get(i).name)) {
						blueBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
					if (amban1.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("우리팀 네번째 밴 챔피언 선택");
				String meban4 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (meban4.equals(name.get(i).name)) {
						redBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
					if (meban4.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("적팀 네번째 밴 챔피언 선택");
				String amban4 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (amban4.equals(name.get(i).name)) {
						blueBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
					if (amban1.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("우리팀 다섯번째 밴 챔피언 선택");
				String meban5 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (meban5.equals(name.get(i).name)) {
						redBanname.add(name.get(i));
						name.remove(i);
						d.nowChamp(name);
					}
					if (meban5.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("적팀 다섯번째 밴 챔피언 선택");
				String amban5 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (amban5.equals(name.get(i).name)) {
						blueBanname.add(name.get(i));
						name.remove(i);
					}
					if (amban5.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.print("우리팀 밴 목록 : ");
				d.redBanChamp(redBanname);
				System.out.println("");
				System.out.print("상대팀 밴 목록 : ");
				d.blueBanChamp(blueBanname);
				System.out.println("");
				System.out.println("===============================");
				System.out.println("픽을 시작합니다.");

				d.nowChamp(name);

				System.out.println("");
				System.out.println("우리팀 1픽 챔피언 선택");
				String mepick1 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (mepick1.equals(name.get(i).name)) {
						System.out.println("우리팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						redPickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 우리팀 픽 상황 : ");
						d.redPickChamp(redPickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (mepick1.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("상대팀 1픽 챔피언 선택");
				String ampick1 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (ampick1.equals(name.get(i).name)) {
						System.out.println("상대팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						bluePickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 상대팀 픽 상황 : ");
						d.bluePickChamp(bluePickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (ampick1.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("상대팀 2픽 챔피언 선택");
				String ampick2 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (ampick2.equals(name.get(i).name)) {
						System.out.println("상대팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						bluePickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 상대팀 픽 상황 : ");
						d.bluePickChamp(bluePickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (ampick2.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("우리팀 2픽 챔피언 선택");
				String mepick2 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (mepick2.equals(name.get(i).name)) {
						System.out.println("우리팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						redPickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 우리팀 픽 상황 : ");
						d.redPickChamp(redPickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (mepick2.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("우리팀 3픽 챔피언 선택");
				String mepick3 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (mepick3.equals(name.get(i).name)) {
						System.out.println("우리팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						redPickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 우리팀 픽 상황 : ");
						d.redPickChamp(redPickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (mepick3.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("상대팀 3픽 챔피언 선택");
				String ampick3 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (ampick3.equals(name.get(i).name)) {
						System.out.println("상대팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						bluePickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 상대팀 픽 상황 : ");
						d.bluePickChamp(bluePickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (ampick3.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("상대팀 4픽 챔피언 선택");
				String ampick4 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (ampick4.equals(name.get(i).name)) {
						System.out.println("상대팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						bluePickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 상대팀 픽 상황 : ");
						d.bluePickChamp(bluePickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (ampick4.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("우리팀 4픽 챔피언 선택");
				String mepick4 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (mepick4.equals(name.get(i).name)) {
						System.out.println("우리팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						redPickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 우리팀 픽 상황 : ");
						d.redPickChamp(redPickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (mepick4.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("우리팀 5픽 챔피언 선택");
				String mepick5 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (mepick5.equals(name.get(i).name)) {
						System.out.println("우리팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						redPickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 우리팀 픽 상황 : ");
						d.redPickChamp(redPickname);
						System.out.println("");
						d.nowChamp(name);
					}
					if (mepick5.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.println("상대팀 5픽 챔피언 선택");
				String ampick5 = sc.next();
				for (int i = 0; i < name.size(); i++) {
					if (ampick5.equals(name.get(i).name)) {
						System.out.println("상대팀이 " + name.get(i).name + "을(를) 픽했습니다.");
						bluePickname.add(name.get(i));
						name.remove(i);
						System.out.print("현재 상대팀 픽 상황 : ");
						d.bluePickChamp(bluePickname);
						System.out.println("");
					}
					if (ampick5.equals("닷지")) {
						System.out.println("게임을 종료합니다");
						break xxx;
					}
				}
				System.out.println("");
				System.out.print("우리팀 최종픽 : ");
				d.redPickChamp(redPickname);
				System.out.println("");
				System.out.println("=======================");
				System.out.print("상대팀 최종픽 : ");
				d.bluePickChamp(bluePickname);
				break xxx;
			}
		}
	}
}
