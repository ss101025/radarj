package org.radarlab.core;


import com.radar.core.fields.Field;

public class Limits extends STArray{
    public void add(Entry val){
        STObject st = new STObject();
        st.put(Field.Entry,val);
        super.add(st);
    }
}
