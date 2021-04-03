package Geo;

import org.junit.Test;

import java.util.List;

public class testGeo {
    public static void main(String[] args) {


        long raidus = 10000; //半径10km
        double lon = 114.305981; //当前经度
        double lat = 22.596304; //当前纬度
        double lon1=118.446439850079;
        double lat1=29.8220753639329;
//        double lon2=108.9644583556;
//        double lat2=34.286439088548;
        double dist;
        double dist2;
        dist=GeoUtils.GetDistance(lon, lat, lon1, lat1);
        dist2=GeoUtils.distance(lon, lat, lon1, lat1);
        System.out.println("1.两点相距：" + dist + " 米");
        System.out.println("2.两点相距：" + dist2 + " 米");


    }


    @Test
    public void test(){

        List<String>list=null;

        System.out.println(list);

    }

}
