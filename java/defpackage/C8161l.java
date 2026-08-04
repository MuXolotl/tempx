package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8161l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f17037l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2186l f17038l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17039l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C6402l f17040l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f17041l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f17042l;

    public /* synthetic */ C8161l(InterfaceC2186l interfaceC2186l, boolean z, boolean z2, C6402l c6402l, InterfaceC14328l interfaceC14328l, int i) {
        this.f17039l = i;
        this.f17038l = interfaceC2186l;
        this.f17037l = z;
        this.f17041l = z2;
        this.f17040l = c6402l;
        this.f17042l = interfaceC14328l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f17039l;
        InterfaceC14328l interfaceC14328l = this.f17042l;
        InterfaceC2186l interfaceC2186l = this.f17038l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                ((Number) obj3).intValue();
                c6956l.m2123default(-1525724089);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == c13863l) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                C2403l c2403l = (C2403l) objM2132native;
                InterfaceC17242l interfaceC17242lPremium = AbstractC14631l.yandex(c4346l, c2403l, interfaceC2186l).premium(new C1494l(this.f17037l, c2403l, null, this.f17041l, this.f17040l, (Function0) interfaceC14328l));
                c6956l.startapp(false);
                return interfaceC17242lPremium;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                ((Number) obj3).intValue();
                c6956l2.m2123default(-1525724089);
                Object objM2132native2 = c6956l2.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = AbstractC14814l.isPro(c6956l2);
                }
                C2403l c2403l2 = (C2403l) objM2132native2;
                InterfaceC17242l interfaceC17242lPremium2 = AbstractC14631l.yandex(c4346l, c2403l2, interfaceC2186l).premium(new C17825l(this.f17037l, c2403l2, null, this.f17041l, this.f17040l, (Function1) interfaceC14328l));
                c6956l2.startapp(false);
                return interfaceC17242lPremium2;
        }
    }
}
