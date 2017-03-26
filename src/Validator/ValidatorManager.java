package Validator;

import tsv.Api;
import tsv.Part;

public class ValidatorManager {
	public IValidator getValidator(Part part,Api api){
		switch(api) {
			case Voyagent:
				return getVoyagent(part);
		}
		
		return null;
	}
	
	IValidator getVoyagent(Part part) {
		IValidator validator = null;
		switch(part) {
		case Action:
			validator = new IValidator() {
				@Override
				public String create(String string) {
					return string;
				}
			};
		case Common:
			validator = new IValidator() {
				@Override
				public String create(String string) {
					return string;
				}
			};
		case Contents:
			validator = new IValidator() {
				@Override
				public String create(String string) {
					return string;
				}
			};
		}
		return validator;
	}
}
