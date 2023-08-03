package Chandraayan;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpaceCraftTest {
	private SpaceCraft spaceCraft;
	@BeforeEach
    public void setUp() {
		int[] position = {0,0,0};
		Character direction = 'N';
		 spaceCraft = new SpaceCraft(position,direction);
        
    }
	

	@Test
    public void testInitialPositionAndDirection() {
        int[] position = spaceCraft.getPosition();
        char direction = spaceCraft.getDirection();

        assertArrayEquals(new int[]{0, 0, 0}, position);
        assertEquals('N', direction);
    }

}
