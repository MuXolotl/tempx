package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙ۟۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6790l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5803l f14225l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14226l;

    public /* synthetic */ C6790l(C5803l c5803l, int i) {
        this.f14226l = i;
        this.f14225l = c5803l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f14226l;
        C13863l c13863l = C1867l.yandex;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C5803l c5803l = this.f14225l;
                    boolean zAdmob = c6956l.admob(c5803l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        C4936l c4936l = new C4936l(0, c5803l, C5803l.class, "onDismissClicked", "onDismissClicked()V", 0, 0, 3);
                        c6956l.m2147try(c4936l);
                        objM2132native = c4936l;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC10704l.loadAd, c6956l, 1572864, 62);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C5803l c5803l2 = this.f14225l;
                    boolean zAdmob2 = c6956l2.admob(c5803l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C4936l c4936l2 = new C4936l(0, c5803l2, C5803l.class, "dismissSnippetHint", "dismissSnippetHint()V", 0, 0, 4);
                        c6956l2.m2147try(c4936l2);
                        objM2132native2 = c4936l2;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native2), null, false, null, null, null, AbstractC10704l.admob, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
