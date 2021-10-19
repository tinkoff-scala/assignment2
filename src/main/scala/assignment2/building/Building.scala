package assignment2.building

/** Building should have:
  *   - string address
  *   - floors (link to first floor) Floor can be either residential floor or attic Each residential floor has two
  *     persons living on it and ladder to next floor (just a link) Attic has no person living in it Each person has age
  *     and sex (male/female)
  */
trait Building // rewrite me
trait Floor // rewrite me
trait Attic // rewrite me
trait ResidentialFloor // rewrite me

object Building {

  /** Traverse building bottom to top applying function [[f]] on each residential floor with the initial accumulator
    * [[acc0]]
    */
  def protoFold[T](building: Building, acc0: T)(f: (T, ResidentialFloor) => T): T = ???

  /** Count number of floors where there is at least one man older than [[olderThan]] NOTE: use [[protoFold]]
    */
  def countOldManFloors(building: Building, olderThan: Int): Int = ???

  /** Find age of the oldest woman NOTE: use [[protoFold]]
    */
  def womenMaxAge(building: Building): Option[Int] = ???

}
