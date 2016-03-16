package org.zoo.javaee;

import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZooTest {

	static Zoo zoo;

	@Before
	public void setUp() {
		zoo = Zoo.getZoo();
	}

	@Test
	public void OnlyOneZoo() {
		Zoo zoo1 = Zoo.getZoo();
		Zoo zoo2 = Zoo.getZoo();
		Assert.assertTrue(true);
		Assert.assertTrue(zoo1 != null);
		Assert.assertTrue(zoo2 != null);
		Assert.assertTrue(zoo1 == zoo2);
	}

	@Test
	public void enclosAreLoaded() {
		Assert.assertEquals(5, zoo.getEnclos().size());
	}

	@Test
	public void animalsAreLoaded() {
		Assert.assertEquals(11, zoo.getAnimaux().size());
	}

	@Test
	public void kangourousAreAllLoaded() {
//		Assert.assertEquals( 4, zoo.getAnimaux().stream().filter(e->e.getEspece().equals("kangourou")).count() );
		int count=	0;
		for( Animal a: zoo.getAnimaux() )
				if( a.getEspece().equals("Kangourou"))
					count++;
		Assert.assertEquals( 3, count );
	}

	@Test
	public void visitsAreLoaded() {
		Assert.assertEquals(25, zoo.getVisites().size());
	}

	
	@Test
	public void everyAnimalHasARoom() {
		Assert.assertEquals( zoo.getAnimaux().size(), zoo.getAffectations().size());
	}
	
}
