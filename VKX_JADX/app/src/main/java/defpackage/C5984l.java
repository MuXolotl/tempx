package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘۜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5984l {
    public static final C11606l Companion = new C11606l();
    public static final InterfaceC1220l[] isPro = {null, null, null, null, AbstractC9968l.crashlytics(2, new C3321l(23)), null, AbstractC9968l.crashlytics(2, new C3321l(24)), null, null};
    public final C17533l admob;
    public final Boolean amazon;
    public final String billing;
    public final C8768l crashlytics;
    public final boolean loadAd;
    public final List mopub;
    public final EnumC10104l purchase;
    public final C13414l subs;
    public final String yandex;

    public /* synthetic */ C5984l(int i, String str, boolean z, C8768l c8768l, Boolean bool, EnumC10104l enumC10104l, String str2, List list, C17533l c17533l, C13414l c13414l) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C0202l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = z;
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = c8768l;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = bool;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = enumC10104l;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str2;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = list;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = c17533l;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = c13414l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5984l)) {
            return false;
        }
        C5984l c5984l = (C5984l) obj;
        return AbstractC8576l.yandex(this.yandex, c5984l.yandex) && this.loadAd == c5984l.loadAd && AbstractC8576l.yandex(this.crashlytics, c5984l.crashlytics) && AbstractC8576l.yandex(this.amazon, c5984l.amazon) && this.purchase == c5984l.purchase && AbstractC8576l.yandex(this.billing, c5984l.billing) && AbstractC8576l.yandex(this.mopub, c5984l.mopub) && AbstractC8576l.yandex(this.admob, c5984l.admob) && AbstractC8576l.yandex(this.subs, c5984l.subs);
    }

    public final int hashCode() {
        int iHashCode = ((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31;
        C8768l c8768l = this.crashlytics;
        int iHashCode2 = (iHashCode + (c8768l == null ? 0 : c8768l.hashCode())) * 31;
        Boolean bool = this.amazon;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        EnumC10104l enumC10104l = this.purchase;
        int iHashCode4 = (iHashCode3 + (enumC10104l == null ? 0 : enumC10104l.hashCode())) * 31;
        String str = this.billing;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.mopub;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        C17533l c17533l = this.admob;
        int iHashCode7 = (iHashCode6 + (c17533l == null ? 0 : c17533l.hashCode())) * 31;
        C13414l c13414l = this.subs;
        return iHashCode7 + (c13414l != null ? c13414l.hashCode() : 0);
    }

    public final String toString() {
        return "EcosystemCheckOtpResponseDto(sid=" + this.yandex + ", profileExist=" + this.loadAd + ", profile=" + this.crashlytics + ", canSkipPassword=" + this.amazon + ", nextStep=" + this.purchase + ", signupRestrictionReason=" + this.billing + ", signupFields=" + this.mopub + ", signupFieldsValues=" + this.admob + ", signupParams=" + this.subs + ')';
    }
}
