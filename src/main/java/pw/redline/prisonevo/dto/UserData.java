package pw.redline.prisonevo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public class UserData {

    @Getter
    @Setter
    private int level;


    @Getter
    @Setter
    private int blockCount;

    @Getter
    @Setter
    private int clearBlockCount;

    public UserData(int level, int blockCount, int clearBlockCount) {
        this.level = level;
        this.blockCount = blockCount;
        this.clearBlockCount = clearBlockCount;
    }


}
