package defpackage;

/* JADX INFO: renamed from: lؘْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5359l extends AbstractC14648l {
    @Override // defpackage.AbstractC14648l
    public final void amazon() {
        C11338l c11338l = this.loadAd;
        C10526l c10526l = (C10526l) c11338l;
        int i = c10526l.f21418l;
        int i2 = c10526l.f21415l;
        int i3 = c10526l.f21416l;
        C7265l c7265l = this.admob;
        if (i3 == 1) {
            if (i != -1) {
                c7265l.smaato.add(c11338l.f22866switch.amazon.admob);
                this.loadAd.f22866switch.amazon.admob.firebase.add(c7265l);
                c7265l.billing = i;
            } else if (i2 != -1) {
                c7265l.smaato.add(c11338l.f22866switch.amazon.subs);
                this.loadAd.f22866switch.amazon.subs.firebase.add(c7265l);
                c7265l.billing = -i2;
            } else {
                c7265l.loadAd = true;
                c7265l.smaato.add(c11338l.f22866switch.amazon.subs);
                this.loadAd.f22866switch.amazon.subs.firebase.add(c7265l);
            }
            remoteconfig(this.loadAd.amazon.admob);
            remoteconfig(this.loadAd.amazon.subs);
            return;
        }
        if (i != -1) {
            c7265l.smaato.add(c11338l.f22866switch.purchase.admob);
            this.loadAd.f22866switch.purchase.admob.firebase.add(c7265l);
            c7265l.billing = i;
        } else if (i2 != -1) {
            c7265l.smaato.add(c11338l.f22866switch.purchase.subs);
            this.loadAd.f22866switch.purchase.subs.firebase.add(c7265l);
            c7265l.billing = -i2;
        } else {
            c7265l.loadAd = true;
            c7265l.smaato.add(c11338l.f22866switch.purchase.subs);
            this.loadAd.f22866switch.purchase.subs.firebase.add(c7265l);
        }
        remoteconfig(this.loadAd.purchase.admob);
        remoteconfig(this.loadAd.purchase.subs);
    }

    @Override // defpackage.AbstractC14648l
    public final void billing() {
        this.admob.crashlytics();
    }

    @Override // defpackage.AbstractC14648l
    public final boolean firebase() {
        return false;
    }

    @Override // defpackage.AbstractC14648l
    public final void purchase() {
        C11338l c11338l = this.loadAd;
        int i = ((C10526l) c11338l).f21416l;
        C7265l c7265l = this.admob;
        if (i == 1) {
            c11338l.f22846default = c7265l.mopub;
        } else {
            c11338l.f22849final = c7265l.mopub;
        }
    }

    public final void remoteconfig(C7265l c7265l) {
        C7265l c7265l2 = this.admob;
        c7265l2.firebase.add(c7265l);
        c7265l.smaato.add(c7265l2);
    }

    @Override // defpackage.InterfaceC1419l
    public final void yandex(InterfaceC1419l interfaceC1419l) {
        C7265l c7265l = this.admob;
        if (c7265l.crashlytics && !c7265l.isPro) {
            c7265l.amazon((int) ((((C7265l) c7265l.smaato.get(0)).mopub * ((C10526l) this.loadAd).f21419return) + 0.5f));
        }
    }
}
