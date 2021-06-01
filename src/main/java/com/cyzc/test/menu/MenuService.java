package com.cyzc.test.menu;

import com.cyzc.test.menu.model.Menu;
import java.util.List;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-05-28
 */
public interface MenuService {

    List<Menu> findAll(Menu menu);
}
