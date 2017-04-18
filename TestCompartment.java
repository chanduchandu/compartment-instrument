package compartmentinstrument;
import java.util.Random;
public class TestCompartment {

	public static void main(String[] args) {
	  Compartment [] c=new Compartment[10];
	  int []a=new int[10];
		Random rand=new Random();
		for(int i=0;i<10;i++){
			int pick=rand.nextInt(4)+1;
			switch(pick){
			case 1:
				Firstclass fc=new Firstclass();
				c[i]=fc;
				System.out.println(pick);
				c[i].notice();
				break;
			case 2:
				General ge=new General();
				c[i]=ge;
				System.out.println(pick);
				c[i].notice();
				break;
			case 3:
				ladies la=new ladies();
				c[i]=la;
				System.out.println(pick);
				c[i].notice();
				break;
			case 4:
				Luggage lu=new Luggage();
				c[i]=lu;
				System.out.println(pick);
				c[i].notice();
				break;
			}
		}
		
	}

}
