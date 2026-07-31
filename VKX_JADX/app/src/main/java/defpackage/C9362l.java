package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9362l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f19190l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ EnumC17214l f19191l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19192l;

    public /* synthetic */ C9362l(EnumC17214l enumC17214l, InterfaceC12244l interfaceC12244l, int i) {
        this.f19192l = i;
        this.f19191l = enumC17214l;
        this.f19190l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19192l;
        InterfaceC12244l interfaceC12244l = this.f19190l;
        EnumC17214l enumC17214l = this.f19191l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4597l.yandex(AbstractC13702l.amazon(), null, AbstractC15788l.yandex(C4346l.f8873l, ((EnumC17214l) interfaceC12244l.getValue()) == enumC17214l ? 1.0f : 0.0f), 0L, c6956l, 48, 8);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (((EnumC17214l) interfaceC12244l.getValue()) == enumC17214l) {
                        c6956l2.m2123default(1208576388);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                    } else {
                        c6956l2.m2123default(1183665284);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
