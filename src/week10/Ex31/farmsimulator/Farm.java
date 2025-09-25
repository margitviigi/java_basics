package week10.Ex31.farmsimulator;

import java.util.ArrayList;
import java.util.List;

    public class Farm implements Alive {
        private String owner;
        private Barn barn;
        private List<Cow> cows;

        public Farm(String ownerName, Barn barn) {
            this.owner = ownerName;
            this.barn = barn;
            this.cows = new ArrayList<>();
        }

        public String getOwner() {
            return this.owner;
        }

        public void addCow(Cow cow) {
            this.cows.add(cow);
        }

        public void installMilkingRobot(MilkingRobot robot) {
            this.barn.installMilkingRobot(robot);
        }

        @Override
        public void liveHour() {
            for (Cow cow : cows) {
                cow.liveHour();
            }
        }

        public void manageCows() {
            this.barn.takeCareOf(this.cows);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Farm owner: ").append(this.owner).append("\n");
            sb.append("Barn bulk tank: ").append(this.barn.getBulkTank()).append("\n");

            if (cows.isEmpty()) {
                sb.append("No cows.");
            } else {
                sb.append("Animals:\n");
                for (Cow cow : cows) {
                    sb.append("        ").append(cow).append("\n");
                }
            }

            return sb.toString().trim();
        }
    }

