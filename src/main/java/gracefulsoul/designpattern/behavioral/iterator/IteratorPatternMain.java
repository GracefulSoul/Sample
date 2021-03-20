package gracefulsoul.designpattern.behavioral.iterator;

import gracefulsoul.designpattern.behavioral.iterator.name.Iterator;
import gracefulsoul.designpattern.behavioral.iterator.name.NameRepository;

public class IteratorPatternMain {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}

	}

}