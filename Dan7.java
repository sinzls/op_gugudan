package jump2java.gugu;

public class Dan7 extends GuGuDan implements GGInterface{
	public Dan7() {
		super(7);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
