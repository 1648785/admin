```javascript 
//定义一个字符串

let data='{"name":"创梦流浪人"}'

//解析对象​

​JSON.parse(data)

结果是：

​name:"创梦流浪人"

//从一个对象中解析出字符串
JSON.stringify()

var data={name:'创梦流浪人'}

JSON.stringify(data)

//结果是：

'{"name":"创梦流浪人"}'
```