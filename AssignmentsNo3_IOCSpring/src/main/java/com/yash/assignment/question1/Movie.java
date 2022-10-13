package com.yash.assignment.question1;

public class Movie
{
	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Movie(String movieName) {
		super();
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + "]";
	}
	
	public void showMovie() {
		System.out.println("Movie : " + movieName);
	}
	
}
