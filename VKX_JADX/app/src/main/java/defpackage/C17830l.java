package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17830l {
    public static final C4172l Companion = new C4172l();
    public static final InterfaceC1220l[] isPro = {null, null, null, AbstractC9968l.crashlytics(2, new C6573l(10)), AbstractC9968l.crashlytics(2, new C6573l(11)), null, null, AbstractC9968l.crashlytics(2, new C6573l(12)), null};
    public final EnumC6811l admob;
    public final List amazon;
    public final String billing;
    public final C13748l crashlytics;
    public final String loadAd;
    public final String mopub;
    public final List purchase;
    public final String subs;
    public final String yandex;

    public /* synthetic */ C17830l(int i, String str, String str2, C13748l c13748l, List list, List list2, String str3, String str4, EnumC6811l enumC6811l, String str5) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C7879l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = c13748l;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = list;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = list2;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str3;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = str4;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = enumC6811l;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17830l)) {
            return false;
        }
        C17830l c17830l = (C17830l) obj;
        return AbstractC8576l.yandex(this.yandex, c17830l.yandex) && AbstractC8576l.yandex(this.loadAd, c17830l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c17830l.crashlytics) && AbstractC8576l.yandex(this.amazon, c17830l.amazon) && AbstractC8576l.yandex(this.purchase, c17830l.purchase) && AbstractC8576l.yandex(this.billing, c17830l.billing) && AbstractC8576l.yandex(this.mopub, c17830l.mopub) && this.admob == c17830l.admob && AbstractC8576l.yandex(this.subs, c17830l.subs);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C13748l c13748l = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (c13748l == null ? 0 : c13748l.hashCode())) * 31;
        List list = this.amazon;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.purchase;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.billing;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mopub;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC6811l enumC6811l = this.admob;
        int iHashCode8 = (iHashCode7 + (enumC6811l == null ? 0 : enumC6811l.hashCode())) * 31;
        String str4 = this.subs;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaPopupDto(title=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", button=");
        sb.append(this.crashlytics);
        sb.append(", buttons=");
        sb.append(this.amazon);
        sb.append(", icons=");
        sb.append(this.purchase);
        sb.append(", musicSubscriptionEvent=");
        sb.append(this.billing);
        sb.append(", text=");
        sb.append(this.mopub);
        sb.append(", imageMode=");
        sb.append(this.admob);
        sb.append(", emojiIcons=");
        return AbstractC2812l.tapsense(sb, this.subs, ')');
    }
}
