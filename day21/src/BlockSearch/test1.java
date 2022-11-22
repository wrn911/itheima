package BlockSearch;

public class test1 {
    public static void main(String[] args) {
        //分块查找
        //核心思想:块内无序,块间有序
        //步骤:创建数组blockArr存放每一个块的对象信息
        //先查找blockArr属于哪一个块
        //再单独遍历这一块数据即可

        //分块
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        //创建三个块的对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //定义数组记录对象
        Block[] blocks = {b1, b2, b3};

        //创建变量记录需要查找的值
        int number = 32;

        //调用方法返回索引
        int index = getIndex(arr, blocks, number);

        //打印
        System.out.println(index);
    }

    private static int getIndex(int[] arr, Block[] blocks, int number) {
        //查找在哪一块中
        int blockIndex = getBlockIndex(blocks, number);

        if (blockIndex == -1){
            return -1;
        }
        //记录对象
        Block block = blocks[blockIndex];

        //找到起始索引和结束索引
        int startIndex = block.getStartIndex();
        int endIndex = block.getEndIndex();

        //遍历查找
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        //若代码运行到这说明number不在数组中
        return -1;

    }

    private static int getBlockIndex(Block[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if (number < blocks[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
