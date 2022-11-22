package BlockSearch;

public class test2 {
    public static void main(String[] args) {
        //分块查找
        //核心思想:块内无序,块间有序
        //步骤:创建数组blockArr存放每一个块的对象信息
        //先查找blockArr属于哪一个块
        //再单独遍历这一块数据即可

        //分块
        int[] arr = {27,22,30,40,36,
                13,19,16,20,
                7,10,
                43,50,48};
        //创建三个块的对象
        Block2 b1 = new Block2(40,22,0,4);
        Block2 b2 = new Block2(20,13,5,8);
        Block2 b3 = new Block2(10,7,9,10);
        Block2 b4 = new Block2(50,43,11,13);

        //定义数组记录对象
        Block2[] block2s = {b1, b2, b3,b4};

        //创建变量记录需要查找的值
        int number = 19;

        //调用方法返回索引
        int index = getIndex(arr, block2s, number);

        //打印
        System.out.println(index);
    }

    private static int getIndex(int[] arr, Block2[] block2s, int number) {
        //查找在哪一块中
        int blockIndex = getBlockIndex(block2s, number);

        if (blockIndex == -1){
            return -1;
        }
        //记录对象
        Block2 block2 = block2s[blockIndex];

        //找到起始索引和结束索引
        int startIndex = block2.getStartIndex();
        int endIndex = block2.getEndIndex();

        //遍历查找
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        //若代码运行到这说明number不在数组中
        return -1;

    }

    private static int getBlockIndex(Block2[] block2s, int number) {
        for (int i = 0; i < block2s.length; i++) {
            if (number < block2s[i].getMax() && number > block2s[i].getMin()){
                return i;
            }
        }
        return -1;
    }
}

class Block2 {
    private int max;
    private int min;

    public Block2(int max, int min, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    private int startIndex;
    private int endIndex;

    public Block2() {
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
