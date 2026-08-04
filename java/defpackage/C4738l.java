package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؚؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4738l {
    public final InterfaceC2406l loadAd;
    public final EnumC17323l yandex;

    public C4738l(EnumC17323l enumC17323l, InterfaceC2406l interfaceC2406l) {
        this.yandex = enumC17323l;
        this.loadAd = interfaceC2406l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4738l)) {
            return false;
        }
        C4738l c4738l = (C4738l) obj;
        return this.yandex == c4738l.yandex && Objects.equals(this.loadAd, c4738l.loadAd);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd);
    }
}
