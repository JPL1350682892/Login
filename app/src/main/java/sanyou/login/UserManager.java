package sanyou.login;

import android.content.Context;


/**
 * @version V1.0 <描述当前版本功能>
 * @category 用户管理
 * @FileName: com.littlealarmclock.app.manager.UserManager.java
 * @author: hxl
 * @date: 2016-05-07 11:04
 */
public class UserManager {

    private static final String TAG = "UserManager";

    private static UserManager userManager=null;

    private static Context _context;

//    private User user;
    LoginBean bean;
    /**0 为未登录  1 为已登录  */
    private int isLogin;

    public static synchronized UserManager getInstance(Context context){
        if(userManager==null){
            userManager = new UserManager(context);
        }
        return userManager;
    }

    private UserManager(Context context) {
        _context = context;
        String json = SharedPreferencesUtils.getString(_context,"user_login","");
        if(json.equals("")){
            bean = null;
            isLogin = 0;
        }else{
            bean = GsonUtil.instance().fromJson(json,LoginBean.class);
            isLogin = 1;
        }
    }

    public  LoginBean getUser() {
        String json = SharedPreferencesUtils.getString(_context,"user_login","");
        if(!json.equals("")) {
            bean = GsonUtil.instance().fromJson(json, LoginBean.class);
        }
        return bean;
    }

    public int getIsLogin() {
        return isLogin;
    }

    public synchronized void setUser(LoginBean user) {
        this.bean = user;
        if(user==null){
            SharedPreferencesUtils.remove(_context,"user_login");
        }else{
            SharedPreferencesUtils.saveString(_context,"user_login",
                    GsonUtil.instance().toJson(user));
        }
    }

    public void setIsLogin(int isLogin) {
        this.isLogin = isLogin;
    }

//    public String getUid(){
//        if(bean!=null){
//            return user.getUserid();
//        }else{
//            String json = SharedPreferencesUtils.getString(_context,"user_login","");
//            if(!json.equals("")) {
//                user = GsonUtil.instance().fromJson(json, User.class);
//                if(user!=null){
//                    return user.getUserid();
//                }
//            }
//
//        }
//        return "";
//    }

//    public String getToken(){
//        if(user!=null){
//            return user.getToken();
//        }else{
//            String json = SharedPreferencesUtils.getString(_context,"user_login","");
//            if(!json.equals("")) {
//                user = GsonUtil.instance().fromJson(json, User.class);
//                if(user!=null){
//                    return user.getToken();
//                }
//            }
//        }
//        return "";
//    }
}
