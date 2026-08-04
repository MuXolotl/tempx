package defpackage;

/* JADX INFO: renamed from: lٍؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9308l implements InterfaceC10137l {
    public final C8954l yandex;

    public C9308l(C8954l c8954l) {
        this.yandex = c8954l;
    }

    @Override // defpackage.InterfaceC10137l
    public final int amazon(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return 0;
    }

    @Override // defpackage.InterfaceC10137l
    public final int crashlytics(InterfaceC13490l interfaceC13490l) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9308l)) {
            return false;
        }
        return AbstractC8576l.yandex(this.yandex, ((C9308l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC10137l
    public final int loadAd(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l) {
        return 0;
    }

    @Override // defpackage.InterfaceC10137l
    public final int yandex(InterfaceC13490l interfaceC13490l) {
        int i;
        float fAdmob = ((C13765l) this.yandex.mopub.subs).admob();
        if (!Float.isNaN(fAdmob) && (i = (int) fAdmob) >= 0) {
            return i;
        }
        return 0;
    }
}
