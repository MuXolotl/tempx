package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؙٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6517l implements InterfaceC18035l {
    public final InterfaceC18035l yandex;

    public AbstractC6517l(InterfaceC18035l interfaceC18035l) {
        this.yandex = interfaceC18035l;
    }

    @Override // defpackage.InterfaceC18035l
    public final String admob(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.InterfaceC18035l
    public final int amazon(String str) {
        Integer numSignatures = AbstractC16648l.signatures(str);
        if (numSignatures != null) {
            return numSignatures.intValue();
        }
        C8339l.metrica(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.InterfaceC18035l
    public final AbstractC2021l billing() {
        return C9164l.amazon;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6517l)) {
            return false;
        }
        AbstractC6517l abstractC6517l = (AbstractC6517l) obj;
        return AbstractC8576l.yandex(this.yandex, abstractC6517l.yandex) && AbstractC8576l.yandex(yandex(), abstractC6517l.yandex());
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean firebase(int i) {
        if (i >= 0) {
            return false;
        }
        C1759l.startapp(AbstractC2812l.Signature("Illegal index ", i, ", "), yandex(), " expects only non-negative indices");
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ List getAnnotations() {
        return C2580l.f5619l;
    }

    public final int hashCode() {
        return yandex().hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC18035l
    public final InterfaceC18035l isPro(int i) {
        if (i >= 0) {
            return this.yandex;
        }
        C1759l.startapp(AbstractC2812l.Signature("Illegal index ", i, ", "), yandex(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.InterfaceC18035l
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final List subs(int i) {
        if (i >= 0) {
            return C2580l.f5619l;
        }
        C1759l.startapp(AbstractC2812l.Signature("Illegal index ", i, ", "), yandex(), " expects only non-negative indices");
        return null;
    }

    public final String toString() {
        return yandex() + '(' + this.yandex + ')';
    }
}
