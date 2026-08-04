package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6275l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC1112l f13234l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13235l;

    public /* synthetic */ C6275l(AbstractC1112l abstractC1112l, int i) {
        this.f13235l = i;
        this.f13234l = abstractC1112l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13235l;
        AbstractC1112l abstractC1112l = this.f13234l;
        switch (i) {
            case 0:
                return AbstractC5592l.crashlytics(abstractC1112l.mo818extends());
            case 1:
                return abstractC1112l.m821synchronized(true);
            case 2:
                return AbstractC7572l.admob(abstractC1112l) ? abstractC1112l.m821synchronized(false) : abstractC1112l.admob();
            case 3:
                InterfaceC13012l interfaceC13012l = abstractC1112l.f3046l.loadAd.yandex(1, abstractC1112l.mo820private()).loadAd;
                if (interfaceC13012l != null) {
                    return interfaceC13012l;
                }
                AbstractC4769l.billing(abstractC1112l.getName());
                throw null;
            default:
                List typeParameters = abstractC1112l.mo818extends().getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C9243l(abstractC1112l, (InterfaceC16902l) it.next(), abstractC1112l.f3046l.loadAd));
                }
                return arrayList;
        }
    }
}
