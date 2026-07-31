package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11003l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f22175l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22176l;

    public /* synthetic */ C11003l(InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f22176l = i2;
        this.f22175l = interfaceC17242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f22176l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC10704l.crashlytics(this.f22175l, c6956l, AbstractC0545l.purchase(7));
                break;
            case 1:
                AbstractC10704l.amazon(this.f22175l, c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                AbstractC10565l.yandex(this.f22175l, c6956l, AbstractC0545l.purchase(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
