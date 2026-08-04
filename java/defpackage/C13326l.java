package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lّْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13326l implements InterfaceC3783l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f26151l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f26152l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f26153l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f26154l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f26155l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C8099l[] f26156l;

    public C13326l(int i) {
        AbstractC12442l.admob(i > 0);
        this.f26153l = true;
        this.f26152l = i;
        this.f26154l = 0;
        this.f26156l = new C8099l[100];
    }

    @Override // defpackage.InterfaceC3783l
    public final int adcel() {
        return this.f26152l;
    }

    @Override // defpackage.InterfaceC3783l
    public final synchronized void firebase(C8099l c8099l) {
        C8099l[] c8099lArr = this.f26156l;
        int i = this.f26154l;
        this.f26154l = i + 1;
        c8099lArr[i] = c8099l;
        this.f26155l--;
    }

    @Override // defpackage.InterfaceC3783l
    public final synchronized void loadAd(C16528l c16528l) {
        while (c16528l != null) {
            C8099l[] c8099lArr = this.f26156l;
            int i = this.f26154l;
            this.f26154l = i + 1;
            C8099l c8099l = (C8099l) c16528l.f32302l;
            c8099l.getClass();
            c8099lArr[i] = c8099l;
            this.f26155l--;
            c16528l = (C16528l) c16528l.f32305l;
            if (c16528l == null || ((C8099l) c16528l.f32302l) == null) {
                c16528l = null;
            }
        }
    }

    @Override // defpackage.InterfaceC3783l
    public final synchronized void remoteconfig() {
        int iMax = Math.max(0, AbstractC15323l.mopub(this.f26151l, this.f26152l) - this.f26155l);
        int i = this.f26154l;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f26156l, iMax, i, (Object) null);
        this.f26154l = iMax;
    }

    @Override // defpackage.InterfaceC3783l
    public final synchronized C8099l smaato() {
        C8099l c8099l;
        try {
            int i = this.f26155l + 1;
            this.f26155l = i;
            int i2 = this.f26154l;
            if (i2 > 0) {
                C8099l[] c8099lArr = this.f26156l;
                int i3 = i2 - 1;
                this.f26154l = i3;
                c8099l = c8099lArr[i3];
                c8099l.getClass();
                this.f26156l[this.f26154l] = null;
            } else {
                C8099l c8099l2 = new C8099l(new byte[this.f26152l], 0);
                C8099l[] c8099lArr2 = this.f26156l;
                if (i > c8099lArr2.length) {
                    this.f26156l = (C8099l[]) Arrays.copyOf(c8099lArr2, c8099lArr2.length * 2);
                }
                c8099l = c8099l2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c8099l;
    }

    public final synchronized void yandex(int i) {
        boolean z = i < this.f26151l;
        this.f26151l = i;
        if (z) {
            remoteconfig();
        }
    }
}
