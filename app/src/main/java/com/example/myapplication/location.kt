package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class location : AppCompatActivity() {

    val contactsList : List<Contacts> = listOf(
        Contacts("침대해찬 포카","해차니 포카가 와떠요."),
        Contacts("쓸모없는 연말 선물","크리스마스 \n가장 쓸모없는 선물을 주세요."),
        Contacts("인스탁스/필름/SD카드","순간의 아름다운 포착 \n찍어서 바로 출력해 보세요."),
        Contacts("덥즈 할로우니 포카 분철","O:제이콥,학년 \n X:현재,선우,주연,영훈,큐,뉴"),
        Contacts("[사팍]스테니인형","스테니인형 거완")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)
    }
}