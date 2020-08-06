package domain;

public class RepostsInfo {
    private int count;
    private String iconRepostUrl;
    private boolean tapRepost;
    private int userReposted;
    private MenuRepost menuRepost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getIconRepostUrl() {
        return iconRepostUrl;
    }

    public void setIconRepostUrl(String iconRepostUrl) {
        this.iconRepostUrl = iconRepostUrl;
    }

    public boolean isTapRepost() {
        return tapRepost;
    }

    public void setTapRepost(boolean tapRepost) {
        this.tapRepost = tapRepost;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

    public MenuRepost getMenuRepost() {
        return menuRepost;
    }

    public void setMenuRepost(MenuRepost menuRepost) {
        this.menuRepost = menuRepost;
    }
}
