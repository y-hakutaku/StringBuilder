package tsv;

import Validator.IValidator;
import Validator.ValidatorManager;

public class Creator {
	String createPart(String string, Part part, Api api) {
		 ValidatorManager manager = new ValidatorManager();
		 IValidator validator = manager.getValidator(part,api);
		 validator.create(string);
		 return string;
	}
}
