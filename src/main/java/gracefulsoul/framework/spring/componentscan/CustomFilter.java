package gracefulsoul.framework.spring.componentscan;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class CustomFilter implements TypeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory){
		for (String annotationType : metadataReader.getAnnotationMetadata().getAnnotationTypes()) {
			/* ... */
			return true;
		}
		return false;
	}

}
