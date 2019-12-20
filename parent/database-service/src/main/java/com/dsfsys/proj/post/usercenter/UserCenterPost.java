package com.dsfsys.proj.post.usercenter;

import com.dsfsys.base.data.InputMapDataUtil;
import com.dsfsys.pub.exception.ConcrrentException;
import com.dsfsys.validateanno.CheckFor;
import com.dsfsys.validateanno.DataConvert;
import com.dsfsys.validateanno.InputField;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserCenterPost {
    @InputField(fieldName="userName",checkFor = @CheckFor(length=20,isEmpty=false),inputName = "username")
    public String userName;
    @InputField(fieldName="userAge",checkFor = @CheckFor(length=3,isEmpty=false),dataConvert = @DataConvert(str2Int = true),inputName = "userage")
    public Integer userAge;
    @InputField(fieldName="gender",dataConvert = @DataConvert(str2Short = true),inputName = "gender")
    public Short gender;
    @InputField(fieldName="workDate",checkFor = @CheckFor(isEmpty=false),dataConvert = @DataConvert(str2Date = true),inputName = "workdate")
    public Date workDate;
    @InputField(fieldName="workTime",checkFor = @CheckFor(isEmpty=false),inputName = "worktime")
    public String workTime;
    @InputField(fieldName="addr",inputName = "addr")
    public String addr;
    @InputField(fieldName="email",checkFor = @CheckFor(isEmpty = false,regx = "[a-zA-Z0-9]*@[a-zA-Z0-9]*.[a-z]+"),inputName = "email")
    public String email;


    @Override
    public String toString() {
        return "UserCenterPost{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", gender=" + gender +
                ", workDate=" + workDate +
                ", workTime=" + workTime +
                ", addr='" + addr + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map input = new HashMap();
        input.put("username","12345678");
        input.put("userage","22");
        input.put("gender","1");
        input.put("workdate","2019-12-17");
        input.put("worktime","14:01:55");
        input.put("addr","asd asdew ewrfhg啊实打实大");
        input.put("email","david0998@sina.com");
        try {
            UserCenterPost userCenterPost = InputMapDataUtil.getPostEntity(input,UserCenterPost.class);
            System.out.println(userCenterPost.toString());
        } catch (ConcrrentException e) {
            System.out.println(e.getErr_func()+"\t"+e.getErr_msg()+"\t"+e.getErr_code());
        }
    }
}
