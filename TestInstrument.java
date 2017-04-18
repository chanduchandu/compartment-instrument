package compartmentinstrument;
import java.util.Random;
public class TestInstrument {

	public static void main(String[] args) {
		int []a=new int[10];
		Random rand=new Random();
		for(int i=0;i<10;i++){
			a[i]=rand.nextInt(3)+1;
			switch(a[i]){
			case 1:
				Flute f=new Flute();
				f.play();
				System.out.println("a["+i+"] is obj of flute");
				break;
			case 2:
				Piano p=new Piano();
				p.play();
				System.out.println("a["+i+"] is obj of piano");
				break;
			case 3:
				Guitar gu=new Guitar();
				gu.play();
				System.out.println("a["+i+"] is obj of guitar");
				break;
				
				
	}

}
}
}