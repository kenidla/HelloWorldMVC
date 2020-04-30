package helloworldmvc;

import controller.Controller;
import model.Model;
import view.View;

public class HelloWorldMVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c=new Controller(new Model(), new View());
		c.run();

	}

}
