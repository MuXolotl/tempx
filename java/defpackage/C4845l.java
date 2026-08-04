package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: lّؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4845l {
    public static final C12903l firebase;
    public static C2016l isPro;
    public final int admob;
    public final C6664l amazon;
    public final C3823l billing;
    public final C7774l crashlytics;
    public final String loadAd;
    public final String mopub;
    public final C3823l purchase;
    public final HashMap subs = new HashMap();
    public final String yandex;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        firebase = new C12903l(objArr);
    }

    public C4845l(Context context, C6664l c6664l, C7774l c7774l) {
        new HashMap();
        this.yandex = context.getPackageName();
        this.loadAd = AbstractC8109l.yandex(context);
        this.amazon = c6664l;
        this.crashlytics = c7774l;
        C8565l.isVip();
        this.mopub = "vision-common";
        C5138l c5138lM1704new = C5138l.m1704new();
        CallableC15551l callableC15551l = new CallableC15551l(5, this);
        c5138lM1704new.getClass();
        this.purchase = C5138l.m1703implements(callableC15551l);
        C5138l c5138lM1704new2 = C5138l.m1704new();
        c6664l.getClass();
        CallableC14197l callableC14197l = new CallableC14197l(c6664l, 0);
        c5138lM1704new2.getClass();
        this.billing = C5138l.m1703implements(callableC14197l);
        C12903l c12903l = firebase;
        this.admob = c12903l.containsKey("vision-common") ? C7269l.amazon(context, (String) c12903l.get("vision-common"), false) : -1;
    }
}
