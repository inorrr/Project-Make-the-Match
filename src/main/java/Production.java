import java.util.ArrayList;
import java.util.HashSet;

public class Production {

    private String projectName;

    private String seasonName;

    private HashSet<Episode> episodes;

    private int numEpisodes;

    private HashSet<String> type;

    private HashSet<String> genres;

    private HashSet<String> cast;

    private HashSet<String> creators;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public HashSet<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(HashSet<Episode> episodes) {
        this.episodes = episodes;
    }

    public int getNumEpisodes() {
        return numEpisodes;
    }

    public void setNumEpisodes(int numEpisodes) {
        this.numEpisodes = numEpisodes;
    }

    public HashSet<String> getType() {
        return type;
    }

    public void setType(HashSet<String> type) {
        this.type = type;
    }

    public HashSet<String> getGenres() {
        return genres;
    }

    public void setGenres(HashSet<String> genres) {
        this.genres = genres;
    }

    public HashSet<String> getCast() {
        return cast;
    }

    public void setCast(HashSet<String> cast) {
        this.cast = cast;
    }

    public HashSet<String> getCreators() {
        return creators;
    }

    public void setCreators(HashSet<String> creators) {
        this.creators = creators;
    }


}
