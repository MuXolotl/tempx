package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًًۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8206l {
    public static final C9570l Companion = new C9570l();
    public static final InterfaceC1220l[] smaato = {null, null, null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C14499l(11))};
    public final String admob;
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final List firebase;
    public final String isPro;
    public final int loadAd;
    public final String mopub;
    public final String purchase;
    public final String subs;
    public final int yandex;

    public /* synthetic */ C8206l(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C13631l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = i3;
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str2;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str3;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str4;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = str5;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = str6;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = str7;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = null;
        } else {
            this.isPro = str8;
        }
        if ((i & 1024) == 0) {
            this.firebase = null;
        } else {
            this.firebase = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8206l)) {
            return false;
        }
        C8206l c8206l = (C8206l) obj;
        return this.yandex == c8206l.yandex && this.loadAd == c8206l.loadAd && AbstractC8576l.yandex(this.crashlytics, c8206l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8206l.amazon) && AbstractC8576l.yandex(this.purchase, c8206l.purchase) && AbstractC8576l.yandex(this.billing, c8206l.billing) && AbstractC8576l.yandex(this.mopub, c8206l.mopub) && AbstractC8576l.yandex(this.admob, c8206l.admob) && AbstractC8576l.yandex(this.subs, c8206l.subs) && AbstractC8576l.yandex(this.isPro, c8206l.isPro) && AbstractC8576l.yandex(this.firebase, c8206l.firebase);
    }

    public final int hashCode() {
        int i = ((this.yandex * 31) + this.loadAd) * 31;
        String str = this.crashlytics;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.amazon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchase;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billing;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mopub;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.admob;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subs;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.isPro;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list = this.firebase;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPhotoDto(width=");
        sb.append(this.yandex);
        sb.append(", height=");
        sb.append(this.loadAd);
        sb.append(", id=");
        sb.append(this.crashlytics);
        sb.append(", photo34=");
        sb.append(this.amazon);
        sb.append(", photo68=");
        sb.append(this.purchase);
        sb.append(", photo135=");
        sb.append(this.billing);
        sb.append(", photo270=");
        sb.append(this.mopub);
        sb.append(", photo300=");
        sb.append(this.admob);
        sb.append(", photo600=");
        sb.append(this.subs);
        sb.append(", photo1200=");
        sb.append(this.isPro);
        sb.append(", sizes=");
        return AbstractC0653l.subscription(sb, this.firebase, ')');
    }

    public C8206l(String str, String str2, String str3, String str4, String str5) {
        this.yandex = 0;
        this.loadAd = 0;
        this.crashlytics = null;
        this.amazon = null;
        this.purchase = null;
        this.billing = str;
        this.mopub = str2;
        this.admob = str3;
        this.subs = str4;
        this.isPro = str5;
        this.firebase = null;
    }
}
