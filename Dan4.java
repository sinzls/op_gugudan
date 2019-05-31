package jump2java.gugu;

public class Dan4 extends GuGuDan implements GGInterface{
	public Dan4() {
		super(4);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
