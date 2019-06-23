package inventory.validate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import inventory.model.User;
import inventory.service.UserService;
@Component
public class LoginValidator implements Validator{
	@Autowired
	private UserService userService;
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz == User.class;
	}

	public void validate(Object target, Errors errors) {
		User users = (User) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "msg.required");
		ValidationUtils.rejectIfEmpty(errors, "password", "msg.required");
		if (!StringUtils.isEmpty(users.getUserName()) && !StringUtils.isEmpty(users.getPassword())) {
			List<User> user = userService.findByProperty("userName", users.getUserName());
			if(users!=null && !user.isEmpty()) {
				if (!user.get(0).getPassword().equals(users.getPassword())) {
					errors.rejectValue("password", "msg.wrong.password");
				}
			}else {
				errors.rejectValue("userName", "msg.wrong.username");
			}
		}
	}
}
