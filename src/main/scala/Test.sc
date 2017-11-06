import scala.io.Source
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

/*
val binaryNums = Source.fromFile("/home/roksolana/Documents/DataRoot/task2.txt").getLines.map(BigInt(_)).toList
val sumOfBins = binaryNums.sum.toString
println(sumOfBins.count(_ == '0') - sumOfBins.count(_ == '1'))

println("Zeroes occurrence " + sumOfBins.count(_ == '0'))
println("Ones occurrence " + sumOfBins.count(_ == '1'))
*/

val s1 = "10001011101010101010000111110111011110101010101101110101010101010010000010110100101010101011011010100101011010101010101010101010101110101011000101101011110101010101010101010001010101010101101010101010101010101010101010111000001010101111010100111010101001011101010111111111101010101111111101010111110101001010101111110111101011010111111101011110101111111111111101111111111010101111101010101001111101010101010100100101010111101001010101001010101001010111110101010101010101011110101010010101001111101010100101111101010101001111111111101010111111111101001010111111110110101001111101010101111111010110100011111111111010101101011111110101010101110101010101010001110111101010101010101010101000001010110111111010101010010101011110101010000001010101000000000000101001111100000000000010010101010000001"
val s2 = "11100101000010101000001010010000010101011000110000110101000001010100000010000000010101100000110100100010111111111111111010010001010000001000000100000101011110101000000001010100000001010100101010111001010100000000000010101010101101010010101010101111001010000000000000001010010100111000010000000010100001010101000000110000001010101000000000000101001111100000000000010010101010000001"
def binSum(x: String, y: String): BigInt = BigInt(x,2)  + BigInt(y,2)

val binsSum = binSum(s1, s2).toString(2)
(s"#2 - ${binsSum.count(_ == '1') - binsSum.count(_ == '0')}")

// #3

// your code goes here
def isPalindrome(someNumber: String): Boolean =
  someNumber.reverse.mkString == someNumber

def findPalindromes(n: Int) =
  Stream.from(1).filter(x => isPalindrome(Integer.toBinaryString(x))).take(n)

println(s"#3 - ${findPalindromes(73).sum}")

// #4

// your code goes here
val arr = Array(-1, -1, -2, -2, 1, -5, 1, 0, 1, 14, -8, 4, 5, -11, 13, 5, 7,
                -10, -4, 3, -6, 8, 6, 2, -9, -1, -4, 0)
val size =  arr.combinations(3).filter(_.sum == 0).size
println(s"#4 - ${size}")

// #5

// your code goes here
val lines = Source.fromFile("/home/roksolana/Documents/DataRoot/task5.txt").getLines.map(BigInt(_)).toList
val answer5 = lines.sum.toString().take(10)
println(s"#5 - ${answer5}")

