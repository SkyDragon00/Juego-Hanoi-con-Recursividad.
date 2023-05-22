public class HanoiTower {
        private Tower sourceTower;
        private Tower auxiliaryTower;
        private Tower destinationTower;
        private int numberOfMoves;

        public HanoiTower(int numberOfDisks) {
            this.sourceTower = new Tower("Source");
            this.auxiliaryTower = new Tower("Auxiliary");
            this.destinationTower = new Tower("Destination");
            this.numberOfMoves = 0;

            for (int i = numberOfDisks; i > 0; i--) {
                Disk disk = new Disk(i);
                sourceTower.addDisk(disk);
            }
        }

        public void solve() {
            moveDisks(sourceTower, destinationTower, auxiliaryTower, sourceTower.getSize());
        }

        private void moveDisks(Tower source, Tower destination, Tower auxiliary, int disksToMove) {
            if (disksToMove == 1) {
                moveDisk(source, destination);
                numberOfMoves++;
            } else {
                moveDisks(source, auxiliary, destination, disksToMove - 1);
                moveDisk(source, destination);
                numberOfMoves++;
                moveDisks(auxiliary, destination, source, disksToMove - 1);


            }
        }

}
