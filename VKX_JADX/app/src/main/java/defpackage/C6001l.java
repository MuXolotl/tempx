package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘ۟۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C6001l {
    public static final C14613l Companion = new C14613l();
    public static final InterfaceC1220l[] vip = {AbstractC9968l.crashlytics(2, new C15687l(20)), null, AbstractC9968l.crashlytics(2, new C15687l(21)), AbstractC9968l.crashlytics(2, new C15687l(22)), AbstractC9968l.crashlytics(2, new C15687l(23)), null, null, null, null, null, AbstractC9968l.crashlytics(2, new C15687l(24)), AbstractC9968l.crashlytics(2, new C15687l(25)), null};
    public final int admob;
    public final List amazon;
    public final C5576l billing;
    public final List crashlytics;
    public final List firebase;
    public final String isPro;
    public final String loadAd;
    public final boolean mopub;
    public final List purchase;
    public final C15506l remoteconfig;
    public final EnumC18350l smaato;
    public final boolean subs;
    public final EnumC2546l yandex;

    public /* synthetic */ C6001l(int i, EnumC2546l enumC2546l, String str, List list, List list2, List list3, C5576l c5576l, boolean z, int i2, boolean z2, String str2, List list4, EnumC18350l enumC18350l, C15506l c15506l) {
        if (195 != (i & 195)) {
            AbstractC11036l.isPro(i, 195, C13213l.yandex.purchase());
            throw null;
        }
        this.yandex = enumC2546l;
        this.loadAd = str;
        int i3 = i & 4;
        C2580l c2580l = C2580l.f5619l;
        if (i3 == 0) {
            this.crashlytics = c2580l;
        } else {
            this.crashlytics = list;
        }
        if ((i & 8) == 0) {
            this.amazon = c2580l;
        } else {
            this.amazon = list2;
        }
        if ((i & 16) == 0) {
            this.purchase = c2580l;
        } else {
            this.purchase = list3;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = c5576l;
        }
        this.mopub = z;
        this.admob = i2;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = false;
        } else {
            this.subs = z2;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = "";
        } else {
            this.isPro = str2;
        }
        if ((i & 1024) == 0) {
            this.firebase = c2580l;
        } else {
            this.firebase = list4;
        }
        this.smaato = (i & 2048) == 0 ? EnumC18350l.f35864l : enumC18350l;
        if ((i & 4096) == 0) {
            this.remoteconfig = null;
        } else {
            this.remoteconfig = c15506l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6001l)) {
            return false;
        }
        C6001l c6001l = (C6001l) obj;
        return this.yandex == c6001l.yandex && AbstractC8576l.yandex(this.loadAd, c6001l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c6001l.crashlytics) && AbstractC8576l.yandex(this.amazon, c6001l.amazon) && AbstractC8576l.yandex(this.purchase, c6001l.purchase) && AbstractC8576l.yandex(this.billing, c6001l.billing) && this.mopub == c6001l.mopub && this.admob == c6001l.admob && this.subs == c6001l.subs && AbstractC8576l.yandex(this.isPro, c6001l.isPro) && AbstractC8576l.yandex(this.firebase, c6001l.firebase) && this.smaato == c6001l.smaato && AbstractC8576l.yandex(this.remoteconfig, c6001l.remoteconfig);
    }

    public final int hashCode() {
        int iAdmob = AbstractC14814l.admob(AbstractC14814l.admob(AbstractC14814l.admob(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon), 31, this.purchase);
        C5576l c5576l = this.billing;
        int iHashCode = (this.smaato.hashCode() + AbstractC14814l.admob(AbstractC12589l.advert((((((((iAdmob + (c5576l == null ? 0 : c5576l.hashCode())) * 31) + (this.mopub ? 1231 : 1237)) * 31) + this.admob) * 31) + (this.subs ? 1231 : 1237)) * 31, 31, this.isPro), 31, this.firebase)) * 31;
        C15506l c15506l = this.remoteconfig;
        return iHashCode + (c15506l != null ? c15506l.hashCode() : 0);
    }

    public final String toString() {
        return "Y25CBlock(type=" + this.yandex + ", name=" + this.loadAd + ", titles=" + this.crashlytics + ", subtitles=" + this.amazon + ", photoUrls=" + this.purchase + ", background=" + this.billing + ", isVisible=" + this.mopub + ", order=" + this.admob + ", isSharingEnabled=" + this.subs + ", audioPreviewUrl=" + this.isPro + ", metrics=" + this.firebase + ", colorType=" + this.smaato + ", playlist=" + this.remoteconfig + ')';
    }

    public C6001l(EnumC2546l enumC2546l, String str, List list, List list2, C5576l c5576l, boolean z, int i, List list3, int i2) {
        int i3 = i2 & 1024;
        C2580l c2580l = C2580l.f5619l;
        list3 = i3 != 0 ? c2580l : list3;
        EnumC18350l enumC18350l = EnumC18350l.f35864l;
        this.yandex = enumC2546l;
        this.loadAd = str;
        this.crashlytics = list;
        this.amazon = list2;
        this.purchase = c2580l;
        this.billing = c5576l;
        this.mopub = z;
        this.admob = i;
        this.subs = false;
        this.isPro = "";
        this.firebase = list3;
        this.smaato = enumC18350l;
        this.remoteconfig = null;
    }
}
