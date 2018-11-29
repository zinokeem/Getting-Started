package edu.znkim.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.znkim.app.domain.Action;
import edu.znkim.app.persistent.ActionMapper;
import edu.znkim.app.service.ActionService;

@Service
@Transactional
public class ActionServiceImpl implements ActionService {
    @Autowired
    ActionMapper mapper;

    @Override
    public List<Action> selectQuery() {
        return mapper.selectQuery();
    }
}
