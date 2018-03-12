import java.util.List;

public class Resource
{
    private List<Image> images;
    private List<Video> videos;

    public Resource(List<Image> images, List<Video> videos)
    {
        this.images = images;
        this.videos = videos;
    }

    public Resource(Resource resource)
    {
        this.images = resource.getImages();
        this.videos = resource.getVideos();
    }

    public List<Video> getVideos()
    {
        return videos;
    }

    public List<Image> getImages()
    {
        return images;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Image image: images)
            sb.append(image.toString()).append('\n');
        for (Video video: videos)
            sb.append(video.toString()).append('\n');
        return sb.toString();
    }
}
