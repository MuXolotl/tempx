package defpackage;

/* JADX INFO: renamed from: lُؚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11414l implements InterfaceC10137l {
    public final C10086l loadAd;
    public final String yandex;

    public C11414l(C6777l c6777l, String str) {
        this.yandex = str;
        this.loadAd = AbstractC8020l.smaato(c6777l);
    }

    @Override // defpackage.InterfaceC10137l
    public final int amazon(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return purchase().yandex;
    }

    public final void billing(C6777l c6777l) {
        this.loadAd.setValue(c6777l);
    }

    @Override // defpackage.InterfaceC10137l
    public final int crashlytics(InterfaceC13490l interfaceC13490l) {
        return purchase().amazon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11414l) {
            return AbstractC8576l.yandex(purchase(), ((C11414l) obj).purchase());
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC10137l
    public final int loadAd(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return purchase().crashlytics;
    }

    public final C6777l purchase() {
        return (C6777l) this.loadAd.getValue();
    }

    public final String toString() {
        return this.yandex + "(left=" + purchase().yandex + ", top=" + purchase().loadAd + ", right=" + purchase().crashlytics + ", bottom=" + purchase().amazon + ")";
    }

    @Override // defpackage.InterfaceC10137l
    public final int yandex(InterfaceC13490l interfaceC13490l) {
        return purchase().loadAd;
    }
}
