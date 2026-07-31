package defpackage;

/* JADX INFO: renamed from: lٍؙْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13248l extends AbstractC1207l implements Runnable {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Runnable f26022l;

    public RunnableC13248l(Runnable runnable) {
        runnable.getClass();
        this.f26022l = runnable;
    }

    @Override // defpackage.AbstractC1207l
    public final String purchase() {
        String string = this.f26022l.toString();
        return AbstractC9361l.ad(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26022l.run();
        } catch (Throwable th) {
            if (AbstractC13813l.f26938l.metrica(this, null, new C11466l(th))) {
                AbstractC1207l.mopub(this);
            }
            throw th;
        }
    }
}
