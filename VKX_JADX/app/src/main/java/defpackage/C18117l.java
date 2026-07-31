package defpackage;

import java.util.List;

/* JADX INFO: renamed from: l٘ۖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C18117l {
    public static final C0043l Companion = new C0043l();
    public static final InterfaceC1220l[] amazon = {null, null, AbstractC9968l.crashlytics(2, new C7282l(22))};
    public final List crashlytics;
    public final int loadAd;
    public final int yandex;

    public /* synthetic */ C18117l(int i, int i2, int i3, List list) {
        if ((i & 1) == 0) {
            this.yandex = 0;
        } else {
            this.yandex = i2;
        }
        if ((i & 2) == 0) {
            this.loadAd = 0;
        } else {
            this.loadAd = i3;
        }
        if ((i & 4) == 0) {
            this.crashlytics = C2580l.f5619l;
        } else {
            this.crashlytics = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18117l)) {
            return false;
        }
        C18117l c18117l = (C18117l) obj;
        return this.yandex == c18117l.yandex && this.loadAd == c18117l.loadAd && AbstractC8576l.yandex(this.crashlytics, c18117l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAddResponseDto(itemCount=");
        sb.append(this.yandex);
        sb.append(", errorCount=");
        sb.append(this.loadAd);
        sb.append(", items=");
        return AbstractC0653l.subscription(sb, this.crashlytics, ')');
    }
}
