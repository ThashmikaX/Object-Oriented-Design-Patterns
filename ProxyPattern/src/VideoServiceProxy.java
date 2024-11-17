// Create a proxy class to control access to the real video service.
// Add caching or authentication logic here.
import java.util.HashMap;
import java.util.Map;

public class VideoServiceProxy implements VideoService {
    private RealVideoService realVideoService;
    private Map<String, String> cache;

    public VideoServiceProxy() {
        this.realVideoService = new RealVideoService(); // Initialize the real service
        this.cache = new HashMap<>(); // Simulate a cache for video data
    }

    @Override
    public void playVideo(String videoId) {
        if (cache.containsKey(videoId)) {
            System.out.println("Playing cached video with ID: " + videoId);
        } else {
            System.out.println("Fetching video and caching it...");
            cache.put(videoId, "Cached video content for ID: " + videoId);
            realVideoService.playVideo(videoId); // Forward request to the real service
        }
    }
}