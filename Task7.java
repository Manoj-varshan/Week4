$repoPath = "C:\path\to\your\project"
$counterFile = "$repoPath\task_counter.txt"

if (!(Test-Path $counterFile)) {
    "1" | Out-File $counterFile
}

$watcher = New-Object System.IO.FileSystemWatcher
$watcher.Path = $repoPath
$watcher.Filter = "*.*"
$watcher.IncludeSubdirectories = $true
$watcher.EnableRaisingEvents = $true

Register-ObjectEvent $watcher Created -Action {

    $repoPath = "C:\Users\deepi\Documents\Placement Training\PSTJ\Func\Week4"
    $counterFile = "$repoPath\task_counter.txt"

    $taskNumber = Get-Content $counterFile
    $message = "task$taskNumber"

    cd $repoPath

    git add .
    git reset git-autopush.ps1
    git commit -m $message
    git push origin main

    $taskNumber = [int]$taskNumber + 1
    $taskNumber | Out-File $counterFile
}

while ($true) { Start-Sleep 1 }