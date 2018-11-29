package edu.znkim.app.persistent;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.znkim.app.domain.Action;

@Repository
public interface ActionMapper {
    public List<Action> selectQuery();
}
