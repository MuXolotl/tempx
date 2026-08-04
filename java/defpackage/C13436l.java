package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lْٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13436l {
    public final Map loadAd;
    public final InterfaceC1286l yandex;

    public C13436l(InterfaceC1286l interfaceC1286l, Map map) {
        this.yandex = interfaceC1286l;
        this.loadAd = AbstractC18296l.subs(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13436l)) {
            return false;
        }
        C13436l c13436l = (C13436l) obj;
        return AbstractC8576l.yandex(this.yandex, c13436l.yandex) && AbstractC8576l.yandex(this.loadAd, c13436l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.yandex + ", extras=" + this.loadAd + ")";
    }
}
