package com.bridge;

public class Main {

	 public static void main(String[] args) {
	        Video youtubeVideo = new YoutubeVideo(new UHD4KProcessor());
	        youtubeVideo.play("abc.mp4");
	        Video netflixVideo = new NetflixVideo(new HDProcessor());
	        netflixVideo.play("abc.mp4");
	 }
	
}
