package mn.appv;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.validation.Valid;

@Controller("/movies")
public class MovieController {

    @Post
    public MovieResponse createMovie(@Valid @Body CreateMovieRequest request) {
        return new MovieResponse(request.imdbId(), request.title(), request.year(), request.actors());
    }
}