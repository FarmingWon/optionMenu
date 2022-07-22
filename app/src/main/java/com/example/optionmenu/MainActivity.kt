package com.example.optionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        XML로 메뉴를 구성
//        menuInflater.inflate(R.menu.main_menu, menu)
//      menu?.add(Group, Menu_ID, Menu의 순서, title )
        menu?.add(Menu.NONE, Menu.FIRST, Menu.NONE, "코드 메뉴 1")
        val sub = menu?.addSubMenu("코드 메뉴 2")
        sub?.add(Menu.NONE, Menu.FIRST+10, Menu.NONE, "코드 메뉴 2-1")
        sub?.add(Menu.NONE, Menu.FIRST+20, Menu.NONE, "코드 메뉴 2-2")
        menu?.add(Menu.NONE, Menu.FIRST+2, Menu.NONE, "코드 메뉴 3")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //Menu의 id별로 분기한다. ,xml로 구성
//        when(item.itemId){
//            R.id.item1->{
//                textView.text = "Menu1 Clicked"
//            }
//            R.id.item2_1->{
//                textView.text = "Menu2_1 Clicked"
//            }
//            R.id.item2_2->{
//                textView.text = "Menu2-2 Clicked"
//            }
//            R.id.item3->{
//                textView.text = "Menu3 Clicked"
//            }
//        }

        when(item.itemId){
            Menu.FIRST -> {
                textView.text = "Code Menu 1 Clicked"
            }
            Menu.FIRST + 1 -> {
                textView.text = "Code Menu 2 Clicked"
            }
            Menu.FIRST + 2-> {
                textView.text = "Code Menu 3 Clicked"
            }
            Menu.FIRST + 10 -> {
                textView.text = "Code Menu 2-1 Clicked"
            }
            Menu.FIRST + 20 -> {
                textView.text = "Code Menu 2-2 Clicked"
            }
        }

        return super.onOptionsItemSelected(item)
    }
}