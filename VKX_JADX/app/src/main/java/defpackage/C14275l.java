package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;

/* JADX INFO: renamed from: lُٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14275l implements InterfaceC18690l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC10408l f27950l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC13235l f27951l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f27952l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC15879l f27953l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15252l f27954l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C7647l f27955l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C14338l f27956l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C18474l f27957l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f27958l;

    public C14275l(C17927l c17927l, C15252l c15252l, InterfaceC15879l interfaceC15879l, InterfaceC10408l interfaceC10408l, C14338l c14338l, C7647l c7647l) {
        this.f27954l = c15252l;
        this.f27953l = interfaceC15879l;
        this.f27950l = interfaceC10408l;
        this.f27956l = c14338l;
        this.f27955l = c7647l;
        String str = c17927l.loadAd;
        this.f27958l = str;
        this.f27951l = AbstractC15078l.yandex;
        C11879l c11879l = AbstractC8883l.yandex;
        c11879l.getClass();
        this.f27952l = C11879l.loadAd.incrementAndGet(c11879l);
        this.f27957l = AbstractC1805l.yandex(false);
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) C10160l.loadAd(str)));
        }
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC15879l adcel() {
        return this.f27953l;
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC13235l admob() {
        return this.f27951l;
    }

    @Override // defpackage.InterfaceC8927l
    public final void ads(AbstractC6896l abstractC6896l) {
        C15252l c15252l = this.f27954l;
        synchronized (c15252l.firebase) {
            try {
                if (c15252l.remoteconfig.remove(abstractC6896l)) {
                    c15252l.remoteconfig();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC18690l
    public final boolean amazon() {
        return loadAd().metrica() == 0;
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC10408l billing() {
        return this.f27950l;
    }

    @Override // defpackage.InterfaceC8927l
    public final void crashlytics(AbstractC6896l abstractC6896l) {
        C15252l c15252l = this.f27954l;
        synchronized (c15252l.firebase) {
            try {
                if (c15252l.smaato.contains(abstractC6896l)) {
                    c15252l.smaato(c15252l.smaato);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC18690l
    public final boolean firebase() {
        return this.f27957l.loadAd();
    }

    @Override // defpackage.InterfaceC18690l
    public final void isPro(boolean z) {
        C15252l c15252l = this.f27954l;
        synchronized (c15252l.firebase) {
            c15252l.vip = z;
            C1130l c1130lAdmob = c15252l.admob();
            if (c1130lAdmob != null) {
                AbstractC10999l.mopub(c1130lAdmob.loadAd.purchase, null, 0, new C14047l((InterfaceC14029l) null, c1130lAdmob, z), 3);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // defpackage.InterfaceC18690l, defpackage.InterfaceC4982l
    public final InterfaceC15879l loadAd() {
        return adcel();
    }

    @Override // defpackage.InterfaceC18690l
    public final /* synthetic */ boolean metrica() {
        return true;
    }

    @Override // defpackage.InterfaceC8927l
    public final void mopub(AbstractC6896l abstractC6896l) {
        C15252l c15252l = this.f27954l;
        synchronized (c15252l.firebase) {
            try {
                if (c15252l.smaato.contains(abstractC6896l)) {
                    c15252l.remoteconfig();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8927l
    public final void purchase(AbstractC6896l abstractC6896l) {
        this.f27954l.yandex(abstractC6896l);
    }

    @Override // defpackage.InterfaceC18690l
    public final ListenableFuture release() {
        return AbstractC11064l.purchase(new C2683l(0, AbstractC10999l.mopub(this.f27956l.yandex, null, 0, new C13738l(this, null, 1), 3)));
    }

    @Override // defpackage.InterfaceC18690l
    public final void remoteconfig(ArrayList arrayList) {
        this.f27954l.mopub(AbstractC16901l.m4213const(arrayList));
    }

    @Override // defpackage.InterfaceC18690l
    public final void smaato(Collection collection) {
        this.f27954l.amazon(AbstractC16901l.m4213const(collection));
    }

    @Override // defpackage.InterfaceC18690l
    public final void startapp(boolean z) {
        C15252l c15252l = this.f27954l;
        synchronized (c15252l.firebase) {
            c15252l.startapp = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC18690l
    public final void subs(InterfaceC13235l interfaceC13235l) {
        this.f27951l = interfaceC13235l == null ? AbstractC15078l.yandex : interfaceC13235l;
        if (interfaceC13235l != null) {
            ((C5138l) interfaceC13235l).m1720public();
        }
        synchronized (this.f27954l.firebase) {
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void subscription(boolean z) {
        C15252l c15252l = this.f27954l;
        synchronized (c15252l.firebase) {
            c15252l.metrica = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) C10160l.loadAd(this.f27958l));
        sb.append('(');
        return AbstractC14814l.remoteconfig(this.f27952l, ")>", sb);
    }

    @Override // defpackage.InterfaceC18690l
    public final void vip() {
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.f27957l.yandex()) {
            AbstractC10999l.mopub(this.f27956l.yandex, null, 0, new C13738l(this, null, 0), 3);
        }
    }

    @Override // defpackage.InterfaceC18690l
    public final InterfaceC10367l yandex() {
        return this.f27955l.loadAd;
    }
}
