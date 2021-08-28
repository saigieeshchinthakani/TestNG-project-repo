import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jenkinsTestNG {
	
	public class test
	{
		@AfterTest
		public void test1()
		{
			System.out.println("after test1");
		}

	@BeforeTest
	public void test2()
	{
		System.out.println("before test1");

	}
	@Test
	public void test3()
	{
		System.out.println("test3");

	}
	@Test
	public void test4()
	{
		System.out.println("test4");

	}
	}

}
