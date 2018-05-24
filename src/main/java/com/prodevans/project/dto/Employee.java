import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class EmployeeController {
private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	/**
	 * This method will map Get request to EmployeeController
	 * @param model
	 * @return EmployeeController
	 */
	@RequestMapping(value = "/EmployeeController", method = RequestMethod.GET)
	public String getEmployeeController(Model model) {
		logger.info("Welcome to create Employee ");
		return "EmployeeController";
	}
	
}