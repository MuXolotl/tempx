package defpackage;

/* JADX INFO: renamed from: lٌؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8487l {
    public static final C6070l Companion = new C6070l();
    public static final InterfaceC1220l[] purchase = {AbstractC9968l.crashlytics(2, new C8631l(29)), null, null, AbstractC9968l.crashlytics(2, new C7703l(0))};
    public final EnumC10215l amazon;
    public final String crashlytics;
    public final Boolean loadAd;
    public final EnumC11781l yandex;

    public /* synthetic */ C8487l(int i, EnumC11781l enumC11781l, Boolean bool, String str, EnumC10215l enumC10215l) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = enumC11781l;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = bool;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = enumC10215l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8487l)) {
            return false;
        }
        C8487l c8487l = (C8487l) obj;
        return this.yandex == c8487l.yandex && AbstractC8576l.yandex(this.loadAd, c8487l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c8487l.crashlytics) && this.amazon == c8487l.amazon;
    }

    public final int hashCode() {
        EnumC11781l enumC11781l = this.yandex;
        int iHashCode = (enumC11781l == null ? 0 : enumC11781l.hashCode()) * 31;
        Boolean bool = this.loadAd;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC10215l enumC10215l = this.amazon;
        return iHashCode3 + (enumC10215l != null ? enumC10215l.hashCode() : 0);
    }

    public final String toString() {
        return "AuthValidateAccountNextStepDto(verificationMethod=" + this.yandex + ", hasAnotherVerificationMethods=" + this.loadAd + ", externalId=" + this.crashlytics + ", serviceCode=" + this.amazon + ')';
    }
}
