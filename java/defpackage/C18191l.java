package defpackage;

/* JADX INFO: renamed from: l٘ۚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C18191l {
    public static final C3019l Companion = new C3019l();
    public static final InterfaceC1220l[] crashlytics = {null, AbstractC9968l.crashlytics(2, new C0063l(23))};
    public final EnumC5608l loadAd;
    public final Integer yandex;

    public /* synthetic */ C18191l(int i, Integer num, EnumC5608l enumC5608l) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = num;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = enumC5608l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18191l)) {
            return false;
        }
        C18191l c18191l = (C18191l) obj;
        return AbstractC8576l.yandex(this.yandex, c18191l.yandex) && this.loadAd == c18191l.loadAd;
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        EnumC5608l enumC5608l = this.loadAd;
        return iHashCode + (enumC5608l != null ? enumC5608l.hashCode() : 0);
    }

    public final String toString() {
        return "AudioChartInfoDto(position=" + this.yandex + ", state=" + this.loadAd + ')';
    }
}
