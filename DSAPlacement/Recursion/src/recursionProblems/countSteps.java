package recursionProblems;

public class countSteps {

	public static void main(String[] args) {
		int ans = numberOfSteps(14);
		System.out.print(ans);
	}

	public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int num, int steps){
        if(num == 0) return steps;

        if(num%2 == 0) return helper(num/2, ++steps);
        else return helper(num-1, ++steps);
    }
}
