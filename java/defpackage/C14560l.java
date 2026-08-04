package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٓۦۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14560l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Bitmap f28506l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28507l;

    public /* synthetic */ C14560l(Bitmap bitmap, int i) {
        this.f28507l = i;
        this.f28506l = bitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f28507l;
        C16589l c16589l = C16589l.yandex;
        Bitmap bitmap = this.f28506l;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C10053l.yandex(new C7552l(R.drawable.rounded_card_dock), null, AbstractC5573l.tapsense(new C4538l(c16589l)), 1, null, c6956l, 48, 16);
                    if (bitmap == null) {
                        c6956l.m2123default(-1916319865);
                    } else {
                        c6956l.m2123default(-1916319864);
                        C10053l.yandex(new C12826l(bitmap), null, AbstractC5573l.tapsense(new C4538l(c16589l)), 1, null, c6956l, 48, 16);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C10053l.yandex(new C7552l(R.drawable.rounded_card_dock), null, AbstractC5573l.tapsense(new C4538l(c16589l)), 1, null, c6956l, 48, 16);
                    if (bitmap == null) {
                        c6956l.m2123default(1050633512);
                    } else {
                        c6956l.m2123default(1050633513);
                        C10053l.yandex(new C12826l(bitmap), null, AbstractC5573l.tapsense(new C4538l(c16589l)), 1, null, c6956l, 48, 16);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1889l.yandex(AbstractC13542l.loadAd(c6956l), null, AbstractC14566l.amazon(-2098935202, new C14560l(bitmap, i2), c6956l), c6956l, 384, 2);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
