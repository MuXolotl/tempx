package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؗۢ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5234l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3390l f11309l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11310l;

    public /* synthetic */ C5234l(C3390l c3390l, int i) {
        this.f11310l = i;
        this.f11309l = c3390l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set setM4229l;
        Set setM4229l2;
        int i = this.f11310l;
        C5746l c5746l = C5746l.f12138l;
        boolean z = false;
        C3390l c3390l = this.f11309l;
        switch (i) {
            case 0:
                String str = ((Object) C10160l.loadAd(c3390l.f7236l)) + "#availableCaptureRequestKeys";
                try {
                    try {
                        Trace.beginSection(str);
                        if (Build.VERSION.SDK_INT >= 33) {
                            setM4229l = AbstractC16901l.m4229l(AbstractC2847l.mopub(c3390l.f7234l, c3390l.f7235l));
                            break;
                        } else {
                            setM4229l = c5746l;
                        }
                        return setM4229l;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    Log.w("CXCP", "Failed to get " + str + "! Caching {} and ignoring exception.", th);
                    return c5746l;
                }
            case 1:
                String str2 = ((Object) C10160l.loadAd(c3390l.f7236l)) + "#availableCaptureResultKeys";
                try {
                    try {
                        Trace.beginSection(str2);
                        if (Build.VERSION.SDK_INT >= 33) {
                            setM4229l2 = AbstractC16901l.m4229l(AbstractC2847l.admob(c3390l.f7234l, c3390l.f7235l));
                            break;
                        } else {
                            setM4229l2 = c5746l;
                        }
                        return setM4229l2;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th2) {
                    Log.w("CXCP", "Failed to get " + str2 + "! Caching {} and ignoring exception.", th2);
                    return c5746l;
                }
            case 2:
                String str3 = ((Object) C10160l.loadAd(c3390l.f7236l)) + "#isPostviewSupported";
                try {
                    try {
                        Trace.beginSection(str3);
                        boolean zPro = Build.VERSION.SDK_INT >= 34 ? AbstractC5917l.pro(c3390l.f7234l, c3390l.f7235l) : false;
                        Trace.endSection();
                        z = zPro;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                    break;
                } catch (Throwable th4) {
                    Log.w("CXCP", "Failed to get " + str3 + "! Caching false and ignoring exception.", th4);
                }
                return Boolean.valueOf(z);
            default:
                String str4 = ((Object) C10160l.loadAd(c3390l.f7236l)) + "#isCaptureProgressSupported";
                try {
                    try {
                        Trace.beginSection(str4);
                        boolean zLicense = Build.VERSION.SDK_INT >= 34 ? AbstractC5917l.license(c3390l.f7234l, c3390l.f7235l) : false;
                        Trace.endSection();
                        z = zLicense;
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                    break;
                } catch (Throwable th6) {
                    Log.w("CXCP", "Failed to get " + str4 + "! Caching false and ignoring exception.", th6);
                }
                return Boolean.valueOf(z);
        }
    }
}
