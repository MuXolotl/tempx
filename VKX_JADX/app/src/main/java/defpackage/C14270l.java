package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٜٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14270l {
    public static final C18686l Companion = new C18686l();
    public static final InterfaceC1220l[] amazon = {null, AbstractC9968l.crashlytics(2, new C15687l(27)), AbstractC9968l.crashlytics(2, new C15687l(28))};
    public final List crashlytics;
    public final List loadAd;
    public final String yandex;

    public /* synthetic */ C14270l(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C3893l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = list;
        this.crashlytics = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14270l)) {
            return false;
        }
        C14270l c14270l = (C14270l) obj;
        return AbstractC8576l.yandex(this.yandex, c14270l.yandex) && AbstractC8576l.yandex(this.loadAd, c14270l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c14270l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Y25Response(audioTooltip=");
        sb.append(this.yandex);
        sb.append(", blocks=");
        sb.append(this.loadAd);
        sb.append(", actions=");
        return AbstractC0653l.subscription(sb, this.crashlytics, ')');
    }
}
