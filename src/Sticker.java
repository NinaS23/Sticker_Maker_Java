public class Sticker {
    private String stickerName;
    private String url;
    private String stickerText;

    public String getStickerText() {
        return stickerText;
    }

    public void setStickerText(String stickerText) {
        this.stickerText = stickerText;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getStickerName() {
        return this.stickerName;
     }
    
    public void setStickerName(String stickerName) {
        this.stickerName = stickerName;
    }

}
