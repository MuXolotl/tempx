package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lُؔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2931l {
    public final int admob;
    public final List amazon;
    public final int billing;
    public final C4766l crashlytics;
    public final C9696l[] loadAd;
    public final int mopub;
    public final boolean purchase;
    public final int yandex;

    public C2931l(int i, C9696l[] c9696lArr, C4766l c4766l, List list, boolean z, int i2) {
        this.yandex = i;
        this.loadAd = c9696lArr;
        this.crashlytics = c4766l;
        this.amazon = list;
        this.purchase = z;
        this.billing = i2;
        int iMax = 0;
        for (C9696l c9696l : c9696lArr) {
            iMax = Math.max(iMax, c9696l.metrica);
        }
        this.mopub = iMax;
        int i3 = iMax + this.billing;
        this.admob = i3 >= 0 ? i3 : 0;
    }

    public final C9696l[] yandex(int i, int i2, int i3) {
        C9696l[] c9696lArr = this.loadAd;
        int length = c9696lArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            C9696l c9696l = c9696lArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((C1398l) this.amazon.get(i5)).yandex;
            int i9 = this.crashlytics.loadAd[i6];
            int i10 = this.yandex;
            boolean z = this.purchase;
            c9696l.amazon(i, i9, i2, i3, z ? i10 : i6, z ? i6 : i10);
            Unit unit = Unit.INSTANCE;
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return c9696lArr;
    }
}
