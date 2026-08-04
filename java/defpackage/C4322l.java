package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: lؖۖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4322l {
    public static final String Signature;
    public static final String ad;
    public static final Object adcel = new Object();
    public static final Object ads = new Object();
    public static final String advert;
    public static final String applovin;
    public static final String appmetrica;
    public static final String inmobi;
    public static final String isVip;
    public static final String license;
    public static final String premium;
    public static final String pro;
    public static final String signatures;
    public static final C2427l subscription;
    public static final String tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final String f8859throws;
    public boolean admob;
    public Object amazon;
    public long billing;
    public boolean firebase;
    public C7828l isPro;
    public Object loadAd;
    public int metrica;
    public long mopub;
    public long purchase;
    public long remoteconfig;
    public long smaato;
    public long startapp;
    public boolean subs;
    public int vip;
    public Object yandex = adcel;
    public C2427l crashlytics = subscription;

    static {
        C17805l c17805l;
        C0935l c0935l = new C0935l();
        C17464l c17464l = new C17464l();
        List list = Collections.EMPTY_LIST;
        C13708l c13708l = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        Uri uri = Uri.EMPTY;
        AbstractC12442l.subscription(((Uri) c17464l.purchase) == null || ((UUID) c17464l.amazon) != null);
        C14227l c14227l = null;
        if (uri != null) {
            if (((UUID) c17464l.amazon) != null) {
                c14227l = new C14227l(c17464l);
            }
            c17805l = new C17805l(uri, null, c14227l, null, list, null, c13708l, null, -9223372036854775807L);
        } else {
            c17805l = null;
        }
        subscription = new C2427l("androidx.media3.common.Timeline", new C9202l(c0935l), c17805l, new C7828l(c2410l), C3852l.f7980private, c11470l);
        tapsense = Integer.toString(1, 36);
        Signature = Integer.toString(2, 36);
        license = Integer.toString(3, 36);
        pro = Integer.toString(4, 36);
        ad = Integer.toString(5, 36);
        advert = Integer.toString(6, 36);
        isVip = Integer.toString(7, 36);
        signatures = Integer.toString(8, 36);
        premium = Integer.toString(9, 36);
        applovin = Integer.toString(10, 36);
        appmetrica = Integer.toString(11, 36);
        inmobi = Integer.toString(12, 36);
        f8859throws = Integer.toString(13, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4322l.class.equals(obj.getClass())) {
            C4322l c4322l = (C4322l) obj;
            if (Objects.equals(this.yandex, c4322l.yandex) && Objects.equals(this.crashlytics, c4322l.crashlytics) && Objects.equals(this.amazon, c4322l.amazon) && Objects.equals(this.isPro, c4322l.isPro) && this.purchase == c4322l.purchase && this.billing == c4322l.billing && this.mopub == c4322l.mopub && this.admob == c4322l.admob && this.subs == c4322l.subs && this.firebase == c4322l.firebase && this.smaato == c4322l.smaato && this.remoteconfig == c4322l.remoteconfig && this.vip == c4322l.vip && this.metrica == c4322l.metrica && this.startapp == c4322l.startapp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.crashlytics.hashCode() + ((this.yandex.hashCode() + 217) * 31)) * 31;
        Object obj = this.amazon;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C7828l c7828l = this.isPro;
        int iHashCode3 = (iHashCode2 + (c7828l != null ? c7828l.hashCode() : 0)) * 31;
        long j = this.purchase;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.billing;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.mopub;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.admob ? 1 : 0)) * 31) + (this.subs ? 1 : 0)) * 31) + (this.firebase ? 1 : 0)) * 31;
        long j4 = this.smaato;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.remoteconfig;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.vip) * 31) + this.metrica) * 31;
        long j6 = this.startapp;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final void loadAd(Object obj, C2427l c2427l, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C7828l c7828l, long j4, long j5, int i, int i2, long j6) {
        C17805l c17805l;
        this.yandex = obj;
        this.crashlytics = c2427l != null ? c2427l : subscription;
        this.loadAd = (c2427l == null || (c17805l = c2427l.loadAd) == null) ? null : c17805l.admob;
        this.amazon = obj2;
        this.purchase = j;
        this.billing = j2;
        this.mopub = j3;
        this.admob = z;
        this.subs = z2;
        this.isPro = c7828l;
        this.smaato = j4;
        this.remoteconfig = j5;
        this.vip = i;
        this.metrica = i2;
        this.startapp = j6;
        this.firebase = false;
    }

    public final boolean yandex() {
        return this.isPro != null;
    }
}
