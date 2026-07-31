package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؓ۠ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2154l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f4786l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4787l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4788l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f4789l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4790l;

    public /* synthetic */ C2154l(C15578l c15578l, C14632l c14632l, C15578l c15578l2, C15578l c15578l3) {
        this.f4787l = c15578l;
        this.f4789l = c14632l;
        this.f4786l = c15578l2;
        this.f4790l = c15578l3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f4788l;
        C4346l c4346l = C4346l.f8873l;
        Object obj5 = this.f4789l;
        Object obj6 = this.f4790l;
        Object obj7 = this.f4786l;
        Object obj8 = this.f4787l;
        switch (i) {
            case 0:
                C15578l c15578l = (C15578l) obj8;
                C14632l c14632l = (C14632l) obj5;
                C15578l c15578l2 = (C15578l) obj7;
                C15578l c15578l3 = (C15578l) obj6;
                C8511l c8511l = (C8511l) obj;
                C6956l c6956l = (C6956l) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                int iOrdinal = ((EnumC6302l) obj2).ordinal();
                if (iOrdinal == 0) {
                    c6956l.m2123default(-814177199);
                    c15578l.invoke(c14632l, c8511l, c6956l, Integer.valueOf((iIntValue << 3) & 112));
                    c6956l.startapp(false);
                } else if (iOrdinal == 1) {
                    c6956l.m2123default(-813992749);
                    c15578l3.invoke(c14632l, c8511l, c6956l, Integer.valueOf((iIntValue << 3) & 112));
                    c6956l.startapp(false);
                } else if (iOrdinal == 2) {
                    c6956l.m2123default(-814084044);
                    c15578l2.invoke(c14632l, c8511l, c6956l, Integer.valueOf((iIntValue << 3) & 112));
                    c6956l.startapp(false);
                } else {
                    if (iOrdinal != 3) {
                        throw AbstractC12900l.billing(1774850267, c6956l, false);
                    }
                    c6956l.m2123default(-813900834);
                    AbstractC9383l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l, 6);
                    c6956l.startapp(false);
                }
                return Unit.INSTANCE;
            default:
                C0956l c0956l = (C0956l) obj8;
                C6523l c6523l = (C6523l) obj7;
                C15308l c15308l = (C15308l) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                C8032l c8032l = (C8032l) ((InterfaceC13238l) ((InterfaceC12244l) obj6).getValue()).get(iIntValue2);
                String str = c8032l.loadAd;
                String str2 = c8032l.crashlytics;
                boolean zAdmob = c6956l2.admob(c0956l) | c6956l2.billing(c8032l);
                Object objM2132native = c6956l2.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (zAdmob || objM2132native == c13863l) {
                    objM2132native = new C8652l(c0956l, c8032l, 15);
                    c6956l2.m2147try(objM2132native);
                }
                Function0 function0 = (Function0) objM2132native;
                boolean z = (((iIntValue3 & 112) ^ 48) > 32 && c6956l2.amazon(iIntValue2)) || (iIntValue3 & 48) == 32;
                Object objM2132native2 = c6956l2.m2132native();
                if (z || objM2132native2 == c13863l) {
                    objM2132native2 = new C8803l(iIntValue2, c15308l, 6);
                    c6956l2.m2147try(objM2132native2);
                }
                c0956l.admob(str, str2, function0, (Function0) objM2132native2, AbstractC9679l.billing(AbstractC0080l.vip(c4346l, 180.0f), iIntValue2 == 0, AbstractC9966l.billing(c4346l, c6523l)), c6956l2, 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2154l(C0956l c0956l, C6523l c6523l, InterfaceC12244l interfaceC12244l, C15308l c15308l) {
        this.f4787l = c0956l;
        this.f4786l = c6523l;
        this.f4790l = interfaceC12244l;
        this.f4789l = c15308l;
    }
}
