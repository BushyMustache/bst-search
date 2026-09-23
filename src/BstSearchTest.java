import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void containsEmptyTree() {
        BinaryTreeNode<Integer> root = null;

        assertFalse(BstSearch.contains(root, 5));
    }
}
