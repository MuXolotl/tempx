package defpackage;

import java.util.List;

/* JADX INFO: renamed from: l٘ۜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18225l extends AbstractC13151l {
    public final InterfaceC1388l yandex;
    public List loadAd = C2580l.f5619l;
    public final InterfaceC1220l crashlytics = AbstractC9968l.crashlytics(2, new C10740l(19, this));

    public C18225l(InterfaceC1388l interfaceC1388l) {
        this.yandex = interfaceC1388l;
    }

    @Override // defpackage.AbstractC13151l
    public final InterfaceC1388l admob() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return (InterfaceC18035l) this.crashlytics.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.yandex + ')';
    }
}
