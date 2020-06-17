package com.example.yayantest1;
import java.util.Scanner;

//一个Java源码(一个java文件)只能定义一个public类型的class，并且class名称和文件名要完全一致
//类名首字母必须大写
public class Helloworld {
//Java入口程序规定的方法必须是静态方法，方法名必须为main，括号内的参数必须是String数组。
    public static void main(String[] args) {

/* 一.变量和数据类型
基本数据类型: 1.整数类型（byte,short,int,long） 2.浮点数（float,double） 3.字符类型(char)  4.布尔类型（boolean）
引用类型： 1.字符串类型 (String) 2.数组
常量：在定义变量时，加上final修饰符 ，这个变量就变成了常量,常量名通常全部大写 :final doubel PI=3.14

        int age=18;
        float pi=3.14f;
        boolean b1=true;
        char a='A'; // 字符类型是引号，只有一个字符
        String name="yayan";
        System.out.println(age);
        System.out.println(pi);
        System.out.println(b1);
        System.out.println(a);
        System.out.println(name);

-数组：一系列相同类型的数据的组合


        int a[]={1,2,3,4};  //定义了一个int 类型的数组，相当于 int[] a={1,2,3,4}
        System.out.println(a[0]); //a[0]=1
        System.out.println(a[3]); //a[3]=4
        System.out.println(a.length);

        String[] s={"yayan","suisui"}; //定义一个string类型的数组
        System.out.println(s[0]);
        System.out.println(s[1]);

*/


/*二.运算:
    1.整数运算 ： 加（+）， 减（-），乘（*），除（/） ，余（%）

    int a2=(100+200)*4/2;
    int y = 9%4;
    System.out.println(a2);
    System.out.println(y);
*/



/*2.布尔运算:布尔类型boolean 只有true和false两个值
布尔运算是关系运算，包括以下几类：
    -比较运算符：> ,>= ,< ,<=,==,!=
    -逻辑运算 ：与（&&）,或(||), 非（！）
    boolean d=5<3; //d=false
    boolean d1= 5!=3; //d1=true
    boolean d2 = d1||d1; //d2=true
    System.out.println(d);
    System.out.println(d1);
    System.out.println(d2);

 */

/*
输入与输出
1.输入

//      创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input your name:");
//        读取一行输入并获取字符串
        String name=scanner.nextLine();
        System.out.print("please input your age:");
//        读取一行输入并获取整数
        int age=scanner.nextInt();
//       printf +  %s,%d 用来格式化字符换和整数
        System.out.printf("name is : %s, age is %d",name,age);

 */


/* 三.流程判断
(1)if
-if(条件){语句；}
-else if(条件){语句；}
-else{语句；}

        int c=5;
        if (c==1){
            System.out.print("c=1");
        }
        else if (c==2){
            System.out.print("c=2");
        }
        else {
            System.out.print("c is not 1&2");
        }

 */
/*
(2)for
-break :退出整个循环
-continue ：退出当前循环，直接进入下个循环

        int j=6;
        for(int i=0;i<10;i++){
            System.out.printf("now is %d %n",i);
            if(i==j){
                System.out.print("find the j");
                break;
            }



        }

*/
//
//        Person su = new Person();
//        su.setName("yayan");
//        System.out.print(su.getName());
//        用构造方法初始化对象:
        Person su=new Person("yayan",25);
        System.out.println(su.getName());
        System.out.println(su.getAge());




    }

}

/*
面向对象
1.创建类

 */
class Person{
//    定义这个类的字段，private是字段修饰，表示外部无法直接访问这个字段；只能通过类的方法来修改和访问；
    private String name;
    private int age;
//    构造方法：构造方法的名称就是类名，没有返回值，也没有void,调用构造方法，必须使用new 操作符
    public Person(String name,int age) {
        this.name=name;
        this.age = age;
    }


//    定义一个外部能访问的方法，并且这个方法的返回值为string类型
//this 指代这个类实例化之后的那个对象
    public String getName() {
        return this.name;
        }
//    定义一个外部能访问的方法，void 表示这个方法的无返回值，但是接受一个string类型的参数，用来修改对象的name这个字段值
    public void setName(String name) {
        this.name=name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }





}
// 2.实例化对象(在main方法中)



