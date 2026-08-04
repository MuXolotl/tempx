package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lَٓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14433l extends AbstractC14648l {
    @Override // defpackage.AbstractC14648l
    public final void amazon() {
        C11338l c11338l = this.loadAd;
        if (c11338l instanceof C0051l) {
            C7265l c7265l = this.admob;
            c7265l.loadAd = true;
            ArrayList arrayList = c7265l.smaato;
            C0051l c0051l = (C0051l) c11338l;
            int i = c0051l.f934l;
            boolean z = c0051l.f936l;
            int i2 = 0;
            if (i == 0) {
                c7265l.purchase = 4;
                while (i2 < c0051l.f937l) {
                    C11338l c11338l2 = c0051l.f938return[i2];
                    if (z || c11338l2.f22862public != 8) {
                        C7265l c7265l2 = c11338l2.amazon.admob;
                        c7265l2.firebase.add(c7265l);
                        arrayList.add(c7265l2);
                    }
                    i2++;
                }
                remoteconfig(this.loadAd.amazon.admob);
                remoteconfig(this.loadAd.amazon.subs);
                return;
            }
            if (i == 1) {
                c7265l.purchase = 5;
                while (i2 < c0051l.f937l) {
                    C11338l c11338l3 = c0051l.f938return[i2];
                    if (z || c11338l3.f22862public != 8) {
                        C7265l c7265l3 = c11338l3.amazon.subs;
                        c7265l3.firebase.add(c7265l);
                        arrayList.add(c7265l3);
                    }
                    i2++;
                }
                remoteconfig(this.loadAd.amazon.admob);
                remoteconfig(this.loadAd.amazon.subs);
                return;
            }
            if (i == 2) {
                c7265l.purchase = 6;
                while (i2 < c0051l.f937l) {
                    C11338l c11338l4 = c0051l.f938return[i2];
                    if (z || c11338l4.f22862public != 8) {
                        C7265l c7265l4 = c11338l4.purchase.admob;
                        c7265l4.firebase.add(c7265l);
                        arrayList.add(c7265l4);
                    }
                    i2++;
                }
                remoteconfig(this.loadAd.purchase.admob);
                remoteconfig(this.loadAd.purchase.subs);
                return;
            }
            if (i != 3) {
                return;
            }
            c7265l.purchase = 7;
            while (i2 < c0051l.f937l) {
                C11338l c11338l5 = c0051l.f938return[i2];
                if (z || c11338l5.f22862public != 8) {
                    C7265l c7265l5 = c11338l5.purchase.subs;
                    c7265l5.firebase.add(c7265l);
                    arrayList.add(c7265l5);
                }
                i2++;
            }
            remoteconfig(this.loadAd.purchase.admob);
            remoteconfig(this.loadAd.purchase.subs);
        }
    }

    @Override // defpackage.AbstractC14648l
    public final void billing() {
        this.crashlytics = null;
        this.admob.crashlytics();
    }

    @Override // defpackage.AbstractC14648l
    public final boolean firebase() {
        return false;
    }

    @Override // defpackage.AbstractC14648l
    public final void purchase() {
        C11338l c11338l = this.loadAd;
        if (c11338l instanceof C0051l) {
            int i = ((C0051l) c11338l).f934l;
            C7265l c7265l = this.admob;
            if (i == 0 || i == 1) {
                c11338l.f22846default = c7265l.mopub;
            } else {
                c11338l.f22849final = c7265l.mopub;
            }
        }
    }

    public final void remoteconfig(C7265l c7265l) {
        C7265l c7265l2 = this.admob;
        c7265l2.firebase.add(c7265l);
        c7265l.smaato.add(c7265l2);
    }

    @Override // defpackage.InterfaceC1419l
    public final void yandex(InterfaceC1419l interfaceC1419l) {
        C0051l c0051l = (C0051l) this.loadAd;
        int i = c0051l.f934l;
        C7265l c7265l = this.admob;
        Iterator it = c7265l.smaato.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C7265l) it.next()).mopub;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c7265l.amazon(i3 + c0051l.f935l);
        } else {
            c7265l.amazon(i2 + c0051l.f935l);
        }
    }
}
