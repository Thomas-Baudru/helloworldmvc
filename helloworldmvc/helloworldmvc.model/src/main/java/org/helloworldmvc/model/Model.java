package org.helloworldmvc.model;

import org.helloworldmvc.contract.IModel;

public class Model extends DAOHelloWorld implements IModel {
	public String getHelloworld() {
		return DAOHelloWorld.getInstance().getHelloWorldMessage();
	}
}
