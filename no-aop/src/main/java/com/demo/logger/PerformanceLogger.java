package com.demo.logger;

public class PerformanceLogger {


    public PerformanceInfo begin(String name){
        return  new PerformanceInfo(name,System.currentTimeMillis());
    }

    public void end(PerformanceInfo info){
        long startTime= info.getTime();
        long endTime=System.currentTimeMillis();

    }

    public static class PerformanceInfo{
        String name;
        long time;

        public PerformanceInfo(String name, long time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }
    }
}
