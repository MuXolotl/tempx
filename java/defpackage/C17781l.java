package defpackage;

import android.content.Context;
import android.os.SystemClock;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lٌ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17781l {
    public static C2673l firebase;
    public static final C4006l smaato;
    public final int admob;
    public final C6664l amazon;
    public final C3823l billing;
    public final C5694l crashlytics;
    public final String loadAd;
    public final String mopub;
    public final C3823l purchase;
    public final String yandex;
    public final HashMap subs = new HashMap();
    public final HashMap isPro = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        smaato = new C4006l(objArr);
    }

    public C17781l(Context context, C6664l c6664l, C5694l c5694l, String str) {
        this.yandex = context.getPackageName();
        this.loadAd = AbstractC8109l.yandex(context);
        this.amazon = c6664l;
        this.crashlytics = c5694l;
        C15718l.license();
        this.mopub = str;
        C5138l c5138lM1704new = C5138l.m1704new();
        CallableC15551l callableC15551l = new CallableC15551l(8, this);
        c5138lM1704new.getClass();
        this.purchase = C5138l.m1703implements(callableC15551l);
        C5138l c5138lM1704new2 = C5138l.m1704new();
        Objects.requireNonNull(c6664l);
        CallableC14197l callableC14197l = new CallableC14197l(c6664l, 2);
        c5138lM1704new2.getClass();
        this.billing = C5138l.m1703implements(callableC14197l);
        C4006l c4006l = smaato;
        this.admob = c4006l.containsKey(str) ? C7269l.amazon(context, (String) c4006l.get(str), false) : -1;
    }

    public static long yandex(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    public final boolean amazon(EnumC7663l enumC7663l, long j) {
        HashMap map = this.subs;
        return map.get(enumC7663l) == null || j - ((Long) map.get(enumC7663l)).longValue() > 30000;
    }

    public final String crashlytics() {
        C3823l c3823l = this.purchase;
        if (c3823l.smaato()) {
            return (String) c3823l.isPro();
        }
        return C18318l.crashlytics.yandex(this.mopub);
    }

    public final void loadAd(InterfaceC12852l interfaceC12852l, EnumC7663l enumC7663l) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (amazon(enumC7663l, jElapsedRealtime)) {
            this.subs.put(enumC7663l, Long.valueOf(jElapsedRealtime));
            EnumC1150l.f3126l.execute(new RunnableC16843l(16, this, interfaceC12852l.zza(), enumC7663l, crashlytics(), false));
        }
    }
}
