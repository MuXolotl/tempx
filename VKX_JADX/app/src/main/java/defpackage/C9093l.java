package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؘ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9093l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f18683l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f18684l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18685l;

    public /* synthetic */ C9093l(InterfaceC17242l interfaceC17242l, C15578l c15578l, int i, int i2) {
        this.f18685l = i2;
        this.f18684l = interfaceC17242l;
        this.f18683l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18685l;
        C15578l c15578l = this.f18683l;
        InterfaceC17242l interfaceC17242l = this.f18684l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC18263l.yandex(AbstractC0545l.purchase(49), c15578l, c6956l, interfaceC17242l);
                break;
            default:
                AbstractC11397l.crashlytics(AbstractC0545l.purchase(49), c15578l, c6956l, interfaceC17242l);
                break;
        }
        return Unit.INSTANCE;
    }
}
