/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomeClass;

/**
 *
 * @author sorokindv
 */
 public class Test {
                    public static void main(String[] args) {
                        Test t = new Test();
                        t.test();
                    }
                    void test() {
                        Test:{
                            test:
                            for (int i = 0; true; i++) {
                                if (i % 2 == 0) continue test;
                                if (i > 10) break test;
                                System.out.print(i);
                            }
                        }
                    }
                }