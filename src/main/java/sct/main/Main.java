package sct.main;

import java.util.List;

import sct.service.FileService;
import sct.service.YoutubeDlSerivce;

public class Main {	
	
	public static void main(String[] args) {
		YoutubeDlSerivce youtubeDlSerivce = new YoutubeDlSerivce();
		FileService fileService = new FileService();
		int compteur = 1;
		
		List<String> listeUrl = fileService.getListUrl();
		
		if(listeUrl != null) {
			for(String url : listeUrl) {
				System.out.println("Telechargement de la vid�eo n�" + compteur);
				if(youtubeDlSerivce.telechargeCrunchyroll(url) != 0) {
					System.out.println("Erreur lors du t�l�chargement de la vid�o n�"+ compteur);
				}
				compteur++;
			}
		}
		System.out.println("Fin des t�l�chargements.");
	}

}
