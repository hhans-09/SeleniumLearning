package LeetCode;

public class GasStation_134 {

	
	public static void main(String args[]) {
		int[] gas = {3,1,1};
		int[] cost = {1,2,2};
		
		System.out.println("starting index : "+ canCompleteCircuit(gas,cost));
		
	}
	
	
	    public static int canCompleteCircuit(int[] gas, int[] cost) {

	        int sumGas = 0;
	        int sumCost = 0;

	        for(int num : gas){
	            sumGas += num;
	        }

	        for(int num : cost){
	            sumCost += num;
	        }

	        if(sumGas < sumCost){
	            return -1;
	        }

	        int amount = 0;
	        int start = 0;

	        for(int i = 0; i <gas.length; i++){
	            amount += gas[i] - cost[i];
	            System.out.println(amount);
	            if(amount <0){
	                amount = 0;
	                start = i+1;
	            }
	        }
	        
	        return start;

	    }
	}
