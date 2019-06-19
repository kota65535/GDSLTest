package dsl

foo { a ->
  // a is recognized as String
  a.substring(0)
}


bar(String) { a ->
  // a is not recognized as String
  a.substring(0)
}
