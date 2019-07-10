package com.zzj.entity;



import lombok.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaEntity implements Serializable {
    private String aaa = "";
    private String bbb = "";
    private int ccc = 666;
    private Integer integer = 90;
    private int intField = 123;
    public void writeOutStream(ObjectOutputStream out){
        try {
            ObjectOutputStream.PutField putField = out.putFields();
            putField.put("aaa",aaa);
            putField.put("bbb",bbb+" encrypt");
            putField.put("ccc",ccc+ 999);
            out.writeFields();
            PaEntity paEntity = new PaEntity();
            out.writeObject(paEntity);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void readInStream(ObjectInputStream in){
        try {
            in.readObject();
            ObjectInputStream.GetField getField = in.readFields();
            aaa = String.valueOf(getField.get("aaa",""));
            bbb = String.valueOf(getField.get("bbb",""));
            ccc = getField.get("ccc",0);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
