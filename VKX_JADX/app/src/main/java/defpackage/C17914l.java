package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l٘ٔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17914l {
    public ArrayList amazon;
    public ArrayList crashlytics;
    public C14997l loadAd;
    public HashMap purchase;
    public final C14997l yandex;

    public C17914l(C14997l c14997l) {
        this.yandex = c14997l;
    }

    public final Map amazon() {
        HashMap map = this.purchase;
        if (map != null) {
            return map;
        }
        ArrayList<C14997l> arrayList = new ArrayList(yandex());
        arrayList.add(this.yandex);
        HashMap map2 = new HashMap();
        for (C14997l c14997l : arrayList) {
            int i = c14997l.yandex;
            double dPurchase = AbstractC2533l.purchase((i >> 16) & 255);
            double dPurchase2 = AbstractC2533l.purchase((i >> 8) & 255);
            double dPurchase3 = AbstractC2533l.purchase(i & 255);
            double[][] dArr = AbstractC2533l.yandex;
            double[] dArr2 = dArr[0];
            double d = (dArr2[2] * dPurchase3) + (dArr2[1] * dPurchase2) + (dArr2[0] * dPurchase);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * dPurchase3) + (dArr3[1] * dPurchase2) + (dArr3[0] * dPurchase);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * dPurchase3) + (dArr4[1] * dPurchase2) + (dArr4[0] * dPurchase);
            double[] dArr5 = AbstractC2533l.loadAd;
            double d4 = d / dArr5[0];
            double d5 = d2 / dArr5[1];
            double d6 = d3 / dArr5[2];
            double dAmazon = AbstractC2533l.amazon(d4);
            double dAmazon2 = AbstractC2533l.amazon(d5);
            double[] dArr6 = {(116.0d * dAmazon2) - 16.0d, (dAmazon - dAmazon2) * 500.0d, (dAmazon2 - AbstractC2533l.amazon(d6)) * 200.0d};
            double dAtan2 = (Math.atan2(dArr6[2], dArr6[1]) * 57.29577951308232d) % 360.0d;
            if (dAtan2 < 0.0d) {
                dAtan2 += 360.0d;
            }
            double dPow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d7 = (dAtan2 - 50.0d) % 360.0d;
            if (d7 < 0.0d) {
                d7 += 360.0d;
            }
            map2.put(c14997l, Double.valueOf((Math.cos(d7 * 0.017453292519943295d) * dPow) - 0.5d));
        }
        this.purchase = map2;
        return map2;
    }

    public final double crashlytics(C14997l c14997l) {
        double dDoubleValue = ((Number) ((HashMap) amazon()).get(purchase())).doubleValue() - ((Number) ((HashMap) amazon()).get((C14997l) loadAd().get(0))).doubleValue();
        double dDoubleValue2 = ((Number) ((HashMap) amazon()).get(c14997l)).doubleValue() - ((Number) ((HashMap) amazon()).get((C14997l) loadAd().get(0))).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17914l) && this.yandex.equals(((C17914l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.yandex;
    }

    public final List loadAd() {
        ArrayList arrayList = this.crashlytics;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(yandex());
        arrayList2.add(this.yandex);
        AbstractC3826l.Signature(new C0323l(9, this), arrayList2);
        this.crashlytics = arrayList2;
        return arrayList2;
    }

    public final C14997l purchase() {
        return (C14997l) loadAd().get(loadAd().size() - 1);
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.yandex + ")";
    }

    public final List yandex() {
        ArrayList arrayList = this.amazon;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            C14997l c14997l = this.yandex;
            arrayList2.add(new C14997l(AbstractC6889l.firebase(d, c14997l.crashlytics, c14997l.amazon)));
        }
        ArrayList arrayListIsPro = AbstractC14055l.isPro(Collections.singletonList(arrayList2));
        this.amazon = arrayListIsPro;
        return arrayListIsPro;
    }
}
