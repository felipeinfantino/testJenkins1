import static org.junit.Assert.*;

import org.junit.Test;

public class HelloJenkinsTest {

	@Test
	public void test() {
		HelloJenkins d = new HelloJenkins();
		assertEquals("aa", d.h);
		assertEquals("aa", d.getH());
	}

}
