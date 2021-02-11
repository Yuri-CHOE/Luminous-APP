package com.example.luminous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;

public class MyPage extends AppCompatActivity {

    private FirebaseAuth mAuth ;

    private TextView tv_nickName; //닉네임 테스트
    private ImageView iv_profile; //이미지 뷰
    private Button btn_logout;  //로그아웃 버튼
    private TextView tv_email; //이메일 텍스트

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);

        Intent intent = getIntent();
        String nickName = intent.getStringExtra("nickName"); //MainActivity로 부터 닉네임 전달 받음
        String photoUrl = intent.getStringExtra("photoUrl");    //MainActivity로 부터 프로필 사진 Url 전달 받음
        String emailTXT = intent.getStringExtra("emailTXT");    //MainActivity로 부터 이메일 전달 받음

        tv_nickName = findViewById(R.id.tv_nickName);
        tv_nickName.setText(nickName+" 님");    //닉네임 text를 텍스트뷰테 세팅

        tv_email = findViewById(R.id.tv_email);
        tv_email.setText(emailTXT); //이메일 text를 텍스트뷰테 세팅

        iv_profile = findViewById(R.id.iv_profile);
        Glide.with(this).load(photoUrl).into(iv_profile);    //프로필 url을 이미지 뷰에 세팅

        mAuth = FirebaseAuth.getInstance();
        //버튼 클릭 이벤트 세팅
        Button btnlogout = (Button) findViewById(R.id.btn_logout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼의 id를 가져옴
                switch (v.getId())
                {
                    case R.id.btn_logout:   //로그아웃 버튼
                        FirebaseAuth.getInstance().signOut();
                        finishAffinity();
                        break;
                }

            }
        };
        btnlogout.setOnClickListener(listener);
    }






}