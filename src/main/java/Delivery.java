public class Delivery {

    private float distance;
    private Dimension dimension;
    private boolean isFragile;
    private ServiceLoad load;
    private int deliveryCost;

    public Delivery(float distance, Dimension dimension, boolean isFragile, ServiceLoad load) {
        this.distance = distance;
        this.dimension = dimension;
        this.isFragile = isFragile;
        this.load = load;
        deliveryCost = 0;
    }

    public int getDeliveryCost() {
        return deliveryCost;
    }

    private void setDeliveryCost(int deliveryCost) {
        if (deliveryCost > 0) {
            this.deliveryCost = deliveryCost;
        }
    }

    private void calculateCostOfDelivery() {
        calculateCostByDistance(distance);
        calculateCostByDimension(dimension);
        calculateByFragile(isFragile);
        calculateByServiceLoad(load);
        if (getDeliveryCost() < 400) {
            setDeliveryCost(400);
        }
    }

    private boolean calculateCanDeliveryOrNot(float distance, boolean isFragile) {
        boolean canDelivery = true;
        if (((distance > 30) && isFragile) || (distance <= 0)) {
            canDelivery = false;
        }
        return canDelivery;
    }

    private void calculateCostByDistance(float distance) {
        if (distance > 30) {
            setDeliveryCost(getDeliveryCost() + 300);
        } else if ((distance > 10) && (distance <= 30)) {
            setDeliveryCost(getDeliveryCost() + 200);
        } else if ((distance > 2) && (distance <= 10)) {
            setDeliveryCost(getDeliveryCost() + 100);
        } else {
            setDeliveryCost(getDeliveryCost() + 50);
        }
    }

    private void calculateCostByDimension(Dimension dimension) {
        switch (dimension) {
            case BIG:
                setDeliveryCost(getDeliveryCost() + 200);
                break;
            case SMALL:
                setDeliveryCost(getDeliveryCost() + 100);
                break;
        }
    }

    private void calculateByFragile(boolean isFragile) {
        if (isFragile) {
            setDeliveryCost(getDeliveryCost() + 300);
        }
    }

    private void calculateByServiceLoad(ServiceLoad load) {
        switch (load) {
            case CRITICAL:
                setDeliveryCost(getDeliveryCost() * 16 / 10);
                break;
            case HIGHEST:
                setDeliveryCost(getDeliveryCost() * 14 / 10);
                break;
            case HIGH:
                setDeliveryCost(getDeliveryCost() * 12 / 10);
                break;
            case DEFAULT:
                setDeliveryCost(getDeliveryCost());
                break;
        }
    }

    public String getCost() {
        if (calculateCanDeliveryOrNot(distance, isFragile)) {
            calculateCostOfDelivery();
            return String.format("Стоимость доставки %d руб.", getDeliveryCost());
        } else {
            return "Товар не может быть доставлен";
        }
    }

}
