package tabian.com.cardview;

/**
 * Created by User on 4/4/2017.
 */

public class Card {
    private String imgURL;
    private String title;

    public Card(String imgURL, String title) {
        this.imgURL = imgURL;
        this.title = title;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
