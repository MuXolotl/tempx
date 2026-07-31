package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lؚْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13145l extends AbstractC7581l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25707l = AtomicReferenceFieldUpdater.newUpdater(C13145l.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C11649l f25708l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2397l f25709l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC11791l f25710l;

    public C13145l(C11649l c11649l, C2397l c2397l) {
        this.f25708l = c11649l;
        this.f25709l = c2397l;
    }

    @Override // defpackage.AbstractC7581l
    public final void isPro(Throwable th) {
        C2397l c2397l = this.f25709l;
        if (th != null) {
            C9676l c9676lM1134volatile = c2397l.m1134volatile(new C2175l(th, false), null);
            if (c9676lM1134volatile != null) {
                c2397l.startapp(c9676lM1134volatile);
                C11635l c11635l = (C11635l) f25707l.get(this);
                if (c11635l != null) {
                    c11635l.loadAd();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C11649l.loadAd;
        C11649l c11649l = this.f25708l;
        if (atomicIntegerFieldUpdater.decrementAndGet(c11649l) == 0) {
            InterfaceC1142l[] interfaceC1142lArr = c11649l.yandex;
            ArrayList arrayList = new ArrayList(interfaceC1142lArr.length);
            for (InterfaceC1142l interfaceC1142l : interfaceC1142lArr) {
                arrayList.add(interfaceC1142l.isVip());
            }
            c2397l.subs(arrayList);
        }
    }

    @Override // defpackage.AbstractC7581l
    public final boolean subs() {
        return false;
    }
}
