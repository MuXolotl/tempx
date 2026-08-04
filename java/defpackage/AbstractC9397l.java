package defpackage;

/* JADX INFO: renamed from: lًٍؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9397l implements InterfaceC0974l, Cloneable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC13399l f19242l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC13399l f19243l;

    public AbstractC9397l(AbstractC13399l abstractC13399l) {
        this.f19243l = abstractC13399l;
        if (abstractC13399l.metrica()) {
            C8339l.metrica("Default instance must be immutable.");
            throw null;
        }
        this.f19242l = abstractC13399l.ads();
    }

    public final AbstractC9397l amazon() {
        AbstractC9397l abstractC9397lAdcel = this.f19243l.amazon();
        abstractC9397lAdcel.f19242l = crashlytics();
        return abstractC9397lAdcel;
    }

    public final void billing(AbstractC13399l abstractC13399l) {
        if (this.f19243l.equals(abstractC13399l)) {
            return;
        }
        purchase();
        AbstractC13399l abstractC13399l2 = this.f19242l;
        C17073l c17073l = C17073l.crashlytics;
        c17073l.getClass();
        c17073l.yandex(abstractC13399l2.getClass()).yandex(abstractC13399l2, abstractC13399l);
    }

    public final AbstractC13399l crashlytics() {
        boolean zMetrica = this.f19242l.metrica();
        AbstractC13399l abstractC13399l = this.f19242l;
        if (!zMetrica) {
            return abstractC13399l;
        }
        abstractC13399l.getClass();
        C17073l c17073l = C17073l.crashlytics;
        c17073l.getClass();
        c17073l.yandex(abstractC13399l.getClass()).loadAd(abstractC13399l);
        abstractC13399l.startapp();
        return this.f19242l;
    }

    public final void purchase() {
        if (this.f19242l.metrica()) {
            return;
        }
        AbstractC13399l abstractC13399lAds = this.f19243l.ads();
        AbstractC13399l abstractC13399l = this.f19242l;
        C17073l c17073l = C17073l.crashlytics;
        c17073l.getClass();
        c17073l.yandex(abstractC13399lAds.getClass()).yandex(abstractC13399lAds, abstractC13399l);
        this.f19242l = abstractC13399lAds;
    }

    public final AbstractC13399l yandex() {
        AbstractC13399l abstractC13399lCrashlytics = crashlytics();
        abstractC13399lCrashlytics.getClass();
        if (AbstractC13399l.vip(abstractC13399lCrashlytics, true)) {
            return abstractC13399lCrashlytics;
        }
        throw new C14816l();
    }
}
