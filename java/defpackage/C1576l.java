package defpackage;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: renamed from: lؓؓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1576l extends AbstractC9654l {
    public final /* synthetic */ Object billing;
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1576l(Object obj, InterfaceC17182l interfaceC17182l, int i) {
        super(interfaceC17182l);
        this.purchase = i;
        this.billing = obj;
    }

    @Override // defpackage.AbstractC9654l
    public final void yandex() {
        int i = this.purchase;
        Object obj = this.billing;
        switch (i) {
            case 0:
                C16528l c16528l = (C16528l) obj;
                C11569l c11569l = (C11569l) c16528l.f32305l;
                c11569l.mo211l();
                C17417l c17417l = (C17417l) c11569l.f833l;
                c17417l.f33951l.getClass();
                c16528l.subs(SystemClock.elapsedRealtime(), false, false);
                C1185l c1185l = c17417l.f33952l;
                C17417l.purchase(c1185l);
                c17417l.f33951l.getClass();
                c1185l.m847l(SystemClock.elapsedRealtime());
                break;
            case 1:
                C6448l c6448l = (C6448l) obj;
                c6448l.m2007l();
                C8118l c8118l = ((C17417l) c6448l.f833l).f33950l;
                C17417l.admob(c8118l);
                c8118l.f16911l.yandex("Starting upload from DelayedRunnable");
                c6448l.f13233l.smaato();
                break;
            default:
                C6901l c6901l = (C6901l) obj;
                c6901l.mo224l().mo211l();
                String str = (String) c6901l.f14462l.pollFirst();
                if (str != null) {
                    c6901l.mo198abstract().getClass();
                    c6901l.f14457l = SystemClock.elapsedRealtime();
                    c6901l.mo200else().f16911l.loadAd(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    C6901l.m2085throw(c6901l.f14473l.f33936l, intent);
                }
                c6901l.applovin();
                break;
        }
    }
}
