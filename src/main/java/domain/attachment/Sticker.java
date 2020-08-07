package domain.attachment;

public class Sticker {
    private int productId;
    private int stickerId;
    private Image[] images;
    private ImagesWithBackground[] imagesWithBackground;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStickerId() {
        return stickerId;
    }

    public void setStickerId(int stickerId) {
        this.stickerId = stickerId;
    }

    public Image[] getImage() {
        return images;
    }

    public void setImage(Image[] images) {
        this.images = images;
    }

    public ImagesWithBackground[] getImagesWithBackground() {
        return imagesWithBackground;
    }

    public void setImagesWithBackground(ImagesWithBackground[] imagesWithBackground) {
        this.imagesWithBackground = imagesWithBackground;
    }
}
