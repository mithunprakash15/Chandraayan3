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
	
	@Test
    public void testMoveForward() {
        spaceCraft.updatePositionAndDirection('f');
        int[] position = spaceCraft.getPosition();
        assertArrayEquals(new int[]{0, 1, 0}, position);
    }
	@Test
    public void testMoveBackward() {
        spaceCraft.updatePositionAndDirection('b');
        int[] position = spaceCraft.getPosition();
        assertArrayEquals(new int[]{0, -1, 0}, position);
    }

	@Test
    public void testTurnLeft() {
        spaceCraft.updatePositionAndDirection('l');
        assertEquals('W', spaceCraft.getDirection());
    }
	public void testTurnRight() {
        spaceCraft.updatePositionAndDirection('r');
        assertEquals('E', spaceCraft.getDirection());
    }
	@Test
	public void testMoveForwardNorth() {
	    spaceCraft.updatePositionAndDirection('f');	   
	    assertArrayEquals(new int[]{0, 1, 0}, spaceCraft.getPosition());
	}

	@Test
	public void testMoveBackwardSouth() {
	    spaceCraft.updatePositionAndDirection('b');   
	    assertArrayEquals(new int[]{0, -1, 0}, spaceCraft.getPosition());
	}

	@Test
	public void testTurnLeftFromNorth() {
	    spaceCraft.updatePositionAndDirection('l');
	    assertEquals('W', spaceCraft.getDirection());
	}

	@Test
    public void testMoveUpward() {
        spaceCraft.updatePositionAndDirection('u');
        spaceCraft.updatePositionAndDirection('f'); 
        assertArrayEquals(new int[]{0, 0, 1}, spaceCraft.getPosition());
    }
    @Test
    public void testMoveForwardEast() {
        spaceCraft.updatePositionAndDirection('r'); // Change direction to East
        spaceCraft.updatePositionAndDirection('f');
        assertArrayEquals(new int[]{1, 0, 0}, spaceCraft.getPosition());
    }

    @Test
    public void testMoveBackwardWest() {
        spaceCraft.updatePositionAndDirection('r'); // Change direction to East
        spaceCraft.updatePositionAndDirection('b');      
        assertArrayEquals(new int[]{-1, 0, 0}, spaceCraft.getPosition());
    }

    @Test
    public void testTurnUpFromNorth() {
        spaceCraft.updatePositionAndDirection('u');
        assertEquals('U', spaceCraft.getDirection());
    }
    @Test
    public void testTurnDownFromNorth() {
        spaceCraft.updatePositionAndDirection('d');
        assertEquals('D', spaceCraft.getDirection());
    }
    

	

    

    

	

	
	
	

}
