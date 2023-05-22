import java.util.Stack;

    public class Tower {
        private String name;
        private Stack<Disk> disks;

        public Tower(String name) {
            this.name = name;
            this.disks = new Stack<>();
        }

        public String getName() {
            return name;
        }

        public void addDisk(Disk disk) {
            disks.push(disk);
        }

        public Disk removeDisk() {
            return disks.pop();
        }

        public boolean isNotEmpty() {
            return !disks.isEmpty();
        }

        public Disk getTopDisk() {
            return disks.peek();
        }

}
