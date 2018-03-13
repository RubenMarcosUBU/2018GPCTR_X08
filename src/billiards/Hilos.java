package billiards;


public class Hilos extends Thread{
	
	private Ball ball;
	private Board board;

	Hilos(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(Billiards.running) {
			
			try {
				ball.move();
				board.repaint();
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.err.println("Sleeping Thread Interrupted");
			}
		}
	}
}