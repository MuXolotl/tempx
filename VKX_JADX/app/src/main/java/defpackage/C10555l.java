package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lَٖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10555l {
    public final String admob;
    public final long amazon;
    public final Map billing;
    public final C3385l crashlytics;
    public final byte[] isPro;
    public final Integer loadAd;
    public final Integer mopub;
    public final long purchase;
    public final byte[] subs;
    public final String yandex;

    public C10555l(String str, Integer num, C3385l c3385l, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.yandex = str;
        this.loadAd = num;
        this.crashlytics = c3385l;
        this.amazon = j;
        this.purchase = j2;
        this.billing = map;
        this.mopub = num2;
        this.admob = str2;
        this.subs = bArr;
        this.isPro = bArr2;
    }

    public final C18289l crashlytics() {
        C18289l c18289l = new C18289l(1);
        String str = this.yandex;
        if (str == null) {
            C6541l.subs("Null transportName");
            return null;
        }
        c18289l.loadAd = str;
        c18289l.crashlytics = this.loadAd;
        c18289l.admob = this.mopub;
        c18289l.subs = this.admob;
        c18289l.isPro = this.subs;
        c18289l.firebase = this.isPro;
        C3385l c3385l = this.crashlytics;
        if (c3385l == null) {
            C6541l.subs("Null encodedPayload");
            return null;
        }
        c18289l.amazon = c3385l;
        c18289l.purchase = Long.valueOf(this.amazon);
        c18289l.billing = Long.valueOf(this.purchase);
        c18289l.mopub = new HashMap(this.billing);
        return c18289l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10555l) {
            C10555l c10555l = (C10555l) obj;
            if (this.yandex.equals(c10555l.yandex)) {
                Integer num = c10555l.loadAd;
                Integer num2 = this.loadAd;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.crashlytics.equals(c10555l.crashlytics) && this.amazon == c10555l.amazon && this.purchase == c10555l.purchase && this.billing.equals(c10555l.billing)) {
                        Integer num3 = c10555l.mopub;
                        Integer num4 = this.mopub;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = c10555l.admob;
                            String str2 = this.admob;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (Arrays.equals(this.subs, c10555l.subs) && Arrays.equals(this.isPro, c10555l.isPro)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.yandex.hashCode() ^ 1000003) * 1000003;
        Integer num = this.loadAd;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.crashlytics.hashCode()) * 1000003;
        long j = this.amazon;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.purchase;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.billing.hashCode()) * 1000003;
        Integer num2 = this.mopub;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.admob;
        return Arrays.hashCode(this.isPro) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.subs)) * 1000003);
    }

    public final int loadAd(String str) {
        String str2 = (String) this.billing.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.yandex + ", code=" + this.loadAd + ", encodedPayload=" + this.crashlytics + ", eventMillis=" + this.amazon + ", uptimeMillis=" + this.purchase + ", autoMetadata=" + this.billing + ", productId=" + this.mopub + ", pseudonymousId=" + this.admob + ", experimentIdsClear=" + Arrays.toString(this.subs) + ", experimentIdsEncrypted=" + Arrays.toString(this.isPro) + "}";
    }

    public final String yandex(String str) {
        String str2 = (String) this.billing.get(str);
        return str2 == null ? "" : str2;
    }
}
