package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14350l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11383l f28097l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28098l;

    public /* synthetic */ C14350l(AbstractC11383l abstractC11383l, int i) {
        this.f28098l = i;
        this.f28097l = abstractC11383l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f28098l;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 0;
        AbstractC11383l abstractC11383l = this.f28097l;
        switch (i) {
            case 0:
                AbstractC10999l.mopub(AbstractC11990l.firebase(abstractC11383l), null, 0, new C2720l(abstractC11383l, interfaceC14029l, 1), 3);
                break;
            case 1:
                AbstractC9029l.loadAd(abstractC11383l.isVip());
                break;
            case 2:
                abstractC11383l.f22965l.setValue("");
                break;
            case 3:
                AbstractC10999l.mopub(AbstractC11990l.firebase(abstractC11383l), null, 0, new C2720l(abstractC11383l, interfaceC14029l, i2), 3);
                break;
            default:
                new C14472l(new C12467l(), 2).Signature(abstractC11383l.isVip());
                break;
        }
        return Unit.INSTANCE;
    }
}
