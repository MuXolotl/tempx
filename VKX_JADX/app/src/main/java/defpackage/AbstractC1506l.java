package defpackage;

/* JADX INFO: renamed from: lؒۧۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1506l implements Cloneable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC17187l f3757l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC17187l f3758l;

    public AbstractC1506l(AbstractC17187l abstractC17187l) {
        this.f3758l = abstractC17187l;
        if (abstractC17187l.isPro()) {
            C8339l.metrica("Default instance must be immutable.");
            throw null;
        }
        this.f3757l = (AbstractC17187l) abstractC17187l.subs(4, null);
    }

    public final Object clone() {
        AbstractC1506l abstractC1506l = (AbstractC1506l) this.f3758l.subs(5, null);
        boolean zIsPro = this.f3757l.isPro();
        AbstractC17187l abstractC17187l = this.f3757l;
        if (zIsPro) {
            abstractC17187l.getClass();
            C12765l.crashlytics.yandex(abstractC17187l.getClass()).mopub(abstractC17187l);
            abstractC17187l.firebase();
            abstractC17187l = this.f3757l;
        }
        abstractC1506l.f3757l = abstractC17187l;
        return abstractC1506l;
    }

    public final AbstractC17187l loadAd() {
        boolean zIsPro = this.f3757l.isPro();
        AbstractC17187l abstractC17187l = this.f3757l;
        if (zIsPro) {
            abstractC17187l.getClass();
            C12765l.crashlytics.yandex(abstractC17187l.getClass()).mopub(abstractC17187l);
            abstractC17187l.firebase();
            abstractC17187l = this.f3757l;
        }
        abstractC17187l.getClass();
        boolean z = true;
        byte bByteValue = ((Byte) abstractC17187l.subs(1, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                z = false;
            } else {
                boolean zBilling = C12765l.crashlytics.yandex(abstractC17187l.getClass()).billing(abstractC17187l);
                abstractC17187l.subs(2, true == zBilling ? abstractC17187l : null);
                z = zBilling;
            }
        }
        if (z) {
            return abstractC17187l;
        }
        throw new C6451l("Message was missing required fields.  (Lite runtime could not determine which fields were missing).", 20, (byte) 0);
    }

    public final void yandex() {
        if (this.f3757l.isPro()) {
            return;
        }
        AbstractC17187l abstractC17187l = (AbstractC17187l) this.f3758l.subs(4, null);
        C12765l.crashlytics.yandex(abstractC17187l.getClass()).yandex(abstractC17187l, this.f3757l);
        this.f3757l = abstractC17187l;
    }
}
