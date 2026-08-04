package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lؒٛۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1171l implements Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f3160l;

    public /* synthetic */ C1171l(Object obj) {
        this.f3160l = obj;
    }

    public static final Throwable yandex(Object obj) {
        if (obj instanceof C18435l) {
            return ((C18435l) obj).f36003l;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1171l) {
            return AbstractC8576l.yandex(this.f3160l, ((C1171l) obj).f3160l);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3160l;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3160l;
        if (obj instanceof C18435l) {
            return ((C18435l) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
