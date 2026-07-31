package defpackage;

/* JADX INFO: renamed from: lٓۖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14330l {
    public boolean amazon;
    public boolean crashlytics;
    public boolean loadAd;
    public final Object yandex;

    public AbstractC14330l(Object obj) {
        this.yandex = obj;
    }

    public abstract void amazon(Object obj);

    public final void billing(Object obj) {
        if (this.crashlytics || this.amazon) {
            C1759l.isPro(this.yandex, "sendResult() called when either sendResult() or sendError() had already been called for: ");
        } else {
            this.crashlytics = true;
            amazon(obj);
        }
    }

    public void crashlytics() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.yandex);
    }

    public final boolean loadAd() {
        return this.loadAd || this.crashlytics || this.amazon;
    }

    public final void purchase() {
        if (this.crashlytics || this.amazon) {
            C1759l.isPro(this.yandex, "sendError() called when either sendResult() or sendError() had already been called for: ");
        } else {
            this.amazon = true;
            crashlytics();
        }
    }

    public void yandex() {
        boolean z = this.loadAd;
        Object obj = this.yandex;
        if (z) {
            C8339l.smaato(AbstractC15560l.subscription(obj, "detach() called when detach() had already been called for: "));
            return;
        }
        if (this.crashlytics) {
            C8339l.smaato(AbstractC15560l.subscription(obj, "detach() called when sendResult() had already been called for: "));
        } else if (this.amazon) {
            C8339l.smaato(AbstractC15560l.subscription(obj, "detach() called when sendError() had already been called for: "));
        } else {
            this.loadAd = true;
        }
    }
}
