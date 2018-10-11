
public class Netflix {
public static void main(String[] args) {
	Movie StarWars = new Movie("Star Wars", 5);
	Movie JussasicPark = new Movie("Jurrasic Park", 3);
	Movie HacksawRidge = new Movie("Hacksaw Ridge", 3);
	Movie HunterKiller = new Movie("Hunter Killer", 3);
	Movie Dunkirk = new Movie("Dunkirk", 4);
	StarWars.getTicketPrice();
	NetflixQueue quene = new NetflixQueue();
	quene.addMovie(Dunkirk);
	quene.addMovie(HunterKiller);
	quene.addMovie(HacksawRidge);
	quene.addMovie(JussasicPark);
	quene.addMovie(StarWars);
	quene.printMovies();
	StarWars.getTicketPrice();
	quene.sortMoviesByRating();
	quene.getBestMovie();
	
}
}
