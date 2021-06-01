package com.cyzc.test.menu;

import com.cyzc.test.menu.model.Menu;
import com.cyzc.test.mybatis.dao.MenuMapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-05-28
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findAll(Menu menu) {

        try {
            //查询出所有的菜单
            List<Menu> allMenu = menuMapper.findAll();

            //根节点存储
            List<Menu> rootMenu = new ArrayList<>();
            //根据传递的参数设置根节点
            if (menu != null && menu.getId() != null) {
                //父节点为传递的id为根节点
                for (Menu nav : allMenu) {
                    if (nav.getParentId().equals(menu.getId())) {
                        rootMenu.add(nav);
                    }
                }
            } else {
                //父节点是0的，为根节点
                for (Menu nav : allMenu) {
                    if (nav.getParentId().equals(0)) {
                        rootMenu.add(nav);
                    }
                }
            }
            // 根据Menu类的order排序
            Collections.sort(rootMenu);

            //为根节点设置子菜单，getChild是递归调用
            for (Menu nv : rootMenu) {
                //获取根节点下的所有子节点，使用getChild方法
                List<Menu> childList = getChild(nv.getId(), allMenu);
                //给根节点设置子节点
                nv.setChildren(childList);
            }

            return rootMenu;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    private List<Menu> getChild(Integer id, List<Menu> allMenu) {
        //子菜单
        List<Menu> childList = new ArrayList<>();
        for (Menu nav : allMenu) {
            //遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
            //相等说明：为该根节点的子节点
            if (nav.getParentId().equals(id)) {
                childList.add(nav);
            }
        }
        //递归设置子节点
        for (Menu nav : childList) {
            nav.setChildren(getChild(nav.getId(), allMenu));
        }
        //排序
        Collections.sort(childList);
        //如果节点下没有子节点，返回一个空List（递归退出）
        if (childList.size() == 0) {
            return new ArrayList<Menu>();
        }
        return childList;
    }
}
