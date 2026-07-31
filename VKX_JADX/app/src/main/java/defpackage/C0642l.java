package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؑۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0642l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17986l f2102l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2103l;

    public /* synthetic */ C0642l(C17986l c17986l, int i) {
        this.f2103l = i;
        this.f2102l = c17986l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2103l;
        C13863l c13863l = C1867l.yandex;
        boolean z = false;
        int i2 = 2;
        C17986l c17986l = this.f2102l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c17986l.pro((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                c17986l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, c17986l.signatures() ? R.string.library_mass_action_invert_desc_on : R.string.library_mass_action_invert_desc_off), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 3:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zSignatures = c17986l.signatures();
                    boolean zAdmob = c6956l2.admob(c17986l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C9773l(c17986l, z ? 1 : 0);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC2021l.yandex(zSignatures, (Function1) objM2132native, null, false, null, c6956l2, 0, 124);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 4:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zIsVip = c17986l.isVip();
                    boolean zAdmob2 = c6956l3.admob(c17986l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C9773l(c17986l, i2);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC2021l.yandex(zIsVip, (Function1) objM2132native2, null, false, null, c6956l3, 0, 124);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c17986l.ad((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0642l(C17986l c17986l, int i, int i2) {
        this.f2103l = i2;
        this.f2102l = c17986l;
    }
}
