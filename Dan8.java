package jump2java.gugu;

public class Dan8 extends GuGuDan implements GGInterface{
	public Dan8() {
		super(8);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
