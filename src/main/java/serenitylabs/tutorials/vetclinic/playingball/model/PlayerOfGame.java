package serenitylabs.tutorials.vetclinic.playingball.model;

//Player of games knows how to play each game, its a factory produce other instance.
public class PlayerOfGame {
    public static Player called(Game game) {
        switch (game) {
            case Football:
                return new PlayFootball();
            case Tennis:
                return new PlayTennis();
            case Cricket:
                return new PlayCricket();
            case Handball:
                return new PlayHandball();
            case Hockey:
                return new PlayHockey();
            default:
                throw new DontKnowThatGameException();
        }

    }
}
