package serenitylabs.tutorials.vetclinic.playingball.model;



public class Child {
  public void goPlay(Game game) {

      //the goPlay method asks the PlayerOfGame factory which game/ what player implementation it should take
     Player gameToPlay = PlayerOfGame.called(game);

     gameToPlay.play();

}

}
