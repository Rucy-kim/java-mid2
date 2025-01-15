package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitUtil {

    /**
     * 두 유닛을 비교해서 HP가 높은 유닛을 반환
     * 체력이 같은 경우 아무거나 반환
     * 제네릭 메서드 사용, 입력하는 유닛과 반환하는 유닛의 타입이 같아야함
     */
    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        return t1.getHp() >= t2.getHp() ? t1 : t2;
    }
}
