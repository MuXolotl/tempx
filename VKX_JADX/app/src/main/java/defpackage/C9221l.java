package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lٌۨؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9221l {
    public final boolean admob;
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final List firebase;
    public final String isPro;
    public final String loadAd;
    public final boolean mopub;
    public final String purchase;
    public final int smaato;
    public final boolean subs;
    public final EnumC7009l yandex;

    public C9221l(EnumC7009l enumC7009l, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, List list, int i) {
        this.yandex = enumC7009l;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = str4;
        this.billing = str5;
        this.mopub = z;
        this.admob = z2;
        this.subs = z3;
        this.isPro = str6;
        this.firebase = AbstractC9905l.loadAd(list);
        this.smaato = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9221l)) {
            return false;
        }
        C9221l c9221l = (C9221l) obj;
        return this.yandex == c9221l.yandex && Objects.equals(this.loadAd, c9221l.loadAd) && Objects.equals(this.crashlytics, c9221l.crashlytics) && Objects.equals(this.amazon, c9221l.amazon) && Objects.equals(this.purchase, c9221l.purchase) && Objects.equals(this.billing, c9221l.billing) && this.mopub == c9221l.mopub && this.admob == c9221l.admob && this.subs == c9221l.subs && Objects.equals(this.isPro, c9221l.isPro) && Objects.equals(this.firebase, c9221l.firebase) && this.smaato == c9221l.smaato;
    }

    public final int hashCode() {
        return Objects.hash(this.purchase, Boolean.valueOf(this.admob), this.firebase, Boolean.valueOf(this.mopub), Boolean.valueOf(this.subs), this.crashlytics, this.isPro, this.amazon, this.billing, this.yandex, this.loadAd, Integer.valueOf(this.smaato));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaData [mType=");
        sb.append(this.yandex);
        sb.append(", mUri=");
        sb.append(this.loadAd);
        sb.append(", mGroupId=");
        sb.append(this.crashlytics);
        sb.append(", mLanguage=");
        sb.append(this.amazon);
        sb.append(", mAssociatedLanguage=");
        sb.append(this.purchase);
        sb.append(", mName=");
        sb.append(this.billing);
        sb.append(", mDefault=");
        sb.append(this.mopub);
        sb.append(", mAutoSelect=");
        sb.append(this.admob);
        sb.append(", mForced=");
        sb.append(this.subs);
        sb.append(", mInStreamId=");
        sb.append(this.isPro);
        sb.append(", mCharacteristics=");
        sb.append(this.firebase);
        sb.append(", mChannels=");
        return AbstractC14814l.remoteconfig(this.smaato, "]", sb);
    }
}
