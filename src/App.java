import java.io.InputStream;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        /* set sticker properties */
        Sticker sticker = new Sticker();
        sticker.setStickerName("ittle duck");
        sticker.setStickerText("cute baby duck!");
        sticker.setUrl("https://media.istockphoto.com/id/187217267/pt/foto/pato-beb%C3%A9.jpg?s=1024x1024&w=is&k=20&c=yHxzgfLhb2ucNTPDfjYNBkA_yTcvk78vWcqMy7U62x8=");

        /* build sticker with stickerMaker */
        InputStream inputStream = new URL(sticker.getUrl()).openStream();
        StickerMaker stickerMaker =  new StickerMaker();
        String fileName = "output/" + sticker.getStickerName() + ".png";
        String stickerText = sticker.getStickerText();
        stickerMaker.buildSticker(inputStream,fileName, stickerText );
    }
}
