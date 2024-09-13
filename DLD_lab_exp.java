import java.util.Random;

class DLD_lab_exp {

    static class LabMates {
        private String name;
        private int workCount = 0;

        public LabMates(String name) {
            this.name = name;
        }

        void increment() {
            this.workCount++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWorkCount() {
            return workCount;
        }

        public void setWorkCount(int workCount) {
            this.workCount = workCount;
        }

        public String toString() {
            return STR."\{name} ";
        }
    }

    public static void main(String[] args) {
        LabMates[] labMates = {new LabMates("Turjo"), new LabMates("Kazi"), new LabMates("Toma"), new LabMates("Jagaran")};
        String[] work_name = {
                "Theory",
                "Devices and Instruments",
                "Circuit Diagram",
                "Experimental Procedure",
                "Experimental Data and Table",
                "Result",
                "Conclusion",
                "Extra"
        };
        int work_count = work_name.length;

        Random random = new Random();

//        System.out.println(STR."\{work_count} \{random.nextInt(work_count)}");

        for (int i = 0; i <= work_count; i++) {
            int randomInt = random.nextInt(labMates.length);
            if (i <= 3) {
                while (true) {
                    if (labMates[randomInt].getWorkCount() == 0) {
                        labMates[randomInt].increment();
                        System.out.println(STR."\{i + 1}. - \{labMates[randomInt].getName()} - \{work_name[i]}");
                        break;
                    }
                    randomInt = random.nextInt(labMates.length);
                }
            } else {
                while (true) {
                    if (labMates[randomInt].getWorkCount() == 1) {
                        labMates[randomInt].increment();
                        System.out.println(STR."\{i + 1}. - \{labMates[randomInt].getName()} - \{work_name[i]}");
                        break;
                    }
                    randomInt = random.nextInt(labMates.length);
                }
            }
        }
    }
}
