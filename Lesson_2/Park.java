package Lesson_2;
//Task_3
public class Park {

        public class Attractions {
            private String attractionName;
            private String time;
            private int cost;

            public Attractions(String attraction, String time, int cost) {
                this.attractionName = attraction;
                this.time = time;
                this.cost = cost;
            }
        }

        public static void main(String[] args) {
            Attractions paratruperPark = new Park().new Attractions(
                    "Paratruper", "9:00-17:30", 7);
            System.out.println("Attraction: " + paratruperPark.attractionName + ";\nTime: " +
                    paratruperPark.time + ";\nCost: " + paratruperPark.cost + " руб.");
            System.out.println("------------------------");

            Attractions waltzPark = new Park().new Attractions(
                    "Waltz", "10:00-17:00", 5);
            System.out.println("Attraction: " + waltzPark.attractionName + ";\nTime: " + waltzPark.time +
                    ";\nCost: " + waltzPark.cost + " руб.");
            System.out.println("------------------------");

            Attractions carouselPark = new Park().new Attractions(
                    "Carousel", "10:00-18:00", 4);
            System.out.println("Attraction: " + carouselPark.attractionName + ";\nTime: " + carouselPark.time +
                    ";\nCost: " + carouselPark.cost + " руб.");
        }
    }