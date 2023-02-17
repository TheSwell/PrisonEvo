package pw.redline.prisonevo.dto;

public class UserData {
    private int level;
    private int blockCount;
    private int clearBlockCount;

    public UserData(int level, int blockCount, int clearBlockCount) {
        this.level = level;
        this.blockCount = blockCount;
        this.clearBlockCount = clearBlockCount;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    public int getClearBlockCount() {
        return clearBlockCount;
    }

    public void setClearBlockCount(int clearBlockCount) {
        this.clearBlockCount = clearBlockCount;
    }
}
