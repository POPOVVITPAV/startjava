SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE origin = 'Destroyed';
SELECT * FROM jaegers WHERE mark = 'Mark - 2' AND mark = 'Mark - 5'
SELECT modelName FROM jaegers ORDER BY mark;
SELECT modelName FROM jaegers WHERE height >= '80';
SELECT MAX(kaijuKill) FROM jaegers;
SELECT AVG(weight) FROM jaegers;
DELETE modelName FROM jaegers WHERE status = 'Destroyeded';