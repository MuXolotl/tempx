package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚٟۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7436l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12000l f15395l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15396l;

    public /* synthetic */ C7436l(C12000l c12000l, int i) {
        this.f15396l = i;
        this.f15395l = c12000l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15396l;
        C12000l c12000l = this.f15395l;
        switch (i) {
            case 0:
                c12000l.f23914l.setValue(Boolean.FALSE);
                break;
            case 1:
                if (c12000l.m3296import()) {
                    c12000l.m4125private(new C18014l());
                } else {
                    c12000l.m4125private(new C7044l());
                }
                break;
            default:
                c12000l.f23914l.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
