package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lٛۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18435l implements Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Throwable f36003l;

    public C18435l(Throwable th) {
        this.f36003l = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18435l) {
            return AbstractC8576l.yandex(this.f36003l, ((C18435l) obj).f36003l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36003l.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f36003l + ')';
    }
}
