package billiards;


public class Hilos implements Runnable{
	
	private Ball ball;
	private Board board;

	 Hilos(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}