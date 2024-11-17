// Pseudocode:
// Demonstrate the proxy pattern by using the proxy to control access to the video service.
public class Main {
    public static void main(String[] args) {
        VideoService videoService = new VideoServiceProxy();

        // First time fetching the video (not in cache)
        videoService.playVideo("123");

        // Second time fetching the same video (should use cache)
        videoService.playVideo("123");

        // Fetching a different video
        videoService.playVideo("456");
    }
}
