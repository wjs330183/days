import java.util.ArrayList;
import java.util.List;

public class Pagination {

    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        for (int i = 1; i < 14; i++) {
            List page = getPage(i, 8, list);
            System.out.println(page);
        }
    }


    public static List getPage(int pageNum, int pageSize, List list) {
        List list1 = new ArrayList();
//        int pageNum = pages.getPageNum() - 1;
//        int pageSize = pages.getPageSize();
//        int size = (pageNum + 1) * pageSize - 1 > exerciseDtos.size()?exerciseDtos.size():(pageNum + 1) * pageSize - 1;
//        for (int i = pageNum * pageSize; i < size; i++) {
//            exerciseList.add(exerciseDtos.get(i));
//        }
        int size = pageNum  * pageSize > list.size() ? list.size() : pageNum * pageSize;
        for (int i = (pageNum-1) * pageSize; i < size; i++) {
            list1.add(list.get(i));
        }
        return list1;
    }
}
