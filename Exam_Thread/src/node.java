
public class node {
	private int value;
	private node parent;
	private node child1;
	private node child2;
	public node(){}
	public node(int a, node c1, node c2){
		value = a;
		child1 = c1;
		child2 = c2;
	}
	public node getchild1(){
		return child1;
	}
	public node getchild2(){
		return child2;
	}
	public int getVal(){
		return value;
	}
	public node getparent(){
		return parent;
	}
	public void setchild1(node n){
		child1 = n;
	}
	public void setchild2(node n){
		child2 = n;
	}
	public void setVal(int a){
		value = a;
	}
	public void setparent(node n){
		parent = n;
	}
}
