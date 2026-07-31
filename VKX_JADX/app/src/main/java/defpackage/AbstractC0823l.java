package defpackage;

/* JADX INFO: renamed from: lٕؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0823l extends AbstractC12295l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C9268l f2465l;

    public AbstractC0823l(C9268l c9268l) {
        this.f2465l = c9268l;
    }

    @Override // defpackage.AbstractC12295l
    public final Throwable inmobi() {
        C9268l c9268l = this.f2465l;
        try {
            ((C10354l) this).f21145l.close();
            close();
            c9268l.m2629synchronized(this);
            return null;
        } catch (Throwable th) {
            c9268l.m2629synchronized(this);
            return th;
        }
    }

    @Override // defpackage.AbstractC12295l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final C12034l mo689switch(C4993l c4993l) {
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC10310l.appmetrica(this, AbstractC10586l.billing(ExecutorC6708l.f14063l, new C0499l("cio-to-nio-writer")), c4993l, new C2298l(this, c4993l, this.f2465l, ((C10354l) this).f21145l, null));
    }

    @Override // defpackage.AbstractC12295l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C13400l mo690synchronized(C4993l c4993l) {
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC7572l.Signature(this, AbstractC10586l.billing(ExecutorC6708l.f14063l, new C0499l("cio-from-nio-reader")), c4993l, new C8472l(this, c4993l, ((C10354l) this).f21145l, this.f2465l, null));
    }
}
