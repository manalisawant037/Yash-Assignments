package com.yash.assignment.question1;

public class City {
	
	private String city;
	private CinemaHall cinemaHall;
	
	public City(String city, CinemaHall cinemaHall) {
		super();
		this.city = city;
		this.cinemaHall = cinemaHall;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	
	public void showCity() {
		System.out.println("City : " + city);
		System.out.println("Cinema Hall : " + cinemaHall.getCinemaHall());
	}
}
