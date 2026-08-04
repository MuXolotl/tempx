package defpackage;

import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lَۖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10497l extends AbstractC6791l {
    public C16391l smaato;
    public final C13143l isPro = new C13143l();
    public final C5257l firebase = new C5257l();

    @Override // defpackage.AbstractC6791l
    public final C7417l subs(C15608l c15608l, ByteBuffer byteBuffer) {
        InterfaceC1525l c18137l;
        long j;
        C16391l c16391l = this.smaato;
        if (c16391l == null || c15608l.f30464l != c16391l.purchase()) {
            C16391l c16391l2 = new C16391l(c15608l.f8496l);
            this.smaato = c16391l2;
            c16391l2.yandex(c15608l.f8496l - c15608l.f30464l);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C13143l c13143l = this.isPro;
        c13143l.m3565private(iLimit, bArrArray);
        C5257l c5257l = this.firebase;
        c5257l.firebase(iLimit, bArrArray);
        c5257l.metrica(39);
        long jMopub = (((long) c5257l.mopub(1)) << 32) | ((long) c5257l.mopub(32));
        c5257l.metrica(20);
        int iMopub = c5257l.mopub(12);
        int iMopub2 = c5257l.mopub(8);
        c13143l.m3568throw(14);
        if (iMopub2 == 0) {
            c18137l = new C18137l();
        } else if (iMopub2 == 255) {
            long jApplovin = c13143l.applovin();
            int i = iMopub - 4;
            c13143l.firebase(0, i, new byte[i]);
            c18137l = new C1429l(0, jApplovin, jMopub);
        } else if (iMopub2 == 4) {
            int iSignatures = c13143l.signatures();
            ArrayList arrayList = new ArrayList(iSignatures);
            for (int i2 = 0; i2 < iSignatures; i2++) {
                c13143l.applovin();
                boolean z = (c13143l.signatures() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iSignatures2 = c13143l.signatures();
                    boolean z2 = (iSignatures2 & 64) != 0;
                    boolean z3 = (iSignatures2 & 32) != 0;
                    if (z2) {
                        c13143l.applovin();
                    }
                    if (!z2) {
                        int iSignatures3 = c13143l.signatures();
                        ArrayList arrayList3 = new ArrayList(iSignatures3);
                        for (int i3 = 0; i3 < iSignatures3; i3++) {
                            c13143l.signatures();
                            c13143l.applovin();
                            arrayList3.add(new C14529l(10));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        c13143l.signatures();
                        c13143l.applovin();
                    }
                    c13143l.m3567synchronized();
                    c13143l.signatures();
                    c13143l.signatures();
                }
                C12899l c12899l = new C12899l(10);
                DesugarCollections.unmodifiableList(arrayList2);
                arrayList.add(c12899l);
            }
            c18137l = new C18137l();
            DesugarCollections.unmodifiableList(arrayList);
        } else if (iMopub2 == 5) {
            C16391l c16391l3 = this.smaato;
            c13143l.applovin();
            boolean z4 = (c13143l.signatures() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iSignatures4 = c13143l.signatures();
                boolean z5 = (iSignatures4 & 64) != 0;
                boolean z6 = (iSignatures4 & 32) != 0;
                boolean z7 = (iSignatures4 & 16) != 0;
                long jAmazon = (!z5 || z7) ? -9223372036854775807L : C1429l.amazon(jMopub, c13143l);
                if (!z5) {
                    int iSignatures5 = c13143l.signatures();
                    ArrayList arrayList4 = new ArrayList(iSignatures5);
                    for (int i4 = 0; i4 < iSignatures5; i4++) {
                        c13143l.signatures();
                        c16391l3.loadAd(!z7 ? C1429l.amazon(jMopub, c13143l) : -9223372036854775807L);
                        arrayList4.add(new C4269l(10));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    c13143l.signatures();
                    c13143l.applovin();
                }
                c13143l.m3567synchronized();
                c13143l.signatures();
                c13143l.signatures();
                j = jAmazon;
            }
            c18137l = new C1429l(j, c16391l3.loadAd(j), list);
        } else if (iMopub2 != 6) {
            c18137l = null;
        } else {
            C16391l c16391l4 = this.smaato;
            long jAmazon2 = C1429l.amazon(jMopub, c13143l);
            c18137l = new C1429l(2, jAmazon2, c16391l4.loadAd(jAmazon2));
        }
        return c18137l == null ? new C7417l(new InterfaceC1525l[0]) : new C7417l(c18137l);
    }
}
