import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceIml;

public class Application {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceIml();
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
