package defpackage;

/* JADX INFO: renamed from: lؚؑۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0178l extends AbstractC14506l {
    @Override // defpackage.AbstractC14506l
    public final void admob(C16075l c16075l, C16075l c16075l2) {
        c16075l.loadAd = c16075l2;
    }

    @Override // defpackage.AbstractC14506l
    public final boolean crashlytics(AbstractC4867l abstractC4867l, C16075l c16075l, C16075l c16075l2) {
        synchronized (abstractC4867l) {
            try {
                if (abstractC4867l.f9930l != c16075l) {
                    return false;
                }
                abstractC4867l.f9930l = c16075l2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC14506l
    public final boolean loadAd(AbstractC4867l abstractC4867l, Object obj, Object obj2) {
        synchronized (abstractC4867l) {
            try {
                if (abstractC4867l.f9932l != obj) {
                    return false;
                }
                abstractC4867l.f9932l = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC14506l
    public final void subs(C16075l c16075l, Thread thread) {
        c16075l.yandex = thread;
    }

    @Override // defpackage.AbstractC14506l
    public final boolean yandex(AbstractC4867l abstractC4867l, C6755l c6755l, C6755l c6755l2) {
        synchronized (abstractC4867l) {
            try {
                if (abstractC4867l.f9931l != c6755l) {
                    return false;
                }
                abstractC4867l.f9931l = c6755l2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
