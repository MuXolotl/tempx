package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15727l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4560l f30893l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30894l;

    public /* synthetic */ C15727l(C4560l c4560l, int i) {
        this.f30894l = 1;
        this.f30893l = c4560l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30894l;
        C4560l c4560l = this.f30893l;
        int i2 = 2;
        boolean z = false;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC18079l.yandex(AbstractC14566l.amazon(835595713, new C15727l(c4560l, i2, z ? (byte) 1 : (byte) 0), c6956l), null, AbstractC14566l.amazon(762011135, new C15727l(c4560l, 3, z ? (byte) 1 : (byte) 0), c6956l), null, 0.0f, null, null, null, c6956l, 390, 506);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                c4560l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int iOrdinal = c4560l.m1555import().yandex.ordinal();
                    int i3 = R.drawable.ic_phone_outline_28;
                    switch (iOrdinal) {
                        case 0:
                            i3 = R.drawable.ic_message_outline_28;
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i3, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                            break;
                        case 1:
                            i3 = R.drawable.ic_smartphone_outline_28;
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i3, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                            break;
                        case 2:
                            i3 = R.drawable.ic_mail_outline_28;
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i3, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                            break;
                        case 3:
                            i3 = R.drawable.ic_pincode_lock_outline_28;
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i3, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                            break;
                        case 4:
                        case 5:
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i3, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                            break;
                        case 6:
                            i3 = R.drawable.ic_article_outline_28;
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i3, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                            break;
                        default:
                            C18725l.billing();
                            return null;
                    }
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C4560l c4560l2 = this.f30893l;
                    boolean zAdmob = c6956l3.admob(c4560l2);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C6335l c6335l = new C6335l(0, c4560l2, C4560l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 27);
                        c6956l3.m2147try(c6335l);
                        objM2132native = c6335l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC4952l.yandex, c6956l3, 1572864, 62);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            default:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC13010l.loadAd((String) c4560l.f9236l.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C15727l(C4560l c4560l, int i, byte b) {
        this.f30894l = i;
        this.f30893l = c4560l;
    }
}
