package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْۨٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13830l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11148l f26974l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26975l;

    public /* synthetic */ C13830l(C11148l c11148l, int i) {
        this.f26975l = i;
        this.f26974l = c11148l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f26975l;
        C11148l c11148l = this.f26974l;
        switch (i) {
            case 0:
                c11148l.m3042abstract((String) obj);
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                C11560l c11560l = c11148l.f30818l;
                if (c11560l == null) {
                    c11560l = null;
                }
                c11560l.setCurrentItem(iIntValue, true);
                break;
        }
        return Unit.INSTANCE;
    }
}
