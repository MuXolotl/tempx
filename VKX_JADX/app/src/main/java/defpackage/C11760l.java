package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُِِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11760l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7276l f23556l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23557l;

    public /* synthetic */ C11760l(C7276l c7276l, int i) {
        this.f23557l = i;
        this.f23556l = c7276l;
    }

    private final Object yandex(Object obj) {
        C7276l c7276l = this.f23556l;
        synchronized (c7276l.startapp) {
            c7276l.ads = C10370l.crashlytics;
            Log.d("CXCP", c7276l + " is closed");
            Unit unit = Unit.INSTANCE;
        }
        c7276l.vip.loadAd(c7276l);
        C9426l c9426l = c7276l.pro;
        Unit unit2 = Unit.INSTANCE;
        c9426l.m3885new(unit2);
        AbstractC11990l.billing(c7276l.yandex, null);
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f23557l) {
            case 0:
                return yandex(obj);
            default:
                C7276l c7276l = this.f23556l;
                synchronized (c7276l.startapp) {
                    z = c7276l.adcel;
                }
                return Boolean.valueOf(z);
        }
    }
}
