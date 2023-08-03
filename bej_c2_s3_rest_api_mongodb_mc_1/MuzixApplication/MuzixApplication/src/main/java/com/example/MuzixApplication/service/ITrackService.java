package com.example.MuzixApplication.service;

import com.example.MuzixApplication.domain.Track;
import com.example.MuzixApplication.exception.ArtistNameNotFound;
import com.example.MuzixApplication.exception.InvalidTrackId;
import com.example.MuzixApplication.exception.NoTrackExistWithTheSpecifiedCondition;
import com.example.MuzixApplication.exception.TrackDetailsWithSpecifiedIdAlreadyExist;

import java.util.List;

public interface ITrackService {

    public Track saveTrackDetails(Track track) throws TrackDetailsWithSpecifiedIdAlreadyExist;
    public boolean deleteTrackDetails(int trackId) throws InvalidTrackId;
    public List<Track> fetchAllTrackDetails();
    public List<Track> getTrackByTrackRating() throws NoTrackExistWithTheSpecifiedCondition;
    public List<Track> getTrackByArtistName(String artistName) throws ArtistNameNotFound ;
}
