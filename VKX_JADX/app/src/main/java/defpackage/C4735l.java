package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚؗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4735l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f9754l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9755l = 1;

    public C4735l(List list, C4619l c4619l) {
        this.f9754l = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f9755l;
        List list = this.f9754l;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC18041l abstractC18041lAmazon = AbstractC5170l.amazon((AbstractC18041l) ((InterfaceC13789l) it.next()));
                    if (abstractC18041lAmazon != null) {
                        arrayList.add(abstractC18041lAmazon);
                    }
                }
                return arrayList;
            default:
                return list;
        }
    }

    public C4735l(List list) {
        this.f9754l = list;
    }
}
