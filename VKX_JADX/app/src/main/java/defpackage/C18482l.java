package defpackage;

import android.os.Build;
import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٞ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18482l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C9965l f36093l = new C9965l(3, AbstractC18202l.yandex.loadAd(C18482l.class), 2, null);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C0318l f36094l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f36095l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f36096l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final String f36097l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C18413l f36098l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f36099l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f36100l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final EnumC10382l f36101l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final String f36102l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f36103l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final boolean f36104l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C6771l f36105l;

    public /* synthetic */ C18482l(int i, boolean z, EnumC10382l enumC10382l, C0318l c0318l, C6771l c6771l, C18413l c18413l, int i2) {
        this((i2 & 1) != 0 ? "" : Build.VERSION.RELEASE, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : Build.BOARD, (i2 & 8) != 0 ? "" : Build.BRAND, (i2 & 16) != 0 ? "" : Build.DEVICE, (i2 & 32) != 0 ? "" : Build.MODEL, (i2 & 64) != 0 ? "" : Build.MANUFACTURER, (i2 & 128) != 0 ? false : z, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? EnumC10382l.StockOrUnknown : enumC10382l, (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : c0318l, (i2 & 1024) != 0 ? null : c6771l, (i2 & 2048) != 0 ? null : c18413l, C3844l.f7950l);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18482l)) {
            return false;
        }
        C18482l c18482l = (C18482l) obj;
        return AbstractC8576l.yandex(yandex(), c18482l.yandex()) && AbstractC8576l.yandex(this.f36100l, c18482l.f36100l) && this.f36099l == c18482l.f36099l && AbstractC8576l.yandex(this.f36103l, c18482l.f36103l) && AbstractC8576l.yandex(this.f36095l, c18482l.f36095l) && AbstractC8576l.yandex(this.f36096l, c18482l.f36096l) && AbstractC8576l.yandex(this.f36102l, c18482l.f36102l) && AbstractC8576l.yandex(this.f36097l, c18482l.f36097l) && this.f36104l == c18482l.f36104l && this.f36101l == c18482l.f36101l && AbstractC8576l.yandex(this.f36094l, c18482l.f36094l) && AbstractC8576l.yandex(this.f36105l, c18482l.f36105l) && AbstractC8576l.yandex(this.f36098l, c18482l.f36098l);
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (this.f36101l.hashCode() + ((AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert((AbstractC12589l.advert(yandex().hashCode() * 37, 37, this.f36100l) + this.f36099l) * 37, 37, this.f36103l), 37, this.f36095l), 37, this.f36096l), 37, this.f36102l), 37, this.f36097l) + (this.f36104l ? 1231 : 1237)) * 37)) * 37;
        C0318l c0318l = this.f36094l;
        int iHashCode2 = (iHashCode + (c0318l != null ? c0318l.hashCode() : 0)) * 37;
        C6771l c6771l = this.f36105l;
        int iHashCode3 = (iHashCode2 + (c6771l != null ? c6771l.hashCode() : 0)) * 37;
        C18413l c18413l = this.f36098l;
        int iHashCode4 = iHashCode3 + (c18413l != null ? c18413l.hashCode() : 0);
        this.f23747l = iHashCode4;
        return iHashCode4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbVip = AbstractC9029l.vip(this.f36100l, "android_version_name=", arrayList, "android_sdk_int=");
        sbVip.append(this.f36099l);
        arrayList.add(sbVip.toString());
        AbstractC9029l.pro(this.f36103l, "board=", arrayList);
        AbstractC9029l.pro(this.f36095l, "brand=", arrayList);
        AbstractC9029l.pro(this.f36096l, "device=", arrayList);
        AbstractC9029l.pro(this.f36102l, "model=", arrayList);
        StringBuilder sbMetrica = AbstractC9029l.metrica(AbstractC9029l.vip(this.f36097l, "manufacturer=", arrayList, "has_gms="), this.f36104l, arrayList, "oem_flavor=");
        sbMetrica.append(this.f36101l);
        arrayList.add(sbMetrica.toString());
        C0318l c0318l = this.f36094l;
        if (c0318l != null) {
            arrayList.add("miui_metadata=" + c0318l);
        }
        C6771l c6771l = this.f36105l;
        if (c6771l != null) {
            arrayList.add("emui_metadata=" + c6771l);
        }
        C18413l c18413l = this.f36098l;
        if (c18413l != null) {
            arrayList.add("oneui_metadata=" + c18413l);
        }
        return AbstractC16901l.m4210case(arrayList, ", ", "OrbitCoreAndroidDeviceInfo{", "}", null, 56);
    }

    public C18482l(String str, int i, String str2, String str3, String str4, String str5, String str6, boolean z, EnumC10382l enumC10382l, C0318l c0318l, C6771l c6771l, C18413l c18413l, C3844l c3844l) {
        super(f36093l, c3844l);
        this.f36100l = str;
        this.f36099l = i;
        this.f36103l = str2;
        this.f36095l = str3;
        this.f36096l = str4;
        this.f36102l = str5;
        this.f36097l = str6;
        this.f36104l = z;
        this.f36101l = enumC10382l;
        this.f36094l = c0318l;
        this.f36105l = c6771l;
        this.f36098l = c18413l;
    }
}
