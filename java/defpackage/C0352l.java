package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0352l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f1414l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10113l f1415l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1416l;

    public /* synthetic */ C0352l(AbstractC10113l abstractC10113l, int i, int i2) {
        this.f1416l = i2;
        this.f1415l = abstractC10113l;
        this.f1414l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f1416l;
        int i2 = this.f1414l;
        AbstractC10113l abstractC10113l = this.f1415l;
        AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
        switch (i) {
            case 0:
                abstractC9601l.mopub(abstractC10113l, -i2, 0, 0.0f);
                break;
            case 1:
                abstractC9601l.mopub(abstractC10113l, 0, -i2, 0.0f);
                break;
            default:
                abstractC9601l.mopub(abstractC10113l, i2, 0, 0.0f);
                break;
        }
        return Unit.INSTANCE;
    }
}
