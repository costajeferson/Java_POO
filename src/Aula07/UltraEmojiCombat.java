package Aula07;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
				
				l[0] = new Lutador ("Pretty Boy", "França", 31, 1.65f, 30, 12, 5, 2);
				
				l[1] = new Lutador ("UltraJava", "Brasil", 25, 1.75f, 99, 12, 5, 2);
				
				l[2] = new Lutador ("MaggieUltra", "Brasil", 25, 1.75f, 99, 12, 5, 2);
				
				l[3] = new Lutador ("ThainaBox", "Brasil", 25, 1.55f, 99, 12, 5, 2);
				
				l[4] = new Lutador ("FamiliaBox", "Brasil", 25, 1.75f, 99, 12, 5, 2);
				
				Luta UEC01 = new Luta();
				UEC01.marcarLuta(l[2],l[4]);
				UEC01.lutar();
				l[2].status();
				l[4].status();
				
				
				
	}

}
