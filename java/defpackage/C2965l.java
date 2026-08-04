package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؔۡؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2965l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15620l f6452l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6453l;

    public /* synthetic */ C2965l(C15620l c15620l, int i) {
        this.f6453l = i;
        this.f6452l = c15620l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f6453l;
        C15620l c15620l = this.f6452l;
        switch (i) {
            case 0:
                c15620l.m4093l();
                return Unit.INSTANCE;
            case 1:
                return new C1187l(c15620l.f30530l);
            default:
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) c15620l.f30518l.getValue();
                return new C1187l(interfaceC18212l != null ? interfaceC18212l.mo2591strictfp(0L) : 9205357640488583168L);
        }
    }
}
