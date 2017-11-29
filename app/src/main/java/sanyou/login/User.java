package sanyou.login;

/**
 * @version V1.0 <描述当前版本功能>
 * @category 在此写用途
 * @author: hxl
 * @date: 2016-05-07 13:19
 */
public class User {

    private static final String TAG = "User";
    /*{
        "userid": "100007",
        "username": "test",
        "mobile": "18810422321",
        "sex": "0",
        "avater": "eg.gif",
        "secret": "c90a4c143735485318a5a9c3fb6ca2f289a9f421",
        "points": "1000",
        "user_money": "0.00",
        "carry": "0",
        "carry_p": "0",
        "ask_p": "1",
        "un_p": "0",
        "pay_p": "",
        "imuser": "100007",
        "impas": "123456",
        "token": "f0f91114e81787e23e077d53f80d3702dbe8b50a"
    }*/
    private String token;         //(string)用户令牌
    private String username;        //(String)用户名
    private String userid;          //(int)用户id
    private int sex;             //(int)性别 0男 1女
    private String mobile;           //(string)用户手机号
    private String avater;         //(string)头像
    private String secret;       //(string)秘钥

    private String imuser;           //(string)即时通讯用户名
    private String impas;       //(string)密码

    private String pay_p;           //支付密码
    private int points;//积分
    private double user_money;//账户余额
    private double carry;//可提现金额
    private int carry_p;//身份验证0未身份验证1审核中2已通过）
    private int ask_p;//安全问题是否设置0未1yes
    private int un_p;//银行卡0未设置1审核中2通过
    private String address;//默认收货地址

    public String getPay_p() {
        return pay_p;
    }

    public void setPay_p(String pay_p) {
        this.pay_p = pay_p;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getUser_money() {
        return user_money;
    }

    public void setUser_money(double user_money) {
        this.user_money = user_money;
    }

    public double getCarry() {
        return carry;
    }

    public void setCarry(double carry) {
        this.carry = carry;
    }

    public int getCarry_p() {
        return carry_p;
    }

    public void setCarry_p(int carry_p) {
        this.carry_p = carry_p;
    }

    public int getAsk_p() {
        return ask_p;
    }

    public void setAsk_p(int ask_p) {
        this.ask_p = ask_p;
    }

    public int getUn_p() {
        return un_p;
    }

    public void setUn_p(int un_p) {
        this.un_p = un_p;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getImuser() {
        return imuser;
    }

    public void setImuser(String imuser) {
        this.imuser = imuser;
    }

    public String getImpas() {
        return impas;
    }

    public void setImpas(String impas) {
        this.impas = impas;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
