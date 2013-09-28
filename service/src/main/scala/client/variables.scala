package client

import java.nio.{IntBuffer, FloatBuffer, ByteBuffer}

object Speed {
  //val bb: ByteBuffer = ByteBuffer.allocate(4)
  //val fb: FloatBuffer bb.asFloatbu
  //val ib: IntBuffer
  var value: Float = 0.1F
}

object Sequence {
  var value = 0
  def nextValue() = {
    value += 1
    println(value)
    value
  }
  def reset {
    value = 0
  }
}
