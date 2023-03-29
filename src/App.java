import java.io.InputStream;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        /* set sticker properties */
        Sticker sticker = new Sticker();
        sticker.setStickerName("duck");
        sticker.setStickerText("cute duck!");
        sticker.setUrl("https://www.petz.com.br/blog/wp-content/uploads/2021/08/pato-de-estimacao2.jpg");

        /* build sticker with stickerMaker */
        InputStream inputStream = new URL(sticker.getUrl()).openStream();
        StickerMaker stickerMaker =  new StickerMaker();
        String fileName = "output/" + sticker.getStickerName() + ".png";
        String stickerText = sticker.getStickerText();
        stickerMaker.buildSticker(inputStream,fileName, stickerText );
    }
}
