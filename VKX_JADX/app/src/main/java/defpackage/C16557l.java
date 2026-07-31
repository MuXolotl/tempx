package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import j$.util.Objects;

/* JADX INFO: renamed from: lٖۖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16557l implements InterfaceC15479l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f32502l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f32503l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f32504l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f32505l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f32506l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f32507l;

    public C16557l(C14184l c14184l) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f32503l = new Object();
        this.f32506l = new C2350l();
        this.f32504l = false;
        this.f32505l = new C2350l();
        c14184l.yandex();
        Context context = c14184l.yandex;
        this.f32502l = c14184l;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f32504l = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (boolValueOf2 == null) {
                this.f32504l = false;
                boolValueOf = null;
            } else {
                this.f32504l = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f32507l = boolValueOf;
        synchronized (this.f32503l) {
            try {
                if (yandex()) {
                    ((C2350l) this.f32506l).amazon(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void amazon(C10602l c10602l) {
        C3714l c3714l = (C3714l) ((C14138l) this.f32507l).f27644l.get((C7800l) this.f32503l);
        if (c3714l != null) {
            c3714l.vip(c10602l);
        }
    }

    @Override // defpackage.InterfaceC15479l
    public void crashlytics(C10602l c10602l) {
        ((C14138l) this.f32507l).f27638l.post(new RunnableC9929l(this, c10602l, false, 22));
    }

    public void loadAd(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (((Boolean) this.f32507l) == null) {
            str = "global Firebase setting";
        } else {
            str = this.f32504l ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strAds = AbstractC14814l.ads("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strAds, null);
        }
    }

    public synchronized boolean yandex() {
        boolean zAdmob;
        Boolean bool = (Boolean) this.f32507l;
        if (bool != null) {
            zAdmob = bool.booleanValue();
        } else {
            try {
                zAdmob = ((C14184l) this.f32502l).admob();
            } catch (IllegalStateException unused) {
                zAdmob = false;
            }
        }
        loadAd(zAdmob);
        return zAdmob;
    }

    public C16557l(int i, float f, AbstractC13264l abstractC13264l) {
        this.f32502l = abstractC13264l;
        this.f32506l = new C15308l(i);
        this.f32505l = new C13765l(f);
        this.f32507l = new C0536l(i, 30, 100);
    }

    public C16557l(C14138l c14138l, InterfaceC1168l interfaceC1168l, C7800l c7800l) {
        Objects.requireNonNull(c14138l);
        this.f32507l = c14138l;
        this.f32506l = null;
        this.f32505l = null;
        this.f32504l = false;
        this.f32502l = interfaceC1168l;
        this.f32503l = c7800l;
    }
}
