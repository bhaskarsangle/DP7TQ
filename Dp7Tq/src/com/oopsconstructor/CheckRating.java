package com.oopsconstructor;

class Movie {
	int mId;
	String mName;
	float mRate;

	public Movie(int mId, String mName, float mRate) {
 		this.mId = mId;
		this.mName = mName;
		this.mRate = mRate;
	}

	public Movie() {
 		// TODO Auto-generated constructor stub
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public float getmRate() {
		return mRate;
	}

	public void setmRate(float mRate) {
		this.mRate = mRate;
	}

	@Override
	public String toString() {
		return "Movie [mId=" + mId + ", mName=" + mName + ", mRate=" + mRate + "]";
	}

}

public class CheckRating {

	static void check(Movie m) {
		if (m.getmRate() > 7) {
			System.out.println(m.mId+" ==> " + m.getmName());
		}
	}

	public static void main(String[] args) {
		Movie movie1 = new Movie(123, "rrr", 10f);
		Movie movie2 = new Movie(124, "gadar2", 9f);
		Movie movie3 = new Movie(125, "joker", 6.5f);
		Movie movie4 = new Movie(126, "jailor", 8f);
		Movie movie5 = new Movie(127, "dreamgirl", 6f);

		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);
		System.out.println(movie4);
		System.out.println(movie5);
		System.out.println("=================================");

		check(movie1);
		check(movie2);
		check(movie3);
		check(movie4);
		check(movie5);

	}

}
