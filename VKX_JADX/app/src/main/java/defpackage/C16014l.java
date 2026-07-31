package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lٕۣؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16014l extends AbstractC4416l {

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final C0022l f31391package = new C0022l("CastClient", null);

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final C3797l f31392synchronized = new C3797l("Cast.API_CXLESS", new C5795l(5), AbstractC14983l.yandex);
    public String Signature;
    public int ad;
    public final AtomicLong adcel;
    public final Object ads;
    public int advert;
    public final HashMap applovin;
    public final C1021l appmetrica;
    public final BinderC3747l firebase;
    public final List inmobi;
    public C10121l isVip;
    public double license;
    public C2350l metrica;
    public final HashMap premium;
    public boolean pro;
    public boolean remoteconfig;
    public final CastDevice signatures;
    public HandlerC4052l smaato;
    public C2350l startapp;
    public final Object subscription;
    public C5040l tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public int f31393throws;
    public boolean vip;

    public C16014l(Context context, C11552l c11552l) {
        super(context, f31392synchronized, c11552l, C1308l.crashlytics);
        this.firebase = new BinderC3747l(this);
        this.ads = new Object();
        this.subscription = new Object();
        this.inmobi = DesugarCollections.synchronizedList(new ArrayList());
        this.appmetrica = c11552l.crashlytics;
        this.signatures = c11552l.loadAd;
        this.premium = new HashMap();
        this.applovin = new HashMap();
        this.adcel = new AtomicLong(0L);
        this.f31393throws = 1;
        firebase();
    }

    public final Handler admob() {
        if (this.smaato == null) {
            this.smaato = new HandlerC4052l(this.mopub, 6);
        }
        return this.smaato;
    }

    public final void billing(int i) {
        synchronized (this.subscription) {
            try {
                C2350l c2350l = this.startapp;
                if (c2350l == null) {
                    return;
                }
                if (i == 0) {
                    c2350l.loadAd(new Status(0, null, null, null));
                } else {
                    c2350l.yandex(AbstractC5578l.amazon(new Status(i, null, null, null)));
                }
                this.startapp = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void firebase() {
        CastDevice castDevice = this.signatures;
        C14513l c14513l = castDevice.f534l;
        if (c14513l.m3860synchronized(2048) || !c14513l.m3860synchronized(4) || c14513l.m3860synchronized(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f531l);
    }

    public final void isPro(int i) {
        synchronized (this.ads) {
            try {
                C2350l c2350l = this.metrica;
                if (c2350l != null) {
                    c2350l.yandex(AbstractC5578l.amazon(new Status(i, null, null, null)));
                }
                this.metrica = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void mopub(int i, long j) {
        C2350l c2350l;
        HashMap map = this.premium;
        synchronized (map) {
            Long lValueOf = Long.valueOf(j);
            c2350l = (C2350l) map.get(lValueOf);
            map.remove(lValueOf);
        }
        if (c2350l != null) {
            if (i == 0) {
                c2350l.loadAd(null);
            } else {
                c2350l.yandex(AbstractC5578l.amazon(new Status(i, null, null, null)));
            }
        }
    }

    public final void subs() {
        f31391package.loadAd("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap map = this.applovin;
        synchronized (map) {
            map.clear();
        }
    }
}
