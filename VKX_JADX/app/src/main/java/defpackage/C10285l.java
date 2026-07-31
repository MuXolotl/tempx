package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: lَٓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10285l extends AbstractC15422l {
    public final /* synthetic */ C15546l firebase;

    public C10285l(C15546l c15546l) {
        this.firebase = c15546l;
    }

    @Override // defpackage.AbstractC15422l
    public final void billing(C12014l c12014l) {
        C15546l c15546l = this.firebase;
        c15546l.crashlytics = c12014l;
        C12014l c12014l2 = (C12014l) c15546l.crashlytics;
        C12304l c12304l = (C12304l) c15546l.yandex;
        c15546l.loadAd = new C18449l(c12014l2, c12304l.mopub, c12304l.subs, Build.VERSION.SDK_INT >= 34 ? AbstractC7290l.yandex() : AbstractC7902l.loadAd());
        C12304l c12304l2 = (C12304l) c15546l.yandex;
        ArrayList arrayList = new ArrayList();
        c12304l2.yandex.writeLock().lock();
        try {
            c12304l2.crashlytics = 1;
            arrayList.addAll(c12304l2.loadAd);
            c12304l2.loadAd.clear();
            c12304l2.yandex.writeLock().unlock();
            c12304l2.amazon.post(new RunnableC16326l(arrayList, c12304l2.crashlytics, (Throwable) null));
        } catch (Throwable th) {
            c12304l2.yandex.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.AbstractC15422l
    public final void purchase(Throwable th) {
        ((C12304l) this.firebase.yandex).billing(th);
    }
}
