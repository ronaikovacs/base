package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.time.LocalDateTime;
 
public class Tachograph implements hu.bme.mit.train.interfaces.Tachograph {

    Table<LocalDateTime, Integer, Integer> database = HashBasedTable.create();

    @Override
    public void add(int JSPos, int Speed) {
        database.put(LocalDateTime.now(), JSPos, Speed);
    }

}