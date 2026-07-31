package defpackage;

/* JADX INFO: renamed from: lؙُۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C6393l {
    public static final C1404l Companion = new C1404l();
    public static final InterfaceC1220l[] admob = {null, null, AbstractC9968l.crashlytics(2, new C0063l(18)), null, null, null, null};
    public final int amazon;
    public final String billing;
    public final EnumC11113l crashlytics;
    public final String loadAd;
    public final String mopub;
    public final Integer purchase;
    public final C17383l yandex;

    public /* synthetic */ C6393l(int i, C17383l c17383l, String str, EnumC11113l enumC11113l, int i2, Integer num, String str2, String str3) {
        if (103 != (i & 103)) {
            AbstractC11036l.isPro(i, 103, C4131l.yandex.purchase());
            throw null;
        }
        this.yandex = c17383l;
        this.loadAd = str;
        this.crashlytics = enumC11113l;
        if ((i & 8) == 0) {
            this.amazon = 0;
        } else {
            this.amazon = i2;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = num;
        }
        this.billing = str2;
        this.mopub = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6393l)) {
            return false;
        }
        C6393l c6393l = (C6393l) obj;
        return AbstractC8576l.yandex(this.yandex, c6393l.yandex) && AbstractC8576l.yandex(this.loadAd, c6393l.loadAd) && this.crashlytics == c6393l.crashlytics && this.amazon == c6393l.amazon && AbstractC8576l.yandex(this.purchase, c6393l.purchase) && AbstractC8576l.yandex(this.billing, c6393l.billing) && AbstractC8576l.yandex(this.mopub, c6393l.mopub);
    }

    public final int hashCode() {
        int iHashCode = (((this.crashlytics.hashCode() + AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd)) * 31) + this.amazon) * 31;
        Integer num = this.purchase;
        return this.mopub.hashCode() + AbstractC12589l.advert((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.billing);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksChapterDto(audioFile=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", progressStatus=");
        sb.append(this.crashlytics);
        sb.append(", progressTime=");
        sb.append(this.amazon);
        sb.append(", specialProjectId=");
        sb.append(this.purchase);
        sb.append(", title=");
        sb.append(this.billing);
        sb.append(", trackCode=");
        return AbstractC2812l.tapsense(sb, this.mopub, ')');
    }
}
