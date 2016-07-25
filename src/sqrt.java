import java.text.DecimalFormat;

public class sqrt {
	private double num;
	public sqrt(double value){
		num = value;
	}
	public void sqrtMethod(){
		double a;
		double b;
		int count = 0;
		double avg;
		double answer;
		
		for (int i = 1; i <= num; i++){
			if((i*i) <= num)
				count++;
			}
			a = count;
			b = a + 1;
			avg = (a + b)/2;
			answer = avg * avg;
		while((answer-num)>0.0000005 || (num-answer)>0.0000005){
			if(answer > num)
				b = (avg + b)/2;
				avg = (a + b)/2;
				answer = avg * avg;
				System.out.println(answer);
			if(answer < num)
				a = (avg + a)/2;
				avg = (a + b)/2;
				answer = avg * avg;
			if(answer == num)
				answer = avg;
			}		
		DecimalFormat numberFormat = new DecimalFormat ("#.00");
		System.out.print("The sqrt of " + num + " is " + numberFormat.format(avg) + "\n");
		}
		
}
