package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;

/* JADX INFO: renamed from: lٍۜٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9834l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f20027l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9554l f20028l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Block f20029l;

    public C9834l(C9554l c9554l, AbstractC9694l abstractC9694l, Catalog2Block catalog2Block) {
        this.f20029l = catalog2Block;
        this.f20028l = c9554l;
        this.f20027l = abstractC9694l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            C9554l c9554l = this.f20028l;
            if (objM2132native == c13863l) {
                Catalog2Block catalog2Block = this.f20029l;
                Map mapCrashlytics = catalog2Block.crashlytics(c9554l);
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
                    if (obj3 instanceof AudioContentCard) {
                        arrayList2.add(obj3);
                    }
                }
                objM2132native = AbstractC0509l.billing(arrayList2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC4107l.yandex((AbstractC18082l) objM2132native, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), AbstractC14566l.amazon(-2061340936, new C13147l(c9554l, this.f20027l, i), c6956l), c6956l, 440, 0);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
