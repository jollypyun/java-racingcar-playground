class MainApplication {
    public static void main(String[] args) {
        Logic logic = new Logic();
        InputLogic inputLogic = new InputLogic();
        OutputLogic outputLogic = new OutputLogic();
        InputView inputView = new InputView(inputLogic);
        OutputView outputView = new OutputView(outputLogic);

        Game game = new Game(inputView, outputView, logic);
        game.game();
    }
}
