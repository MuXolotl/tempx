package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؓؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1528l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f3796l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3797l;

    public /* synthetic */ C1528l(InterfaceC8714l interfaceC8714l, int i) {
        this.f3797l = i;
        this.f3796l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f3797l;
        InterfaceC8714l interfaceC8714l = this.f3796l;
        switch (i) {
            case 0:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                interfaceC8714l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                interfaceC8714l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                return (InterfaceC18212l) interfaceC8714l.getValue();
        }
    }
}
