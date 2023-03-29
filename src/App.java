import java.io.InputStream;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        /* set sticker properties */
        Sticker sticker = new Sticker();
        sticker.setStickerName("nana");
        sticker.setUrl("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies_1.jpg");

        /* build sticker with stickerMaker */
        InputStream inputStream = new URL(sticker.getUrl()).openStream();
        StickerMaker stickerMaker =  new StickerMaker();
        String fileName = "output/" + sticker.getStickerName() + ".png";
        stickerMaker.buildSticker(inputStream,fileName );
    }
}
