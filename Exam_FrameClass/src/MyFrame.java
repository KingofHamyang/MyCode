import java.awt.*;
public class MyFrame extends Frame{
	private FlowLayout f1 = new FlowLayout();
	private GridLayout f2 = new GridLayout(1,2);
	private Button bt1 = new Button();
	private BorderLayout f3 = new BorderLayout();
	//panel
	private Panel p1 = new Panel();
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image img = tk.getImage("aaa,gif");

	
	public MyFrame(String c){
		super(c);
		this.setVisible(true);
		this.setSize(700,400);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension f1 = this.getSize();
		
		double x, y;
		x = screen.getWidth();
		y = screen.getHeight();
		
		int xpos = (int)(x/2 - f1.getWidth()/2);
		int ypos = (int)(y/2 - f1.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setIconImage(img);
	}
	public void init(Label lb,Button bt1){   //panel_exam
		this.setLayout(f3);
		this.add("South", p1);
		p1.setLayout(f2);
		p1.add(bt1);
	}
	public void setButton(Button bt){
		p1.add(bt);
	}

	

}
