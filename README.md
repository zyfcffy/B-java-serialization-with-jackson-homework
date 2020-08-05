# Java Serialization with Jackson Homework Answer

Homework Answer for Java Serialization with Jackson

## Problem1

通过使用Jackson注解或者其他定制化手段

使得`EventController`中的两个接口，能够接收和返回如下格式的JSON：

```json
{
    "id": "1",
    "name": "下载文件",
    "type": "D",
    "time": 1590050488701,
    "userId": "3",
    "userName": "张三"
}
```

其中时间是毫秒为单位的时间戳

## Problem2

要求`PersonController`返回Person时：
- 当age字段为null时，返回0
- 当hobby字段为null时，忽略该字段

即当age和hobby不为null时，正常返回：
```json
{
    "id": "1",
    "age": 18,
    "name": "张三",
    "hobby": "打篮球"
}
```

当age和hobby为null时，返回：
```json
{
    "id": "1",
    "age": 0,
    "name": "张三"
}
```
