package all;

public class Problem2Example {

	public static void main(String[] args) {
		Problem2StructForFastAddAndMinElement<Integer> myList = new Problem2StructForFastAddAndMinElement<Integer>(44);
        myList.add(123);
        myList.add(123);
        myList.add(1);
        myList.add(2);
        System.out.println(myList.getMinElement());

        Problem2StructForFastAddAndMinElement<Float> myList2 = new Problem2StructForFastAddAndMinElement<Float>(1.3f);
        myList2.add(1.5f);
        myList2.add(1f);
        myList2.add(0.7f);
        System.out.println(myList2.getMinElement());
	}

}
