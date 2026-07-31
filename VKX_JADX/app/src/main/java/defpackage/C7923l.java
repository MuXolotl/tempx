package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًُؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7923l {
    public final String adcel;
    public final List admob;
    public final long ads;
    public final long amazon;
    public final long billing;
    public final Uri crashlytics;
    public final long firebase;
    public final long isPro;
    public final Uri loadAd;
    public final boolean metrica;
    public final long mopub;
    public final long purchase;
    public final AbstractC1186l remoteconfig;
    public final AbstractC1186l smaato;
    public final String startapp;
    public final boolean subs;
    public final long subscription;
    public final String tapsense;
    public final C13708l vip;
    public final String yandex;

    public C7923l(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        AbstractC12442l.admob((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.yandex = str;
        this.loadAd = uri;
        this.crashlytics = uri2;
        this.amazon = j;
        this.purchase = j2;
        this.billing = j3;
        this.mopub = j4;
        this.admob = arrayList;
        this.subs = z;
        this.isPro = j5;
        this.firebase = j6;
        this.smaato = AbstractC1186l.Signature(arrayList2);
        this.remoteconfig = AbstractC1186l.Signature(arrayList3);
        this.vip = AbstractC1186l.appmetrica(new C2351l(16), arrayList4);
        this.metrica = z2;
        this.startapp = str2;
        this.adcel = str3;
        this.ads = j7;
        this.subscription = j8;
        this.tapsense = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7923l)) {
            return false;
        }
        C7923l c7923l = (C7923l) obj;
        return this.amazon == c7923l.amazon && this.purchase == c7923l.purchase && this.billing == c7923l.billing && this.mopub == c7923l.mopub && this.subs == c7923l.subs && this.isPro == c7923l.isPro && this.firebase == c7923l.firebase && this.metrica == c7923l.metrica && this.ads == c7923l.ads && this.subscription == c7923l.subscription && Objects.equals(this.yandex, c7923l.yandex) && Objects.equals(this.loadAd, c7923l.loadAd) && Objects.equals(this.crashlytics, c7923l.crashlytics) && Objects.equals(this.admob, c7923l.admob) && Objects.equals(this.smaato, c7923l.smaato) && Objects.equals(this.remoteconfig, c7923l.remoteconfig) && Objects.equals(this.vip, c7923l.vip) && Objects.equals(this.startapp, c7923l.startapp) && Objects.equals(this.adcel, c7923l.adcel) && Objects.equals(this.tapsense, c7923l.tapsense);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd, this.crashlytics, Long.valueOf(this.amazon), Long.valueOf(this.purchase), Long.valueOf(this.billing), Long.valueOf(this.mopub), this.admob, Boolean.valueOf(this.subs), Long.valueOf(this.isPro), Long.valueOf(this.firebase), this.smaato, this.remoteconfig, this.vip, Boolean.valueOf(this.metrica), this.startapp, this.adcel, Long.valueOf(this.ads), Long.valueOf(this.subscription), this.tapsense);
    }
}
