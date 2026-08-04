package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lٜؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1976l {
    public static boolean isPro = true;
    public final C14605l amazon;
    public final C17781l billing;
    public final C5633l mopub;
    public final InterfaceC3634l purchase;
    public boolean subs;
    public final AtomicInteger loadAd = new AtomicInteger(0);
    public final AtomicBoolean crashlytics = new AtomicBoolean(false);
    public final C11919l yandex = new C11919l((byte) 0, 11);
    public final C17855l admob = new C17855l();

    public C1976l(C7854l c7854l, C14605l c14605l, InterfaceC3634l interfaceC3634l, C17781l c17781l) {
        AbstractC1051l.isPro(c7854l, "MlKitContext can not be null");
        this.amazon = c14605l;
        this.purchase = interfaceC3634l;
        this.billing = c17781l;
        this.mopub = new C5633l(c7854l.loadAd());
    }

    public final void crashlytics(final EnumC5421l enumC5421l, long j, final C3049l c3049l, List list) {
        final appmetrica appmetricaVar = new appmetrica((byte) 0, 12);
        final appmetrica appmetricaVar2 = new appmetrica((byte) 0, 12);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8130l c8130l = (C8130l) it.next();
                int format = c8130l.yandex.getFormat();
                if (format > 4096 || format == 0) {
                    format = -1;
                }
                EnumC12536l enumC12536l = (EnumC12536l) AbstractC14693l.yandex.get(format);
                if (enumC12536l == null) {
                    enumC12536l = EnumC12536l.FORMAT_UNKNOWN;
                }
                appmetricaVar.m166static(enumC12536l);
                EnumC6850l enumC6850l = (EnumC6850l) AbstractC14693l.loadAd.get(c8130l.yandex.purchase());
                if (enumC6850l == null) {
                    enumC6850l = EnumC6850l.TYPE_UNKNOWN;
                }
                appmetricaVar2.m166static(enumC6850l);
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.billing.loadAd(new InterfaceC12852l() { // from class: lٖۣٕ
            @Override // defpackage.InterfaceC12852l
            public final C2888l zza() {
                int iLimit;
                EnumC8628l enumC8628l;
                C1976l c1976l = this.yandex;
                long j2 = jElapsedRealtime;
                EnumC5421l enumC5421l2 = enumC5421l;
                appmetrica appmetricaVar3 = appmetricaVar;
                appmetrica appmetricaVar4 = appmetricaVar2;
                C3049l c3049l2 = c3049l;
                C3557l c3557l = new C3557l();
                C3557l c3557l2 = new C3557l();
                c3557l2.f7480l = Long.valueOf(j2 & Long.MAX_VALUE);
                c3557l2.f7479l = enumC5421l2;
                c3557l2.f7478l = Boolean.valueOf(C1976l.isPro);
                Boolean bool = Boolean.TRUE;
                c3557l2.f7482l = bool;
                c3557l2.f7481l = bool;
                c3557l.f7480l = new C14215l(c3557l2);
                c3557l.f7479l = AbstractC14693l.yandex(c1976l.amazon);
                c3557l.f7478l = appmetricaVar3.m165final();
                c3557l.f7482l = appmetricaVar4.m165final();
                int i = c3049l2.billing;
                if (i == -1) {
                    Bitmap bitmap = c3049l2.yandex;
                    AbstractC1051l.subs(bitmap);
                    iLimit = bitmap.getAllocationByteCount();
                } else {
                    if (i == 17 || i == 842094169) {
                        AbstractC1051l.subs(null);
                        throw null;
                    }
                    if (i != 35) {
                        iLimit = 0;
                    } else {
                        Image.Plane[] planeArrYandex = c3049l2.yandex();
                        AbstractC1051l.subs(planeArrYandex);
                        iLimit = (planeArrYandex[0].getBuffer().limit() * 3) / 2;
                    }
                }
                C0848l c0848l = new C0848l(13);
                if (i == -1) {
                    enumC8628l = EnumC8628l.BITMAP;
                } else if (i == 35) {
                    enumC8628l = EnumC8628l.YUV_420_888;
                } else if (i == 842094169) {
                    enumC8628l = EnumC8628l.YV12;
                } else if (i != 16) {
                    enumC8628l = i != 17 ? EnumC8628l.UNKNOWN_FORMAT : EnumC8628l.NV21;
                } else {
                    enumC8628l = EnumC8628l.NV16;
                }
                c0848l.f2499l = enumC8628l;
                c0848l.f2498l = Integer.valueOf(iLimit & Alert.DURATION_SHOW_INDEFINITELY);
                c3557l.f7481l = new C8273l(c0848l);
                C1424l c1424l = new C1424l();
                c1424l.f3601l = c1976l.subs ? EnumC14285l.TYPE_THICK : EnumC14285l.TYPE_THIN;
                c1424l.f3605l = new C3246l(c3557l);
                return new C2888l(c1424l, 0);
            }
        }, EnumC7663l.ON_DEVICE_BARCODE_DETECT);
        C3557l c3557l = new C3557l();
        c3557l.f7480l = enumC5421l;
        c3557l.f7479l = Boolean.valueOf(isPro);
        c3557l.f7478l = AbstractC14693l.yandex(this.amazon);
        c3557l.f7482l = appmetricaVar.m165final();
        c3557l.f7481l = appmetricaVar2.m165final();
        final C15131l c15131l = new C15131l(c3557l);
        final C15053l c15053l = new C15053l(this);
        final C17781l c17781l = this.billing;
        EnumC7663l enumC7663l = EnumC7663l.UNKNOWN_EVENT;
        EnumC1150l.f3126l.execute(new Runnable() { // from class: lٖۣؒ
            {
                EnumC7663l enumC7663l2 = EnumC7663l.UNKNOWN_EVENT;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EnumC7663l enumC7663l2 = EnumC7663l.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                C17781l c17781l2 = c17781l;
                HashMap map = c17781l2.isPro;
                if (!map.containsKey(enumC7663l2)) {
                    map.put(enumC7663l2, new C14164l());
                }
                C14164l c14164l = (C14164l) map.get(enumC7663l2);
                Long lValueOf = Long.valueOf(jElapsedRealtime);
                C6756l c6756l = c14164l.f27696l;
                C15131l c15131l2 = c15131l;
                Collection collection = (Collection) c6756l.get(c15131l2);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        C8339l.subs("New Collection violated the Collection spec");
                        return;
                    }
                    c6756l.put(c15131l2, arrayList);
                } else {
                    collection.add(lValueOf);
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (c17781l2.amazon(enumC7663l2, jElapsedRealtime2)) {
                    c17781l2.subs.put(enumC7663l2, Long.valueOf(jElapsedRealtime2));
                    EnumC1150l.f3126l.execute(new RunnableC16301l(c17781l2, c15053l));
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = this.subs;
        long j2 = jCurrentTimeMillis - jElapsedRealtime;
        C5633l c5633l = this.mopub;
        int i = true != z ? 24301 : 24302;
        int i2 = enumC5421l.f11620l;
        synchronized (c5633l) {
            AtomicLong atomicLong = (AtomicLong) c5633l.f11985l;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && jElapsedRealtime2 - ((AtomicLong) c5633l.f11985l).get() <= 1800000) {
                return;
            }
            ((C7560l) c5633l.f11986l).mopub(new C12798l(0, Arrays.asList(new C0152l(i, i2, 0, j2, jCurrentTimeMillis, null, null, 0, -1)))).crashlytics(new C3253l(c5633l, jElapsedRealtime2, 10));
        }
    }

    public final List loadAd(C3049l c3049l) throws Throwable {
        C1976l c1976l;
        C3049l c3049l2;
        synchronized (this) {
            try {
                try {
                    C17855l c17855l = this.admob;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c17855l.yandex(c3049l);
                    try {
                        ArrayList arrayListYandex = this.purchase.yandex(c3049l);
                        c1976l = this;
                        c3049l2 = c3049l;
                        try {
                            c1976l.crashlytics(EnumC5421l.NO_ERROR, jElapsedRealtime, c3049l2, arrayListYandex);
                            isPro = false;
                            return arrayListYandex;
                        } catch (C12397l e) {
                            e = e;
                            C12397l c12397l = e;
                            c1976l.crashlytics(c12397l.f24492l == 14 ? EnumC5421l.MODEL_NOT_DOWNLOADED : EnumC5421l.UNKNOWN_ERROR, jElapsedRealtime, c3049l2, null);
                            throw c12397l;
                        }
                    } catch (C12397l e2) {
                        e = e2;
                        c1976l = this;
                        c3049l2 = c3049l;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public final C3823l yandex(Executor executor, Callable callable, C5008l c5008l) {
        AbstractC1051l.smaato(this.loadAd.get() > 0);
        if (((C3823l) c5008l.f10245l).firebase()) {
            C3823l c3823l = new C3823l();
            c3823l.adcel();
            return c3823l;
        }
        C1770l c1770l = new C1770l(7);
        C2350l c2350l = new C2350l((C5008l) c1770l.f4179l);
        this.yandex.Signature(new RunnableC7698l(this, c5008l, c1770l, callable, c2350l), new ExecutorC12937l(executor, c5008l, c1770l, c2350l));
        return c2350l.yandex;
    }
}
