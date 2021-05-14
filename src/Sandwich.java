public class Sandwich {
    // 一回サンドイッチを作ったらハムやレタスの量を変えないのでfinal
    private final int ham;
    private final int lettuce;

    public Sandwich(int ham, int lettuce) {
        this.ham = ham;
        this.lettuce = lettuce;
    }

    @Override
    public String toString() {
        // 三項演算子の良い使い方
        String size = ham + lettuce < 100 ? "Regular" : "Large";
        String vegi = ham < lettuce ? "Vegi" : "Ham";

        // String.formatを使うと""とか+を多用しなくていい
        return String.format("%s-%s-Sand", size, vegi);
    }
}
