public class TreeMultiSet extends MultiSet {

    Tree _tree = new Tree();
    // TODO add a Tree object as a private instance variable for this class.
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        this._tree.insert(item);
    }

    void remove(Integer item) {
        this._tree.delete_item(item);
    }

    boolean contains(Integer item) {
        return this._tree.contains(item);
    }
}
