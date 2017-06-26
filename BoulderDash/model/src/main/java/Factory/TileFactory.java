package Factory;

import Blocks.Entity;
import Blocks.Diamond;
import Blocks.EmptyTile;
import Blocks.Enemy;
import Blocks.Movable;
import Blocks.Mud;
import Blocks.NotMovable;
import Blocks.Stone;
import Blocks.Wall;

public class TileFactory {

	 public Movable createMovable(char tile, int x, int y){
		switch(tile) {
			case 'o':
				return new Stone(x, y);
			case '.':
				return new Diamond(x, y);
			case '=':
				return new Enemy(x, y);
			default:
				return null;
		}
	 }
	 
	 public NotMovable createNotMovable(char tile, int x, int y){
		switch(tile) {
			case '+':
				return new Wall(x, y);
			case '-':
				return new Mud(x, y);
			case 'x':
				return new EmptyTile(x, y);
			default:
				return null;
		}
	}
	
}