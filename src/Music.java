public class Music {
    String name;
    String author;
    String genre;
    Integer duration_sec;

    public Music(String name, String author, String genre, Integer duration_sec){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration_sec = duration_sec;
    }

    public String get_info(){
        return this.name + " by " + this.author + ". genre: " + this.genre;
    }


}
