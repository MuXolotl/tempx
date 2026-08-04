package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٌۦؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9190l extends RuntimeException {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16761l f18901l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C12463l f18902l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12463l f18903l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f18904l;

    public C9190l(C12463l c12463l, C12463l c12463l2, C16761l c16761l, int i, Exception exc) {
        super(exc);
        this.f18903l = c12463l;
        this.f18902l = c12463l2;
        this.f18901l = c16761l;
        this.f18904l = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() throws IOException {
        List listSingletonList;
        C11129l c11129lPurchase = AbstractC6900l.purchase(new C10492l(this, null));
        if (c11129lPurchase.hasNext()) {
            Object next = c11129lPurchase.next();
            if (c11129lPurchase.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c11129lPurchase.hasNext()) {
                    arrayList.add(c11129lPurchase.next());
                }
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = C2580l.f5619l;
        }
        return AbstractC1833l.smaato("\n            |Failed to execute op number " + this.f18904l + ":\n            |" + AbstractC16901l.m4210case(AbstractC16901l.m4209break(50, listSingletonList), "\n", null, null, null, 62) + "\n            ");
    }
}
