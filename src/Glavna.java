import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> iminja;
		iminja=new ArrayList<>();
		iminja.add("Tanas");
		iminja.add("Mila");
		iminja.add("David");
		iminja.add("Gordana");
		iminja.stream()
			.filter(x->x.length()<=5)
			.forEach(x ->System.out.println(x));
	}

}
