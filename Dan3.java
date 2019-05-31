package jump2java.gugu;

public class Dan3 extends GuGuDan implements GGInterface{
	public Dan3() {
		super(3);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
