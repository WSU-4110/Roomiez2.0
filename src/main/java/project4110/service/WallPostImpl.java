package project4110.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project4110.Repository.WallPostRepository;
import project4110.model.WallPost;
import project4110.web.WallPostDto;

@Service
public class WallPostImpl implements WallPostService{

    @Autowired
    private WallPostRepository wallPostRepository;

    public WallPostImpl(WallPostRepository wallPostRepository) {
        this.wallPostRepository = wallPostRepository;
    }

    @Override
    public WallPost save(WallPostDto wallPostDto) {
        WallPost wallPost = new WallPost(wallPostDto.getWallPost());
        return wallPostRepository.save(wallPost);
    }

    @Override
    public WallPost get(Long id) {
        return wallPostRepository.findById(id).get();
    }


    @Override
    public Iterable<WallPost> findAll() {
        return wallPostRepository.findAll();
    }
}
