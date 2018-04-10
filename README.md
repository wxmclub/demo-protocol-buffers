# protocol buffers使用示例

* [官方项目源码](https://github.com/google/protobuf)
* [官网文档地址](https://developers.google.com/protocol-buffers/docs)

## 1. 基本数据类型

proto类型 | 备注 | C++    | Java       | Python      | Go
----------|------|--------|------------|-------------|--------
double    |      | double | double     | float       | float64
float     |      | float  | float      | float       | float32
int32     |      | int32  | int        | int         | int32
int64     |      | int64  | long       | int/long    | int64
uint32    |      | uint32 | int        | int/long    | uint32
uint64    |      | uint64 | long       | int/long    | uint64
sint32    |      | int32  | int        | int         | int32
sint64    |      | int64  | long       | int/long    | int64
fixed32   |      | uint32 | int        | int/long    | uint32
fixed64   |      | uint64 | long       | int/long    | uint64
sfixed32  |      | int32  | int        | int         | int32
sfixed64  |      | int64  | long       | int/long    | int64
bool      |      | bool   | boolean    | bool        | bool
string    |      | string | String     | str/unicode | string
bytes     |      | string | ByteString | str         | []byte
