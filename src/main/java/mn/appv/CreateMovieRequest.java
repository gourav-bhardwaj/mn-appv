package mn.appv;

import io.micronaut.core.annotation.Introspected;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;

@Introspected
public record CreateMovieRequest(
    @NotBlank(message = "IMDB ID cannot be blank") String imdbId,
    @NotBlank(message = "Title cannot be blank") String title,
    @NotNull(message = "Year cannot be null") @Min(value = 1888, message = "Year must be after 1888") Integer year,
    @NotBlank(message = "Actors cannot be blank") String actors
) {}