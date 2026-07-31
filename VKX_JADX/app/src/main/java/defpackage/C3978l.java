package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lًٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3978l implements InterfaceC11759l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f8171l = -1;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8915l f8172l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f8173l;

    public C3978l(C8915l c8915l, int i) {
        this.f8172l = c8915l;
        this.f8173l = i;
    }

    @Override // defpackage.InterfaceC11759l
    public final int adcel(C10023l c10023l, C4136l c4136l, int i) {
        C5978l c5978l;
        if (this.f8171l == -3) {
            c4136l.yandex(4);
            return -4;
        }
        if (crashlytics()) {
            int i2 = this.f8171l;
            C8915l c8915l = this.f8172l;
            ArrayList arrayList = c8915l.f18364l;
            if (!c8915l.inmobi()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((C7377l) arrayList.get(i4)).firebase;
                        int length = c8915l.f18321l.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (c8915l.f18332l[i6] && c8915l.f18321l[i6].isVip() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    String str = AbstractC15323l.yandex;
                    if (i4 > arrayList.size() || i4 < 0) {
                        C11983l.crashlytics();
                        return 0;
                    }
                    if (i4 != 0) {
                        arrayList.subList(0, i4).clear();
                    }
                    C7377l c7377l = (C7377l) arrayList.get(0);
                    C5978l c5978l2 = c7377l.amazon;
                    if (!c5978l2.equals(c8915l.f18318l)) {
                        C13698l c13698l = c8915l.f18361l;
                        c13698l.subscription(new C15263l(c13698l, new C2040l(1, c8915l.f18339l, c5978l2, c7377l.purchase, c7377l.billing, AbstractC15323l.m3986try(c7377l.mopub), -9223372036854775807L), 9));
                    }
                    c8915l.f18318l = c5978l2;
                }
                if (arrayList.isEmpty() || ((C7377l) arrayList.get(0)).billing()) {
                    int iSignatures = c8915l.f18321l[i2].signatures(c10023l, c4136l, i, c8915l.f18326l);
                    if (iSignatures == -5) {
                        C5978l c5978lAmazon = (C5978l) c10023l.f20418l;
                        c5978lAmazon.getClass();
                        if (i2 == c8915l.f18345l) {
                            int iLoadAd = AbstractC9966l.loadAd(c8915l.f18321l[i2].isVip());
                            while (i3 < arrayList.size() && ((C7377l) arrayList.get(i3)).firebase != iLoadAd) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                c5978l = ((C7377l) arrayList.get(i3)).amazon;
                            } else {
                                c5978l = c8915l.f18358l;
                                c5978l.getClass();
                            }
                            c5978lAmazon = c5978lAmazon.amazon(c5978l);
                        }
                        c10023l.f20418l = c5978lAmazon;
                    }
                    return iSignatures;
                }
            }
        }
        return -3;
    }

    public final boolean crashlytics() {
        int i = this.f8171l;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.InterfaceC11759l
    public final void firebase() throws IOException {
        int i = this.f8171l;
        C8915l c8915l = this.f8172l;
        if (i == -2) {
            c8915l.pro();
            throw new C8413l(AbstractC15560l.Signature("Unable to bind a sample queue to TrackGroup with MIME type ", c8915l.f18336l.yandex(this.f8173l).amazon[0].metrica, "."));
        }
        if (i == -1) {
            c8915l.m2433package();
            return;
        }
        if (i != -3) {
            c8915l.m2433package();
            C4251l c4251l = c8915l.f18321l[i];
            InterfaceC9655l interfaceC9655l = c4251l.admob;
            if (interfaceC9655l == null || interfaceC9655l.yandex() != 1) {
                return;
            }
            C4684l c4684lMopub = c4251l.admob.mopub();
            c4684lMopub.getClass();
            throw c4684lMopub;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void loadAd() {
        AbstractC12442l.admob(this.f8171l == -1);
        C8915l c8915l = this.f8172l;
        c8915l.pro();
        c8915l.f18356l.getClass();
        int[] iArr = c8915l.f18356l;
        int i = this.f8173l;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = c8915l.f18332l;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (c8915l.f18349l.contains(c8915l.f18336l.yandex(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.f8171l = i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // defpackage.InterfaceC11759l
    public final int smaato(long j) throws Throwable {
        Object next;
        Object objFirebase;
        if (!crashlytics()) {
            return 0;
        }
        int i = this.f8171l;
        C8915l c8915l = this.f8172l;
        if (c8915l.inmobi()) {
            return 0;
        }
        C4251l c4251l = c8915l.f18321l[i];
        int iSignature = c4251l.Signature(j, c8915l.f18326l);
        ArrayList arrayList = c8915l.f18364l;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objFirebase = next;
            } else {
                objFirebase = null;
            }
        } else if (arrayList.isEmpty()) {
            objFirebase = null;
        } else {
            objFirebase = AbstractC14814l.firebase(1, arrayList);
        }
        C7377l c7377l = (C7377l) objFirebase;
        if (c7377l != null && !c7377l.billing()) {
            iSignature = Math.min(iSignature, c7377l.purchase(i) - c4251l.subscription());
        }
        c4251l.m4096package(iSignature);
        return iSignature;
    }

    @Override // defpackage.InterfaceC11759l
    public final boolean yandex() {
        if (this.f8171l == -3) {
            return true;
        }
        if (!crashlytics()) {
            return false;
        }
        int i = this.f8171l;
        C8915l c8915l = this.f8172l;
        return !c8915l.inmobi() && c8915l.f18321l[i].pro(c8915l.f18326l);
    }
}
