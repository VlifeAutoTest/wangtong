package studentdemo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;   

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	@RunWith(Parameterized.class)
	public class StudentTest {

		String expected = "A";
		int input = 95;
		
		public StudentTest(String expected, int input) {
			this.expected = expected;
			this.input =input;
		}
		
		@Parameters
		public static Collection userData(){  
			return Arrays.asList(new Object[][]{  
		                {"A",97},
		                {"B",88},
		                {"C",78},
		                {"D",65},
		                {"N",18},
		                {"N",52},
		                {"F",120},
		                {"F",-5}
		                
			 }) ;  
		}
	

	@Test
	public void Ta() {
		//fail("Not yet implemented");
		assertEquals(expected, new Student().judgeScore(input));
	}

}

