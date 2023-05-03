package top.lldwb.PinduoduoSlashSimulator.entity;

/**
 * Prize实体类，代表一个奖品
 * id: 奖品ID
 * name: 奖品名称
 * grouping: 奖品分组，用于区分不同的奖品类型
 */
public class Prize {
    private int id;
    private String name;
    private int grouping;

    @Override
    public String toString() {
        return "Prize{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grouping=" + grouping +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrouping() {
        return grouping;
    }

    public void setGrouping(int grouping) {
        this.grouping = grouping;
    }
}
