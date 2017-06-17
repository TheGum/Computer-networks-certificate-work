public class Device {
    private int numberDepartment;
    private String firstInterface;
    private String secondInterface;
    private String SubnetAddress;
    private String IpAddress;
    private String SubnetMask;
    private String DefaultGateway;

    void Router(String firstInterface, String secondInterface, String SubnetAddress, String IpAddress, String SubnetMask, String DefaultGateway) {
        this.firstInterface = firstInterface;
        this.secondInterface = secondInterface;
        this.SubnetAddress = SubnetAddress;
        this.IpAddress = IpAddress;
        this.SubnetMask = SubnetMask;
        this.DefaultGateway = DefaultGateway;
    }

    void workspace(String Interface, String SubnetAddress, String IpAddress, String SubnetMask, String DefaultGateway) {
        this.firstInterface = Interface;
        this.SubnetAddress = SubnetAddress;
        this.IpAddress = IpAddress;
        this.SubnetMask = SubnetMask;
        this.DefaultGateway = DefaultGateway;
    }
}
