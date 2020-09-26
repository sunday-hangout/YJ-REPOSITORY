/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let result = true;
    let array = [];
    array = s.split('');
    let remain = [];
    array.forEach(item => {
        if(item === ')' || item === '}' || item === ']') {
            if(remain.length === 0) result = false;
            let last = remain[remain.length - 1];
            switch (item) {
                case ')':
                    if(last !== '(') {
                        result = false;
                    }
                    remain.pop();
                    break;
                case '}':
                    if(last !== '{') {
                        result = false;
                    }
                    remain.pop();
                    break;
                case ']':
                    if(last !== '[') {
                        result = false;
                    }
                    remain.pop();
                    break;    
             }
            remain[remain.length - 1]
        } else {
            remain.push(item)
        }
    })
    if(remain.length !== 0) result = false;
    return result;
};
console.log(isValid('()'))
console.log(isValid('{()}'))
console.log(isValid('{(})'))
console.log(isValid(']'))