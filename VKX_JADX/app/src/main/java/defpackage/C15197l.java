package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔ۟ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15197l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1930l f29799l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29800l;

    public /* synthetic */ C15197l(C1930l c1930l, int i) {
        this.f29800l = i;
        this.f29799l = c1930l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f29800l;
        Object obj4 = C1867l.yandex;
        int i2 = 2;
        C1930l c1930l = this.f29799l;
        boolean z = false;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC17307l.billing((Bitmap) c1930l.f4396l.getValue(), 0, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp, 0L, 0, 0.0f, false, null, null, null, c6956l, 0, 1018);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(1594827519, new C3998l(c1930l, i3), c6956l2), AbstractC14566l.amazon(1327777728, new C3998l(c1930l, i2), c6956l2), c6956l2, (iIntValue2 & 14) | 432);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zAdmob = c6956l3.admob(c1930l);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == obj4) {
                        objM2132native = new C17829l(c1930l, 1);
                        c6956l3.m2147try(objM2132native);
                    }
                    AbstractC7470l.billing((Function0) objM2132native, null, c1930l.ad() != null, null, null, null, AbstractC4596l.subs, c6956l3, 1572864, 58);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    C1930l c1930l2 = this.f29799l;
                    if (c1930l2.ad() != null) {
                        c6956l4.m2123default(-1882511124);
                        boolean zAdmob2 = c6956l4.admob(c1930l2);
                        Object objM2132native2 = c6956l4.m2132native();
                        if (zAdmob2 || objM2132native2 == obj4) {
                            objM2132native2 = new C6814l(0, c1930l2, C1930l.class, "dispatchApply", "dispatchApply()V", 0, 0, 25);
                            c6956l4.m2147try(objM2132native2);
                        }
                        AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native2), null, false, null, null, null, AbstractC4596l.admob, c6956l4, 1572864, 62);
                    } else {
                        c6956l4.m2123default(-1895507099);
                    }
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC0133l.amazon(AbstractC14566l.amazon(719031456, new C15197l(c1930l, z ? 1 : 0), c6956l5), AbstractC14566l.amazon(-1910062145, new C15197l(c1930l, i3), c6956l5), AbstractC3605l.smaato(C4346l.f8873l, 16.0f), AbstractC14566l.amazon(1421685245, new C15197l(c1930l, i2), c6956l5), c6956l5, 3510, 0);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
