[![Build Status](https://travis-ci.org/yurydoronin/braces.svg?branch=master)](https://travis-ci.org/yurydoronin/braces)
[![codecov](https://codecov.io/gh/yurydoronin/braces/branch/master/graph/badge.svg)](https://codecov.io/gh/yurydoronin/braces)
# Мини тестовое задание компании YADRO

**YADRO (ООО КНС ГРУПП) – продуктовая IT-компания, разрабатывающая и производящая собственные продукты - серверы VESNIN и семейство СХД TATLIN.**

Проверить валидность расстановки скобок в выражении.

Скобки могут быть всех трех видов - ()[]{}.

На вход программа или функция должна принимать строку, а на выходе ответить правильно ли расставлены скобочки в ней.

Те есть открывающиеся скобочки корректно закрываются скобочкой того же вида.

Например:

  - "([])" - true
  
  - "{[(]}"- false
  - "()[()]{()()[]}" - true
  - "[(]{})"- false