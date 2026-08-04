package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْٝۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13538l implements InterfaceC10835l {
    public final boolean loadAd;
    public final InterfaceC13460l yandex;

    public C13538l(InterfaceC13460l interfaceC13460l, boolean z) {
        this.yandex = interfaceC13460l;
        this.loadAd = z;
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC1757l.smaato(this, interfaceC12822l, list, i);
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC1757l.Signature(this, interfaceC12822l, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13538l)) {
            return false;
        }
        C13538l c13538l = (C13538l) obj;
        return AbstractC8576l.yandex(this.yandex, c13538l.yandex) && this.loadAd == c13538l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237);
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        int iIsPro;
        int iSubs;
        AbstractC10113l abstractC10113lAdcel;
        boolean zIsEmpty = list.isEmpty();
        C14054l c14054l = C14054l.f27396l;
        if (zIsEmpty) {
            return interfaceC7448l.isVip(C15519l.isPro(j), C15519l.subs(j), c14054l, new C10351l(19));
        }
        long j2 = this.loadAd ? j : j & (-8589934589L);
        if (list.size() == 1) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list.get(0);
            Object objSignature = interfaceC6357l.Signature();
            C18619l c18619l = objSignature instanceof C18619l ? (C18619l) objSignature : null;
            if (c18619l != null ? c18619l.f36376l : false) {
                iIsPro = C15519l.isPro(j);
                iSubs = C15519l.subs(j);
                int iIsPro2 = C15519l.isPro(j);
                int iSubs2 = C15519l.subs(j);
                if (!((iSubs2 >= 0) & (iIsPro2 >= 0))) {
                    AbstractC10280l.yandex("width and height must be >= 0");
                }
                abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.admob(iIsPro2, iIsPro2, iSubs2, iSubs2));
            } else {
                abstractC10113lAdcel = interfaceC6357l.adcel(j2);
                iIsPro = Math.max(C15519l.isPro(j), abstractC10113lAdcel.f20592l);
                iSubs = Math.max(C15519l.subs(j), abstractC10113lAdcel.f20591l);
            }
            int i = iSubs;
            int i2 = iIsPro;
            return interfaceC7448l.isVip(i2, i, c14054l, new C2184l(abstractC10113lAdcel, interfaceC6357l, interfaceC7448l, i2, i, this));
        }
        AbstractC10113l[] abstractC10113lArr = new AbstractC10113l[list.size()];
        C9987l c9987l = new C9987l();
        c9987l.f20387l = C15519l.isPro(j);
        C9987l c9987l2 = new C9987l();
        c9987l2.f20387l = C15519l.subs(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) list.get(i3);
            Object objSignature2 = interfaceC6357l2.Signature();
            C18619l c18619l2 = objSignature2 instanceof C18619l ? (C18619l) objSignature2 : null;
            if (c18619l2 != null ? c18619l2.f36376l : false) {
                z = true;
            } else {
                AbstractC10113l abstractC10113lAdcel2 = interfaceC6357l2.adcel(j2);
                abstractC10113lArr[i3] = abstractC10113lAdcel2;
                c9987l.f20387l = Math.max(c9987l.f20387l, abstractC10113lAdcel2.f20592l);
                c9987l2.f20387l = Math.max(c9987l2.f20387l, abstractC10113lAdcel2.f20591l);
            }
        }
        if (z) {
            int i4 = c9987l.f20387l;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = c9987l2.f20387l;
            long jYandex = AbstractC7563l.yandex(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) list.get(i7);
                Object objSignature3 = interfaceC6357l3.Signature();
                C18619l c18619l3 = objSignature3 instanceof C18619l ? (C18619l) objSignature3 : null;
                if (c18619l3 != null ? c18619l3.f36376l : false) {
                    abstractC10113lArr[i7] = interfaceC6357l3.adcel(jYandex);
                }
            }
        }
        return interfaceC7448l.isVip(c9987l.f20387l, c9987l2.f20387l, c14054l, new C2623l(abstractC10113lArr, list, interfaceC7448l, c9987l, c9987l2, this, 2));
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC1757l.ads(this, interfaceC12822l, list, i);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.yandex + ", propagateMinConstraints=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC10835l
    public final /* synthetic */ int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        return AbstractC1757l.metrica(this, interfaceC12822l, list, i);
    }
}
