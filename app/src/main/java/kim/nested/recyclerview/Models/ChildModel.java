package kim.nested.recyclerview.Models;

public class ChildModel {
      private  int hero_image;
    private String movieName;

    public ChildModel(int hero_image, String movieName){
        this.hero_image = hero_image;
         this.movieName = movieName;
    }
    public int getHeroImage() {
        return hero_image;
    }
    public String getMovieName() {
        return movieName;
    }
}