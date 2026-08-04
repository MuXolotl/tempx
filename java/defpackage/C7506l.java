package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚۚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7506l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f15522l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10056l f15523l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15524l;

    public /* synthetic */ C7506l(C10056l c10056l, InterfaceC12244l interfaceC12244l, int i) {
        this.f15524l = i;
        this.f15523l = c10056l;
        this.f15522l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15524l;
        C4346l c4346l = C4346l.f8873l;
        InterfaceC12244l interfaceC12244l = this.f15522l;
        switch (i) {
            case 0:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l), 16.0f, 0.0f, 2);
                    C10056l c10056l = this.f15523l;
                    boolean zAdmob = c6956l.admob(c10056l) | c6956l.billing(interfaceC12244l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C8854l(c10056l, interfaceC12244l, 22);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(interfaceC17242lVip, null, null, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 24576, 494);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(c7091l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    this.f15523l.m2873instanceof(((C4700l) interfaceC12244l.getValue()).f9550l, ((C4700l) interfaceC12244l.getValue()).f9549l, AbstractC5020l.smaato(c7091l, c4346l), c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
