import static org.junit.Assert.*;				
import org.junit.Test;	
public class MappingTest {
	
	/**
	 * 1. Put inserts proper key value pair
	 * 2. from key correct value is returned
	 * 3. how to delete a value from pre- defined key
	 * 4. Size of key should be returned every time key is defined
	 * 
	 */
	@Test
	public void validate_isMapEmpty() {
		Map m= new Map();
		assertEquals(0, m.getSize());
		
	}
	
	@Test
	public void validate_isInstanceAdded() {
		Map m= new Map();
		assertNotNull(m);
		
	}
	
//	@Test
//	public void validate_isValueAndKeyOfInstanceAdded(){
//		Map m = new Map();
//		m.put(1,1);
//		assertEquals(1,m.key[0]);
//		assertEquals(1,m.value[0]);
//	}
	
	@Test
	public void validate_getValue() {
		Map m= new Map();
		m.put(1,1);
		assertEquals(1,m.get(1));
	}
	
	@Test
	public void validate_correctSize() {
		Map m= new Map();
		m.put(1,1);
		assertEquals(1,m.getSize());
	}
//	
//
//	
//	
	@Test
	public void validate_AddMultipleElementRetrieveOne() {
		Map m1= new Map();
		m1.put(1, 1);
		m1.put(2, 2);
		assertEquals(1,m1.get(1));
		
	}
	
	@Test 
	public void validate_isSizeExpanded() {
		Map m1= new Map();
		m1.put(1, 1);
		m1.put(2, 2);
		m1.put(3, 3);
		
		assertEquals(3,m1.get(3));
	}
	
	
	@Test
	public void validate_isElementsRemoved(){
		Map m1= new Map();
		m1.put(1, 1);
		m1.put(2, 2);
		m1.put(3, 3);
		m1.remove(3);
		
		assertEquals(2,m1.getSize());
		
	}
}
//
//}


