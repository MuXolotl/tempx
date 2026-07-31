package defpackage;

/* JADX INFO: renamed from: l٘ۡۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18276l {
    public C7100l loadAd;
    public AbstractC11918l yandex;

    public final synchronized C7100l amazon() {
        try {
            if (this.loadAd == null) {
                this.loadAd = loadAd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.loadAd;
    }

    public final synchronized AbstractC11918l crashlytics() {
        try {
            if (this.yandex == null) {
                this.yandex = yandex();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.yandex;
    }

    public abstract C7100l loadAd();

    public abstract AbstractC11918l yandex();
}
