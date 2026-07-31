package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lْؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13059l {
    public static final C13059l crashlytics;
    public static final C7943l loadAd = new C7943l(0);
    public final C17762l yandex;

    static {
        List list = Collections.EMPTY_LIST;
        crashlytics = new C13059l(new C17762l());
    }

    public C13059l(C17762l c17762l) {
        this.yandex = c17762l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13059l) && ((C13059l) obj).yandex.equals(this.yandex);
    }

    public final int hashCode() {
        return ~this.yandex.hashCode();
    }

    public final String toString() {
        return this.yandex.toString();
    }
}
