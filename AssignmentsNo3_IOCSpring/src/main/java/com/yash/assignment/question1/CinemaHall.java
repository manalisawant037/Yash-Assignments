package com.yash.assignment.question1;

public class CinemaHall {

	private String cinemaHall;
	private Movie movie;
	private String time;
	
	public String getCinemaHall() {
		return cinemaHall;
	}
	public void setCinemaHall(String cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public CinemaHall(String cinemaHall, Movie movie, String time) {
		super();
		this.cinemaHall = cinemaHall;
		this.movie = movie;
		this.time = time;
	}
	@Override
	public String toString() {
		return "CinemaHall [cinemaHall=" + cinemaHall + ", movie=" + movie + ", time=" + time + "]";
	}
	public void showCinemaHall() {
		System.out.println("Cinema Hall : " + this.cinemaHall);
		System.out.println("Movie : " + movie.getMovieName());
		System.out.println("Time : " + this.time);
		
	}
	
}
