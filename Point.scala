package Tutorial07
case class Point(var a:Int, var b:Int){
  def +(r:Point) = new Point(this.a + r.a, this.b + r.b)
  def move(a:Int, b:Int):Unit={
      this.a = this.a + a
      this.b = this.b + b
  }

  def dist(r:Point):Double = {
    var x:Int = this.a-r.a
    var y:Int = this.b-r.b
    var z : Int = x*x - y*y

    return scala.math.sqrt(z)
  }

  def invert():Unit = {
    var tmp = this.a
    this.a = this.b
    this.b = tmp
  }
}
object demo extends App{
   var c = Point(1,2)
   var d = Point(3,2)
   var g = c.dist(d)
   println(c)
   c.move(2,5)
   println(c)
   println(c+d)
   println(g)
   d.invert()
   println(d)
}
