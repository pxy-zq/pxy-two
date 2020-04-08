package com.csdj.oaserviceimpl;

import com.csdj.oadao.OaMapper;
import com.csdj.pojo.Faqs;
import com.csdj.service.OaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OaServiceImpl implements OaService {

    @Autowired
    OaMapper oaMapper;

    @Override
    public List<Faqs> getOa() {
        return oaMapper.selectAll();
    }
}
