if [ $# -ne 1 ]
then
    echo "Usage: ./build.sh [FileName]"
    echo "e.g., ./run.sh Parity.java"
    exit
fi

javac -encoding utf-8 -cp junit-platform-console-standalone-1.9.0.jar $1
