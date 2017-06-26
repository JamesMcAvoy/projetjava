package Parser;

import Blocks.Entity;
import Factory.TileFactory;

public class Parser {

	private String parse;
	
	private int x = 35; 

	private int y = 23;

	private Entity[][] tiles;

	/**
	 * Constructor
	 * @param str
	 * @param x
	 * @param y
	 */
	public Parser(String str) {
		this.parse = str;
		
		if(this.parse == null) {
			this.parse = "++++++++++++++++++++++++++++++++++++o-------oo-----.-----------------++---x---.-o------+-------o--------++----------.--o-----.xxxx=xxxxxxxx++.+++++++++++++----------o--o-----++o----------+------.-----x--------++o----------+---x---------=-------++--.--.-----+------.--------------++--------o--+----o----o---.-------++----x------+--------------+------++-----.-----+-o-------o-+--x------++-----------+----------+---xxxx---++-----------+--o------+----xxxxxxx++--.---o-o--+-------o+----.=xxx=xx++--x--------+-------+-------------++---.-------+------+--------------++----xxx----+-++---+-------o------++---xxxx----+------o------++-+++--++--o-x-=----+----+-+------+--+.---++o------------------------+--+++--++---o------------o-------.+-------++o----.---o-----------o---+--+----++++++++++++++++++++++++++++++++++++";
		}
	}
	
	/**
	 * Parse the string
	 */
	public Entity[][] parse() {
		
		TileFactory factory = new TileFactory();
		char charToTest;
		int i, j;
		for(i = 0; i<this.y; i++) {
			for(j = 0; j<this.x; j++) {
				charToTest = this.charToParse(i, j);
				
				switch (charToTest) {
					case '+' :
						this.tiles[i][j] = (Entity) factory.createNotMovable(charToTest, i, j);
						break;
					case '-' :
						this.tiles[i][j] = (Entity) factory.createNotMovable(charToTest, i, j);
						break;
					case 'x' :
						this.tiles[i][j] = (Entity) factory.createNotMovable(charToTest, i, j);
						break;
					case '=' :
						this.tiles[i][j] = (Entity) factory.createMovable(charToTest, i, j);
						break;
					case '.' :
						this.tiles[i][j] = (Entity) factory.createMovable(charToTest, i, j);
						break;
					case 'o' :
						this.tiles[i][j] = (Entity) factory.createMovable(charToTest, i, j);
						break;
				}
			}
		}
		
		return this.tiles;
		
	}
	
	/**
	 * 
	 */
	private char charToParse(int i, int j) {
		return this.parse.charAt(i*this.x + j);
	}

	/**
	 * Getter
	 * @return String
	 */
	public String getParse() {
		return this.parse;
	}
	
	/**
	 * Setter
	 * @return String
	 */
	public Parser setParse(String str) {
		this.parse = str;
		return this;
	}
	
}