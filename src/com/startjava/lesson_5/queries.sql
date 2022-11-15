SELECT * FROM jaegers;                                                           \выведите всю таблицу
SELECT * FROM jaegers WHERE origin = 'Destroyed';                                \отобразите только уничтоженных роботов
SELECT * FROM jaegers WHERE mark IN ('Mark - 2', 'Mark - 4');                    \отобразите роботов нескольких серий: Mark-1 и Mark-4
SELECT * FROM jaegers WHERE mark NOT IN ('Mark - 2', 'Mark - 4');                \отобразите всех роботов, кроме Mark-1 и Mark-4
SELECT modelName FROM jaegers ORDER BY mark;                                     \отсортируйте таблицу по убыванию по столбцу mark
SELECT modelName FROM jaegers WHERE height >= '80';                              \отобразите информацию о самом старом(высоком) роботе
SELECT MAX(kaijuKill) FROM jaegers;                                              \отобразите роботов, которые уничтожили больше всех kaiju
SELECT AVG(weight) FROM jaegers;                                                 \отобразите средний вес роботов
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Not destroyed';     \увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
DELETE modelName FROM jaegers WHERE status = 'Destroyeded';                      \удалите уничтоженных роботов
