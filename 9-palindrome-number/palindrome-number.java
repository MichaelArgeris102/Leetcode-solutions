class Solution {
    public boolean isPalindrome(int x) {
    
    if (x<0){
            return false;
        }

    int count = 0;
    int temp = x;
    // when dividing integeres you get an integer result
    // ex 5/10 = 0 and NOT 0.5 so we can divide till 0
    // and get the length in count
    while(temp != 0){
        temp = temp/10;
        count++;
    }
    //stored length in count so we can put that into an array and interate through it 
    int [] palin = new int[count];
    for (int i=0; i<palin.length; i++){
        palin[i] = x % 10;
        x = x/10;
    }
    //loop to compare first half with backhalf
    //count -1 always gives us the last position of the array length, its an int but we stored its length in count so when we do count-1 were accessing that last count value and i is what iteratres through it so were always targetting last value and iterating with I
//NO NEED TO ITERATE ENTIRE ARRAY SINCE WE CHECK IT ALL ONCE REACHING THE MIDDLE SO DIVIDE ARRAY BY 2
    int first_half = 0;
    int second_half = 0;
    for (int i=0; i<palin.length/2; i++ ){
        
        if(palin[i] != palin[count-1-i]){
            return false; 
        }
       
        
    }
    return true;

    }
}