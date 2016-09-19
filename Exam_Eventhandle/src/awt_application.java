import java.awt.*;


public class awt_application {
	public static void main(String[] args)  throws Exception{

		MyFrame mf2 = new MyFrame("It's Highnoon");
		Label lb = new Label("HSJ");
		Button bt1 = new Button("zero maker");
		Button bt2 = new Button("exit");
		mf2.init(lb, bt1);

		

		
		mf2.addbut(bt2);

		mf2.setListener(bt1,bt2);


		
		
	}
	
}
