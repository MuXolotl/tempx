package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًۣۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8366l {
    public static final C17534l Companion = new C17534l();
    public static final InterfaceC1220l[] firebase = {null, null, AbstractC9968l.crashlytics(2, new C7703l(1)), AbstractC9968l.crashlytics(2, new C7703l(2)), null, null, null, null, null, null};
    public final String admob;
    public final List amazon;
    public final String billing;
    public final EnumC14924l crashlytics;
    public final String isPro;
    public final Boolean loadAd;
    public final Boolean mopub;
    public final Boolean purchase;
    public final C8487l subs;
    public final Boolean yandex;

    public /* synthetic */ C8366l(int i, Boolean bool, Boolean bool2, EnumC14924l enumC14924l, List list, Boolean bool3, String str, Boolean bool4, String str2, C8487l c8487l, String str3) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = bool;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = bool2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = enumC14924l;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = list;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = bool3;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = bool4;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = str2;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = c8487l;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = null;
        } else {
            this.isPro = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8366l)) {
            return false;
        }
        C8366l c8366l = (C8366l) obj;
        return AbstractC8576l.yandex(this.yandex, c8366l.yandex) && AbstractC8576l.yandex(this.loadAd, c8366l.loadAd) && this.crashlytics == c8366l.crashlytics && AbstractC8576l.yandex(this.amazon, c8366l.amazon) && AbstractC8576l.yandex(this.purchase, c8366l.purchase) && AbstractC8576l.yandex(this.billing, c8366l.billing) && AbstractC8576l.yandex(this.mopub, c8366l.mopub) && AbstractC8576l.yandex(this.admob, c8366l.admob) && AbstractC8576l.yandex(this.subs, c8366l.subs) && AbstractC8576l.yandex(this.isPro, c8366l.isPro);
    }

    public final int hashCode() {
        Boolean bool = this.yandex;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.loadAd;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        EnumC14924l enumC14924l = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (enumC14924l == null ? 0 : enumC14924l.hashCode())) * 31;
        List list = this.amazon;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.purchase;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.billing;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.mopub;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.admob;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C8487l c8487l = this.subs;
        int iHashCode9 = (iHashCode8 + (c8487l == null ? 0 : c8487l.hashCode())) * 31;
        String str3 = this.isPro;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidateAccountResponseDto(isPhone=");
        sb.append(this.yandex);
        sb.append(", isEmail=");
        sb.append(this.loadAd);
        sb.append(", flowName=");
        sb.append(this.crashlytics);
        sb.append(", flowNames=");
        sb.append(this.amazon);
        sb.append(", ads=");
        sb.append(this.purchase);
        sb.append(", sid=");
        sb.append(this.billing);
        sb.append(", passSid=");
        sb.append(this.mopub);
        sb.append(", login=");
        sb.append(this.admob);
        sb.append(", nextStep=");
        sb.append(this.subs);
        sb.append(", rememberHash=");
        return AbstractC2812l.tapsense(sb, this.isPro, ')');
    }
}
