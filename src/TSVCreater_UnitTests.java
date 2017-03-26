import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tsv.ITSV;
import tsv.TSVSampleCreator;

public class TSVCreater_UnitTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		TSVSampleCreator creator = new TSVSampleCreator();
		String sample = "sample";
		ITSV tsv = creator.createTSV(sample);
		
		assertEquals("sample", tsv.getAction());
		assertEquals("sample", tsv.getContents());
		assertEquals("sample", tsv.getCommon());
	}

}
