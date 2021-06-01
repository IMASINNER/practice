package com.cyzc.test.menu.model;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class Menu implements Comparable<Menu>, Serializable {

    private static final long serialVersionUID = -4866555859812317355L;
    /**
     * 主键递增
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父节点id
     */
    private Integer parentId;

    /**
     * 分类链接
     */
    private String url;

    /**
     * 分类图标
     */
    private String icon;

    /**
     * 分类排序权重
     */
    private Integer order;

    //子菜单列表
    private List<Menu> children;

    private Boolean unfold;

    @Override
    public int compareTo(com.cyzc.test.menu.model.Menu o) {
        if (!this.order.equals(o.order)) {
            return this.order - o.order;
        }
        return 0;
    }
}