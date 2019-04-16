package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Pode nao colocar nada,pq por padrao o JAVA ja coloca como nulo.
	}

	protected Board getBoard() {
		return board;
	}

}
