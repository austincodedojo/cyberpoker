package austincodedojo.cyberpoker.core.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import austincodedojo.cyberpoker.core.test.dealer.WhenComparingTwoDealers;
import austincodedojo.cyberpoker.core.test.dealer.WhenGeneratingATextRepresentation;
import austincodedojo.cyberpoker.core.test.dealer.WhenGeneratingAnXmlRepresentation;

@RunWith(Suite.class)
@SuiteClasses({WhenGeneratingAnXmlRepresentation.class, 
			   WhenGeneratingATextRepresentation.class,
			   WhenComparingTwoDealers.class})
public class DealerTest {

}
