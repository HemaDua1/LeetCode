/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
   const filarr=[];
   for(let i=0,j=0;i<arr.length;i++){
    if(fn(arr[i],i)){
    filarr[j]=arr[i];
    j++;
    }
   } 
   return filarr;
};