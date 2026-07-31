package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lٍ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17805l {
    public static final String adcel;
    public static final String firebase;
    public static final String isPro;
    public static final String metrica;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String startapp;
    public static final String vip;
    public final Object admob;
    public final C8842l amazon;
    public final String billing;
    public final C14227l crashlytics;
    public final String loadAd;
    public final AbstractC1186l mopub;
    public final List purchase;
    public final long subs;
    public final Uri yandex;

    static {
        String str = AbstractC15323l.yandex;
        isPro = Integer.toString(0, 36);
        firebase = Integer.toString(1, 36);
        smaato = Integer.toString(2, 36);
        remoteconfig = Integer.toString(3, 36);
        vip = Integer.toString(4, 36);
        metrica = Integer.toString(5, 36);
        startapp = Integer.toString(6, 36);
        adcel = Integer.toString(7, 36);
    }

    public C17805l(Uri uri, String str, C14227l c14227l, C8842l c8842l, List list, String str2, AbstractC1186l abstractC1186l, Object obj, long j) {
        this.yandex = uri;
        this.loadAd = AbstractC3825l.vip(str);
        this.crashlytics = c14227l;
        this.amazon = c8842l;
        this.purchase = list;
        this.billing = str2;
        this.mopub = abstractC1186l;
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (int i = 0; i < abstractC1186l.size(); i++) {
            C9749l c9749l = (C9749l) abstractC1186l.get(i);
            C1652l c1652l = new C1652l();
            c1652l.amazon = c9749l.yandex;
            c1652l.yandex = c9749l.loadAd;
            c1652l.purchase = c9749l.crashlytics;
            c1652l.loadAd = c9749l.amazon;
            c1652l.crashlytics = c9749l.purchase;
            c1652l.billing = c9749l.billing;
            c1652l.mopub = c9749l.mopub;
            c16971lMetrica.crashlytics(new C18654l(c1652l));
        }
        c16971lMetrica.mopub();
        this.admob = obj;
        this.subs = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17805l)) {
            return false;
        }
        C17805l c17805l = (C17805l) obj;
        return this.yandex.equals(c17805l.yandex) && Objects.equals(this.loadAd, c17805l.loadAd) && Objects.equals(this.crashlytics, c17805l.crashlytics) && Objects.equals(this.amazon, c17805l.amazon) && this.purchase.equals(c17805l.purchase) && Objects.equals(this.billing, c17805l.billing) && this.mopub.equals(c17805l.mopub) && Objects.equals(this.admob, c17805l.admob) && this.subs == c17805l.subs;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C14227l c14227l = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (c14227l == null ? 0 : c14227l.hashCode())) * 31;
        C8842l c8842l = this.amazon;
        int iHashCode4 = (this.purchase.hashCode() + ((iHashCode3 + (c8842l == null ? 0 : c8842l.hashCode())) * 31)) * 31;
        String str2 = this.billing;
        int iHashCode5 = (this.mopub.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.admob;
        return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.subs);
    }
}
