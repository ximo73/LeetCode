class JumpGame {

    public boolean sumar(int[] nums, int index, int[] desdeAca){
        //Exploro todos los posibles saltos desde cada indice
        if(index >= nums.length-1) return true;

        if(desdeAca[index] != -1) return desdeAca[index] == 0? false : true;

        for(int i = 1; i <= nums[index]; i++){
            if(sumar(nums, index + i, desdeAca)){
                desdeAca[index] = 1;
                return true;
            }
        }
        desdeAca[index] = 0;
        return false;
    }

    public boolean canJump(int[] nums) {
        int[] desdeAca = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            desdeAca[i] = -1;
        }

        return sumar(nums, 0, desdeAca);
    }
    public static void main(String args[]){  
        JumpGame jg = new JumpGame();
        int[] nums = {1,1,0};
        System.out.println(jg.canJump(nums));
    }
}
