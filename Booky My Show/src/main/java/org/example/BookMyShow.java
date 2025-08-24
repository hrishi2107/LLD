package org.example;

import java.util.*;

public class BookMyShow {
    String movieName;
    String city;

    MovieController movieController;
    TheaterController theaterController;
    BookMyShow()
    {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }
    public void getMeTickets()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name");
        this.movieName = sc.nextLine();
        System.out.println("Enter city");
        this.city = sc.nextLine();

        setup();

        List<Movie> moviesInCity = movieController.getCityVSmovie().get(city);
        Boolean foundMovie = false;
        for(Movie m: moviesInCity)
        {
            if(m.getName().equalsIgnoreCase(movieName)) {
                foundMovie = true;
            }
        }

        if(foundMovie) {
            System.out.println("We found your movie at your city!");

            List<Theater> theatersNearYou = theaterController.getCityVStheater().get(city);
            System.out.println(this.movieName + " is playing here: ");
            for(Theater t: theatersNearYou)
            {
                System.out.println(t.getId());
            }
            System.out.println("Select your theater");
            String theaterName = sc.nextLine();
            Theater selectedTheatre = null;

            List<Theater> allTheatres = theaterController.getAllTheaters();
            for(Theater t: allTheatres)
            {
                if(t.getId().equalsIgnoreCase(theaterName))
                {
                    selectedTheatre = t;
                    break;
                }
            }
            System.out.println("Choose your preferred show : ");
            for(Show s: selectedTheatre.getShows())
            {
                System.out.println("Show "+s.getShowId()+" starts at : "+ s.getStartTime());
            }
            System.out.println("Selected any showId");
            Integer showId = sc.nextInt();
            System.out.println("Booking Done!!!");

        }
        else {
            System.out.println("Oops! Sorry this movie has still not reached your city.");
        }

    }
    public void setup()
    {
        Movie movie1 = new Movie(1,"Avengers",150);
        Movie movie2 = new Movie(2,"Don",190);

        Seat seat1 = new Seat("st1",1,200,SeatCategory.SILVER);
        Seat seat2 = new Seat("st2",1,200,SeatCategory.SILVER);
        Seat seat3 = new Seat("st3",1,200,SeatCategory.SILVER);
        Seat seat4 = new Seat("st4",1,200,SeatCategory.SILVER);
        Seat seat5 = new Seat("st5",1,200,SeatCategory.SILVER);
        Seat seat6 = new Seat("st6",1,200,SeatCategory.SILVER);

        List<Seat> seatsM = new ArrayList<>();
        seatsM.add(seat1);
        seatsM.add(seat2);
        seatsM.add(seat3);

        List<Seat> seatsK = new ArrayList<>();
        seatsK.add(seat4);
        seatsK.add(seat5);
        seatsK.add(seat6);

        Screen screen1 = new Screen(1,seatsM);
        Screen screen2 = new Screen(2,seatsK);

        List<Screen> screensM = new ArrayList<>();
        screensM.add(screen1);

        List<Screen> screensK = new ArrayList<>();
        screensM.add(screen2);

        Show show1 = new Show(1,movie1,screen1,1400,new ArrayList<>());
        Show show2 = new Show(2,movie2,screen1,1700,new ArrayList<>());
        Show show3 = new Show(3,movie1,screen2,1400,new ArrayList<>());
        Show show4 = new Show(4,movie2,screen2,1800,new ArrayList<>());

        List<Show> showsM = new ArrayList<>();
        showsM.add(show1);
        showsM.add(show2);

        List<Show> showsK = new ArrayList<>();
        showsK.add(show3);
        showsK.add(show4);

        Theater theater1 = new Theater("INOX","Mumbai",screensM,showsM);
        Theater theater2 = new Theater("PVR","Kanpur",screensK,showsK);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);

        List<Theater> theaters = new ArrayList<>();
        theaters.add(theater1);
        theaters.add(theater2);

        this.theaterController.setAllTheaters(theaters);
        this.movieController.setAllMovies(movies);
        Map<String,List<Theater>> mp1 = new HashMap<>();
        mp1.putIfAbsent("Mumbai", new ArrayList<>());
        mp1.get("Mumbai").add(theater1);
        mp1.putIfAbsent("Kanpur", new ArrayList<>());
        mp1.get("Kanpur").add(theater2);
        this.theaterController.setCityVStheater(mp1);

        Map<String,List<Movie>> mp2 = new HashMap<>();
        mp2.putIfAbsent("Kanpur", new ArrayList<>());
        mp2.get("Kanpur").add(movie1);
        mp2.get("Kanpur").add(movie2);
        mp2.putIfAbsent("Mumbai", new ArrayList<>());
        mp2.get("Mumbai").add(movie1);
        mp2.get("Mumbai").add(movie2);
        this.movieController.setCityVSmovie(mp2);




    }
}
