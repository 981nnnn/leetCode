package com.xb.lightCloud;

import java.util.Stack;

/**
 * @ClassName GetMinByStack
 * @Description 【题目】 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。 【要求】1.pop、push、getMin操作的时间复杂度都是O（1）。2.设计的栈类型可以使用现成的栈结构。
 * @Author xb
 * @Date 2021/8/8 21:29
 * @Version 1.0
 **/
public class GetMinByStack {
  private Stack<Integer> stackData;
  private Stack<Integer> stackMin;

  public static void main(String[] args) {

  }

  public void push(Integer newNum) {
    stackData.push(newNum);
    if (stackMin.isEmpty()) {
      stackMin.push(newNum);
    } else if (this.getMin() >= newNum) {
      stackMin.push(newNum);
    } else {
      throw new RuntimeException();
    }
  }

  public Integer pop() {
    if (stackData.isEmpty()) {
      throw new RuntimeException("this stackData is empty");
    }
    Integer pop = this.stackMin.pop();
    if (pop == this.getMin()) {
      this.stackMin.pop();
    }
    return pop;
  }


  public int getMin() {
    if (stackMin.isEmpty()) {
      throw new RuntimeException("your stack is empty");
    } else {
      return this.stackMin.peek();
    }
  }
}
