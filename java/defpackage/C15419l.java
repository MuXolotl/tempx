package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15419l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f30134l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30135l;

    public /* synthetic */ C15419l(C12217l c12217l, int i) {
        this.f30135l = i;
        this.f30134l = c12217l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f30135l;
        C12217l c12217l = this.f30134l;
        switch (i) {
            case 0:
                return new C9582l(7, c12217l);
            case 1:
                EnumC6775l enumC6775l = (EnumC6775l) c12217l.tapsense.getValue();
                EnumC6775l enumC6775l2 = EnumC6775l.f14200l;
                if (enumC6775l == enumC6775l2) {
                    enumC6775l2 = EnumC6775l.f14201l;
                }
                c12217l.pro(enumC6775l2);
                return Unit.INSTANCE;
            default:
                c12217l.amazon();
                return Unit.INSTANCE;
        }
    }
}
