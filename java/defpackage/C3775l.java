package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕۦٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3775l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13238l f7861l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7862l;

    public /* synthetic */ C3775l(InterfaceC13238l interfaceC13238l, int i, int i2) {
        this.f7862l = i2;
        this.f7861l = interfaceC13238l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7862l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC12959l.loadAd(this.f7861l, c6956l, AbstractC0545l.purchase(9));
                break;
            default:
                AbstractC12959l.amazon(this.f7861l, c6956l, AbstractC0545l.purchase(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
