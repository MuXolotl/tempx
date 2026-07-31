package defpackage;

/* JADX INFO: renamed from: lْٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C13716l extends AbstractC8769l {
    public final void isPro(Object obj) {
        boolean z;
        synchronized (this.yandex) {
            z = this.billing == AbstractC8769l.firebase;
            this.billing = obj;
        }
        if (z) {
            C0508l.purchase().billing(this.isPro);
        }
    }

    @Override // defpackage.AbstractC8769l
    public final void subs(Object obj) {
        AbstractC8769l.yandex("setValue");
        this.mopub++;
        this.purchase = obj;
        crashlytics(null);
    }
}
