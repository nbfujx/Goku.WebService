package com.goku.common.model;

import java.util.List;

/**
 * Created by nbfujx on 2018/1/12.
 */
public class TreeInfo {
    private String id;
    private String name;
    private List<TreeInfo> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreeInfo> getChildren() {
        return children;
    }

    public void setChildren(List<TreeInfo> children) {
        this.children = children;
    }
}
