import java.awt.*;

public class MyFrame extends Frame{
	private FlowLayout flowlay = new FlowLayout();
	private GridLayout gridlay = new GridLayout(4,3,5,5);
	private Button bt1 = new Button();
	private BorderLayout borderlay = new BorderLayout(10,10);
	//panel
	private Panel p1 = new Panel();
	//Label
	private Label lb = new Label("ÀüÈ­±â",Label.CENTER);
	private Button[] numberButton = new Button[12];
	private String[] charbutton = new String[3];
	private Button[] cb = new Button[3];

	
	
	
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
		charbutton[0] = "*";
		charbutton[1] = "0";
		charbutton[2] = "#";


	}
	public void init(Label lb1,Button bt1){   //panel_exam
		this.setLayout(borderlay);
		this.add("North", lb);
		
		p1.setLayout(gridlay);
		for(int i =0; i <12 ; i++){
			if(i<9){
				numberButton[i] =  new Button(String.valueOf(i+1));
				p1.add(numberButton[i]);
			}
			else{
				cb[i-9] = new Button(charbutton[i-9]);
				p1.add(cb[i-9]);
			}
			
		
			
		}
		this.add("Center", p1);
	}
	public void setButton(Button bt){
		p1.add(bt);
	}

	

}
