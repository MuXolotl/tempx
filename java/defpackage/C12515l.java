package defpackage;

/* JADX INFO: renamed from: lَّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12515l extends AbstractC3947l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f24655l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public InterfaceC1489l f24656l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f24657l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public long f24658l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public long f24659l;

    public C12515l(InterfaceC1489l interfaceC1489l) {
        super(1);
        this.f24656l = interfaceC1489l;
        this.f24658l = -9223372034707292160L;
        this.f24659l = AbstractC7563l.loadAd(0, 0, 0, 0, 15);
        this.f24655l = AbstractC8020l.smaato(null);
    }

    @Override // defpackage.AbstractC3947l, defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel;
        C10294l c10294l;
        long jAmazon;
        C10294l c10294l2;
        if (interfaceC7448l.mo992import()) {
            this.f24659l = j;
            this.f24657l = true;
            abstractC10113lAdcel = interfaceC6357l.adcel(j);
        } else {
            abstractC10113lAdcel = interfaceC6357l.adcel(this.f24657l ? this.f24659l : j);
        }
        AbstractC10113l abstractC10113l = abstractC10113lAdcel;
        char c = ' ';
        long j2 = (((long) abstractC10113l.f20591l) & 4294967295L) | (((long) abstractC10113l.f20592l) << 32);
        if (interfaceC7448l.mo992import()) {
            this.f24658l = j2;
            c = ' ';
            jAmazon = j2;
            j2 = jAmazon;
        } else {
            long j3 = !C4999l.loadAd(this.f24658l, -9223372034707292160L) ? this.f24658l : j2;
            C10086l c10086l = this.f24655l;
            C10294l c10294l3 = (C10294l) c10086l.getValue();
            if (c10294l3 != null) {
                C5616l c5616l = c10294l3.yandex;
                boolean z = (C4999l.loadAd(j3, ((C4999l) c5616l.amazon()).yandex) || c5616l.purchase()) ? false : true;
                if (!C4999l.loadAd(j3, ((C4999l) c5616l.purchase.getValue()).yandex) || z) {
                    c10294l3.loadAd = ((C4999l) c5616l.amazon()).yandex;
                    c10294l2 = c10294l3;
                    AbstractC10999l.mopub(m3914l(), null, 0, new C10118l(c10294l2, j3, this, null, 4), 3);
                } else {
                    c10294l2 = c10294l3;
                }
                c10294l = c10294l2;
            } else {
                long j4 = j3;
                c10294l = new C10294l(new C5616l(new C4999l(j4), AbstractC3483l.smaato, new C4999l(4294967297L), 8), j4);
            }
            c10086l.setValue(c10294l);
            jAmazon = AbstractC7563l.amazon(j, ((C4999l) c10294l.yandex.amazon()).yandex);
        }
        int i = (int) (jAmazon >> c);
        int i2 = (int) (jAmazon & 4294967295L);
        return interfaceC7448l.isVip(i, i2, C14054l.f27396l, new C2190l(this, j2, i, i2, interfaceC7448l, abstractC10113l));
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        this.f24658l = -9223372034707292160L;
        this.f24657l = false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        this.f24655l.setValue(null);
    }
}
