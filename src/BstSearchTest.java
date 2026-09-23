import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void containsEmptyTree() {
        BinaryTreeNode<Integer> root = null;

        assertFalse(BstSearch.contains(root, 5));
    }

    @Test
    void containsSingleNodeWhenTargetMatches() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);

        assertTrue(BstSearch.contains(root, 5));
    }
}
