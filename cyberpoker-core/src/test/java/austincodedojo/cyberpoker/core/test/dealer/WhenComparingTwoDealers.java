package austincodedojo.cyberpoker.core.test.dealer;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import austincodedojo.cyberpoker.core.Dealer;

public class WhenComparingTwoDealers {
	@Test
	public void ifAllTheirAttributesAreTheSameTheyAreEqual() throws Exception {
		Dealer joe1 = new Dealer("Joe");
		Dealer joe2 = new Dealer("Joe");
		
		assertThat("Both have all the same attributes, so should compare equal", joe1.equals(joe2), is(true));
	}
	
	@Test
	public void ifTheyHaveDifferentNamesTheyAreNotEqual() throws Exception {
		Dealer joe = new Dealer("Joe");
		Dealer flo = new Dealer("Flo");
		
		assertThat("They have different names, should not be equal", joe.equals(flo), is(false));
	}
	
	@Test
	public void ifTheyreNotBothDealersThenTheyreNotEqual() throws Exception {
		Dealer joe = new Dealer("Joe");
		String flo = "Flo";
		
		assertThat("They are not the same type so can't be equal", joe.equals(flo), is(false));
	}

	@Test
	public void theHashCodeShouldBeTheHashCodeOfTheName() throws Exception {
		Dealer joe = new Dealer("Joe");
		
		assertThat(joe.hashCode(), equalTo("Joe".hashCode()));
	}
}
