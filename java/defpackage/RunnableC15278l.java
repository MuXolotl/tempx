package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lۣٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC15278l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f29877l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29878l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29879l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f29880l;

    public /* synthetic */ RunnableC15278l(Object obj, Object obj2, Object obj3, int i) {
        this.f29879l = i;
        this.f29878l = obj;
        this.f29877l = obj2;
        this.f29880l = obj3;
    }

    private final void yandex() {
        boolean zBooleanValue;
        C5648l c5648l = (C5648l) this.f29878l;
        C16565l c16565l = (C16565l) this.f29877l;
        C11120l c11120l = (C11120l) this.f29880l;
        c5648l.getClass();
        try {
            zBooleanValue = ((Boolean) c16565l.f32512l.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        synchronized (c5648l.firebase) {
            try {
                C0350l c0350lIsPro = AbstractC3605l.isPro(c11120l.yandex);
                String str = c0350lIsPro.yandex;
                if (c5648l.amazon(str) == c11120l) {
                    c5648l.loadAd(str);
                }
                C14513l.tapsense().vip(C5648l.smaato, C5648l.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                Iterator it = c5648l.isPro.iterator();
                while (it.hasNext()) {
                    ((InterfaceC18230l) it.next()).loadAd(c0350lIsPro, zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02d0  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d4, code lost:
    
        if (((defpackage.C15691l) r15.admob) == r5) goto L134;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC15278l.run():void");
    }
}
