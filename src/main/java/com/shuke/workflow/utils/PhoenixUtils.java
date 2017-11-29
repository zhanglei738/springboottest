package com.shuke.workflow.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.log4j.Logger;

/*
* JDBC utils for phoenix
* create by zhanglei 2017.11.29
* */
public class PhoenixUtils {
    //phoenxi connection utils
    private String connstr = "jdbc:phoenix:localhost:2181/hbase";
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private FastDateFormat timeFormat = FastDateFormat.getInstance("yyyy/MM/dd HH:mm:ss.SSS");
    private static Logger LOG = Logger.getLogger(PhoenixUtils.class);

    //get phoenix conn
    public Connection getPhoenixConnection() {
        try {
            //get phoenix conn
            conn = DriverManager.getConnection(connstr);
            conn.setAutoCommit(true);
        } catch (Exception e) {
            LOG.error(timeFormat.format(new Date()) + "fail to get phoenix connection......" + e);
        }
        return conn;
    }

    //save data to hbase by phoenix
    public boolean save2hbase(String sql) {
        boolean res = true;
        if (conn == null) {
            getPhoenixConnection();
        }
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
            LOG.error(timeFormat.format(new Date()) + "\n" + sql + "\n" + e.getMessage() + "\n");
        }

        return res;
    }

    //search from phoenix
    public ResultSet searchFromHbase(String sql) {
        ResultSet rest = null;
        if(conn==null){
            getPhoenixConnection();
        }
        try{
            pstmt = conn.prepareStatement(sql);
            rest = pstmt.executeQuery();

        }catch (Exception e ){
            LOG.error(timeFormat.format(new Date())+"\n"+sql+"\n"+e.getMessage()+"\n");
        }


        return rest;
    }
    //close connection
    public  void clostConnect(){
        try{
            if(conn!=null){
                conn.commit();
                conn.close();
            }
            if(pstmt!=null){
                pstmt.close();
            }

        }
        catch (Exception e ){
            LOG.error(timeFormat.format(new Date())+"\n"+e.getMessage()+"\n"+"fail to close connection");
        }


    }

//  public static void main(String[] args){
//
//        PhoenixUtils phoenixUtils = new PhoenixUtils();
//        ResultSet resultSet =  phoenixUtils.searchFromHbase("select * from TEST limit 10");
//
//
//        try{
//            while (resultSet.next()){
//
//                System.out.println("111");
//                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)+ " " + resultSet.getString(3));
//            }
//        }catch (Exception e){
//            // System.out.println("===" + e.printStackTrace());
//            e.printStackTrace();
//        }
//
//  }
}


