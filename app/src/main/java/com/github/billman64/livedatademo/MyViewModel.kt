package com.github.billman64.livedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MyViewModel:ViewModel(){
    private var num: MutableLiveData<Int> = MutableLiveData(2)   // 0?

    companion object

    public fun getNum(): MutableLiveData<Int>{
        return this.num
    }

    public fun addNum(n:Int){
        this.num.value = this.num.value!! + n
    }


}