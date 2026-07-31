package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔۧٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15332l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC17477l f29964l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29965l;

    public C15332l(InterfaceC17477l interfaceC17477l, C11720l c11720l, AbstractC15211l abstractC15211l, C9188l c9188l) {
        this.f29965l = 2;
        this.f29964l = interfaceC17477l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f29965l;
        InterfaceC17477l interfaceC17477l = this.f29964l;
        switch (i) {
            case 0:
                C9959l c9959l = (C9959l) obj;
                List listIsVip = interfaceC17477l.isVip();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listIsVip, 10));
                Iterator it = listIsVip.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C9243l(c9959l, (InterfaceC16902l) it.next()));
                }
                return arrayList;
            case 1:
                Collection collectionYandex = interfaceC17477l.metrica().yandex();
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(collectionYandex, 10));
                Iterator it2 = collectionYandex.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C5380l((AbstractC18041l) it2.next()));
                }
                return arrayList2;
            default:
                AbstractC3759l.billing(interfaceC17477l);
                return null;
        }
    }

    public /* synthetic */ C15332l(InterfaceC17477l interfaceC17477l, int i) {
        this.f29965l = i;
        this.f29964l = interfaceC17477l;
    }
}
