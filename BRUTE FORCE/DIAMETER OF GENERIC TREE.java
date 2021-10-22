// 1. using array as an ans(because of the heap creation jb array bnata hai,toh value persist karegi recursion calls pop hona ka baad bhi)
//2. /USING BRUTE FORCE i.e USING GLOBAL STATIC METHOD

// why? hmna deepestheight and second deepest height is liya nikali because hme max distance in terms of edges nikalna 
// tha kisi bhi 2 nodes purra generic tree mai.

 public static int getDiameterByReturningHeightOptimized(Node root, int[] MaxDiameter) {

    int deepestHeight = -1, secondDeepestHeight = -1;


    //   hr ek child pa jo ki root ka chilren ka arraylist mai hai , usee deepest height aur second deepest height niklawadi
    for (Node child : root.children) {

      int heightFromChildren = getDiameterByReturningHeightOptimized(child, MaxDiameter);
      if (deepestHeight <= heightFromChildren) {

        secondDeepestHeight = deepestHeight;
        deepestHeight = heightFromChildren;
      } else if ( secondDeepestHeight >= heightFromChildren) {
        secondDeepestHeight = heightFromChildren;
      }

    }

    //loop ka bahar ya jb loop chla hi nhi toh obviously hmarha updated deepestHeight aur secondDeepestHeight hogi

    MaxDiameter[0] = Math.max( MaxDiameter[0], deepestHeight + secondDeepestHeight + 2);


    return 1 + deepestHeight;

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    // write your code here
    int [] maxDiameterArray = new int[1];
    // int maxHeight = getDiameterByReturningHeight(root);
    int maxHeight = getDiameterByReturningHeightOptimized(root, maxDiameterArray);
    int maxDiamterValueOptimized = maxDiameterArray[0];
    System.out.println(maxDiamterValueOptimized);

  }
// 2. second method brute force

static int MaxDiameter = Integer.MIN_VALUE;

  public static int getDiameterByReturningHeight(Node root) {

    int deepestHeight = -1, secondDeepestHeight = -1;


    //   hr ek child pa jo ki root ka chilren ka arraylist mai hai , usee deepest height aur second deepest height niklawadi
    for (Node child : root.children) {

      int heightFromChildren = getDiameterByReturningHeight(child);
      if (deepestHeight <= heightFromChildren) {

        secondDeepestHeight = deepestHeight;
        deepestHeight = heightFromChildren;
      } else if ( secondDeepestHeight >= heightFromChildren) {
        secondDeepestHeight = heightFromChildren;
      }

    }

    //loop ka bahar ya jb loop chla hi nhi toh obviously hmarha updated deepestHeight aur secondDeepestHeight hogi

    MaxDiameter = Math.max( MaxDiameter, deepestHeight + secondDeepestHeight + 2);


    // return 1 + Math.max(secondDeepestHeight, deepestHeight);
    return 1 + deepestHeight;

  }

/

