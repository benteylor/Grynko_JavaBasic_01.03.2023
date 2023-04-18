public class MusicStyles {
    public void playMusic() {
    }
}

class PopMusic extends MusicStyles {
    public void playMusic() {
        System.out.println("Playing pop music by Imagine Dragons");
    }
}

class RockMusic extends MusicStyles {
    public void playMusic() {
        System.out.println("Playing rock music by Queen");
    }
}

class ClassicMusic extends MusicStyles {
    public void playMusic() {
        System.out.println("Playing classic music by Vivaldi Bands");
    }
}

class main {
    public static void main(String[] args) {
        PopMusic popMusicBand = new PopMusic();
        RockMusic rockMusicBand = new RockMusic();
        ClassicMusic classicMusicBand = new ClassicMusic();

        MusicStyles[] bands = {popMusicBand, rockMusicBand, classicMusicBand};

        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}

