package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؘٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5861l implements InterfaceC6347l {
    public final C1819l yandex;

    public C5861l(C1819l c1819l) {
        this.yandex = c1819l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5861l c5861l = obj instanceof C5861l ? (C5861l) obj : null;
        return (c5861l != null ? c5861l.yandex : null) == this.yandex;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC6347l
    public final AbstractC15342l yandex(long j, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l) {
        C9902l c9902lYandex = AbstractC3478l.yandex();
        c9902lYandex.loadAd();
        Unit unit = Unit.INSTANCE;
        c9902lYandex.loadAd();
        return new C13616l(c9902lYandex);
    }
}
