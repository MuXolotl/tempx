package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: renamed from: lٟؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5062l implements InterfaceC10835l, InterfaceC8077l {
    public final C0086l loadAd;
    public final InterfaceC5404l yandex;

    public C5062l(InterfaceC5404l interfaceC5404l, C0086l c0086l) {
        this.yandex = interfaceC5404l;
        this.loadAd = c0086l;
    }

    @Override // defpackage.InterfaceC8077l
    public final InterfaceC17792l admob(AbstractC10113l[] abstractC10113lArr, InterfaceC7448l interfaceC7448l, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC7448l.isVip(i, i2, C14054l.f27396l, new C0237l(abstractC10113lArr, this, i2, iArr));
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
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
                int iMin2 = Math.min(interfaceC6357l.metrica(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC6357l.crashlytics(iMin2));
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
                iMax = Math.max(iMax, interfaceC6357l2.crashlytics(iRound != Integer.MAX_VALUE ? Math.round(iRound * fPurchase2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.InterfaceC8077l
    public final void billing(int i, int[] iArr, int[] iArr2, InterfaceC7448l interfaceC7448l) {
        this.yandex.Signature(interfaceC7448l, i, iArr, interfaceC7448l.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
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
            int iRemoteconfig = interfaceC6357l.remoteconfig(i);
            if (fPurchase == 0.0f) {
                i2 += iRemoteconfig;
            } else if (fPurchase > 0.0f) {
                f += fPurchase;
                iMax = Math.max(iMax, Math.round(iRemoteconfig / fPurchase));
            }
        }
        return ((list.size() - 1) * iMo870l) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5062l)) {
            return false;
        }
        C5062l c5062l = (C5062l) obj;
        return AbstractC8576l.yandex(this.yandex, c5062l.yandex) && AbstractC8576l.yandex(this.loadAd, c5062l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC8077l
    public final int isPro(AbstractC10113l abstractC10113l) {
        return abstractC10113l.f20592l;
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        return AbstractC16164l.mopub(this, C15519l.isPro(j), C15519l.subs(j), C15519l.admob(j), C15519l.mopub(j), interfaceC7448l.mo870l(this.yandex.amazon()), interfaceC7448l, list, new AbstractC10113l[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.InterfaceC8077l
    public final long mopub(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC7563l.yandex(i, i2, 0, i3) : AbstractC13628l.billing(i, i2, 0, i3);
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
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
                int iMin2 = Math.min(interfaceC6357l.metrica(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC6357l.mo1460for(iMin2));
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
                iMax = Math.max(iMax, interfaceC6357l2.mo1460for(iRound != Integer.MAX_VALUE ? Math.round(iRound * fPurchase2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.InterfaceC8077l
    public final int subs(AbstractC10113l abstractC10113l) {
        return abstractC10113l.f20591l;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.yandex + ", verticalAlignment=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
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
            int iMetrica = interfaceC6357l.metrica(i);
            if (fPurchase == 0.0f) {
                i2 += iMetrica;
            } else if (fPurchase > 0.0f) {
                f += fPurchase;
                iMax = Math.max(iMax, Math.round(iMetrica / fPurchase));
            }
        }
        return ((list.size() - 1) * iMo870l) + Math.round(iMax * f) + i2;
    }
}
