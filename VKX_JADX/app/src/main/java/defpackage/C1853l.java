package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: renamed from: lؓٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1853l implements InterfaceC10835l, InterfaceC8077l {
    public final InterfaceC6947l loadAd;
    public final InterfaceC3501l yandex;

    public C1853l(InterfaceC3501l interfaceC3501l, InterfaceC6947l interfaceC6947l) {
        this.yandex = interfaceC3501l;
        this.loadAd = interfaceC6947l;
    }

    @Override // defpackage.InterfaceC8077l
    public final InterfaceC17792l admob(AbstractC10113l[] abstractC10113lArr, InterfaceC7448l interfaceC7448l, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC7448l.isVip(i2, i, C14054l.f27396l, new C12834l(abstractC10113lArr, this, i2, interfaceC7448l, iArr));
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        int iMo870l = interfaceC12822l.mo870l(this.yandex.amazon());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(i3);
            float fPurchase = AbstractC9690l.purchase(AbstractC9690l.amazon(interfaceC6357l));
            int iCrashlytics = interfaceC6357l.crashlytics(i);
            if (fPurchase == 0.0f) {
                i2 += iCrashlytics;
            } else if (fPurchase > 0.0f) {
                f += fPurchase;
                iMax = Math.max(iMax, Math.round(iCrashlytics / fPurchase));
            }
        }
        return ((list.size() - 1) * iMo870l) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.InterfaceC8077l
    public final void billing(int i, int[] iArr, int[] iArr2, InterfaceC7448l interfaceC7448l) {
        this.yandex.startapp(interfaceC7448l, i, iArr, iArr2);
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        int iMo870l = interfaceC12822l.mo870l(this.yandex.amazon());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo870l, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(i2);
            float fPurchase = AbstractC9690l.purchase(AbstractC9690l.amazon(interfaceC6357l));
            if (fPurchase == 0.0f) {
                int iMin2 = Math.min(interfaceC6357l.crashlytics(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC6357l.remoteconfig(iMin2));
            } else if (fPurchase > 0.0f) {
                f += fPurchase;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) list.get(i3);
            float fPurchase2 = AbstractC9690l.purchase(AbstractC9690l.amazon(interfaceC6357l2));
            if (fPurchase2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC6357l2.remoteconfig(iRound != Integer.MAX_VALUE ? Math.round(iRound * fPurchase2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853l)) {
            return false;
        }
        C1853l c1853l = (C1853l) obj;
        return this.yandex.equals(c1853l.yandex) && AbstractC8576l.yandex(this.loadAd, c1853l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC8077l
    public final int isPro(AbstractC10113l abstractC10113l) {
        return abstractC10113l.f20591l;
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        return AbstractC16164l.mopub(this, C15519l.subs(j), C15519l.isPro(j), C15519l.mopub(j), C15519l.admob(j), interfaceC7448l.mo870l(this.yandex.amazon()), interfaceC7448l, list, new AbstractC10113l[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.InterfaceC8077l
    public final long mopub(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC7563l.yandex(0, i3, i, i2) : AbstractC13628l.purchase(0, i3, i, i2);
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        int iMo870l = interfaceC12822l.mo870l(this.yandex.amazon());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(i3);
            float fPurchase = AbstractC9690l.purchase(AbstractC9690l.amazon(interfaceC6357l));
            int iMo1460for = interfaceC6357l.mo1460for(i);
            if (fPurchase == 0.0f) {
                i2 += iMo1460for;
            } else if (fPurchase > 0.0f) {
                f += fPurchase;
                iMax = Math.max(iMax, Math.round(iMo1460for / fPurchase));
            }
        }
        return ((list.size() - 1) * iMo870l) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.InterfaceC8077l
    public final int subs(AbstractC10113l abstractC10113l) {
        return abstractC10113l.f20592l;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.yandex + ", horizontalAlignment=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        int iMo870l = interfaceC12822l.mo870l(this.yandex.amazon());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo870l, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(i2);
            float fPurchase = AbstractC9690l.purchase(AbstractC9690l.amazon(interfaceC6357l));
            if (fPurchase == 0.0f) {
                int iMin2 = Math.min(interfaceC6357l.crashlytics(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC6357l.metrica(iMin2));
            } else if (fPurchase > 0.0f) {
                f += fPurchase;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) list.get(i3);
            float fPurchase2 = AbstractC9690l.purchase(AbstractC9690l.amazon(interfaceC6357l2));
            if (fPurchase2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC6357l2.metrica(iRound != Integer.MAX_VALUE ? Math.round(iRound * fPurchase2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
