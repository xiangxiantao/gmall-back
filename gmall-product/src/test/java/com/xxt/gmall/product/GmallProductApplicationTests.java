package com.xxt.gmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xxt.gmall.product.entity.BrandEntity;
import com.xxt.gmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("h3");
        brandEntity.setName("极米");
        brandEntity.setFirstLetter("b");
        brandEntity.setLogo("www.baidu.com");
        brandEntity.setShowStatus(1);

        boolean save = brandService.save(brandEntity);
        System.out.println(save);

    }

    @Test
    void testSelect(){
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach(System.out::println);
    }

}
