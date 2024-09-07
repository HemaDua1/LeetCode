/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
 let p=init;
 return{
    increment(){return ++p;},
    decrement(){return --p;},
    reset(){return (p=init);}
 }   
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */