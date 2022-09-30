import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
interface AlertDAO{
    public UUID addAlert(Date time);
    public Date getAlert(UUID id);
}
class AlertService {
    private AlertDAO AlertDAOObject;
    public AlertService(AlertDAO AlertDAOObject){
        this.AlertDAOObject = AlertDAOObject;
    }
    private final MapAlertDAO storage = new MapAlertDAO();

    public UUID raiseAlert() {
        return this.AlertDAOObject.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.AlertDAOObject.getAlert(id);
    }
}

class MapAlertDAO implements AlertDAO{
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}