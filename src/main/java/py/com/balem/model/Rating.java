package py.com.balem.model;

import com.opencsv.bean.CsvBindByName;

public class Rating {
    @CsvBindByName(column = "userId")
    private String userId;
    @CsvBindByName(column = "movieId")
    private String movieId;
    @CsvBindByName(column = "rating")
    private String rating;
    @CsvBindByName(column = "timestamp")
    private String timestamp;

    public Rating() {}

    public Rating(String userId, String movieId, String rating, String timestamp) {
        this.userId = userId;
        this.movieId = movieId;
        this.rating = rating;
        this.timestamp = timestamp;
    }

    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getRating() {
        return rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "userId:" + userId +
                ", movieId:" + movieId +
                ", rating:" + rating +
                ", timestamp:'" + timestamp + '\'' +
                '}';
    }
}
