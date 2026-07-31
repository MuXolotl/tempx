package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lَؙٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6643l {
    public int Signature;
    public String adcel;
    public String ads;
    public final C4039l billing;
    public String firebase;
    public C0189l isPro;
    public String metrica;
    public final String mopub;
    public C0386l remoteconfig;
    public String smaato;
    public String startapp;
    public final long subs;
    public String subscription;
    public String vip;
    public static final C0022l license = new C0022l("SessionFlowSummary", null);
    public static final String pro = "22.2.0";
    public static long ad = System.currentTimeMillis();
    public final C5885l yandex = new C5885l(1);
    public final List loadAd = DesugarCollections.synchronizedList(new ArrayList());
    public final List crashlytics = DesugarCollections.synchronizedList(new ArrayList());
    public final List amazon = DesugarCollections.synchronizedList(new ArrayList());
    public final Map purchase = DesugarCollections.synchronizedMap(new HashMap());
    public int tapsense = 0;
    public final long admob = System.currentTimeMillis();

    public C6643l(C4039l c4039l, String str) {
        this.billing = c4039l;
        this.mopub = str;
        long j = ad;
        ad = 1 + j;
        this.subs = j;
    }

    public final void loadAd(int i) {
        Integer numValueOf = Integer.valueOf(i - 1);
        Map map = this.purchase;
        C6075l c6075l = (C6075l) map.get(numValueOf);
        if (c6075l != null) {
            c6075l.amazon.incrementAndGet();
            c6075l.loadAd = System.currentTimeMillis();
        } else {
            C6075l c6075l2 = new C6075l(new C14513l(i, 24, (byte) 0));
            c6075l2.crashlytics = this.admob;
            map.put(numValueOf, c6075l2);
        }
    }

    public final void yandex(C0189l c0189l) {
        if (c0189l == null) {
            loadAd(2);
            return;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        CastDevice castDevice = c0189l.firebase;
        if (castDevice == null) {
            loadAd(3);
            return;
        }
        this.isPro = c0189l;
        String str = this.smaato;
        String str2 = castDevice.f533l;
        if (str != null) {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            loadAd(5);
            return;
        }
        this.smaato = str2;
        this.vip = castDevice.f531l;
        this.tapsense = castDevice.admob();
        C7851l c7851lMopub = castDevice.mopub();
        if (c7851lMopub != null) {
            this.metrica = c7851lMopub.f16382l;
            this.startapp = c7851lMopub.f16381l;
            this.adcel = c7851lMopub.f16384l;
            this.ads = c7851lMopub.f16376l;
            this.subscription = c7851lMopub.f16377l;
        }
        c0189l.loadAd();
    }
}
