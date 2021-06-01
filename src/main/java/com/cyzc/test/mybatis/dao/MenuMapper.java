package com.cyzc.test.mybatis.dao;

import com.cyzc.test.menu.model.Menu;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {

    List<Menu> findAll();
}