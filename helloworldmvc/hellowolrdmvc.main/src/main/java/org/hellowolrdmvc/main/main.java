package org.hellowolrdmvc.main;

import java.io.IOException;

import org.hellowolrdmvc.view.View;
import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;

public class main {

	public static void main(String[] args) throws IOException {
		View view = new View();
		Model model = new Model();
		Controller controller = new Controller(view, model);
		controller.run();
	}

}
