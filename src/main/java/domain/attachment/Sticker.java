package domain.attachment;

public class Sticker {
    private int productId;
    private int stickerId;
    private ImagesInfo2 imagesInfo2;
    private ImagesWithBackground imagesWithBackground;

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

    public ImagesInfo2 getImagesInfo2() {
        return imagesInfo2;
    }

    public void setImagesInfo2(ImagesInfo2 imagesInfo2) {
        this.imagesInfo2 = imagesInfo2;
    }

    public ImagesWithBackground getImagesWithBackground() {
        return imagesWithBackground;
    }

    public void setImagesWithBackground(ImagesWithBackground imagesWithBackground) {
        this.imagesWithBackground = imagesWithBackground;
    }
}
