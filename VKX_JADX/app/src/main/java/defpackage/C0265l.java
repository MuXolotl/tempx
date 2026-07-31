package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* JADX INFO: renamed from: lِؑۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0265l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f1256l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Layout.SynthOpenCacheSearch f1257l;

    public C0265l(AbstractC9694l abstractC9694l, Catalog2Layout.SynthOpenCacheSearch synthOpenCacheSearch) {
        this.f1257l = synthOpenCacheSearch;
        this.f1256l = abstractC9694l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            Catalog2Layout.SynthOpenCacheSearch synthOpenCacheSearch = this.f1257l;
            String str = synthOpenCacheSearch.yandex;
            AbstractC9694l abstractC9694l = this.f1256l;
            boolean zAdmob = c6956l.admob(abstractC9694l) | c6956l.billing(synthOpenCacheSearch);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C16713l(abstractC9694l, synthOpenCacheSearch);
                c6956l.m2147try(objM2132native);
            }
            AbstractC14055l.yandex(str, (Function0) objM2132native, c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
