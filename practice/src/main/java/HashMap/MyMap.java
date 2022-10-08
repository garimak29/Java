package HashMap;

import linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MyMap {

    List<MyEntry> myEntryList ;
    final int SIZE = 757;

    MyMap(){
        if(myEntryList == null)
        myEntryList  = (List<MyEntry>) new LinkedList<>();
    }

    public  int getKey(int key){
        int bucket = key%SIZE;
    //    LinkedList<MyEntry> entries = map[bucket];
    //    if(entries!=null){


     //   }
        return -1;
    }


    public void put(int key, int value){
        int bucket = key%SIZE;
      /*  if(map[bucket]== null){
            map[bucket] = new LinkedList<MyEntry>();
            map[bucket].(new MyEntry(key,value));
        }*/
    }
}

