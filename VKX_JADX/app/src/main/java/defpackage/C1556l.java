package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: lٌؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1556l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ List f3839l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f3840l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f3841l;

    public C1556l(AbstractC9694l abstractC9694l, List list, List list2) {
        this.f3841l = abstractC9694l;
        this.f3840l = list;
        this.f3839l = list2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogArtist catalogArtist = (CatalogArtist) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? c6956l.billing(catalogArtist) : c6956l.admob(catalogArtist) ? 4 : 2;
        }
        int i = 0;
        boolean z = true;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            Unit unit = Unit.INSTANCE;
            AbstractC9694l abstractC9694l = this.f3841l;
            boolean zAdmob = c6956l.admob(abstractC9694l);
            if ((iIntValue & 14) != 4 && ((iIntValue & 8) == 0 || !c6956l.admob(catalogArtist))) {
                z = false;
            }
            boolean z2 = zAdmob | z;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z2 || objM2132native == c13863l) {
                objM2132native = new C13624l(abstractC9694l, catalogArtist, null, 27);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            boolean zAdmob2 = c6956l.admob(abstractC9694l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C11998l(abstractC9694l, i);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC0496l.yandex((Function0) objM2132native2, this.f3840l, this.f3839l, catalogArtist, c6956l, 4096 | ((iIntValue << 9) & 7168));
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
