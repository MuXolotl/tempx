package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lِٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C15407l {
    public static final C8054l Companion = new C8054l();
    public static final InterfaceC1220l[] amazon = {null, null, AbstractC9968l.crashlytics(2, new C8631l(13))};
    public final List crashlytics;
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C15407l(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C2280l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15407l)) {
            return false;
        }
        C15407l c15407l = (C15407l) obj;
        return AbstractC8576l.yandex(this.yandex, c15407l.yandex) && AbstractC8576l.yandex(this.loadAd, c15407l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c15407l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixSettingsDto(title=");
        sb.append(this.yandex);
        sb.append(", subtitle=");
        sb.append(this.loadAd);
        sb.append(", settings=");
        return AbstractC0653l.subscription(sb, this.crashlytics, ')');
    }
}
