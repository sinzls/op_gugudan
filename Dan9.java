package jump2java.gugu;

public class Dan9 extends GuGuDan implements GGInterface{
	public Dan9() {
		super(9);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
