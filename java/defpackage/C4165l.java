package defpackage;

/* JADX INFO: renamed from: lؖٗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4165l implements InterfaceC1489l {
    public final long crashlytics;
    public final int loadAd;
    public final InterfaceC14206l yandex;

    public C4165l(InterfaceC14206l interfaceC14206l, int i, long j) {
        this.yandex = interfaceC14206l;
        this.loadAd = i;
        this.crashlytics = j;
        if (interfaceC14206l instanceof C4776l) {
            C4776l c4776l = (C4776l) interfaceC14206l;
            if (c4776l.yandex != 0 || c4776l.loadAd != 0) {
                return;
            }
        } else if (interfaceC14206l instanceof C2966l) {
            if (((C2966l) interfaceC14206l).yandex != 0) {
                return;
            }
        } else if (!(interfaceC14206l instanceof C13591l) || ((C13591l) interfaceC14206l).yandex.yandex != 0) {
            return;
        }
        C8339l.metrica("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4165l) {
            C4165l c4165l = (C4165l) obj;
            if (c4165l.yandex.equals(this.yandex) && c4165l.loadAd == this.loadAd && c4165l.crashlytics == this.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFirebase = AbstractC0653l.firebase(this.loadAd, this.yandex.hashCode() * 31, 31);
        long j = this.crashlytics;
        return ((int) (j ^ (j >>> 32))) + iFirebase;
    }

    @Override // defpackage.InterfaceC1489l
    public final InterfaceC15930l yandex(C0010l c0010l) {
        return new C13294l(this.yandex.yandex(c0010l), this.loadAd, this.crashlytics);
    }
}
