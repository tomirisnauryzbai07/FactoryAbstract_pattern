interface Instrument {
    void play();
}

class Guitar implements Instrument {
    public void play() {
        System.out.println("playing the guitar");
    }
}

class Drum implements Instrument {
    public void play() {
        System.out.println("playing the drums");
    }
}

class Piano implements Instrument {
    public void play() {
        System.out.println("playinh the piano");
    }
}

class InstrumentFactory {
    public Instrument createInstrument(String type) {
        if (type.equalsIgnoreCase("guitar")) {
            return new Guitar();
        } else if (type.equalsIgnoreCase("drum")) {
            return new Drum();
        } else if (type.equalsIgnoreCase("piano")) {
            return new Piano();
        } else {
            throw new IllegalArgumentException("unknown instrument type: " + type);
        }
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        InstrumentFactory factory = new InstrumentFactory();

        Instrument guitar = factory.createInstrument("guitar");
        guitar.play();

        Instrument drum = factory.createInstrument("drum");
        drum.play();

        Instrument piano = factory.createInstrument("piano");
        piano.play();
    }
}