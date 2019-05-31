package jump2java.gugu;

public class Dan6 extends GuGuDan implements GGInterface{
	public Dan6() {
		super(6);
	}
	
	public void gudan() {
		for(int i =1; i < 10; i++) {
			System.out.print(this.getDan() + "*" + i + "=" + this.getDan()*i+"   ");
		}
	}
}
