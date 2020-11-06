package serenitylabs.tutorials.vetclinic.playingball.model;

//This is a factory class that produces intances of another class.
public class PlayerForGame {
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
