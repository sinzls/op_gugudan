package jump2java.gugu;

public class GuGuDan {
	private int dan;
	
	public GuGuDan() {}
	public GuGuDan(int dan) {
		this.dan = dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
    public int getDan() {
		return dan;
	}
	
	public void gudan(int dan) {
		for(int i =1; i < 10; i++) {
			System.out.print(dan + "*" + i + "=" + dan*i+"   ");
		}
	}
}
