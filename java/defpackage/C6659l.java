package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.NativePointer;

/* JADX INFO: renamed from: lؙۖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6659l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC7832l f14001l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f14002l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6659l(C12125l c12125l, NativePointer nativePointer, int i) {
        super(c12125l);
        this.f14002l = i;
        switch (i) {
            case 1:
                super(c12125l);
                this.f14001l = new C5765l(this, nativePointer, new C11513l(nativePointer, c12125l.purchase.values()));
                break;
            default:
                this.f14001l = new C6067l(this, nativePointer);
                break;
        }
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public DynamicMutableRealmObject m2062l(InterfaceC11343l interfaceC11343l) {
        DynamicMutableRealmObject dynamicMutableRealmObject;
        C6067l c6067l = (C6067l) this.f14001l;
        if (!AbstractC15011l.isPro(interfaceC11343l)) {
            return null;
        }
        C1332l f36671l = ((InterfaceC2851l) interfaceC11343l).getF36807l();
        if (f36671l == null) {
            dynamicMutableRealmObject = null;
        } else {
            if (!AbstractC8576l.yandex(f36671l.f3419l, c6067l)) {
                C1332l c1332lPurchase = f36671l.purchase(c6067l, AbstractC18202l.yandex.loadAd(DynamicMutableRealmObject.class));
                return (DynamicMutableRealmObject) (c1332lPurchase != null ? (InterfaceC11343l) AbstractC6710l.firebase(c1332lPurchase) : null);
            }
            dynamicMutableRealmObject = (DynamicMutableRealmObject) interfaceC11343l;
        }
        if (dynamicMutableRealmObject != null) {
            return dynamicMutableRealmObject;
        }
        C8339l.metrica("Cannot lookup unmanaged object");
        return null;
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final C14649l m2063l(String str, String str2, Object... objArr) {
        int i = this.f14002l;
        InterfaceC7832l interfaceC7832l = this.f14001l;
        switch (i) {
            case 0:
                C6067l c6067l = (C6067l) interfaceC7832l;
                return new C14649l(c6067l, c6067l.mo1847l().crashlytics(str).loadAd, AbstractC18202l.yandex.loadAd(DynamicMutableRealmObject.class), ((C12125l) this.f33215l).billing, str2, objArr);
            default:
                C5765l c5765l = (C5765l) interfaceC7832l;
                return new C14649l(c5765l, c5765l.f12150l.crashlytics(str).loadAd, AbstractC18202l.yandex.loadAd(InterfaceC11343l.class), ((C12125l) this.f33215l).billing, str2, objArr);
        }
    }

    @Override // defpackage.AbstractC17054l, defpackage.InterfaceC13079l
    public final InterfaceC7832l remoteconfig() {
        switch (this.f14002l) {
            case 0:
                return (C6067l) this.f14001l;
            default:
                return (C5765l) this.f14001l;
        }
    }
}
