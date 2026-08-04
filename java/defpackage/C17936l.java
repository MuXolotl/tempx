package defpackage;

/* JADX INFO: renamed from: lٕ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17936l extends AbstractC16670l {
    @Override // defpackage.AbstractC16670l
    public final C12054l admob(AbstractC2722l abstractC2722l) {
        C12054l c12054l;
        C12054l c12054l2 = C12054l.crashlytics;
        synchronized (abstractC2722l) {
            try {
                c12054l = abstractC2722l.f5917l;
                if (c12054l != c12054l2) {
                    abstractC2722l.f5917l = c12054l2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c12054l;
    }

    @Override // defpackage.AbstractC16670l
    public final boolean amazon(AbstractC2722l abstractC2722l, C12054l c12054l, C12054l c12054l2) {
        synchronized (abstractC2722l) {
            try {
                if (abstractC2722l.f5917l != c12054l) {
                    return false;
                }
                abstractC2722l.f5917l = c12054l2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC16670l
    public final boolean crashlytics(AbstractC2722l abstractC2722l, Object obj, Object obj2) {
        synchronized (abstractC2722l) {
            try {
                if (abstractC2722l.f5919l != obj) {
                    return false;
                }
                abstractC2722l.f5919l = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC16670l
    public final boolean loadAd(AbstractC2722l abstractC2722l, C0181l c0181l, C0181l c0181l2) {
        synchronized (abstractC2722l) {
            try {
                if (abstractC2722l.f5918l != c0181l) {
                    return false;
                }
                abstractC2722l.f5918l = c0181l2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC16670l
    public final C0181l mopub(AbstractC2722l abstractC2722l) {
        C0181l c0181l;
        C0181l c0181l2 = C0181l.amazon;
        synchronized (abstractC2722l) {
            try {
                c0181l = abstractC2722l.f5918l;
                if (c0181l != c0181l2) {
                    abstractC2722l.f5918l = c0181l2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0181l;
    }

    @Override // defpackage.AbstractC16670l
    public final void remoteconfig(C12054l c12054l, C12054l c12054l2) {
        c12054l.loadAd = c12054l2;
    }

    @Override // defpackage.AbstractC16670l
    public final void vip(C12054l c12054l, Thread thread) {
        c12054l.yandex = thread;
    }
}
