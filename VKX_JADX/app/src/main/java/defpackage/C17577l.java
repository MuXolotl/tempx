package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗۨۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17577l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10113l f34203l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34204l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34205l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f34206l;

    public /* synthetic */ C17577l(int i, AbstractC10113l abstractC10113l, int i2, int i3) {
        this.f34205l = i3;
        this.f34204l = i;
        this.f34203l = abstractC10113l;
        this.f34206l = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f34205l;
        int i2 = this.f34206l;
        int i3 = this.f34204l;
        AbstractC10113l abstractC10113l = this.f34203l;
        AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
        switch (i) {
            case 0:
                abstractC9601l.mopub(abstractC10113l, i3, i2, 0.0f);
                break;
            case 1:
                abstractC9601l.mopub(abstractC10113l, AbstractC5573l.ads((i3 - abstractC10113l.f20592l) / 2.0f), AbstractC5573l.ads((i2 - abstractC10113l.f20591l) / 2.0f), 0.0f);
                break;
            case 2:
                abstractC9601l.mopub(abstractC10113l, AbstractC5573l.ads((i3 - abstractC10113l.f20592l) / 2.0f), AbstractC5573l.ads((i2 - abstractC10113l.f20591l) / 2.0f), 0.0f);
                break;
            default:
                abstractC9601l.mopub(abstractC10113l, i3, i2, 0.0f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17577l(AbstractC10113l abstractC10113l, int i, int i2, int i3) {
        this.f34205l = i3;
        this.f34203l = abstractC10113l;
        this.f34204l = i;
        this.f34206l = i2;
    }
}
