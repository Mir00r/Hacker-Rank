Problem Link -> https://www.hackerrank.com/challenges/weather-observation-station-17

// For MySQL

select round(LONG_W, 4) from station where LAT_N = (select min(LAT_N) from station where LAT_N > 38.7780 );
