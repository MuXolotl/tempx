package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lۣؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3742l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8757l f7827l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7828l;

    public /* synthetic */ C3742l(C8757l c8757l, int i) {
        this.f7828l = i;
        this.f7827l = c8757l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f7828l;
        C8757l c8757l = this.f7827l;
        switch (i) {
            case 0:
                c8757l.f18022l.setValue(Boolean.FALSE);
                break;
            case 1:
                c8757l.f18022l.setValue(Boolean.TRUE);
                break;
            default:
                c8757l.f18022l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
