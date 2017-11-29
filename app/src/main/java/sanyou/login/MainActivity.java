package sanyou.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.Timer;
import java.util.TimerTask;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {
    private boolean isExit = false;
    private LoginBean bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn= (Button) findViewById(R.id.btn);
        Button btn_toast= (Button) findViewById(R.id.btn_toast);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                load();
            }
        });
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,UserManager.getInstance(getApplicationContext()).getUser()+"nihao",Toast.LENGTH_SHORT).show();
            }
        });
        if (UserManager.getInstance(getApplicationContext()).getUser() == null) {
        } else {
            load();

        }
    }

    private void load() {
        OkHttpUtils.post()
                .url("http://192.168.0.103/index.php/api/user/login")
                .addParams("username", "13123238686")
                .addParams("password","123456")
                .build()
                .execute(new StringCallback() {

                    @Override
                    public void onError(Call call, Exception e) {

                    }

                    @Override
                    public void onResponse(String response) {
                        if (response!=null) {
                            Gson gson = new Gson();
                            bean = gson.fromJson(response, LoginBean.class);
                            if ("0".equals(bean.getCode())) {
                                UserManager.getInstance(MainActivity.this).setUser(bean);
                                Intent intent=new Intent(MainActivity.this,MM.class);
                                startActivity(intent);
                                finish();
                            } else {
                            }
                        }
                    }
                });


    }
    /**
     * 菜单、返回键响应
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click();
        }//调用双击退出函数
        return true;
    }

    private void exitBy2Click() {
        Timer tExit = null;
        if (isExit == false) {
            isExit = true; // 准备退出
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else {
            ActivityManager.getInstance().existApp();
            System.exit(0);
        }
    }


}
