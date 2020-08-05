package ru.netology.domain;

public class LikesInfo {
    private int count;
    private int userLike;
    private String iconLikeUrl;
    private String iconIsNotLikeUrl;
    private int canLike;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLike() {
        return userLike;
    }

    public void setUserLike(int userLike) {
        this.userLike = userLike;
    }

    public String getIconLikeUrl() {
        return iconLikeUrl;
    }

    public void setIconLikeUrl(String iconLikeUrl) {
        this.iconLikeUrl = iconLikeUrl;
    }

    public String getIconIsNotLikeUrl() {
        return iconIsNotLikeUrl;
    }

    public void setIconIsNotLikeUrl(String iconIsNotLikeUrl) {
        this.iconIsNotLikeUrl = iconIsNotLikeUrl;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }
}
