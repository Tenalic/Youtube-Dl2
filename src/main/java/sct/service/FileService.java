package sct.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileService {
	
	static private String cheminEtNomFichierUrl = "config/listeUrl.txt";
	private Scanner myReader;
	
	public List<String> getListUrl() {
		List<String> listeUrl = new ArrayList<String>();
		try {
			File file = new File(cheminEtNomFichierUrl);
			myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				listeUrl.add(myReader.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getStackTrace());
			return null;
		}
		return listeUrl;
	}

}
