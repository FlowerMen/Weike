package com.creacc.weike.biz;

import com.creacc.weike.bean.CategoryEntity;
import com.creacc.weike.biz.model.ICategoryModel;
import com.creacc.weike.utils.TestUtils;

import java.util.List;

/**
 * Created by Creacc on 2017/4/6.
 */

public class CategoryModelImpl implements ICategoryModel {

    @Override
    public List<CategoryEntity> getCategories() {
        return TestUtils.getTestCategories();
    }
}
