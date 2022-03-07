package exercise

object ex2:
  
  val negVal: (String => Boolean) => String => Boolean = f => i => !f(i)

  def negDef(f: String => Boolean): String => Boolean = i => !f(i)
