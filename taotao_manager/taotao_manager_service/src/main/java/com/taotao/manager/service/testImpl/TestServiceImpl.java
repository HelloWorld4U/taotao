package com.taotao.manager.service.testImpl;

import com.taotao.manager.mapper.TestMapper;
import com.taotao.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Override
    public String queryDate() {
        return testMapper.queryDate();
    }
}
