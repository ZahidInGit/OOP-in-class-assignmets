class Solution{
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int totalSum = 0;
        int temp = x;

        while (temp > 0) {
            totalSum += temp % 10; 
            temp /= 10;        
        }

        
        if (x % totalSum == 0) {
            return totalSum;
        } else {
            return -1;
        }
    }
}
