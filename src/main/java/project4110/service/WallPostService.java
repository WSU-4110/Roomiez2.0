package project4110.service;


import project4110.model.WallPost;
import project4110.web.WallPostDto;

public interface WallPostService {

    WallPost save(WallPostDto wallPostDto);

    WallPost get(Long id);

    Iterable<WallPost> findAll();
}
