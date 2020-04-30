package controller;

import model.IModel;
import view.IView;

public class Controller {
	
	private IModel model;
	private IView view;
	
	public Controller(IModel Model,IView View) {
		
		this.model=Model;
		this.view=View;
		
	}

	public void run() {
		
		String message=this.model.getMessage();
		this.view.display(message);
	}
	
}
