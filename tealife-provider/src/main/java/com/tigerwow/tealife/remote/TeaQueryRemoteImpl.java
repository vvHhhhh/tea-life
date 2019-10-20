package com.tigerwow.tealife.remote;

import com.tigerwow.tealife.api.TeaQueryRemote;
import org.springframework.stereotype.Component;

/**
 * create by vvh 2019/10/18 下午1:10
 */
@Component
public class TeaQueryRemoteImpl implements TeaQueryRemote {

    public String queryTeaById(Integer teaId) {
        return "根据teaId获取到了柠檬茶！";
    }
}
