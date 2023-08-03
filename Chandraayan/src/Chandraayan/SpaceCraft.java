package Chandraayan;

public class SpaceCraft {
	 int[] position;
	 Character direction;
	 int quadrant;

	public SpaceCraft(int[] position, Character direction) {
		this.position = position;
		this.direction = direction;
		switch (direction) {
		case 'E':
		case 'W':
			this.quadrant = 0;
			break;
		case 'N':
		case 'S':
			this.quadrant = 1;
			break;
		case 'U':
		case 'D':
			this.quadrant = 2;
			break;
		default:
		}
	}
	public Character getDirection() {
		return direction;	
	}

	public int[] getPosition() {
		return position;
	}
	public void updatePositionAndDirection(Character cmd) {
	}
	
	}





