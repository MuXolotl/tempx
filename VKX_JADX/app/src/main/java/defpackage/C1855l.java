package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؓٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1855l implements InterfaceC10835l {
    public final InterfaceC5344l yandex;

    public C1855l(InterfaceC5344l interfaceC5344l) {
        this.yandex = interfaceC5344l;
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        return this.yandex.amazon(interfaceC12822l, AbstractC10733l.loadAd(interfaceC12822l), i);
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        return this.yandex.crashlytics(interfaceC12822l, AbstractC10733l.loadAd(interfaceC12822l), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1855l) && AbstractC8576l.yandex(this.yandex, ((C1855l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        return this.yandex.loadAd(interfaceC7448l, AbstractC10733l.loadAd(interfaceC7448l), j);
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        return this.yandex.purchase(interfaceC12822l, AbstractC10733l.loadAd(interfaceC12822l), i);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.yandex + ")";
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        return this.yandex.yandex(interfaceC12822l, AbstractC10733l.loadAd(interfaceC12822l), i);
    }
}
