package jump2java.gugu;

public class Dan1 extends GuGuDan implements GGInterface{
	public Dan1() {
		super(1);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
