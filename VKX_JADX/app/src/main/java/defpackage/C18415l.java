package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18415l implements InterfaceC11075l, InterfaceC15834l {
    public final int crashlytics;
    public final int loadAd;
    public final InterfaceC11075l yandex;

    public C18415l(InterfaceC11075l interfaceC11075l, int i, int i2) {
        this.yandex = interfaceC11075l;
        this.loadAd = i;
        this.crashlytics = i2;
        if (i < 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            C10754l.metrica(AbstractC0653l.vip(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        C10754l.metrica(AbstractC12589l.premium(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    }

    @Override // defpackage.InterfaceC11075l
    public final Iterator iterator() {
        return new C17991l(this);
    }

    @Override // defpackage.InterfaceC15834l
    public final InterfaceC11075l loadAd(int i) {
        int i2 = this.crashlytics;
        int i3 = this.loadAd;
        return i >= i2 - i3 ? C8360l.yandex : new C18415l(this.yandex, i3 + i, i2);
    }

    @Override // defpackage.InterfaceC15834l
    public final InterfaceC11075l yandex(int i) {
        int i2 = this.crashlytics;
        int i3 = this.loadAd;
        return i >= i2 - i3 ? this : new C18415l(this.yandex, i3, i + i3);
    }
}
