import java.awt.*;
public class imagechange {
	public static void main(String[] args)  throws Exception{

		MyFrame mf2 = new MyFrame("It's Highnoon");
		Label lb = new Label("HSJ");

		Button bt1 = new Button("1");
		Button bt2 = new Button("2");
		Button bt3 = new Button("3");
		mf2.init(lb, bt1);
		mf2.setButton(bt2);

		
		
	}
	
}
