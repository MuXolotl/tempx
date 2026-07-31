package defpackage;

/* JADX INFO: renamed from: lؘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18425l extends AbstractC17549l {
    @Override // defpackage.AbstractC17549l
    public final boolean firebase(AbstractC13813l abstractC13813l, C14714l c14714l, C14714l c14714l2) {
        synchronized (abstractC13813l) {
            try {
                if (abstractC13813l.f26942l != c14714l) {
                    return false;
                }
                abstractC13813l.f26942l = c14714l2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC17549l
    public final void isPro(C14714l c14714l, C14714l c14714l2) {
        c14714l.loadAd = c14714l2;
    }

    @Override // defpackage.AbstractC17549l
    public final boolean metrica(AbstractC13813l abstractC13813l, Object obj, Object obj2) {
        synchronized (abstractC13813l) {
            try {
                if (abstractC13813l.f26944l != obj) {
                    return false;
                }
                abstractC13813l.f26944l = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC17549l
    public final C14714l remoteconfig(AbstractC1207l abstractC1207l) {
        C14714l c14714l;
        C14714l c14714l2 = C14714l.crashlytics;
        synchronized (abstractC1207l) {
            try {
                c14714l = abstractC1207l.f26942l;
                if (c14714l != c14714l2) {
                    abstractC1207l.f26942l = c14714l2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14714l;
    }

    @Override // defpackage.AbstractC17549l
    public final boolean smaato(AbstractC13813l abstractC13813l, C14266l c14266l, C14266l c14266l2) {
        synchronized (abstractC13813l) {
            try {
                if (abstractC13813l.f26943l != c14266l) {
                    return false;
                }
                abstractC13813l.f26943l = c14266l2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC17549l
    public final void subs(C14714l c14714l, Thread thread) {
        c14714l.yandex = thread;
    }

    @Override // defpackage.AbstractC17549l
    public final C14266l vip(AbstractC1207l abstractC1207l) {
        C14266l c14266l;
        C14266l c14266l2 = C14266l.amazon;
        synchronized (abstractC1207l) {
            try {
                c14266l = abstractC1207l.f26943l;
                if (c14266l != c14266l2) {
                    abstractC1207l.f26943l = c14266l2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14266l;
    }
}
