package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lِؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0998l extends AbstractC16374l implements InterfaceC18293l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Exception f2748l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f2749l;

    /* JADX WARN: Multi-variable type inference failed */
    public C0998l(String str, InterfaceC18293l interfaceC18293l, AbstractC15076l abstractC15076l, boolean z, C9226l c9226l) {
        super("<missing root>:".concat(str), (AbstractC17970l) interfaceC18293l, AbstractC15076l.yandex(abstractC15076l, C13185l.billing), c9226l);
        this.f2748l = interfaceC18293l.amazon();
        this.f2749l = z;
    }

    @Override // defpackage.InterfaceC18293l
    public final Exception amazon() {
        return this.f2748l;
    }

    @Override // defpackage.InterfaceC14094l
    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public final InterfaceC14094l mo766l(String str, AbstractC15076l abstractC15076l, C9226l c9226l) {
        AtomicReference atomicReference = AbstractC10540l.yandex;
        return mo767static(str, abstractC15076l, true, c9226l);
    }

    @Override // defpackage.InterfaceC14094l
    public final AbstractC15076l remoteconfig() {
        return C13185l.purchase;
    }

    @Override // defpackage.InterfaceC18293l
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final C0998l mo767static(String str, AbstractC15076l abstractC15076l, boolean z, C9226l c9226l) {
        boolean z2 = this.f2749l;
        if (z && !z2) {
            AtomicReference atomicReference = AbstractC10540l.yandex;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new C0998l(str, this, abstractC15076l, z3, c9226l);
    }

    public C0998l(UUID uuid, String str, String str2, AbstractC15076l abstractC15076l, Exception exc, C9226l c9226l) {
        super("<missing root>:".concat(str2), uuid, str, AbstractC15076l.yandex(abstractC15076l, C13185l.billing), c9226l);
        this.f2748l = exc;
        this.f2749l = false;
    }
}
