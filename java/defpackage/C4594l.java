package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؗؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4594l implements InterfaceC14029l, InterfaceC1840l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8539l f9334l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f9335l = RecyclerView.UNDEFINED_DURATION;

    public C4594l(C8539l c8539l) {
        this.f9334l = c8539l;
    }

    @Override // defpackage.InterfaceC1840l
    public final InterfaceC1840l admob() {
        InterfaceC14029l interfaceC14029l = C9861l.f20073l;
        int i = this.f9335l;
        C8539l c8539l = this.f9334l;
        if (i == Integer.MIN_VALUE) {
            this.f9335l = c8539l.f17630l;
        }
        int i2 = this.f9335l;
        if (i2 < 0) {
            this.f9335l = RecyclerView.UNDEFINED_DURATION;
            interfaceC14029l = null;
        } else {
            try {
                InterfaceC14029l interfaceC14029l2 = c8539l.f17628l[i2];
                if (interfaceC14029l2 != null) {
                    this.f9335l = i2 - 1;
                    interfaceC14029l = interfaceC14029l2;
                }
            } catch (Throwable unused) {
            }
        }
        if (interfaceC14029l instanceof InterfaceC1840l) {
            return (InterfaceC1840l) interfaceC14029l;
        }
        return null;
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        C8539l c8539l = this.f9334l;
        for (int i = c8539l.f17630l; -1 < i; i--) {
            InterfaceC14029l interfaceC14029l = c8539l.f17628l[i];
            if (interfaceC14029l != this && interfaceC14029l != null) {
                return interfaceC14029l.metrica();
            }
        }
        C8339l.smaato("Not started");
        return null;
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        Throwable thYandex = C1171l.yandex(obj);
        C8539l c8539l = this.f9334l;
        if (thYandex != null) {
            c8539l.subs(new C18435l(thYandex));
        } else {
            c8539l.admob(false);
        }
    }
}
