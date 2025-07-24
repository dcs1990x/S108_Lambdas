package Level_1.Exercise_2;

import java.util.List;

@FunctionalInterface
public interface ListPrinter<T> {

    void printList(List<T> list);
}
