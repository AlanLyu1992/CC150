public class ThreeStacks {
    Object[] stack;
    ThreeStacks(Integer len1, Integer len2, Integer len3) {
        stack = new Object[9+len1+len2+len3];
        stack[0] = len1;stack[1] = len2;stack[2] = len3;
        stack[3] = 0;stack[4] = 0;stack[5] = 0;
        stack[6] = 9;stack[7] = 9+len1;stack[8] = 9+len1+len2;
    }
    void push(Object data, Integer idx) {
        if(idx <= 0 || idx > 3) return;//throw new Exception();
        if(stack[2+idx] == stack[-1+idx]) {
            return;
            //throw new Exception();
        }else {
            stack[2+idx] = (Integer)stack[2+idx] + 1;
            stack[(Integer)stack[5+idx]] = data;
        }
    }
    Object pop(Integer idx) {
        if(idx <= 0 || idx > 3) return null;//throw new Exception();
        if((Integer)stack[2+idx] == 0) {
            return null;
            //throw new Exception();
        }else {
            stack[2+idx] = (Integer)stack[2+idx] - 1;
            stack[5+idx] = (Integer)stack[5+idx] - 1;
            Object data = stack[(Integer)stack[5+idx]];
            stack[(Integer)stack[5+idx]] = null;
            return data;
        }
    }
}

