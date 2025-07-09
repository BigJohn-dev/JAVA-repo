package DietelChapter6;

public class SportRecommender {

    public static String weatherTips (int celsius) {
        if (celsius >= 20 && celsius <= 30 ) return "It’s lovely weather for sports today!";
        else if (celsius >= 10 && celsius <= 40) return "It’s reasonable weather for sports today.";
        else return "Please exercise with care today, watch out for the weather!";
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Sports Recommender");
        System.out.println(SportRecommender.weatherTips(25));
    }
}
