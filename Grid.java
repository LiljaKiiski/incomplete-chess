//Grid Class
public class Grid {
	Tile[][] grid;
	Set setW;
	Set setB;

	//Constructor
	public Grid(){
		grid = new Tile[8][8];
		setW = new Set('w');
		setB = new Set('b');
		setBaseGrid();
		initPawns();
		initBishops();
		initKnights();
		initRooks();
		initRoyals();

		setW.initAllPieces();
		setB.initAllPieces();

		for (int x = 0; x < setW.pieces.length; x++){
			grid[setW.pieces[x].x][setW.pieces[x].y] = setW.pieces[x];
			grid[setB.pieces[x].x][setB.pieces[x].y] = setB.pieces[x];
		}
	}	

	//Set basic grid to non-null tiles
	private void setBaseGrid(){
		for (int x = 0; x < grid.length; x++){
			for (int y = 0; y < grid[0].length; y++){
				grid[x][y] = new Tile(x, y);
			}
		}
	}

	//Initialize kings and queens onto grid
	private void initRoyals(){
		setW.queen = new Queen(3, 0, 'w', this);
                setB.queen = new Queen(3, 7, 'b', this);
		setW.king = new King(4, 0, 'w', this);
		setB.king = new King(4, 7, 'b', this);
	}

	//Initialize pawns onto grid
	private void initPawns(){        
		for (int x = 0; x < grid.length; x++){
			setW.pawns[x] = new Pawn(x, 1, 'w', this);
		}

		for (int x = 0; x < grid.length; x++){
                        setB.pawns[x] = new Pawn(x, 6, 'b', this);
                }
	}

	//Initialize bishops onto grid
        private void initBishops(){
                setW.bishop1 = new Bishop(1, 0, 'w', this);
		setW.bishop2 = new Bishop(6, 0, 'w', this);
		setB.bishop1 = new Bishop(1, 7, 'b', this);
		setB.bishop2 = new Bishop(6, 7, 'b', this);	
	}

	//Initialize knights onto grid
	private void initKnights(){
		setW.knight1 = new Knight(2, 0, 'w', this);
                setW.knight2 = new Knight(5, 0, 'w', this);
                setB.knight1 = new Knight(2, 7, 'b', this);
                setB.knight2 = new Knight(5, 7, 'b', this);
	}

	//Initialize rooks onto grid
        private void initRooks(){
                setW.rook1 = new Rook(0, 0, 'w', this);
                setW.rook2 = new Rook(7, 0, 'w', this);
                setB.rook1 = new Rook(0, 7, 'b', this);
               	setB.rook2 = new Rook(7, 7, 'b', this);
        }

	//Print grid, for debugging
	public void printGrid(){
		for (int x = 0; x < grid.length; x++){
                        for (int y = 0; y < grid[0].length; y++){
                                System.out.print("[" + grid[x][y] + "]");
                        }
			System.out.println("");
                }
	}
}
