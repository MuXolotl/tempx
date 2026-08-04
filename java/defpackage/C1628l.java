package defpackage;

/* JADX INFO: renamed from: lؓؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1628l implements InterfaceC10137l {
    public final int loadAd;
    public final InterfaceC10137l yandex;

    public C1628l(InterfaceC10137l interfaceC10137l, int i) {
        this.yandex = interfaceC10137l;
        this.loadAd = i;
    }

    @Override // defpackage.InterfaceC10137l
    public final int amazon(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        if (((enumC9931l == EnumC9931l.f20223l ? 8 : 2) & this.loadAd) != 0) {
            return this.yandex.amazon(interfaceC13490l, enumC9931l);
        }
        return 0;
    }

    @Override // defpackage.InterfaceC10137l
    public final int crashlytics(InterfaceC13490l interfaceC13490l) {
        if ((this.loadAd & 32) != 0) {
            return this.yandex.crashlytics(interfaceC13490l);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1628l)) {
            return false;
        }
        C1628l c1628l = (C1628l) obj;
        return AbstractC8576l.yandex(this.yandex, c1628l.yandex) && this.loadAd == c1628l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    @Override // defpackage.InterfaceC10137l
    public final int loadAd(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        if (((enumC9931l == EnumC9931l.f20223l ? 4 : 1) & this.loadAd) != 0) {
            return this.yandex.loadAd(interfaceC13490l, enumC9931l);
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.loadAd;
        int i2 = AbstractC15929l.crashlytics;
        if ((i & i2) == i2) {
            AbstractC15929l.amazon("Start", sb);
        }
        int i3 = AbstractC15929l.purchase;
        if ((i & i3) == i3) {
            AbstractC15929l.amazon("Left", sb);
        }
        if ((i & 16) == 16) {
            AbstractC15929l.amazon("Top", sb);
        }
        int i4 = AbstractC15929l.amazon;
        if ((i & i4) == i4) {
            AbstractC15929l.amazon("End", sb);
        }
        int i5 = AbstractC15929l.billing;
        if ((i & i5) == i5) {
            AbstractC15929l.amazon("Right", sb);
        }
        if ((i & 32) == 32) {
            AbstractC15929l.amazon("Bottom", sb);
        }
        return "(" + this.yandex + " only " + AbstractC15560l.Signature("WindowInsetsSides(", sb.toString(), ")") + ")";
    }

    @Override // defpackage.InterfaceC10137l
    public final int yandex(InterfaceC13490l interfaceC13490l) {
        if ((this.loadAd & 16) != 0) {
            return this.yandex.yandex(interfaceC13490l);
        }
        return 0;
    }
}
