package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4392l implements InterfaceC2636l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16543l f8923l;

    public C4392l(C16543l c16543l) {
        this.f8923l = c16543l;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((InterfaceC11449l) this.f8923l.f32482l).close();
    }

    @Override // defpackage.InterfaceC2636l
    public final Object tapsense(boolean z, Function2 function2, AbstractC0283l abstractC0283l) {
        InterfaceC11449l interfaceC11449l = (InterfaceC11449l) this.f8923l.f32482l;
        interfaceC11449l.getClass();
        return function2.invoke(new C5870l(new C15802l(interfaceC11449l.mo966this())), abstractC0283l);
    }
}
