package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: lُ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11115l {
    public EdgeEffect admob;
    public EdgeEffect amazon;
    public EdgeEffect billing;
    public long crashlytics = 0;
    public EdgeEffect firebase;
    public EdgeEffect isPro;
    public final int loadAd;
    public EdgeEffect mopub;
    public EdgeEffect purchase;
    public EdgeEffect subs;
    public final Context yandex;

    public C11115l(Context context, int i) {
        this.yandex = context;
        this.loadAd = i;
    }

    public static boolean billing(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean mopub(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.metrica(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect amazon() {
        EdgeEffect edgeEffect = this.mopub;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectYandex = yandex(EnumC7283l.f15125l);
        this.mopub = edgeEffectYandex;
        return edgeEffectYandex;
    }

    public final EdgeEffect crashlytics() {
        EdgeEffect edgeEffect = this.billing;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectYandex = yandex(EnumC7283l.f15125l);
        this.billing = edgeEffectYandex;
        return edgeEffectYandex;
    }

    public final EdgeEffect loadAd() {
        EdgeEffect edgeEffect = this.purchase;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectYandex = yandex(EnumC7283l.f15126l);
        this.purchase = edgeEffectYandex;
        return edgeEffectYandex;
    }

    public final EdgeEffect purchase() {
        EdgeEffect edgeEffect = this.amazon;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectYandex = yandex(EnumC7283l.f15126l);
        this.amazon = edgeEffectYandex;
        return edgeEffectYandex;
    }

    public final EdgeEffect yandex(EnumC7283l enumC7283l) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.yandex;
        EdgeEffect edgeEffectCrashlytics = i >= 31 ? AbstractC12148l.crashlytics(context) : new C16320l(context);
        edgeEffectCrashlytics.setColor(this.loadAd);
        if (!C4999l.loadAd(this.crashlytics, 0L)) {
            long j = this.crashlytics;
            if (enumC7283l == EnumC7283l.f15126l) {
                edgeEffectCrashlytics.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectCrashlytics;
            }
            edgeEffectCrashlytics.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectCrashlytics;
    }
}
