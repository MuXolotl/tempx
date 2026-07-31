package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15692l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0996l f30831l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30832l;

    public /* synthetic */ C15692l(C0996l c0996l, int i) {
        this.f30832l = 2;
        this.f30831l = c0996l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30832l;
        C13863l c13863l = C1867l.yandex;
        C0996l c0996l = this.f30831l;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC18079l.yandex(AbstractC11718l.yandex, null, AbstractC14566l.amazon(784829745, new C15692l(c0996l, 3, z ? (byte) 1 : (byte) 0), c6956l), null, 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).purchase(c6956l), null, null, c6956l, 390, 474);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c6956l2.m2124else();
                } else if (((Boolean) c0996l.f2744l.getValue()).booleanValue()) {
                    c6956l2.m2123default(940152430);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.view_outline_28, 0, c6956l2), AbstractC11999l.purchase(c6956l2, R.string.hide_password), null, 0L, c6956l2, 8, 12);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(940160942);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.hide_outline_28, 0, c6956l2), AbstractC11999l.purchase(c6956l2, R.string.show_password), null, 0L, c6956l2, 8, 12);
                    c6956l2.startapp(false);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                c0996l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0996l c0996l2 = this.f30831l;
                    boolean zAdmob = c6956l3.admob(c0996l2);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C6335l c6335l = new C6335l(0, c0996l2, C0996l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 29);
                        c6956l3.m2147try(c6335l);
                        objM2132native = c6335l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC11718l.loadAd, c6956l3, 1572864, 62);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 4:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC13010l.loadAd((String) c0996l.f2742l.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zAdmob2 = c6956l5.admob(c0996l);
                    Object objM2132native2 = c6956l5.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C7730l(1, c0996l);
                        c6956l5.m2147try(objM2132native2);
                    }
                    AbstractC7470l.billing((Function0) objM2132native2, null, false, null, null, null, AbstractC14566l.amazon(291480774, new C15692l(c0996l, i2, z ? (byte) 1 : (byte) 0), c6956l5), c6956l5, 1572864, 62);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15692l(C0996l c0996l, int i, byte b) {
        this.f30832l = i;
        this.f30831l = c0996l;
    }
}
