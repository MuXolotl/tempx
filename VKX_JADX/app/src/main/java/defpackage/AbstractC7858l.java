package defpackage;

/* JADX INFO: renamed from: lًًً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7858l implements Cloneable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC12946l f16394l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC12946l f16395l;

    public AbstractC7858l(AbstractC12946l abstractC12946l) {
        this.f16395l = abstractC12946l;
        if (abstractC12946l.admob()) {
            C8339l.metrica("Default instance must be immutable.");
            throw null;
        }
        this.f16394l = abstractC12946l.isPro();
    }

    public static void amazon(Object obj, Object obj2) {
        C10738l c10738l = C10738l.crashlytics;
        c10738l.getClass();
        c10738l.yandex(obj.getClass()).yandex(obj, obj2);
    }

    public final Object clone() {
        AbstractC7858l abstractC7858l = (AbstractC7858l) this.f16395l.amazon(5);
        abstractC7858l.f16394l = loadAd();
        return abstractC7858l;
    }

    public final void crashlytics() {
        if (this.f16394l.admob()) {
            return;
        }
        AbstractC12946l abstractC12946lIsPro = this.f16395l.isPro();
        amazon(abstractC12946lIsPro, this.f16394l);
        this.f16394l = abstractC12946lIsPro;
    }

    public final AbstractC12946l loadAd() {
        boolean zAdmob = this.f16394l.admob();
        AbstractC12946l abstractC12946l = this.f16394l;
        if (!zAdmob) {
            return abstractC12946l;
        }
        abstractC12946l.getClass();
        C10738l c10738l = C10738l.crashlytics;
        c10738l.getClass();
        c10738l.yandex(abstractC12946l.getClass()).loadAd(abstractC12946l);
        abstractC12946l.subs();
        return this.f16394l;
    }

    public final AbstractC12946l yandex() {
        AbstractC12946l abstractC12946lLoadAd = loadAd();
        abstractC12946lLoadAd.getClass();
        if (AbstractC12946l.mopub(abstractC12946lLoadAd, true)) {
            return abstractC12946lLoadAd;
        }
        throw new C8491l();
    }
}
