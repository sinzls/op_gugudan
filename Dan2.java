package jump2java.gugu;

public class Dan2 extends GuGuDan implements GGInterface{
	public Dan2() {
		super(2);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
