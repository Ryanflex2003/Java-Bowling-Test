public class Game {
    private Frame[] frames = new Frame[10];
    int currentFrame = 0;

    public Game(){ ResetGame(); }

    public void Bowl(Frame frame) {
        frames[currentFrame++] = frame;
    }

    public int GetScore(){
        //Add code to properly score the game
        return 0;
    }

    private void ResetGame(){
        for (int i = 0; i < 10; i++) {
            frames[i] = new Frame();
        }
        currentFrame = 0;
    }
}
