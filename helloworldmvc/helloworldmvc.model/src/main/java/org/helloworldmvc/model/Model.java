package org.helloworldmvc.model;

import java.io.IOException;

import org.helloworldmvc.contract.IModel;

public class Model implements IModel{
	public String getHelloWorld() throws IOException {
		return DAOHelloWorld.getInstance().getHelloWorldMessage();
	}
}
