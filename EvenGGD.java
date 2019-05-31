package jump2java.gugu;

public class EvenGGD extends GuGuDan implements GGInterface{
	public void gudan() {
		for(int i =1; i < 10; i++) {
			if(i%2==0) {
				for(int j=1; j<10; j++) {
					System.out.print(i + "*" + j + "=" + i*j + "  ");					
				}
				System.out.print("\r");
			}
		}
	}
	
	public void inputGudan() {
		for(int i =1; i <= this.getDan(); i++) {
			if(i%2==0) {
				for(int j=1; j<10; j++) {
					System.out.print(i + "*" + j + "=" + i*j + "  ");					
				}
				System.out.print("\r");
			}
		}
	}
}
