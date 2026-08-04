package defpackage;

/* JADX INFO: renamed from: lؑۜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0597l implements InterfaceC3442l {
    public final int loadAd;
    public final C3625l yandex;

    public C0597l(String str, int i) {
        this(new C3625l(str), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0597l)) {
            return false;
        }
        C0597l c0597l = (C0597l) obj;
        return AbstractC8576l.yandex(this.yandex.f7563l, c0597l.yandex.f7563l) && this.loadAd == c0597l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.f7563l.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.yandex.f7563l + "', newCursorPosition=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC3442l
    public final void yandex(C7221l c7221l) {
        int i = c7221l.f15052l;
        C3625l c3625l = this.yandex;
        if (i != -1) {
            c7221l.vip(i, c7221l.f15051l, c3625l.f7563l);
        } else {
            c7221l.vip(c7221l.f15049l, c7221l.f15048l, c3625l.f7563l);
        }
        int i2 = c7221l.f15049l;
        int i3 = c7221l.f15048l;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.loadAd;
        int iPurchase = AbstractC8576l.purchase(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c3625l.f7563l.length(), 0, ((C11522l) c7221l.f15053l).premium());
        c7221l.startapp(iPurchase, iPurchase);
    }

    public C0597l(C3625l c3625l, int i) {
        this.yandex = c3625l;
        this.loadAd = i;
    }
}
