package gracefulsoul.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {

	@Autowired
	private BeanObject beanObject;

}
