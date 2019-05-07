package regulateur.interfaces;

public interface Calculator {
    float calcTargetSpeed(float speed, float limit);

    float calcAccel(float targetSpeed, float actualSpeed);
}
