# Collections and Inheritance Assignment
## Part 1 - Combinators
Implement all functions in Collections.scala file

## Part 2 - ADT и здание
1. Отразить в ADT следующую предметную область:<br/>
Здание. У здания есть строковый адрес и этажи (ссылка на 1-й этаж).<br/>
Этаж бывает жилым и чердаком.<br/>
У каждого жилого этажа есть 2 постояльца и лестница на следующий этаж (просто ссылка на этаж)<br/>
У чердака нет никаких интересных свойств.<br/>
У постояльца есть возраст и пол (м/ж).<br/>
1. Реализовать функцию `protoFold` аккумулирующую целое число во время обхода здания.<br/>
На каждом этаже аккумулируемое значение пересчитывается с помощью функции `f`, параметрами которой служат текущее значение аккумулятора и этаж<br/>
(Первый параметр, это текущий аккумулятор. Второй, текущий этаж)<br/>
Здание обходить снизу вверх. Аккумулятор изначально равен `acc0`
    ```scala
    def protoFold[T](building: Building, acc0: T)(f: (T, ResidentialFloor) => T): T = ???
    ```
1. Используя функцию `protoFold` посчитать количество этажей, где есть хотя бы один мужчина старше `olderThan` <br/>
(если нет таких, то 0)
    ```scala
    def countOldManFloors(building: Building, olderThan: Int): Int = ???
    ```
1. Используя функцию `protoFold` посчитать максимальный возраст женщины в здании
(если нет женщин, то 0)
    ```scala
    def womanMaxAge(building: Building): Int = ???
    ```

