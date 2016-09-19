import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame implements ActionListener{
	private FlowLayout flowlay = new FlowLayout();
	private GridLayout gridlay = new GridLayout(4,3,5,5);
	private BorderLayout borderlay = new BorderLayout(10,10);
	//panel
	private Panel p1 = new Panel();
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("File");
	private MenuItem fopen = new MenuItem("open");
	private MenuItem flcose = new MenuItem("close");
	
	private FileDialog fdlg1  = new FileDialog(this, "open it", FileDialog.LOAD);
	private FileDialog fdlg2  = new FileDialog(this, "open it", FileDialog.SAVE);
	
	

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


	}
	
	public void actionPerformed(ActionEvent e){
		System.out.println("000");
		Button btt = new Button("Asdf");
		this.setVisible(false);
		this.add(btt);
		this.setVisible(true);
	};
	
	public void init(Label lb1,Button bt1){   
		this.setLayout(flowlay);//panel_exam
		this.setMenuBar(mb);
		mb.add(file);
		file.add(fopen);
		file.add(flcose);
		
		this.add(bt1);
		

	}
	public void addbut(Button bt){

		this.add(bt);
		
	}
	public void setListener(Button bt1, Button bt2){ //event or thread adding
		bt1.addActionListener(this);
		ListenerExit ep = new  ListenerExit();
		bt2.addActionListener(ep);
	}
	

	

}
