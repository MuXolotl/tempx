package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lؘؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0147l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C3565l f1051l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10316l f1052l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1053l;

    public /* synthetic */ RunnableC0147l(C10316l c10316l, C3565l c3565l, int i) {
        this.f1053l = i;
        this.f1052l = c10316l;
        this.f1051l = c3565l;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[Catch: CancellationException -> 0x0026, ExecutionException -> 0x0028, TryCatch #4 {CancellationException -> 0x0026, ExecutionException -> 0x0028, blocks: (B:5:0x0009, B:7:0x0021, B:20:0x0033, B:22:0x0044, B:24:0x0050, B:30:0x0060, B:32:0x0064, B:14:0x002a, B:35:0x0093), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[Catch: CancellationException -> 0x0026, ExecutionException -> 0x0028, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0026, ExecutionException -> 0x0028, blocks: (B:5:0x0009, B:7:0x0021, B:20:0x0033, B:22:0x0044, B:24:0x0050, B:30:0x0060, B:32:0x0064, B:14:0x002a, B:35:0x0093), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        C18480l c18480l;
        C15333l c15333l;
        C15333l c15333l2;
        InterfaceC7674l interfaceC7674l;
        switch (this.f1053l) {
            case 0:
                C10316l c10316l = this.f1052l;
                try {
                    AbstractC7151l.crashlytics(this.f1051l);
                    return;
                } catch (Exception e) {
                    String str = c10316l.crashlytics;
                    Log.w("FlagStore", AbstractC9361l.ad(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e);
                    return;
                }
            default:
                C10316l c10316l2 = this.f1052l;
                try {
                    C15643l c15643l = (C15643l) AbstractC7151l.crashlytics(this.f1051l);
                    C18480l c18480l2 = new C18480l(c15643l, new C9754l(6, 2, 10));
                    boolean z = c10316l2.purchase;
                    if (z || (c18480l = c10316l2.yandex) == null) {
                        synchronized (c10316l2) {
                            if (!z) {
                                c18480l = c10316l2.yandex;
                                if (c18480l != null) {
                                    c15333l = (C15333l) c18480l.f36087l;
                                    c15333l2 = (C15333l) c18480l2.f36087l;
                                    c15333l.getClass();
                                    if (!AbstractC5573l.amazon(c15333l2, c15333l)) {
                                        interfaceC7674l = (InterfaceC7674l) c10316l2.loadAd.purchase.get();
                                        if (interfaceC7674l != null) {
                                            interfaceC7674l.zza();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            c10316l2.yandex = c18480l2;
                            c10316l2.mopub.yandex.incrementAndGet();
                        }
                    } else {
                        c15333l = (C15333l) c18480l.f36087l;
                        c15333l2 = (C15333l) c18480l2.f36087l;
                        c15333l.getClass();
                        if (!AbstractC5573l.amazon(c15333l2, c15333l)) {
                            interfaceC7674l = (InterfaceC7674l) c10316l2.loadAd.purchase.get();
                            if (interfaceC7674l != null) {
                                interfaceC7674l.zza();
                                return;
                            }
                            return;
                        }
                    }
                    if (c10316l2.purchase) {
                        C7447l c7447l = c10316l2.loadAd;
                        C18222l c18222l = (C18222l) c7447l.amazon.get();
                        String strTapsense = c15643l.tapsense();
                        c18222l.getClass();
                        strTapsense.getClass();
                        AbstractC7151l.yandex(C18222l.loadAd(c18222l.yandex.billing(strTapsense)), Throwable.class, new C1164l(1, c10316l2), c7447l.yandex());
                        return;
                    }
                    return;
                } catch (CancellationException e2) {
                    e = e2;
                    if (e.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str2 = c10316l2.crashlytics;
                    Log.w("FlagStore", AbstractC9361l.ad(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    if (e.getCause() instanceof SecurityException) {
                        String str3 = c10316l2.crashlytics;
                        Log.w("FlagStore", AbstractC9361l.ad(new StringBuilder(String.valueOf(str3).length() + 64), "Unable to update local snapshot for ", str3, ", may result in stale flags."), e);
                        return;
                    }
                    return;
                }
        }
    }
}
