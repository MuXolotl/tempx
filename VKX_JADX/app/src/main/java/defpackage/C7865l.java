package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lًًٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7865l {
    public static final C13708l subscription;
    public final ConcurrentHashMap adcel;
    public final long admob;
    public long ads;
    public final long amazon;
    public final long billing;
    public final C13326l crashlytics;
    public final long firebase;
    public final long isPro;
    public final C3904l loadAd;
    public final long metrica;
    public final long mopub;
    public final long purchase;
    public final boolean remoteconfig;
    public final int smaato;
    public final AbstractC13675l startapp;
    public final long subs;
    public final boolean vip;
    public final C4322l yandex;

    static {
        C9258l c9258l = AbstractC1186l.f3181l;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        AbstractC13743l.yandex(6, objArr);
        subscription = AbstractC1186l.vip(6, objArr);
    }

    public C7865l(C13326l c13326l, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, Map map) {
        yandex(i5, 0, "bufferForPlaybackMs", "0");
        yandex(i6, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        yandex(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        yandex(i8, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        yandex(i, i5, "minBufferMs", "bufferForPlaybackMs");
        yandex(i2, i6, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        yandex(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        yandex(i2, i8, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        yandex(i3, i, "maxBufferMs", "minBufferMs");
        yandex(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        yandex(i9, 0, "backBufferDurationMs", "0");
        this.yandex = new C4322l();
        this.loadAd = new C3904l();
        this.crashlytics = c13326l;
        this.amazon = AbstractC15323l.m3962continue(i);
        this.purchase = AbstractC15323l.m3962continue(i2);
        this.billing = AbstractC15323l.m3962continue(i3);
        this.mopub = AbstractC15323l.m3962continue(i4);
        this.admob = AbstractC15323l.m3962continue(i5);
        this.subs = AbstractC15323l.m3962continue(i6);
        this.isPro = AbstractC15323l.m3962continue(i7);
        this.firebase = AbstractC15323l.m3962continue(i8);
        this.smaato = -1;
        this.remoteconfig = z;
        this.vip = true;
        this.metrica = AbstractC15323l.m3962continue(i9);
        this.adcel = new ConcurrentHashMap();
        this.startapp = AbstractC13675l.loadAd(map);
        this.ads = -1L;
    }

    public static void yandex(int i, int i2, String str, String str2) {
        AbstractC12442l.firebase(i >= i2, "%s cannot be less than %s", str, str2);
    }

    public final void crashlytics() {
        boolean zIsEmpty = this.adcel.isEmpty();
        C13326l c13326l = this.crashlytics;
        int i = 0;
        if (zIsEmpty) {
            synchronized (c13326l) {
                if (c13326l.f26153l) {
                    c13326l.yandex(0);
                }
            }
        } else {
            Iterator it = this.adcel.values().iterator();
            while (it.hasNext()) {
                i += ((C2492l) it.next()).crashlytics;
            }
            c13326l.yandex(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    public final boolean loadAd(C12576l c12576l) {
        int i;
        boolean z;
        C17849l c17849l = c12576l.yandex;
        long j = c12576l.amazon;
        C2492l c2492l = (C2492l) this.adcel.get(c17849l);
        c2492l.getClass();
        C2492l c2492l2 = (C2492l) this.adcel.get(c17849l);
        c2492l2.getClass();
        synchronized (c2492l2) {
            i = c2492l2.amazon;
        }
        int i2 = i * this.crashlytics.f26152l;
        C2492l c2492l3 = (C2492l) this.adcel.get(c17849l);
        c2492l3.getClass();
        boolean z2 = i2 >= c2492l3.crashlytics;
        if (c17849l.equals(C17849l.amazon)) {
            return !z2;
        }
        AbstractC10759l abstractC10759l = c12576l.loadAd;
        C17805l c17805l = abstractC10759l.remoteconfig(abstractC10759l.mopub(c12576l.crashlytics.yandex, this.loadAd).crashlytics, this.yandex, 0L).crashlytics.loadAd;
        if (c17805l == null) {
            z = false;
        } else {
            String scheme = c17805l.yandex.getScheme();
            if (TextUtils.isEmpty(scheme) || subscription.contains(scheme)) {
                z = true;
            } else {
                z = false;
            }
        }
        long jMin = z ? this.purchase : this.amazon;
        long j2 = z ? this.mopub : this.billing;
        float f = c12576l.purchase;
        if (f > 1.0f) {
            jMin = Math.min(AbstractC15323l.appmetrica(f, jMin), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            boolean z3 = (z ? this.vip : this.remoteconfig) || !z2;
            c2492l.loadAd = z3;
            if (!z3 && j < 500000) {
                AbstractC6427l.vip("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z2) {
            c2492l.loadAd = false;
        }
        return c2492l.loadAd;
    }
}
