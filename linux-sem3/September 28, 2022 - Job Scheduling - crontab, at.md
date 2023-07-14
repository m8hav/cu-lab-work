# JOB SCHEDULING

## crontab ===== periodic task

Syntax: crontab minutes (0-59) hours (0-23) Day_of_month (1-31) Month (1-12) Day_of_week(0-6; 0:Sun, 1:Mon,...) Command

crontab -l  ===== lists all scheduled tasks

root#   crontab -u username -l
        crontab -u username -e

crontab -e ===== opens crontab editor that works like vi

i ===== opens insert

46 08 * * * ls -l > batch1.txt

00 09 * 09 * echo "Hello" > batch12.txt

*/5 * * * * ls > abcd

@reboot echo "Welcome Mr Root" > welcome.txt


crontab -r

crontab -l

cat /etc/passwd

crontab -u sonu -e

## at ===== executed once
