/**
 * 
 * @author youssefbee
 *
 */
public class Big3 {
	private int number1;
	private int number2;
	private int number3;

	public Big3() {
		this.number1 = 0;
		this.number2 = 0;
		this.number3 = 0;
	}
/**
 * this method takes and int as parameter and swaps numbers 
 * biggest to smallest int...
 * 
 * @param number
 */
	public void testBig3(int number){
		if(number>this.number1){
			this.number3=this.number2;
			this.number2=this.number1;
			this.number1=number;
		}
		else if(number>this.number2)
		{
			this.number3=this.number2;
			this.number2=number;
		}
		else if(number>this.number3){
			this.number3=number;
		}
	}
	
	
	//Print current values
	@Override
	public String toString() {
		return "Big3 [number1=" + number1 + ", number2=" + number2 + ", number3=" + number3 + "]";
	}

	/**
	 * getters and setters
	 * @return
	 */
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

}
