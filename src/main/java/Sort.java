public class Sort {
    int[] nums;

    public Sort(int[] nums) {
        this.nums = nums;
    }

    public void InsertSort()//插入排序
    {
        for (int i = 1; i < nums.length; i++) {
            int k = i;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[k] < nums[j]) {
                    Swap(k, j);
                    k--;
                }
            }
        }
    }

    public void SelectionSort()//选择排序
    {
        for (int i = 0; i < nums.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[k])
                    k = j;
            }
            Swap(k, i);
        }
    }

    public void QuickSort(int left, int right)//快速排序
    {
        if (left >= right)
            return;
        int i = left - 1, j = right + 1;
        int x = nums[(i + j) >> 1];
        while (i < j) {
            while (nums[++i] < x) ;
            while (nums[--j] > x) ;
            if (i < j)
                Swap(i, j);
        }
        QuickSort(left, j);
        QuickSort(j + 1, right);
    }

    public void Search(char a, String b) {
        if (b.indexOf(a) != -1)
            System.out.println("index=" + b.indexOf(a));
        else System.out.println("Not Found");
    }

    private void Swap(int i, int j)//两数交换
    {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
