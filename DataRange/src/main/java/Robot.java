package main.java;


    public class Robot {
        int x=0;
        int y=0;
        Direction direction = Direction.UP;

        public Robot(int i, int i1, Direction direction) {
        }

        public static void moveByX(Robot robot, int amount, boolean isMore) {
            if (isMore) {
                robot.turnRight();
                for (int i = 0; i < amount; i++) {
                    robot.stepForward();
                }
                robot.turnLeft();
            } else {
                robot.turnLeft();
                for (int i = 0; i < amount; i++) {
                    robot.stepForward();
                }
                robot.turnRight();
            }
        }


        public static void moveByY(Robot robot, int amount, boolean isMore) {
            if (isMore) {
                for (int i = 0; i < amount; i++) {
                    robot.stepForward();
                }
                robot.turnRight();
                robot.turnRight();
            } else {
                robot.turnRight();
                robot.turnRight();
                for (int i = 0; i < amount; i++) {
                    robot.stepForward();
                }
                robot.turnRight();
                robot.turnRight();
            }
        }

        public static void moveRobot(Robot robot, int toX, int toY) {
            int amountOfStepX = toX - robot.getX();
            int amountOfStepY = toY - robot.getY();

            while(robot.getDirection() != Direction.UP){
                robot.turnRight();
            }

            if (amountOfStepX > 0) {
                moveByX(robot, amountOfStepX, true);
            } else {
                moveByX(robot, -amountOfStepX, false);
            }

            if (amountOfStepY > 0) {
                moveByY(robot, amountOfStepY, true);
            } else {
                moveByY(robot, -amountOfStepY, false);
            }
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            System.out.println("Поворот против часовой стрелки");
            if (direction == Direction.DOWN){
                this.direction = Direction.RIGHT;
                return;
            }

            if (direction == Direction.UP){
                this.direction = Direction.LEFT;
                return;
            }

            if (direction == Direction.LEFT){
                this.direction = Direction.DOWN;
                return;
            }

            if (direction == Direction.RIGHT){
                this.direction = Direction.UP;
                return;
            }
        }

        public void turnRight() {
            System.out.println("поворот по часовой стрелке");
            if (this.direction == Direction.DOWN){
                System.out.println("Вниз -> влево");
                this.direction = Direction.LEFT;
                return;
            }

            if (this.direction == Direction.UP){
                System.out.println("Вверх -> вправо");
                this.direction = Direction.RIGHT;
                return;
            }

            if (this.direction == Direction.LEFT){
                System.out.println("Влево -> вверх");
                this.direction = Direction.UP;
                return;
            }

            if (this.direction == Direction.RIGHT){
                System.out.println("Вправо -> вниз");
                this.direction = Direction.DOWN;
                return;
            }
        }

        public void stepForward() {
            System.out.println("движение");
            if (direction == Direction.DOWN){
                System.out.println("вниз");
                this.y--;
            }

            if (direction == Direction.UP){
                System.out.println("вверх");
                this.y++;
            }

            if (direction == Direction.LEFT){
                System.out.println("налево");
                this.x--;
            }

            if (direction == Direction.RIGHT){
                System.out.println("направо");
                this.x++;
            }
        }


        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }

    }

