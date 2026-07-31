package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lؑۘؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0535l implements InterfaceC9354l {
    public final C18476l amazon = new C18476l();
    public final InterfaceC12932l billing;
    public C15957l crashlytics;
    public final C16149l loadAd;
    public final C0462l purchase;

    public C0535l(C16149l c16149l, InterfaceC12932l interfaceC12932l) {
        this.loadAd = c16149l;
        C0462l c0462l = new C0462l((InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l));
        this.purchase = c0462l;
        this.billing = interfaceC12932l.mo246l(c0462l).mo246l(new C0499l("RawSourceChannel"));
        c0462l.signatures(true, new C16931l(4, this), true);
    }

    @Override // defpackage.InterfaceC9354l
    public final boolean admob() {
        return this.crashlytics != null && this.amazon.subs();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC9354l
    public final Object amazon(int i, AbstractC0283l abstractC0283l) throws Throwable {
        C14954l c14954l;
        if (abstractC0283l instanceof C14954l) {
            c14954l = (C14954l) abstractC0283l;
            int i2 = c14954l.f29424l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14954l.f29424l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14954l = new C14954l(this, abstractC0283l);
            }
        } else {
            c14954l = new C14954l(this, abstractC0283l);
        }
        Object obj = c14954l.f29425l;
        int i3 = c14954l.f29424l;
        C18476l c18476l = this.amazon;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (this.crashlytics != null) {
                Throwable thLoadAd = loadAd();
                if (thLoadAd == null) {
                    return Boolean.valueOf(c18476l.f36079l >= ((long) i));
                }
                throw thLoadAd;
            }
            C17972l c17972l = new C17972l(this, i, (InterfaceC14029l) null);
            c14954l.f29426l = i;
            c14954l.f29424l = 1;
            Object objFirebase = AbstractC10999l.firebase(this.billing, c17972l, c14954l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c14954l.f29426l;
            AbstractC2829l.crashlytics(obj);
        }
        return Boolean.valueOf(c18476l.f36079l >= ((long) i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC9354l
    public final Throwable loadAd() {
        Throwable th;
        C15957l c15957l = this.crashlytics;
        if (c15957l == null || (th = c15957l.yandex) == 0) {
            return null;
        }
        if (th instanceof InterfaceC14404l) {
            return ((InterfaceC14404l) th).yandex();
        }
        return th instanceof CancellationException ? AbstractC4952l.yandex(((CancellationException) th).getMessage(), th) : new C8413l(th);
    }

    @Override // defpackage.InterfaceC9354l
    public final C18476l mopub() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC9354l
    public final void yandex(Throwable th) {
        if (this.crashlytics != null) {
            return;
        }
        CancellationException cancellationExceptionYandex = null;
        if (th != null) {
            cancellationExceptionYandex = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionYandex == null) {
                String message = th.getMessage();
                if (message == null) {
                    message = "Channel was cancelled";
                }
                cancellationExceptionYandex = AbstractC4952l.yandex(message, th);
            }
        }
        this.purchase.ads(cancellationExceptionYandex);
        if (this.crashlytics != null) {
            return;
        }
        this.crashlytics = new C15957l(cancellationExceptionYandex);
        this.loadAd.close();
    }
}
