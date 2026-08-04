package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَؙُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10131l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10486l f20635l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20636l;

    public /* synthetic */ C10131l(C10486l c10486l, int i) {
        this.f20636l = i;
        this.f20635l = c10486l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f20636l;
        C10486l c10486l = this.f20635l;
        switch (i) {
            case 0:
                C10202l c10202l = c10486l.f21349l;
                c10202l.m2901l();
                C2518l c2518l = (C2518l) c10202l.f20794l.getValue();
                C2312l c2312l = c10486l.f21348l;
                ArrayList arrayList = new ArrayList();
                AbstractC15011l.crashlytics(c2518l, c2312l, arrayList);
                return arrayList;
            case 1:
                C10202l c10202l2 = c10486l.f21349l;
                c10202l2.m2901l();
                return Boolean.valueOf(AbstractC15011l.mopub((C2518l) c10202l2.f20794l.getValue(), c10486l.f21348l));
            default:
                C2278l c2278l = c10486l.f21346l;
                InterfaceC13922l[] interfaceC13922lArr = C10486l.f21345l;
                InterfaceC13922l interfaceC13922l = interfaceC13922lArr[1];
                boolean zBooleanValue = ((Boolean) c2278l.invoke()).booleanValue();
                C2312l c2312l2 = c10486l.f21348l;
                C10202l c10202l3 = c10486l.f21349l;
                if (zBooleanValue) {
                    return C3198l.loadAd;
                }
                C2278l c2278l2 = c10486l.f21350l;
                InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[0];
                List list = (List) c2278l2.invoke();
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InterfaceC9921l) it.next()).mo2432public());
                }
                return AbstractC12311l.subs("package view scope for " + c2312l2 + " in " + c10202l3.getName(), AbstractC16901l.m4218final(new C17677l(c10202l3, c2312l2), arrayList2));
        }
    }
}
