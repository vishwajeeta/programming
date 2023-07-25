// SPDX-License-Identifier: MIT
pragma solidity 0.8.0;
contract looping {
    //create an array of numbers
    uint256[] public numbers;
    constructor (uint256[] memory _numbers) public {
        numbers=_numbers;
        
    }
    function sumWithWhileLoop( ) public view returns(uint256){
        uint256 sum=0;
        uint256 i=0;
        while(i<numbers.length){
            sum +=numbers[i];
            i++;
        }
        return sum;
    }
    
}