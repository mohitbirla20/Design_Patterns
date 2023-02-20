package com.bridge;

public class YoutubeVideo extends Video{
  
	public YoutubeVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videoFile) {
        processor.process(videoFile); //Processed as per given processor
        //Now play
        if(processor instanceof HDProcessor)
        	System.out.println("video start in hd");
        else
        	System.out.println("video start in UHD4K");
    }

}
