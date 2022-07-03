# 001-Hello World 

## 测试数据
测试后台：http://localhost:5001/graphiql
### 通过ID查找对象，只获取ID属性
```text
query{
  getById (id:1){
    id
    username
  }
}
```

### 通过ID查找对象，获取 id 和 username 属性
```text
query{
  getById (id:1){
    id
    username
  }
}
```

### 获取一个集合,只获取集合的id属性
```text
query{
  findAll{
    id
    username
  }
}
```
### 获取一个集合,获取集合的id和username属性
```text
query{
  findAll{
    id
    username
  }
}
```
