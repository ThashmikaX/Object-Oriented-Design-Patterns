// Implement the real video service, which performs the actual video streaming.
public class RealVideoService implements VideoService {
    @Override
    public void playVideo(String videoId) {
        System.out.println("Streaming video with ID: " + videoId);
    }
}