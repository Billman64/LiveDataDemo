package com.github.billman64.livedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class myViewModel:ViewModel(){
    private var num: MutableLiveData<Int> = MutableLiveData()   // 0?

    public fun getNum(): MutableLiveData<Int>{
        return this.num
    }

    public fun addNum(n:Int){
        this.num.value = this.num.value!! + n
    }
}