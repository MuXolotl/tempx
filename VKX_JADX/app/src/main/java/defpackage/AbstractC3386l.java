package defpackage;

/* JADX INFO: renamed from: lؕٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3386l {
    public abstract AbstractC3386l admob();

    public boolean amazon() {
        return false;
    }

    public C8896l billing(C14509l c14509l) {
        return crashlytics();
    }

    public C8896l crashlytics() {
        return null;
    }

    public boolean loadAd() {
        return this instanceof C8247l;
    }

    public abstract AbstractC3386l mopub(C8030l c8030l);

    public C12014l purchase() {
        return null;
    }

    public AbstractC3386l yandex(C14509l c14509l, C8030l c8030l, long j, long j2, long j3) {
        throw new IllegalStateException(("Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: " + this).toString());
    }

    public void subs(C8896l c8896l) {
    }
}
