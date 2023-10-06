/*
What is a BST?

Binary Tree
    a. Left Subtree Nodes < Root
    b. Right Subtree Nodes > Root
    c. Left & Right Subtrees are also BST with no duplicates

        4
       / \
      /   \
     2     5
    / \     \
   1   3     6

Special Property :- Inorder traversal always gives sorted sequence.

To Remember: BST makes search efficient
 */

 /*
  BST Search :- TC = O(H), H--> Height

        4
       / \
      /   \
     2     5
    / \     \
   1   3     6


   if(key>data){
    go right;
   }

   if(key<data){
    go left;
   }

  */

/*
Strategy
Most problems will be solved using recursion i.e. by dividing into subproblems & making recursive calls on subtrees.
 */