package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُِٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11762l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17284l f23558l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23559l;

    public /* synthetic */ C11762l(C17284l c17284l, int i) {
        this.f23559l = i;
        this.f23558l = c17284l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f23559l;
        C17284l c17284l = this.f23558l;
        switch (i) {
            case 0:
                c17284l.f33542l.setValue(Boolean.TRUE);
                break;
            default:
                c17284l.f33542l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
