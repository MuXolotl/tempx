package defpackage;

/* JADX INFO: renamed from: lًٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7986l implements Cloneable, InterfaceC16189l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC15603l f16649l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC15603l f16650l;

    public AbstractC7986l(AbstractC15603l abstractC15603l) {
        this.f16650l = abstractC15603l;
        if (abstractC15603l.firebase()) {
            C8339l.metrica("Default instance must be immutable.");
            throw null;
        }
        this.f16649l = (AbstractC15603l) abstractC15603l.remoteconfig(4, null);
    }

    public /* bridge */ AbstractC1251l amazon() {
        return crashlytics();
    }

    public void billing() {
        AbstractC15603l abstractC15603l = (AbstractC15603l) this.f16650l.remoteconfig(4, null);
        C13940l.crashlytics.yandex(abstractC15603l.getClass()).mopub(abstractC15603l, this.f16649l);
        this.f16649l = abstractC15603l;
    }

    public final Object clone() {
        AbstractC7986l abstractC7986l = (AbstractC7986l) this.f16650l.remoteconfig(5, null);
        abstractC7986l.f16649l = crashlytics();
        return abstractC7986l;
    }

    public AbstractC15603l crashlytics() {
        boolean zFirebase = this.f16649l.firebase();
        AbstractC15603l abstractC15603l = this.f16649l;
        if (!zFirebase) {
            return abstractC15603l;
        }
        abstractC15603l.getClass();
        C13940l.crashlytics.yandex(abstractC15603l.getClass()).yandex(abstractC15603l);
        abstractC15603l.mopub();
        return this.f16649l;
    }

    public final AbstractC15603l loadAd() {
        AbstractC15603l abstractC15603lCrashlytics = crashlytics();
        if (AbstractC15603l.isPro(abstractC15603lCrashlytics, true)) {
            return abstractC15603lCrashlytics;
        }
        throw new C1360l();
    }

    public final void purchase() {
        if (this.f16649l.firebase()) {
            return;
        }
        billing();
    }

    @Override // defpackage.InterfaceC16189l
    public final boolean yandex() {
        return AbstractC15603l.isPro(this.f16649l, false);
    }
}
