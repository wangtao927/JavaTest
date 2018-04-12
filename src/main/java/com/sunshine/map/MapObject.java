package com.sunshine.map;

/**
 * Created by wangtao on 2018/4/10.
 */
public class MapObject {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        MapObject mapObject = (MapObject) o;

        return name != null ? name.equals(mapObject.name) : mapObject.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
