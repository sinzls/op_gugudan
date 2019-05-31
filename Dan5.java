package jump2java.gugu;

public class Dan5 extends GuGuDan implements GGInterface{
	public Dan5() {
		super(5);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
