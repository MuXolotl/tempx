package defpackage;

/* JADX INFO: renamed from: lْٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C13414l {
    public static final C16393l Companion = new C16393l();
    public final String loadAd;
    public final Integer yandex;

    public /* synthetic */ C13414l(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = num;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13414l)) {
            return false;
        }
        C13414l c13414l = (C13414l) obj;
        return AbstractC8576l.yandex(this.yandex, c13414l.yandex) && AbstractC8576l.yandex(this.loadAd, c13414l.loadAd);
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.loadAd;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidateSignupParamsDto(passwordMinLength=");
        sb.append(this.yandex);
        sb.append(", birthDateMax=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
