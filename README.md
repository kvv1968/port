# port
Создать программу, которая моделирует работу порта
Есть корабли разной вместимости. На корабль может быть загружен один из 3х типов грузов.
Каждый тип груза может быть разгружен на причале для этого типа грузов. (для каждого типа грузов должен быть как минимум один причал)
Разгрузка происходит постепенно (единица груза за определенное время)
Если причал для данного типа грузов занять, корабль остается на рейде.
Рейд имеет ограниченную вместимость.(например 10 кораблей)
Если рейд занят, то порт не принимает корабли вообще.
После разгрузки отчет о разгруженном корабле сохраняется в файл.
Корабли генерируются специальным генератором.
Он создает корабли со случайным грузом и его количеством в пределах от 1 до максимума
Если порт не принимает корабли, генератор должен приостанавливать работу
Генератор должен генерировать определенное количество кораблей
Все изменяемые параметры нужно задавать через файл свойств
