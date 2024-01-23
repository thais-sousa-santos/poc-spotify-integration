package com.tsantos.spotify.infra.client;

import com.tsantos.spotify.domain.album.dtos.response.AlbumResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "AlbumSpotifyClient",
        url = "https://api.spotify.com"
)
public interface AlbumSpotifyClient {

    @GetMapping("/v1/browse/new-releases")
    AlbumResponse getReleases(@RequestHeader("Authorization") String authorization);

}
