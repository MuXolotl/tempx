package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٞۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11213l implements InterfaceC0805l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13802l f22576l;

    public C11213l(InterfaceC6272l interfaceC6272l) {
        this.f22576l = new C13802l(26, interfaceC6272l);
    }

    @Override // defpackage.InterfaceC0805l
    /* JADX INFO: renamed from: continue */
    public final void mo685continue(InterfaceC12932l interfaceC12932l, Throwable th) {
        if ((th instanceof CancellationException) || (th instanceof IOException)) {
            return;
        }
        Object string = (C0499l) interfaceC12932l.mo245l(C0499l.f1807l);
        if (string == null) {
            string = interfaceC12932l.toString();
        }
        ((InterfaceC6272l) this.f22576l.f26934l).amazon("Unhandled exception caught for " + string, th);
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return C13772l.f26879l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
