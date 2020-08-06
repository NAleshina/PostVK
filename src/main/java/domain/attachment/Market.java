package domain.attachment;

import java.awt.*;

public class Market {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private PriceMarket priceMarket;
    private DimensionsMarket dimensionsMarket;
    private int weight;
    private Category category;
    private String thumbPhoto;
    private int date;
    private int availability;
    private boolean isFavorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PriceMarket getPriceMarket() {
        return priceMarket;
    }

    public void setPriceMarket(PriceMarket priceMarket) {
        this.priceMarket = priceMarket;
    }

    public DimensionsMarket getDimensionsMarket() {
        return dimensionsMarket;
    }

    public void setDimensionsMarket(DimensionsMarket dimensionsMarket) {
        this.dimensionsMarket = dimensionsMarket;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getThumbPhoto() {
        return thumbPhoto;
    }

    public void setThumbPhoto(String thumbPhoto) {
        this.thumbPhoto = thumbPhoto;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
