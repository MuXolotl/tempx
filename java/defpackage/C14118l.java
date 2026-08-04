package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lْٓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14118l implements InterfaceC18035l, InterfaceC16555l {
    public final Set crashlytics;
    public final String loadAd;
    public final InterfaceC18035l yandex;

    public C14118l(InterfaceC18035l interfaceC18035l) {
        this.yandex = interfaceC18035l;
        this.loadAd = interfaceC18035l.yandex() + '?';
        this.crashlytics = AbstractC16164l.crashlytics(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC18035l
    public final String admob(int i) {
        return this.yandex.admob(i);
    }

    @Override // defpackage.InterfaceC18035l
    public final int amazon(String str) {
        return this.yandex.amazon(str);
    }

    @Override // defpackage.InterfaceC18035l
    public final AbstractC2021l billing() {
        return this.yandex.billing();
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean crashlytics() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14118l) {
            return AbstractC8576l.yandex(this.yandex, ((C14118l) obj).yandex);
        }
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean firebase(int i) {
        return this.yandex.firebase(i);
    }

    @Override // defpackage.InterfaceC18035l
    public final List getAnnotations() {
        return this.yandex.getAnnotations();
    }

    public final int hashCode() {
        return this.yandex.hashCode() * 31;
    }

    @Override // defpackage.InterfaceC18035l
    public final InterfaceC18035l isPro(int i) {
        return this.yandex.isPro(i);
    }

    @Override // defpackage.InterfaceC16555l
    public final Set loadAd() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC18035l
    public final int mopub() {
        return this.yandex.mopub();
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean purchase() {
        return this.yandex.purchase();
    }

    @Override // defpackage.InterfaceC18035l
    public final List subs(int i) {
        return this.yandex.subs(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.yandex);
        sb.append('?');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC18035l
    public final String yandex() {
        return this.loadAd;
    }
}
