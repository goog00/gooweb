package com.gooweb.jdk8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author steng
 * @description
 * @date 2020-10-29 11:31
 **/
public class StreamTest {

    private enum Status{
        OPEN,CLOSED
    }

    private static final class Task{

        private final Status status;

        private final Integer points;

        Task(final Status status, final Integer points){
            this.status = status;

            this.points = points;
        }

        public Status getStatus() {
            return status;
        }

        public Integer getPoints() {
            return points;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "status=" + status +
                    ", points=" + points +
                    '}';
        }
    }

    public void totalTest(){

        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );

        final long totalPointOfOpenTasks = tasks
                .stream()
                .filter(task -> task.getStatus() == Status.OPEN)
                .mapToInt(Task::getPoints)
                .sum();
        System.out.println(totalPointOfOpenTasks);
    }

    public void parallelTest(){
        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );
        final double totalPoints = tasks
                .stream()
                .parallel()
                .map(Task::getPoints)
                .reduce(0,Integer::sum);
        System.out.println(totalPoints);
    }

    public void groupByTest() {
        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );
        Map<Status, List<Task>> map =  tasks
                .stream()
                .collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(map);

    }


    public void percentTest() {
        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );

        double totalPoint = tasks
                .stream()
                .parallel()
                .map(task -> task.getPoints())
                .reduce(0,Integer::sum);

        Collection<String> result = tasks
                .stream()
                .mapToInt(Task::getPoints)
                .asLongStream()
                .mapToDouble(points->points / totalPoint)
                .boxed()
                .mapToLong(weight-> (long)(weight * 10))
                .mapToObj(percentage->percentage + "%")
                .collect(Collectors.toList());
        System.out.println(result);


    }

    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        streamTest.totalTest();
        streamTest.parallelTest();
        streamTest.groupByTest();
        streamTest.percentTest();

    }

}
