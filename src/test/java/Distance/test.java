package Distance;

import org.junit.Test;

public class test {




    @Test
    public void testDis(){

        final double dis=6371.004;

        ConfLocation confLocation =new ConfLocation("天安门",116.40384710616807,39.91552563252131);

        double lat1= confLocation.getLatitude();
        double lon1= confLocation.getLongitude();
        CompanyLocation companyLocation=new CompanyLocation("清华大学",104.08754919293331,30.408239653676087);
        double lat2= companyLocation.getLatitude();
        double lon2= companyLocation.getLongitude();


        double d=GPSHelper.GetDistance(lon1,lat1,lon2,lat2);


        System.out.println(confLocation.getName()+"距"+companyLocation.getName()+"----"+d+"米");

//C=sin（Lati）*sin（Latj）+cos（Lati）*cos（Loni）*cos（Latj）*con（Lonj）+cos（Lati）*sin（Loni）*cos（Latj）*sin（Lonj）

        //double d=Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lon1)*Math.cos(lat2)*Math.con
       /* Math.acos()
        Math.cos()*/

    }





}
