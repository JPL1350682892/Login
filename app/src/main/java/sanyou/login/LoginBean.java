package sanyou.login;

/**
 * Created by 姜培琳 on 2017/11/20.
 */

public class LoginBean {

    /**
     * code : 0
     * msg : 登录成功！
     * data : {"mobile":"13485596787","please":null}
     */

    private String code;
    private String msg;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * mobile : 13485596787
         * please : null
         */

        private String mobile;
        private Object please;

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public Object getPlease() {
            return please;
        }

        public void setPlease(Object please) {
            this.please = please;
        }
    }
}
