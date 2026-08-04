package defpackage;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؙُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16948l implements InterfaceC6795l, InterfaceC9526l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f33057l;

    public /* synthetic */ C16948l(Object obj) {
        this.f33057l = obj;
    }

    public void amazon(long j, long j2) {
        C11569l c11569l = (C11569l) this.f33057l;
        c11569l.mo211l();
        C17417l c17417l = (C17417l) c11569l.f833l;
        if (c17417l.yandex()) {
            C16386l c16386l = c17417l.f33944l;
            C17417l.billing(c16386l);
            c16386l.f32049l.purchase(j);
            c17417l.f33951l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.loadAd(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            C11675l c11675l = c17417l.f33927l;
            C17417l.mopub(c11675l);
            c11675l.m3197l(j, lValueOf, "auto", "_sid");
            C17417l.billing(c16386l);
            c16386l.f32061l.purchase(j3);
            c16386l.f32041l.loadAd(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            C17417l.mopub(c11675l);
            c11675l.m3186l(j, j2, bundle, "auto", "_s");
            String strPro = c16386l.f32062l.pro();
            if (TextUtils.isEmpty(strPro)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strPro);
            C17417l.mopub(c11675l);
            c11675l.m3186l(j, j2, bundle2, "auto", "_ssr");
        }
    }

    @Override // defpackage.InterfaceC9526l
    public ListenableFuture call() {
        C18289l c18289l = (C18289l) this.f33057l;
        ExecutorC1688l executorC1688l = (ExecutorC1688l) c18289l.purchase;
        try {
            return AbstractC7151l.purchase(c18289l.vip((Uri) AbstractC7151l.crashlytics((ListenableFuture) c18289l.crashlytics)));
        } catch (IOException e) {
            C13464l c13464l = (C13464l) c18289l.mopub;
            c13464l.getClass();
            if ((e instanceof C1409l) || (e.getCause() instanceof C1409l)) {
                return AbstractC7151l.amazon(e);
            }
            C1004l c1004l = (C1004l) c13464l.f26403l;
            c1004l.getClass();
            return AbstractC7151l.admob(!(e.getCause() instanceof C9893l) ? AbstractC7151l.amazon(e) : AbstractC7151l.loadAd(AbstractC7151l.admob(AbstractC7151l.purchase(c1004l.yandex), AbstractC6854l.loadAd(new C9496l(c18289l, 2)), executorC1688l), IOException.class, new C11651l(5, e), EnumC1535l.f3808l), AbstractC6854l.loadAd(new C9496l(c18289l, 1)), executorC1688l);
        }
    }

    public void crashlytics(long j, long j2) {
        C11569l c11569l = (C11569l) this.f33057l;
        c11569l.mo211l();
        c11569l.m3136l();
        C17417l c17417l = (C17417l) c11569l.f833l;
        C16386l c16386l = c17417l.f33944l;
        C17417l.billing(c16386l);
        if (c16386l.m4183l(j)) {
            C17417l.billing(c16386l);
            c16386l.f32041l.loadAd(true);
            c17417l.remoteconfig().m2819l();
        }
        C17417l.billing(c16386l);
        c16386l.f32049l.purchase(j);
        if (c16386l.f32041l.yandex()) {
            amazon(j, j2);
        }
    }

    public void loadAd() {
        long jElapsedRealtime;
        C11569l c11569l = (C11569l) this.f33057l;
        c11569l.mo211l();
        C17417l c17417l = (C17417l) c11569l.f833l;
        C16386l c16386l = c17417l.f33944l;
        C17417l.billing(c16386l);
        C18450l c18450l = c17417l.f33951l;
        c18450l.getClass();
        if (c16386l.m4183l(System.currentTimeMillis())) {
            C16386l c16386l2 = c17417l.f33944l;
            C17417l.billing(c16386l2);
            c16386l2.f32041l.loadAd(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16911l.yandex("Detected application was in foreground");
                c18450l.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12677l)) {
                    c18450l.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                amazon(jCurrentTimeMillis, jElapsedRealtime);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009d A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:30:0x007d, B:32:0x0081, B:34:0x0085, B:39:0x0092, B:44:0x009d, B:45:0x00a7), top: B:57:0x007d }] */
    @Override // defpackage.InterfaceC6795l
    public void yandex(Object obj) {
        boolean z;
        boolean z2;
        C12224l c12224l = (C12224l) obj;
        try {
            byte[] bArr = (byte[]) this.f33057l;
            C11337l c11337l = C11337l.yandex;
            int i = AbstractC5004l.yandex;
            C18608l c18608lSignature = C18608l.Signature(bArr, C11337l.loadAd);
            boolean z3 = false;
            for (C4226l c4226l : c12224l.loadAd.billing) {
                List listTapsense = c18608lSignature.tapsense();
                c4226l.getClass();
                C5321l c5321l = C10316l.subs;
                c5321l.getClass();
                if (listTapsense == null || listTapsense.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = listTapsense.iterator();
                    z = false;
                    while (it.hasNext()) {
                        C15635l c15635l = (C15635l) ((ConcurrentHashMap) c5321l.f11449l).get((String) it.next());
                        if (c15635l != null) {
                            C10316l c10316l = c15635l.yandex;
                            if (c10316l.purchase) {
                                C18480l c18480l = c10316l.yandex;
                                if (c18480l != null && (c18480l.f36085l || ((C9754l) c18480l.f36089l).f19893l == 3 || c10316l.admob.loadAd())) {
                                    synchronized (c10316l) {
                                        try {
                                            C18480l c18480l2 = c10316l.yandex;
                                            if (c18480l2 != null) {
                                                if (c18480l2.f36085l) {
                                                    c10316l.yandex = null;
                                                    c10316l.mopub.yandex.incrementAndGet();
                                                } else if ((((C9754l) c18480l2.f36089l).f19893l == 3) || c10316l.admob.loadAd()) {
                                                    c10316l.yandex = null;
                                                    c10316l.mopub.yandex.incrementAndGet();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z |= z2;
                        }
                    }
                }
                if (z && !z3) {
                    c12224l.yandex.zza();
                    z3 = true;
                }
            }
        } catch (C9893l unused) {
            c12224l.getClass();
        }
    }

    public C16948l(BinderC15695l binderC15695l, byte[] bArr) {
        this.f33057l = bArr;
    }
}
