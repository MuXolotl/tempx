package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌٟۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8968l implements InterfaceC4305l, InterfaceC15894l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4910l f18495l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2397l f18496l;

    public C8968l(C4910l c4910l, C2397l c2397l) {
        this.f18495l = c4910l;
        this.f18496l = c2397l;
    }

    @Override // defpackage.InterfaceC15894l
    public final void loadAd(AbstractC16653l abstractC16653l, int i) {
        this.f18496l.loadAd(abstractC16653l, i);
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return this.f18496l.f5166l;
    }

    @Override // defpackage.InterfaceC4305l
    public final void remoteconfig(Object obj, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4910l.f10006l;
        C4910l c4910l = this.f18495l;
        atomicReferenceFieldUpdater.set(c4910l, null);
        C8250l c8250l = new C8250l(c4910l, this, 8);
        C2397l c2397l = this.f18496l;
        c2397l.m1131package((Unit) obj, c2397l.f14041l, new C1350l(7, c8250l));
    }

    @Override // defpackage.InterfaceC4305l
    public final C9676l smaato(Object obj, Function3 function3) {
        C4910l c4910l = this.f18495l;
        C16561l c16561l = new C16561l(c4910l, this);
        C9676l c9676lM1134volatile = this.f18496l.m1134volatile((Unit) obj, c16561l);
        if (c9676lM1134volatile != null) {
            C4910l.f10006l.set(c4910l, null);
        }
        return c9676lM1134volatile;
    }

    @Override // defpackage.InterfaceC4305l
    public final void startapp(Object obj) {
        this.f18496l.startapp(obj);
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        this.f18496l.subs(obj);
    }

    @Override // defpackage.InterfaceC4305l
    public final boolean yandex(Throwable th) {
        return this.f18496l.yandex(th);
    }
}
