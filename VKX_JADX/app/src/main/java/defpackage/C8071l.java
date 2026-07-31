package defpackage;

/* JADX INFO: renamed from: lًٙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8071l implements InterfaceC10130l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10130l f16832l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f16831l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f16830l = -1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f16833l = -1;

    public C8071l(C5008l c5008l) {
        this.f16832l = c5008l;
    }

    @Override // defpackage.InterfaceC10130l
    public final void admob(int i, int i2) {
        int i3;
        if (this.f16831l == 1 && i >= (i3 = this.f16830l)) {
            int i4 = this.f16833l;
            if (i <= i3 + i4) {
                this.f16833l = i4 + i2;
                this.f16830l = Math.min(i, i3);
                return;
            }
        }
        yandex();
        this.f16830l = i;
        this.f16833l = i2;
        this.f16831l = 1;
    }

    @Override // defpackage.InterfaceC10130l
    public final void ads(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f16831l == 3 && i <= (i4 = this.f16833l + (i3 = this.f16830l)) && (i5 = i + i2) >= i3) {
            this.f16830l = Math.min(i, i3);
            this.f16833l = Math.max(i4, i5) - this.f16830l;
        } else {
            yandex();
            this.f16830l = i;
            this.f16833l = i2;
            this.f16831l = 3;
        }
    }

    @Override // defpackage.InterfaceC10130l
    public final void crashlytics(int i, int i2) {
        yandex();
        this.f16832l.crashlytics(i, i2);
    }

    @Override // defpackage.InterfaceC10130l
    public final void remoteconfig(int i, int i2) {
        int i3;
        if (this.f16831l == 2 && (i3 = this.f16830l) >= i && i3 <= i + i2) {
            this.f16833l += i2;
            this.f16830l = i;
        } else {
            yandex();
            this.f16830l = i;
            this.f16833l = i2;
            this.f16831l = 2;
        }
    }

    public final void yandex() {
        int i = this.f16831l;
        if (i == 0) {
            return;
        }
        InterfaceC10130l interfaceC10130l = this.f16832l;
        if (i == 1) {
            interfaceC10130l.admob(this.f16830l, this.f16833l);
        } else if (i == 2) {
            interfaceC10130l.remoteconfig(this.f16830l, this.f16833l);
        } else if (i == 3) {
            interfaceC10130l.ads(this.f16830l, this.f16833l);
        }
        this.f16831l = 0;
    }
}
