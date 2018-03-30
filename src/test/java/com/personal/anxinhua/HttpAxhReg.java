/**
 * Copyright (C), 2018, ax
 * FileName: HttpAxhReg
 * Author:   liyun
 * Description:
 *
 * @create 2018-03-29 11:31
 * Version:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.personal.anxinhua;

import com.alibaba.fastjson.JSONObject;
import com.xiaoleilu.hutool.http.HttpUtil;
import org.junit.Test;

/**
 * java类简单作用描述
 * @ProjectName: http-client
 * @Package: com.http.anxinhua
 * @Description: java类作用描述
 * @Author: liyun
 * @CreateDate: 2018/3/29 11:31
 * @UpdateUser: liyun
 * @UpdateDate: 2018/3/29 11:31
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 *
 */
public class HttpAxhReg {

    String url = "http://192.168.20.154:9377/anxindai/user/register";
    JSONObject jsonObj = new JSONObject();

    /**
     *@Author:liyun
     *@Description: 安心花用户注册
     *@Date: 13:01 2018/3/29
     *@param：null
     */
    @org.testng.annotations.Test
    public void  testReg(){
        jsonObj.put("code","654654") ;
        jsonObj.put("password","12345678") ;
        jsonObj.put("phone","18725997904") ;
        String params = jsonObj.toJSONString() ;
        String responseData = HttpUtil.post(url,params) ;
//      把json字符串转换为json格式返回
        JSONObject jsStr = JSONObject.parseObject(responseData);
        System.out.println(responseData);
        String msg = (String) jsStr.get("msg");
        System.out.println(msg);    }



}
