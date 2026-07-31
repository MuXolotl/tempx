package defpackage;

import j$.time.ZoneOffset;
import java.io.Serializable;

/* JADX INFO: renamed from: lٖؕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C16048l.class)
public final class C3425l implements Serializable {
    public static final C15031l Companion = new C15031l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ZoneOffset f7283l;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
    }

    public C3425l(ZoneOffset zoneOffset) {
        this.f7283l = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3425l) {
            return AbstractC8576l.yandex(this.f7283l, ((C3425l) obj).f7283l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7283l.hashCode();
    }

    public final String toString() {
        return this.f7283l.toString();
    }
}
