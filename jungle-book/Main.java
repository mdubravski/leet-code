import java.util.*;
class Main {  

	public static int minGroups(List<Integer> list){
		int maxBranchlength = 1;
		for(int i=0; i<list.size(); i++){
			int cur = i;
			int counter = 1;
			while(list.get(cur) > -1 && list.get(cur) < list.size() && counter < list.size()){
				cur = list.get(cur);
				counter++;
			}
			if(counter > maxBranchlength){
				maxBranchlength = counter;
			}
		}
		return maxBranchlength;
	}

	public static int minGroups1(List<Integer> list){
		int maxBranchlength = 1;
		Hashtable<Integer,Integer> visited = new Hashtable<Integer,Integer>();
		int baseLevel = 1;

		for(int i=0; i< list.size(); i++){
			int cur = i;
			int counter = baseLevel;
			if(visited.contains(list.get(cur))){
				counter = (int)visited.get(list.get(cur));
				if(counter > maxBranchlength){
					maxBranchlength = counter;
				}

				visited.put(i, counter);
				continue;
			}

			while(list.get(cur) > -1){
				counter++;
				cur = list.get(cur);
			}

			visited.put(i, counter);

			if(counter > maxBranchlength){
				maxBranchlength = counter;
			}
		}
		return maxBranchlength;
	}
	
	public static void main(String args[]) { 
		List<Integer> list = new ArrayList<Integer>();
		int[] ints =  {-1, 8, 6, 0, 7, 3, 8, 9, -1, 6, 1};
		for(int i : ints){
			list.add(i);
		}
		
		System.out.println();
	    System.out.println(minGroups(list));
  } 
}