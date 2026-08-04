package defpackage;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lَۖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10500l extends AbstractC0958l {
    public C3214l adcel;
    public final C5807l metrica;
    public AbstractC0958l startapp;
    public final C16565l vip;

    public C10500l(int i, Size size) {
        super(i, size);
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            this.metrica = c5807l;
            c5807l.yandex = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        this.vip = c16565l;
    }

    @Override // defpackage.AbstractC0958l
    public final ListenableFuture billing() {
        return this.vip;
    }

    public final boolean mopub(AbstractC0958l abstractC0958l, Runnable runnable) {
        boolean z;
        Size size = this.admob;
        AbstractC12225l.crashlytics();
        abstractC0958l.getClass();
        int i = abstractC0958l.subs;
        Size size2 = abstractC0958l.admob;
        AbstractC0958l abstractC0958l2 = this.startapp;
        if (abstractC0958l2 == abstractC0958l) {
            return false;
        }
        AbstractC5641l.purchase("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", abstractC0958l2 == null);
        AbstractC5641l.loadAd(size.equals(size2), "The provider's size(" + size + ") must match the parent(" + size2 + ")");
        int i2 = this.subs;
        AbstractC5641l.loadAd(i2 == i, AbstractC12589l.applovin(i2, i, "The provider's format(", ") must match the parent(", ")"));
        synchronized (this.yandex) {
            z = this.crashlytics;
        }
        AbstractC5641l.purchase("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.startapp = abstractC0958l;
        AbstractC11356l.subs(abstractC0958l.crashlytics(), this.metrica);
        abstractC0958l.amazon();
        AbstractC11356l.admob(this.purchase).yandex(new RunnableC8523l(abstractC0958l, 1), AbstractC12272l.yandex());
        AbstractC11356l.admob(abstractC0958l.mopub).yandex(runnable, AbstractC12272l.admob());
        return true;
    }

    @Override // defpackage.AbstractC0958l
    public final void yandex() {
        super.yandex();
        AbstractC12225l.firebase(new RunnableC8594l(this, 2));
    }
}
