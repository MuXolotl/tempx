package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔۚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2893l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0684l f6294l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9280l f6295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6296l;

    public /* synthetic */ C2893l(C9280l c9280l, InterfaceC0684l interfaceC0684l, int i) {
        this.f6296l = i;
        this.f6295l = c9280l;
        this.f6294l = interfaceC0684l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f6296l;
        InterfaceC0684l interfaceC0684l = this.f6294l;
        C9280l c9280l = this.f6295l;
        C11154l c11154l = (C11154l) obj;
        switch (i) {
            case 0:
                c9280l.yandex(interfaceC0684l, c11154l);
                break;
            default:
                c9280l.loadAd(interfaceC0684l, c11154l);
                break;
        }
        return Unit.INSTANCE;
    }
}
