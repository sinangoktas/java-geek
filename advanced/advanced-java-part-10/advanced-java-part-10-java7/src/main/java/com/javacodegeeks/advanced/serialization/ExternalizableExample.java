package com.javacodegeeks.advanced.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableExample implements Externalizable {
    private String str;
    private int number;
    private SerializableExample obj;
    
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public SerializableExample getObj() {
        return obj;
    }

    public void setObj(SerializableExample obj) {
        this.obj = obj;
    }
    
    @Override
    public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException {
        setStr(in.readUTF());
        setNumber(in.readInt());
        setObj(( SerializableExample )in.readObject());
    }
    
    @Override
    public void writeExternal(final ObjectOutput out) throws IOException {
        out.writeUTF(getStr());
        out.writeInt(getNumber());
        out.writeObject(getObj());
    }
}
