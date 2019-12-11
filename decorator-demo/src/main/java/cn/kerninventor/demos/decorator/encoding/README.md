# 装饰者模式处理乱码示例
### 1. 配置servlet (/some path) 接收表单数据
在表单编码和服务器编码不一致时，将出现数据乱码的问题。
### 2. 配置Filter 过滤所有请求，(/*), 处理servletRequest中的参数
通过配置专门解决乱码的装饰者（需要与被装饰者继承同样的接口）
以解决乱码问题。
### 3. 运行结果
处理乱码 getParameter \
于谦 \
处理乱码 getParameterValues \
抽烟 \
喝酒 \
烫头 
### 4. 装饰者模式java实现案例
IO
### 5. 装饰者模式的优缺点
##### 优点
1. 目的在于扩展对象的功能。装饰者模式提供比继承更好的灵活性。装饰是动态的，运行时可以修改的，继承是静态的，编译期就确定好。
2. 通过使用不同的装饰类及对他们的排列组合，可以创造出许多不同行为的组合。
##### 缺点
1. 产生很多的小对象，大量的小对象会占用内存
2. 组合方式很多，很容易出错
### 总结
1. 需要熟悉装饰者的结构
    1. 接口 --> 规范
    2. 实现接口的被装饰者
    3. 实现接口的抽象类 装饰器
    4. 继承装饰器的 具体装饰类。重写实现了接口的装饰器方法。
2. 了解装饰者在何种场景使用
3. 了解装饰者的优缺点