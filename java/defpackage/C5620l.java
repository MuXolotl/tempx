package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: lؘِٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5620l extends C17219l {
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m1836super(InterfaceC11792l interfaceC11792l) {
        Object objLicense;
        InterfaceC11699l interfaceC11699lMo1829const = interfaceC11792l.mo1829const();
        InterfaceC7299l interfaceC7299l = interfaceC11699lMo1829const instanceof C15483l ? ((C15483l) interfaceC11699lMo1829const).yandex : null;
        if (interfaceC7299l == null || ((interfaceC7299l.mopub() != EnumC4090l.f8435l && interfaceC7299l.mopub() != EnumC4090l.f8434l) || interfaceC7299l.purchase() != EnumC11672l.f23393l || interfaceC7299l.amazon() != EnumC15027l.f29552l)) {
            ((C11586l) this.f33426l).getClass();
            interfaceC11792l.close();
            return;
        }
        synchronized (this.f33427l) {
            try {
                objLicense = ((ArrayDeque) this.f33423l).size() >= this.f33424l ? license() : null;
                ((ArrayDeque) this.f33423l).addFirst(interfaceC11792l);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C11586l) this.f33426l) == null || objLicense == null) {
            return;
        }
        ((InterfaceC11792l) objLicense).close();
    }
}
