package defpackage;

import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؑۡۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0650l {
    public int admob = -1;
    public final Object amazon;
    public final Function3 billing;
    public final Function3 crashlytics;
    public final Function3 loadAd;
    public Object mopub;
    public final AbstractC5563l purchase;
    public final /* synthetic */ C2671l subs;
    public final Object yandex;

    public C0650l(C2671l c2671l, Object obj, Function3 function3, Function3 function4, C9676l c9676l, AbstractC5563l abstractC5563l, Function3 function5) {
        this.subs = c2671l;
        this.yandex = obj;
        this.loadAd = function3;
        this.crashlytics = function4;
        this.amazon = c9676l;
        this.purchase = abstractC5563l;
        this.billing = function5;
    }

    public final void yandex() {
        Object obj = this.mopub;
        if (obj instanceof AbstractC16653l) {
            ((AbstractC16653l) obj).admob(this.admob, this.subs.f5801l);
            return;
        }
        InterfaceC11791l interfaceC11791l = obj instanceof InterfaceC11791l ? (InterfaceC11791l) obj : null;
        if (interfaceC11791l != null) {
            interfaceC11791l.yandex();
        }
    }
}
