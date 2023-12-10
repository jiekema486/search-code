package com.utopia.service.impl;

import com.utopia.mapper.DeptMapper;
import com.utopia.pojo.Dept;
import com.utopia.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list(){
        return deptMapper.list();
    }
}
