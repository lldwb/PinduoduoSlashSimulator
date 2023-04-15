package top.lldwb.PinduoduoSlashSimulator.entity;

/**
 * @author 安然的尾巴
 * @version 1.0
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
