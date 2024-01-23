package com.tsantos.spotify.domain.album.dtos.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.tsantos.spotify.domain.album.dtos.request.AlbumWrapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumResponse {

    private AlbumWrapper albums;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlbumResponse that)) return false;
        return Objects.equals(albums, that.albums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albums);
    }
}
