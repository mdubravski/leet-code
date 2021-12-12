/**
 * 12/12/2021 solution O(n^2)
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
    let val;

    while (nums.length != 0) {
        val = nums.pop();
        for (let n of nums) {
            if (n === val) {
                return true;
            }
        }
    }
    return false;
};

/**
 * 12/12/2021 solution O(n^2)
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate1 = function (nums) {
    let hash = [];
    for (let i of nums) {
        if(!hash.includes(i)){
            hash.push(i)
        }else{
            return true;
        }
    }
    return false
};

/**
 * 12/12/2021 solution O(1)?
 * @param {number[]} nums
 * @return {boolean}
 */
var contacontainsDuplicate2 = function (nums){
    let s = new Set(nums);
    return s.size != nums.length;
}