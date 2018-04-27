package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {

	private String FileName = "HelloWorld.txt";
	private String helloWorldMessage = null;
	private static DAOHelloWorld instance;

	public void DAOHelloWorld() throws IOException {
		readFile();
	}

	public static DAOHelloWorld getInstance() {
		if (instance == null) {
			setInstance(new DAOHelloWorld());
		}
		return instance;
	}

	private static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	private void readFile() throws IOException {
		File file = new File("target/");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		line = br.readLine();
		br.close();
	}

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}
