package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* JADX INFO: renamed from: lؙؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6204l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9554l f13095l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Block f13096l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f13097l;

    public C6204l(C9554l c9554l, AbstractC9694l abstractC9694l, Catalog2Block catalog2Block) {
        this.f13097l = abstractC9694l;
        this.f13096l = catalog2Block;
        this.f13095l = c9554l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC9694l abstractC9694l = this.f13097l;
            C10086l c10086l = abstractC9694l.f19770l;
            C10086l c10086l2 = abstractC9694l.f19771l;
            boolean z = ((InterfaceC17817l) c10086l.getValue()) instanceof C3086l;
            EnumC11447l enumC11447l = (EnumC11447l) c10086l2.getValue();
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                Catalog2Block catalog2Block = this.f13096l;
                Map mapCrashlytics = catalog2Block.crashlytics(this.f13095l);
                List listPurchase = catalog2Block.purchase();
                ArrayList arrayList = new ArrayList();
                Iterator it = listPurchase.iterator();
                while (it.hasNext()) {
                    InterfaceC12360l interfaceC12360l = (InterfaceC12360l) mapCrashlytics.get((String) it.next());
                    if (interfaceC12360l != null) {
                        arrayList.add(interfaceC12360l);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof AudioStreamMix) {
                        arrayList2.add(obj3);
                    }
                }
                objM2132native = AbstractC0509l.billing(arrayList2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC18082l abstractC18082l = (AbstractC18082l) objM2132native;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(abstractC9694l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C17579l(abstractC9694l);
                c6956l.m2147try(objM2132native2);
            }
            Function2 function2 = (Function2) objM2132native2;
            boolean zAdmob2 = c6956l.admob(abstractC9694l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                objM2132native3 = new C0976l(5, abstractC9694l);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC11839l.yandex(z, enumC11447l, abstractC18082l, function2, (Function2) objM2132native3, interfaceC17242lAmazon, c6956l, 196992);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
