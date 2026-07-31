package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lّۥٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12974l {
    public final int amazon;
    public final int crashlytics;
    public final int loadAd;
    public final List purchase;
    public final int[] yandex;

    public AbstractC12974l(int... iArr) {
        List listM4213const;
        this.yandex = iArr;
        int i = 0;
        Integer numM2405for = AbstractC8669l.m2405for(iArr, 0);
        this.loadAd = numM2405for != null ? numM2405for.intValue() : -1;
        Integer numM2405for2 = AbstractC8669l.m2405for(iArr, 1);
        this.crashlytics = numM2405for2 != null ? numM2405for2.intValue() : -1;
        Integer numM2405for3 = AbstractC8669l.m2405for(iArr, 2);
        this.amazon = numM2405for3 != null ? numM2405for3.intValue() : -1;
        if (iArr.length <= 3) {
            listM4213const = C2580l.f5619l;
        } else {
            if (iArr.length > 1024) {
                C8339l.metrica(AbstractC0653l.adcel(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listM4213const = AbstractC16901l.m4213const(new C1873l(new C10514l(i, iArr), 3, iArr.length));
        }
        this.purchase = listM4213const;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC12974l abstractC12974l = (AbstractC12974l) obj;
        return this.loadAd == abstractC12974l.loadAd && this.crashlytics == abstractC12974l.crashlytics && this.amazon == abstractC12974l.amazon && AbstractC8576l.yandex(this.purchase, abstractC12974l.purchase);
    }

    public final int hashCode() {
        int i = this.loadAd;
        int i2 = (i * 31) + this.crashlytics + i;
        int i3 = (i2 * 31) + this.amazon + i2;
        return this.purchase.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.yandex) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC16901l.m4210case(arrayList, ".", null, null, null, 62);
    }

    public final boolean yandex(int i, int i2, int i3) {
        int i4 = this.loadAd;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.crashlytics;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.amazon >= i3;
    }
}
