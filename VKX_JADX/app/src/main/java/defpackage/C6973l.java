package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6973l {
    public static final C6973l crashlytics = new C6973l(null, null, 63);
    public final Function1 loadAd;
    public final Function1 yandex;

    public C6973l(Function1 function1, Function1 function2, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function2 = (i & 16) != 0 ? null : function2;
        this.yandex = function1;
        this.loadAd = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6973l)) {
            return false;
        }
        C6973l c6973l = (C6973l) obj;
        return this.yandex == c6973l.yandex && this.loadAd == c6973l.loadAd;
    }

    public final int hashCode() {
        Function1 function1 = this.yandex;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 923521;
        Function1 function2 = this.loadAd;
        return (iHashCode + (function2 != null ? function2.hashCode() : 0)) * 31;
    }
}
