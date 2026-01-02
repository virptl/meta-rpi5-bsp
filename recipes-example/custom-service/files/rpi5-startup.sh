#!/bin/sh
### BEGIN INIT INFO
# Provides:          rpi5-startup
# Required-Start:    $all
# Required-Stop:     
# Default-Start:     2 3 4 5
# Default-Stop:      0 1 6
# Short-Description: Custom RPi5 Startup Service
### END INIT INFO

case "$1" in
  start)
    echo "Starting RPi5 Custom Service..."
    /usr/bin/rpi5-hello.sh &
    ;;
  stop)
    echo "Stopping RPi5 Custom Service..."
    ;;
  restart)
    $0 stop
    $0 start
    ;;
  *)
    echo "Usage: $0 {start|stop|restart}"
    exit 1
esac

exit 0
