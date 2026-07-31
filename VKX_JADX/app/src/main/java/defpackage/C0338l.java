package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؑٔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0338l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6187l f1387l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1388l;

    public /* synthetic */ C0338l(C6187l c6187l, int i) {
        this.f1388l = i;
        this.f1387l = c6187l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1388l;
        C6187l c6187l = this.f1387l;
        switch (i) {
            case 0:
                InterfaceC16115l interfaceC16115l = c6187l.f13045l;
                if (interfaceC16115l == null) {
                    throw AbstractC1757l.m1043volatile("Font resolution state is not set.");
                }
                interfaceC16115l.getValue();
                return Unit.INSTANCE;
            default:
                InterfaceC16115l interfaceC16115l2 = c6187l.f13045l;
                if (interfaceC16115l2 == null) {
                    throw AbstractC1757l.m1043volatile("Font resolution state is not set.");
                }
                interfaceC16115l2.getValue();
                return Unit.INSTANCE;
        }
    }
}
