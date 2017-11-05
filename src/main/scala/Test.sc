import scala.util.Try
// #1

// your code goes here
val alphaU='A' to 'Z'

def encrypt(shift: Int, str: String): String = {
  val newShift = shift % 26
  val charArray = str.toUpperCase().toCharArray()
  var message = ""

  for (i <- charArray) {
    if (i.toInt == 32) {
      message += " ";
    } else {
      var temp = (i.toInt - 65 + newShift) % 26
      if (temp < 0) {
        temp += 26
      }
      message += (temp + 65).toChar
    }
  }
  return message
}

def decrypt(shift: Int, str: String): String = {
  return encrypt(shift * - 1, str)
}
var i = 0
var nums = 0 to 20
for (i <- nums){
  println(decrypt(i, "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"))
}
var answer1 = "NOTHING CREATES SUCCESS LIKE NONNSTOPM ENTHUSIASTIC EFFORT"
println(s"#1 - ${answer1}")

// #2

// your code goes here

val x = Integer.parseInt("0101", 2)
val y = Integer.parseInt("1010", 2)

def tryToInt( s: String ) = Try(s.toInt).toOption

val s1 = "10001011101010101010000111110111011110101010101101110101010101010010000010110100101010101011011010100101011010101010101010101010101110101011000101101011110101010101010101010001010101010101101010101010101010101010101010111000001010101111010100111010101001011101010111111111101010101111111101010111110101001010101111110111101011010111111101011110101111111111111101111111111010101111101010101001111101010101010100100101010111101001010101001010101001010111110101010101010101011110101010010101001111101010100101111101010101001111111111101010111111111101001010111111110110101001111101010101111111010110100011111111111010101101011111110101010101110101010101010001110111101010101010101010101000001010110111111010101010010101011110101010000001010101000000000000101001111100000000000010010101010000001"
val s2 = "0010001010000001000000100000101011110101000000001010100000001010100101010111001010100000000000010101010101101010010101010101111001010000000000000001010010100111000010000000010100001010101000000110000001010101000000000000101001111100000000000010010101010000001"
def binSum(x: String, y: String): BigDecimal = BigDecimal(x)  + BigDecimal(y)
def toBinary(n: BigDecimal): String = n.toString()
val sumOfBins = binSum(s1, s2)
println("Zeroes occurrence " + toBinary(binSum(s1,s2)).count(_ == '0'))
println("Ones occurrence " + toBinary(binSum(s1,s2)).count(_ == '1'))

println(s"#2 - ${toBinary(sumOfBins).count(_ == '1') - toBinary(sumOfBins).count(_ == '0')}")

// #3

// your code goes here
def isPalindrome(someNumber: String): Boolean = someNumber.reverse.mkString == someNumber


println(s"#3 - ${/*answer #3*/}")

// #4

// your code goes here

println(s"#4 - ${/*answer #4*/}")

// #5

// your code goes here

println(s"#5 - ${/*answer #5*/}")