@echo off
echo ==============================================
echo   Auto-Push Started for Shikhar Batch (Java)
echo   (Press Ctrl+C to stop this anytime)
echo ==============================================

:loop
echo [%time%] Checking for changes...
git add .
git commit -m "Auto-Update: %date% %time%"
git push origin master

echo.
echo Waiting for 2 minutes...
timeout /t 120 /nobreak > NUL
goto loop
