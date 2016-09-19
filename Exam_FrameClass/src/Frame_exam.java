import java.awt.*;
public class Frame_exam {
	public static void main(String[] args)  throws Exception{

		MyFrame mf2 = new MyFrame("It's Highnoon");
		Label lb = new Label("HSJ");

		Button bt1 = new Button("1");
		Button bt2 = new Button("2");

		mf2.init(lb, bt1);
		mf2.setButton(bt2);

		
		
	}
	
}
