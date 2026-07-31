package defpackage;

/* JADX INFO: renamed from: lٍؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9297l implements InterfaceC10137l {
    public final String loadAd;
    public final int yandex;
    public final C10086l crashlytics = AbstractC8020l.smaato(C15496l.purchase);
    public final C10086l amazon = AbstractC8020l.smaato(Boolean.TRUE);

    public C9297l(int i, String str) {
        this.yandex = i;
        this.loadAd = str;
    }

    @Override // defpackage.InterfaceC10137l
    public final int amazon(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return purchase().yandex;
    }

    public final void billing(boolean z) {
        this.amazon.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC10137l
    public final int crashlytics(InterfaceC13490l interfaceC13490l) {
        return purchase().amazon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9297l) {
            return this.yandex == ((C9297l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC10137l
    public final int loadAd(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return purchase().crashlytics;
    }

    public final void mopub(C1473l c1473l, int i) {
        int i2 = this.yandex;
        if (i == 0 || (i & i2) != 0) {
            this.crashlytics.setValue(c1473l.yandex.subs(i2));
            billing(c1473l.yandex.Signature(i2));
        }
    }

    public final C15496l purchase() {
        return (C15496l) this.crashlytics.getValue();
    }

    public final String toString() {
        return this.loadAd + "(" + purchase().yandex + ", " + purchase().loadAd + ", " + purchase().crashlytics + ", " + purchase().amazon + ")";
    }

    @Override // defpackage.InterfaceC10137l
    public final int yandex(InterfaceC13490l interfaceC13490l) {
        return purchase().loadAd;
    }
}
