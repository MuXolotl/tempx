package defpackage;

import java.util.AbstractCollection;

/* JADX INFO: renamed from: lؗٝٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5032l extends AbstractC12172l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f10290l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AbstractCollection f10291l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5032l(AbstractCollection abstractCollection, InterfaceC6429l interfaceC6429l, int i) {
        super(interfaceC6429l);
        this.f10290l = i;
        this.f10291l = abstractCollection;
    }

    @Override // defpackage.AbstractC12172l
    public final Object crashlytics(int i) {
        int i2 = this.f10290l;
        AbstractCollection abstractCollection = this.f10291l;
        InterfaceC6429l interfaceC6429l = this.f24189l;
        switch (i2) {
            case 0:
                return interfaceC6429l.ads(((C7969l) abstractCollection).f16623l, i);
            default:
                return interfaceC6429l.inmobi(((C14355l) abstractCollection).f28106l, i);
        }
    }
}
