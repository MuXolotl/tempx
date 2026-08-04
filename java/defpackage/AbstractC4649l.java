package defpackage;

/* JADX INFO: renamed from: lؗؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4649l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f9464l = -1;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f9465l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC2810l f9466l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8769l f9467l;

    public AbstractC4649l(AbstractC8769l abstractC8769l, InterfaceC2810l interfaceC2810l) {
        this.f9467l = abstractC8769l;
        this.f9466l = interfaceC2810l;
    }

    public abstract boolean crashlytics();

    public final void yandex(boolean z) {
        if (z == this.f9465l) {
            return;
        }
        this.f9465l = z;
        int i = z ? 1 : -1;
        AbstractC8769l abstractC8769l = this.f9467l;
        int i2 = abstractC8769l.crashlytics;
        abstractC8769l.crashlytics = i + i2;
        if (!abstractC8769l.amazon) {
            abstractC8769l.amazon = true;
            while (true) {
                try {
                    int i3 = abstractC8769l.crashlytics;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        abstractC8769l.billing();
                    } else if (z3) {
                        abstractC8769l.mopub();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    abstractC8769l.amazon = false;
                    throw th;
                }
            }
            abstractC8769l.amazon = false;
        }
        if (this.f9465l) {
            abstractC8769l.crashlytics(this);
        }
    }

    public void loadAd() {
    }
}
