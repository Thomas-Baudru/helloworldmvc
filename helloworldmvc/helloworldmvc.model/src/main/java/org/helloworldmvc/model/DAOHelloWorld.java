package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {

	private String FileName = "HelloWorld.txt";
	private String helloWorldMessage = "toto";
	private static DAOHelloWorld instance = null;

	public DAOHelloWorld() throws IOException {
		readFile();
	}

	public static DAOHelloWorld getInstance() throws IOException {
		if (instance == null) {
			try {
			setInstance(new DAOHelloWorld());
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
		return instance;
	}

	private static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	private void readFile() throws IOException {
		File file = new File(FileName);
		try {
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		this.setHelloWorldMessage(br.readLine());
		} catch (final FileNotFoundException e) {
			System.err.println("le fichier n'a pas ete trouvé");
		} catch (final IOException e) {
			System.err.println("impossible de lire");
		}
	}

	public String getHelloWorldMessage() {
		
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}
