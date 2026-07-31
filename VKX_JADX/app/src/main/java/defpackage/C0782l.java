package defpackage;

import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؘؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0782l {
    public final Object amazon;
    public final Function3 crashlytics;
    public final InterfaceC11295l loadAd;
    public final Throwable purchase;
    public final Object yandex;

    public /* synthetic */ C0782l(Object obj, InterfaceC11295l interfaceC11295l, Function3 function3, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC11295l, (i & 4) != 0 ? null : function3, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static C0782l yandex(C0782l c0782l, InterfaceC11295l interfaceC11295l, Throwable th, int i) {
        Object obj = c0782l.yandex;
        if ((i & 2) != 0) {
            interfaceC11295l = c0782l.loadAd;
        }
        InterfaceC11295l interfaceC11295l2 = interfaceC11295l;
        Function3 function3 = c0782l.crashlytics;
        Object obj2 = c0782l.amazon;
        if ((i & 16) != 0) {
            th = c0782l.purchase;
        }
        return new C0782l(obj, interfaceC11295l2, function3, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0782l)) {
            return false;
        }
        C0782l c0782l = (C0782l) obj;
        return AbstractC8576l.yandex(this.yandex, c0782l.yandex) && AbstractC8576l.yandex(this.loadAd, c0782l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c0782l.crashlytics) && AbstractC8576l.yandex(this.amazon, c0782l.amazon) && AbstractC8576l.yandex(this.purchase, c0782l.purchase);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC11295l interfaceC11295l = this.loadAd;
        int iHashCode2 = (iHashCode + (interfaceC11295l == null ? 0 : interfaceC11295l.hashCode())) * 31;
        Function3 function3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.amazon;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.purchase;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.yandex + ", cancelHandler=" + this.loadAd + ", onCancellation=" + this.crashlytics + ", idempotentResume=" + this.amazon + ", cancelCause=" + this.purchase + ')';
    }

    public C0782l(Object obj, InterfaceC11295l interfaceC11295l, Function3 function3, Object obj2, Throwable th) {
        this.yandex = obj;
        this.loadAd = interfaceC11295l;
        this.crashlytics = function3;
        this.amazon = obj2;
        this.purchase = th;
    }
}
