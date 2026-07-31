package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lٍ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9627l implements InterfaceC5068l {
    public final AbstractC2523l yandex = AbstractC13318l.yandex;
    public final Integer loadAd = 4;
    public final Integer crashlytics = null;
    public final Integer amazon = 4;
    public final int purchase = 2;

    @Override // defpackage.InterfaceC5068l
    public final AbstractC2523l crashlytics() {
        return this.yandex;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9627l) {
            return this.purchase == ((C9627l) obj).purchase;
        }
        return false;
    }

    public final int hashCode() {
        return (AbstractC5020l.inmobi(this.purchase) * 31) + 1237;
    }

    @Override // defpackage.InterfaceC5068l
    public final C14329l loadAd() {
        AbstractC2523l abstractC2523l = this.yandex;
        C1243l c1243lYandex = abstractC2523l.yandex();
        String strCrashlytics = abstractC2523l.crashlytics();
        Integer num = this.loadAd;
        Integer num2 = this.crashlytics;
        ArrayList arrayListMetrica = AbstractC14055l.metrica(AbstractC11308l.loadAd(num, null, num2, c1243lYandex, strCrashlytics, true));
        Integer num3 = this.amazon;
        C2580l c2580l = C2580l.f5619l;
        if (num3 != null) {
            arrayListMetrica.add(AbstractC11308l.loadAd(num, num3, num2, c1243lYandex, strCrashlytics, false));
            arrayListMetrica.add(new C14329l(AbstractC14055l.remoteconfig(new C15699l("+"), new C6994l(Collections.singletonList(new C6040l(Integer.valueOf(num3.intValue() + 1), null, c1243lYandex, strCrashlytics, false)))), c2580l));
        } else {
            arrayListMetrica.add(AbstractC11308l.loadAd(num, null, num2, c1243lYandex, strCrashlytics, false));
        }
        return new C14329l(c2580l, arrayListMetrica);
    }

    @Override // defpackage.InterfaceC5068l
    public final C1094l yandex() {
        this.yandex.yandex();
        Integer num = this.loadAd;
        int iIntValue = num != null ? num.intValue() : 0;
        C1094l c1094l = new C1094l();
        if (iIntValue < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("The minimum number of digits (", iIntValue, ") is negative"));
            return null;
        }
        if (iIntValue <= 9) {
            return this.crashlytics != null ? new C1094l() : c1094l;
        }
        C10754l.metrica(AbstractC15560l.tapsense("The minimum number of digits (", iIntValue, ") exceeds the length of an Int"));
        return null;
    }
}
