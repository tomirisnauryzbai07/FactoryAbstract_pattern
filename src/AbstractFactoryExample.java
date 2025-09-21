interface StringInstrument {
    void play();
}

interface PercussionInstrument {
    void play();
}

class ElectricGuitar implements StringInstrument {
    public void play() {
        System.out.println("playing an electric guitar (rock)");
    }
}

class DrumSet implements PercussionInstrument {
    public void play() {
        System.out.println("playing a drum set (rock)");
    }
}

class Violin implements StringInstrument {
    public void play() {
        System.out.println("playing a violin (classical)");
    }
}

class ClassicalDrum implements PercussionInstrument {
    public void play() {
        System.out.println("playing a classical drum (classical)");
    }
}

interface MusicFactory {
    StringInstrument createStringInstrument();
    PercussionInstrument createPercussionInstrument();
}

class RockMusicFactory implements MusicFactory {
    public StringInstrument createStringInstrument() {
        return new ElectricGuitar();
    }
    public PercussionInstrument createPercussionInstrument() {
        return new DrumSet();
    }
}

class ClassicalMusicFactory implements MusicFactory {
    public StringInstrument createStringInstrument() {
        return new Violin();
    }
    public PercussionInstrument createPercussionInstrument() {
        return new ClassicalDrum();
    }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {

        MusicFactory rockFactory = new RockMusicFactory();
        StringInstrument rockGuitar = rockFactory.createStringInstrument();
        PercussionInstrument rockDrum = rockFactory.createPercussionInstrument();
        rockGuitar.play();
        rockDrum.play();

        MusicFactory classicalFactory = new ClassicalMusicFactory();
        StringInstrument violin = classicalFactory.createStringInstrument();
        PercussionInstrument classicalDrum = classicalFactory.createPercussionInstrument();
        violin.play();
        classicalDrum.play();
    }
}
