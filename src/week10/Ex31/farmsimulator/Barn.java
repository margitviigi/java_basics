package week10.Ex31.farmsimulator;

import java.util.Collection;

    public class Barn {
        private BulkTank tank;
        private MilkingRobot robot;

        public Barn(BulkTank tank) {
            this.tank = tank;
            this.robot = null;
        }

        public BulkTank getBulkTank() {
            return this.tank;
        }

        public void installMilkingRobot(MilkingRobot milkingRobot) {
            this.robot = milkingRobot;
            this.robot.setBulkTank(this.tank);
        }

        public void takeCareOf(Cow cow) {
            if (this.robot == null) {
                throw new IllegalStateException("Milking robot not installed");
            }
            this.robot.milk(cow);
        }

        public void takeCareOf(Collection<Cow> cows) {
            if (this.robot == null) {
                throw new IllegalStateException("Milking robot not installed");
            }
            for (Cow cow : cows) {
                this.robot.milk(cow);
            }
        }

        @Override
        public String toString() {
            return this.tank.toString();
        }
    }

