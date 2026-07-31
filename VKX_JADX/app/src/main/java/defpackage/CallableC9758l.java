package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lٍْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC9758l implements Callable {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC9758l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C17503l c17503l = ((C17044l) obj).mopub;
                c17503l.getClass();
                C0554l.license();
                C10023l c10023l = c17503l.crashlytics;
                C12714l c12714l = (C12714l) c10023l.f20418l;
                String str = (String) c10023l.f20419l;
                c12714l.getClass();
                boolean z = true;
                if (new File((File) c12714l.f25072l, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    C12714l c12714l2 = (C12714l) c10023l.f20418l;
                    c12714l2.getClass();
                    new File((File) c12714l2.f25072l, str).delete();
                } else {
                    String strPurchase = c17503l.purchase();
                    if (strPurchase == null || !c17503l.isPro.crashlytics(strPurchase)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                C7644l c7644l = (C7644l) ((C13645l) obj).f26670l;
                C1693l c1693l = (C1693l) c7644l.f15742l;
                C17643l c17643l = (C17643l) c7644l.f15737l;
                String str2 = c1693l.f4077l;
                C0554l.ad();
                try {
                    HashMap mapAmazon = C1693l.amazon(c17643l);
                    C18449l c18449l = new C18449l(str2, mapAmazon);
                    c18449l.m4543for("User-Agent", "Crashlytics Android SDK/20.0.4");
                    c18449l.m4543for("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    C1693l.loadAd(c18449l, c17643l);
                    String strConcat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str3 = "Settings query params were: " + mapAmazon;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return c1693l.purchase(c18449l.m4558throws());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            default:
                return (AssetFileDescriptor) obj;
        }
    }
}
