package StructuralPatterns.FacadePattern.Example2;

public class ComputerFacade {
    private CPU cpu;
    private Memory ram;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory ram, HardDrive hardDrive) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public void start(){
        cpu.freeze();
        ram.load(132,hardDrive.read(2345,89));
        cpu.jump(132);
        cpu.execute();
    }
}
