package gracefulsoul.blog.framework.spring;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {

	private BeanObject beanObject;

	// @Autowired
	// Constructor dependency injection can omit @Autowired from Spring 4.3.
	public ConstructorInjection(BeanObject beanObject) {
		this.beanObject = beanObject;
	}

}
