package org.example;

import java.util.Iterator;

public class PlannerIterator implements Iterator<Task> {


        private int index = -1;
        private final Planner tasks;

    public PlannerIterator(Planner tasks) {
            this.tasks = tasks;
        }

        public boolean hasNext() {
            return index < tasks.getSize()-1;
        }

        public Task next() {
            return tasks.getTask(++index);
        }

    }
