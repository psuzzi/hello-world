@echo off
@echo.
@echo. ---------------------------------
rem check 32 or 64 bit, the correct way according http://support.microsoft.com/kb/556009
reg Query "HKLM\Hardware\Description\System\CentralProcessor\0" | find /i "x86" > NUL && set OS_TYPE=32BIT || set OS_TYPE=64BIT
@echo. - Check OS type : %OS_TYPE%
set PROG_32=%programfiles%
if %OS_TYPE%==64BIT set PROG_32=%programfiles(x86)%
@echo. - 32 bit programs folder: %PROG_32%
@echo. ---------------------------------
