package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15408l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2077l f30108l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30109l;

    public /* synthetic */ C15408l(InterfaceC2077l interfaceC2077l, int i) {
        this.f30109l = i;
        this.f30108l = interfaceC2077l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f30109l;
        InterfaceC2077l interfaceC2077l = this.f30108l;
        switch (i) {
            case 0:
                interfaceC2077l.yandex(((C1187l) obj).yandex, C1461l.f3667l);
                break;
            case 1:
                C15730l c15730l = (C15730l) obj;
                interfaceC2077l.purchase(AbstractC3474l.subs(c15730l, false));
                c15730l.yandex();
                break;
            default:
                C15730l c15730l2 = (C15730l) obj;
                interfaceC2077l.purchase(AbstractC3474l.subs(c15730l2, false));
                c15730l2.yandex();
                break;
        }
        return Unit.INSTANCE;
    }
}
