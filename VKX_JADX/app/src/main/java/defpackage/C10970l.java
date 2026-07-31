package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lُُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10970l implements InterfaceC15984l {
    public final AbstractC12694l amazon;
    public boolean billing = false;
    public EnumC7384l crashlytics;
    public final C13716l loadAd;
    public C15815l purchase;
    public final InterfaceC15879l yandex;

    public C10970l(InterfaceC15879l interfaceC15879l, C13716l c13716l, AbstractC12694l abstractC12694l) {
        this.yandex = interfaceC15879l;
        this.loadAd = c13716l;
        this.amazon = abstractC12694l;
        synchronized (this) {
            this.crashlytics = (EnumC7384l) c13716l.amazon();
        }
    }

    public final void loadAd(EnumC7384l enumC7384l) {
        synchronized (this) {
            try {
                if (this.crashlytics.equals(enumC7384l)) {
                    return;
                }
                this.crashlytics = enumC7384l;
                AbstractC5088l.yandex("StreamStateObserver", "Update Preview stream state to " + enumC7384l);
                this.loadAd.isPro(enumC7384l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC15984l
    public final void onError(Throwable th) {
        C15815l c15815l = this.purchase;
        if (c15815l != null) {
            c15815l.cancel(false);
            this.purchase = null;
        }
        loadAd(EnumC7384l.f15311l);
    }

    @Override // defpackage.InterfaceC15984l
    public final void yandex(Object obj) {
        EnumC10062l enumC10062l = (EnumC10062l) obj;
        EnumC10062l enumC10062l2 = EnumC10062l.f20534l;
        EnumC7384l enumC7384l = EnumC7384l.f15311l;
        if (enumC10062l == enumC10062l2 || enumC10062l == EnumC10062l.f20529l || enumC10062l == EnumC10062l.f20532l || enumC10062l == EnumC10062l.f20533l) {
            loadAd(enumC7384l);
            if (this.billing) {
                this.billing = false;
                C15815l c15815l = this.purchase;
                if (c15815l != null) {
                    c15815l.cancel(false);
                    this.purchase = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((enumC10062l == EnumC10062l.f20536l || enumC10062l == EnumC10062l.f20530l || enumC10062l == EnumC10062l.f20535l) && !this.billing) {
            InterfaceC15879l interfaceC15879l = this.yandex;
            loadAd(enumC7384l);
            ArrayList arrayList = new ArrayList();
            C5807l c5807l = new C5807l();
            c5807l.crashlytics = new C0011l();
            C16565l c16565l = new C16565l(c5807l);
            c5807l.loadAd = c16565l;
            c5807l.yandex = AbstractC5020l.class;
            try {
                C4470l c4470l = new C4470l(c5807l, interfaceC15879l);
                arrayList.add(c4470l);
                interfaceC15879l.premium(AbstractC12272l.yandex(), c4470l);
                c5807l.yandex = "waitForCaptureResult";
            } catch (Exception e) {
                c16565l.loadAd(e);
            }
            RunnableC9823l runnableC9823lSmaato = AbstractC11356l.smaato(C15815l.loadAd(c16565l), new C3642l(this), AbstractC12272l.yandex());
            C3642l c3642l = new C3642l(this);
            RunnableC9823l runnableC9823lSmaato2 = AbstractC11356l.smaato(runnableC9823lSmaato, new C1770l(14, c3642l), AbstractC12272l.yandex());
            this.purchase = runnableC9823lSmaato2;
            C5991l c5991l = new C5991l(this, arrayList, interfaceC15879l);
            runnableC9823lSmaato2.yandex(new RunnableC9929l(runnableC9823lSmaato2, c5991l, 0), AbstractC12272l.yandex());
            this.billing = true;
        }
    }
}
