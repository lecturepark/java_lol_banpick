package BanPick;

import java.util.ArrayList;

public class Display {
	public void nowChamp(ArrayList<Name> name) {
		for (int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i).name + "/");
		}
	}

	public void bluePickChamp(ArrayList<Name> bluePickname) {
		for (int i = 0; i < bluePickname.size(); i++) {
			System.out.print(bluePickname.get(i).name + " ");
		}
	}

	public void redPickChamp(ArrayList<Name> redPickname) {
		for (int i = 0; i < redPickname.size(); i++) {
			System.out.print(redPickname.get(i).name + " ");
		}
	}

	public void blueBanChamp(ArrayList<Name> blueBanname) {
		for (int i = 0; i < blueBanname.size(); i++) {
			System.out.print(blueBanname.get(i).name + " ");
		}
	}

	public void redBanChamp(ArrayList<Name> redBanname) {
		for (int i = 0; i < redBanname.size(); i++) {
			System.out.print(redBanname.get(i).name + " ");
		}
	}
	public void dodgeGame() {
		System.out.println("밴픽을 강제종료하였습니다. 게임을 다시 시작해주세요.");
		}

}