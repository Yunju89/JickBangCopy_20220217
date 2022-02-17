package com.nepplus.jickbangcopy_20220217

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20220217.adapters.RoomAdapter
import com.nepplus.jickbangcopy_20220217.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.room_list_item.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000, "서울시 동대문구", 3, "1번째 방입니다."))
        mRoomList.add(RoomData(19000, "서울시 강서구", 7, "2번째 방입니다."))
        mRoomList.add(RoomData(15000, "서울시 동작구", 4, "3번째 방입니다."))
        mRoomList.add(RoomData(4500, "서울시 마포구", -1, "4번째 방입니다."))
        mRoomList.add(RoomData(7500, "서울시 동대문구", 8, "5번째 방입니다."))
        mRoomList.add(RoomData(29000, "서울시 은평구", 12, "6번째 방입니다."))
        mRoomList.add(RoomData(30000, "서울시 성동구", 5, "7번째 방입니다."))
        mRoomList.add(RoomData(35000, "서울시 동대문구", 0, "8번째 방입니다."))
        mRoomList.add(RoomData(8500, "서울시 성북구", -2, "9번째 방입니다."))
        mRoomList.add(RoomData(12500, "서울시 강남구", 7, "10번째 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList )
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)


        }


    }
}