package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1458l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5475l f3641l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3642l;

    public /* synthetic */ C1458l(InterfaceC5475l interfaceC5475l, int i) {
        this.f3642l = i;
        this.f3641l = interfaceC5475l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3642l;
        InterfaceC5475l interfaceC5475l = this.f3641l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c6956l.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                    c6956l.m2124else();
                } else if (interfaceC5475l instanceof C3022l) {
                    c6956l.m2123default(-2120622771);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.error_occurred_vk), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(false);
                } else if (interfaceC5475l instanceof C10488l) {
                    c6956l.m2123default(-2120497872);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.error_occurred), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(false);
                } else if (interfaceC5475l instanceof C13974l) {
                    c6956l.m2123default(-2120368757);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.error_state_network), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(false);
                } else if (interfaceC5475l instanceof C12571l) {
                    c6956l.m2123default(-2120227025);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.error_1117_info), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(false);
                } else if (interfaceC5475l instanceof C5190l) {
                    c6956l.m2123default(-2120095926);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.error_5_blocked_info), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(false);
                } else if (interfaceC5475l instanceof C10543l) {
                    c6956l.m2123default(-2119959061);
                    C10543l c10543l = (C10543l) interfaceC5475l;
                    String str = c10543l.loadAd;
                    if (str.length() > 0) {
                        c6956l.m2123default(-2119914421);
                        AbstractC13010l.loadAd(str, null, 0L, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 1572864, 0, 262078);
                    } else {
                        c6956l.m2123default(-2129825214);
                    }
                    c6956l.startapp(false);
                    AbstractC13010l.loadAd(c10543l.crashlytics, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(false);
                } else if (interfaceC5475l instanceof C4494l) {
                    c6956l.m2123default(-2119727925);
                    C4494l c4494l = (C4494l) interfaceC5475l;
                    String str2 = c4494l.loadAd;
                    if (str2.length() > 0) {
                        c6956l.m2123default(-2119683285);
                        AbstractC13010l.loadAd(str2, null, 0L, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 1572864, 0, 262078);
                    } else {
                        c6956l.m2123default(-2129825214);
                    }
                    c6956l.startapp(false);
                    AbstractC13010l.loadAd(c4494l.crashlytics, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                    c6956l.startapp(false);
                } else {
                    if (!AbstractC8576l.yandex(interfaceC5475l, C18058l.yandex)) {
                        throw AbstractC12900l.billing(-899692227, c6956l, false);
                    }
                    c6956l.m2123default(-2119514862);
                    c6956l.startapp(false);
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC0124l.crashlytics(interfaceC5475l, AbstractC0080l.isPro(C4346l.f8873l, 36.0f), c6956l2, 48);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
