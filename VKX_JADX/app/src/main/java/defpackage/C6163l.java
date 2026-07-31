package defpackage;

/* JADX INFO: renamed from: lؙؐٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6163l implements InterfaceC3442l {
    public final int loadAd;
    public final C3625l yandex;

    public C6163l(String str, int i) {
        this.yandex = new C3625l(str);
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6163l)) {
            return false;
        }
        C6163l c6163l = (C6163l) obj;
        return AbstractC8576l.yandex(this.yandex.f7563l, c6163l.yandex.f7563l) && this.loadAd == c6163l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.f7563l.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.yandex.f7563l + "', newCursorPosition=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC3442l
    public final void yandex(C7221l c7221l) {
        int i = c7221l.f15052l;
        C3625l c3625l = this.yandex;
        if (i != -1) {
            int i2 = c7221l.f15051l;
            String str = c3625l.f7563l;
            String str2 = c3625l.f7563l;
            c7221l.vip(i, i2, str);
            if (str2.length() > 0) {
                c7221l.metrica(i, str2.length() + i);
            }
        } else {
            int i3 = c7221l.f15049l;
            int i4 = c7221l.f15048l;
            String str3 = c3625l.f7563l;
            String str4 = c3625l.f7563l;
            c7221l.vip(i3, i4, str3);
            if (str4.length() > 0) {
                c7221l.metrica(i3, str4.length() + i3);
            }
        }
        int i5 = c7221l.f15049l;
        int i6 = c7221l.f15048l;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.loadAd;
        int iPurchase = AbstractC8576l.purchase(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c3625l.f7563l.length(), 0, ((C11522l) c7221l.f15053l).premium());
        c7221l.startapp(iPurchase, iPurchase);
    }
}
