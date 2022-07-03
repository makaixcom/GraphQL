# 001-Hello World 

## 测试数据
测试后台：http://localhost:5001/graphiql
### 通过ID查找对象，只获取ID属性
```text
// 查询hello
query{
  hello
}

// 查询hello name
query{
  helloWithName(name: "makai")
}
// 查询UserById
query {
  userById(id: 1){
    id
    name
  }
}
// 查询一个集合
query {
  users{
    id
    name
  }
}

// 新方式查询集合
query {
  users1{
    id
    name
  }
}
```