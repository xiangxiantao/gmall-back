package com.xxt.gmall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxt.common.utils.PageUtils;
import com.xxt.common.utils.Query;

import com.xxt.gmall.product.dao.CategoryDao;
import com.xxt.gmall.product.entity.CategoryEntity;
import com.xxt.gmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2.组装为父子的树型结构
        List<CategoryEntity> tree = categoryEntities.stream()
                .filter((categoryEntity -> categoryEntity.getParentCid() == 0))
                .map(parent -> {
                    //设置子菜单
                    parent.setChildren(getChildrens(parent, categoryEntities));
                    return parent;
                })
                .sorted((item1, item2) -> (item1.getSort() == null ? 0 : item1.getSort()) - (item2.getSort() == null ? 0 : item2.getSort()))
                .collect(Collectors.toList());
        return tree;
    }

    /**
     * 递归查找所有菜单的子菜单
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> collect = all.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId())
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;
                })
                .sorted((item1, item2) -> (item1.getSort()==null ? 0 :item1.getSort()) - (item2.getSort()==null ? 0 :item2.getSort()))
                .collect(Collectors.toList());
        return collect;
    }


}