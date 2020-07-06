package main

import (
  "fmt"
  "math"
)

func main() {
  var a float64
  fmt.Scan(&a)
  var a2 = math.Pow(a,2)
  var a3 = math.Pow(a,3)
  var tmp = a + a2 + a3
  ans := int(tmp)
  fmt.Println(ans)
}
