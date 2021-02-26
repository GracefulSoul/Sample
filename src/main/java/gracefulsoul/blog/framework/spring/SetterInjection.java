package gracefulsoul.blog.framework.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {

	private BeanObject beanObject;

	// Inject to field variable using Setter Injection.
	@Autowired
	private void setBeanObject(BeanObject beanObject) {
		this.beanObject = beanObject;
	}

	// Inject into the parameter of the method using Setter Injection.
	@Bean
	private OtherBeanObject otherBeanObject(@Qualifier("beanObject") BeanObject beanObject) {
		OtherBeanObject otherBeanObject = new OtherBeanObject();
		otherBeanObject.setBeanObject(beanObject);
		return otherBeanObject;
	}

}
