package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍُؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10750l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10202l f21781l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21782l;

    public /* synthetic */ C10750l(C10202l c10202l, int i) {
        this.f21782l = i;
        this.f21781l = c10202l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f21782l;
        C10202l c10202l = this.f21781l;
        switch (i) {
            case 0:
                return new C7997l(c10202l);
            case 1:
                C5501l c5501l = c10202l.f20790l;
                if (c5501l == null) {
                    C8339l.subs(AbstractC0653l.ads(new StringBuilder("Dependencies of module "), c10202l.getName().f7384l, " were not set before querying module content"));
                    return null;
                }
                List list = (List) c5501l.f11764l;
                c10202l.m2901l();
                list.contains(c10202l);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C10202l) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C10202l) it2.next()).f20795l);
                }
                return new C2518l(arrayList, "CompositeProvider@ModuleDescriptor for " + c10202l.getName());
            default:
                return c10202l.mo2270l(AbstractC3974l.subs).f21347l;
        }
    }
}
