package gitproject1;

import org.testng.annotations.Test;

public class ManualTest {
	@Test
	public void unit() {
		System.out.println("this is unit testing");
		System.out.println("this is unit testing1");
		System.out.println("this is unit testing2");
	}
	@Test
	public void integression() {
		System.out.println("this is integression testing");
	}
	@Test
	public void functional() {
		System.out.println("this is functional testing");
	}
	@Test
	public void nonfunctional() {
		System.out.println("this is nonfunctional testing");
	}

}
