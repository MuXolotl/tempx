package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٍٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4018l implements InterfaceC18044l, InterfaceC5127l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f8256l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f8257l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8258l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f8259l;

    public /* synthetic */ C4018l(boolean z, Object obj, Object obj2, Object obj3) {
        this.f8257l = obj;
        this.f8256l = obj2;
        this.f8258l = z;
        this.f8259l = obj3;
    }

    @Override // defpackage.InterfaceC5127l
    public void purchase(Exception exc) throws Throwable {
        C9516l c9516l = (C9516l) this.f8257l;
        C2350l c2350l = (C2350l) this.f8256l;
        C4635l c4635l = (C4635l) this.f8259l;
        if (exc != null) {
            c2350l.crashlytics(exc);
            return;
        }
        if (this.f8258l) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new RunnableC10311l(c9516l, countDownLatch, 8)).start();
            ExecutorService executorService = AbstractC14730l.yandex;
            boolean z2 = false;
            try {
                long jNanoTime = 2000000000;
                long jNanoTime2 = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            jNanoTime = jNanoTime2 - System.nanoTime();
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        c2350l.amazon(c4635l);
    }

    @Override // defpackage.InterfaceC18044l
    public C13708l subs(int i, C11916l c11916l, int[] iArr) {
        C16717l c16717l = (C16717l) this.f8257l;
        C9205l c9205l = (C9205l) this.f8256l;
        int[] iArr2 = (int[]) this.f8259l;
        c16717l.getClass();
        C16337l c16337l = new C16337l(c16717l, c9205l);
        int i2 = iArr2[i];
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (int i3 = 0; i3 < c11916l.yandex; i3++) {
            c16971lMetrica.crashlytics(new C3121l(i, c11916l, i3, c9205l, iArr[i3], this.f8258l, c16337l, i2));
        }
        return c16971lMetrica.mopub();
    }
}
