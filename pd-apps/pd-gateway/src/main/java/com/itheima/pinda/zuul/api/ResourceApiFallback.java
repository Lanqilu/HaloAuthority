package com.itheima.pinda.zuul.api;

import com.itheima.pinda.authority.dto.auth.ResourceQueryDTO;
import com.itheima.pinda.authority.entity.auth.Resource;
import com.itheima.pinda.base.R;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Halo
 * @create 2021/12/05 下午 01:26
 * @description 资源 API 熔断
 */
@Component
public class ResourceApiFallback implements ResourceApi {
    public R<List> list() {
        return null;
    }

    public R<List<Resource>> visible(ResourceQueryDTO resource) {
        return null;
    }
}
